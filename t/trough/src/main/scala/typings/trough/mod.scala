package typings.trough

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("trough", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def trough(): Pipeline = ^.asInstanceOf[js.Dynamic].applyDynamic("trough")().asInstanceOf[Pipeline]
  
  inline def wrap(middleware: Middleware, callback: Callback): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(middleware.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  @js.native
  trait Callback extends StObject {
    
    def apply(error: js.Error, output: Any*): Unit = js.native
    def apply(error: Null, output: Any*): Unit = js.native
    def apply(error: Unit, output: Any*): Unit = js.native
  }
  
  @js.native
  trait Middleware extends StObject {
    
    def apply(input: Any*): Any = js.native
  }
  
  trait Pipeline extends StObject {
    
    def run(input: Any*): Unit
    @JSName("run")
    var run_Original: Run
    
    def use(fn: Middleware): Pipeline
    @JSName("use")
    var use_Original: Use
  }
  object Pipeline {
    
    inline def apply(run: Run, use: /* fn */ Middleware => Pipeline): Pipeline = {
      val __obj = js.Dynamic.literal(run = run.asInstanceOf[js.Any], use = js.Any.fromFunction1(use))
      __obj.asInstanceOf[Pipeline]
    }
    
    extension [Self <: Pipeline](x: Self) {
      
      inline def setRun(value: Run): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      inline def setUse(value: /* fn */ Middleware => Pipeline): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Run extends StObject {
    
    def apply(input: Any*): Unit = js.native
  }
  
  type Use = js.Function1[/* fn */ Middleware, Pipeline]
}
