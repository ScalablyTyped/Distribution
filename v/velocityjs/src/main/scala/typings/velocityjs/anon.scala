package typings.velocityjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Context extends StObject {
    
    var context: Any
    
    var params: js.Array[Any]
    
    var property: String
  }
  object Context {
    
    inline def apply(context: Any, params: js.Array[Any], property: String): Context = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DictcontextKey
    extends StObject
       with /* contextKey */ StringDictionary[js.Function] {
    
    def eval(vmString: String): String = js.native
    def eval(vmString: String, context: RenderContext): String = js.native
  }
  
  trait Firstcolumn extends StObject {
    
    var first_column: Double
    
    var first_line: Double
  }
  object Firstcolumn {
    
    inline def apply(first_column: Double, first_line: Double): Firstcolumn = {
      val __obj = js.Dynamic.literal(first_column = first_column.asInstanceOf[js.Any], first_line = first_line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Firstcolumn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Firstcolumn] (val x: Self) extends AnyVal {
      
      inline def setFirst_column(value: Double): Self = StObject.set(x, "first_column", value.asInstanceOf[js.Any])
      
      inline def setFirst_line(value: Double): Self = StObject.set(x, "first_line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Match extends StObject {
    
    // the function to judge which method should be handler
    // for example, we want handler the get method like Java
    // $foo.get('bar')
    // @see https://github.com/shepherdwind/velocity.js/pull/146/files#diff-87cd4af0a4775dde2b789b29008ff702828b17afc38d419ffc0772ce4272f5ffR68
    def `match`(payload: Context): Boolean
    
    // the function to handler custom logic
    def resolve(payload: Context): Any
    
    // uid for method handler, use in debug log only
    var uid: String
  }
  object Match {
    
    inline def apply(`match`: Context => Boolean, resolve: Context => Any, uid: String): Match = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve), uid = uid.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[Match]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
      
      inline def setMatch(value: Context => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setResolve(value: Context => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
