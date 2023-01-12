package typings.twineSugarcube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptingMod {
  
  trait ScriptingAPI extends StObject {
    
    /**
      * Evaluates the given JavaScript code and returns the result, throwing if there were errors.
      */
    def evalJavaScript(code: String): Any
    
    /**
      * Evaluates the given TwineScript code and returns the result, throwing if there were errors.
      */
    def evalTwineScript(code: String): Any
    
    def parse(rawCodeString: String): String
  }
  object ScriptingAPI {
    
    inline def apply(evalJavaScript: String => Any, evalTwineScript: String => Any, parse: String => String): ScriptingAPI = {
      val __obj = js.Dynamic.literal(evalJavaScript = js.Any.fromFunction1(evalJavaScript), evalTwineScript = js.Any.fromFunction1(evalTwineScript), parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[ScriptingAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScriptingAPI] (val x: Self) extends AnyVal {
      
      inline def setEvalJavaScript(value: String => Any): Self = StObject.set(x, "evalJavaScript", js.Any.fromFunction1(value))
      
      inline def setEvalTwineScript(value: String => Any): Self = StObject.set(x, "evalTwineScript", js.Any.fromFunction1(value))
      
      inline def setParse(value: String => String): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
}
