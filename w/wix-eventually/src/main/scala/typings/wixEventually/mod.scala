package typings.wixEventually

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fn: js.Function): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply(fn: js.Function, opts: Opts): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("wix-eventually", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _with(overrides: Opts): js.Function2[/* fn */ js.Function, /* opts */ js.UndefOr[Opts], js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("_with")(overrides.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* fn */ js.Function, /* opts */ js.UndefOr[Opts], js.Promise[Unit]]]
  
  inline def `with`(overrides: Opts): js.Function2[/* fn */ js.Function, /* opts */ js.UndefOr[Opts], js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("with")(overrides.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* fn */ js.Function, /* opts */ js.UndefOr[Opts], js.Promise[Unit]]]
  
  trait Opts extends StObject {
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Opts {
    
    inline def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
