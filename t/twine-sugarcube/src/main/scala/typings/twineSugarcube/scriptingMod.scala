package typings.twineSugarcube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptingMod {
  
  @js.native
  trait ScriptingAPI extends StObject {
    
    /**
      * Evaluates the given JavaScript code and returns the result, throwing if there were errors.
      */
    def evalJavaScript(code: String): js.Any = js.native
    
    /**
      * Evaluates the given TwineScript code and returns the result, throwing if there were errors.
      */
    def evalTwineScript(code: String): js.Any = js.native
    
    def parse(rawCodeString: String): String = js.native
  }
  object ScriptingAPI {
    
    @scala.inline
    def apply(evalJavaScript: String => js.Any, evalTwineScript: String => js.Any, parse: String => String): ScriptingAPI = {
      val __obj = js.Dynamic.literal(evalJavaScript = js.Any.fromFunction1(evalJavaScript), evalTwineScript = js.Any.fromFunction1(evalTwineScript), parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[ScriptingAPI]
    }
    
    @scala.inline
    implicit class ScriptingAPIMutableBuilder[Self <: ScriptingAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvalJavaScript(value: String => js.Any): Self = StObject.set(x, "evalJavaScript", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEvalTwineScript(value: String => js.Any): Self = StObject.set(x, "evalTwineScript", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParse(value: String => String): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
}
