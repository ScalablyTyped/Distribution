package typings.twineSugarcube.scriptingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptingAPI extends js.Object {
  
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
  implicit class ScriptingAPIOps[Self <: ScriptingAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvalJavaScript(value: String => js.Any): Self = this.set("evalJavaScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvalTwineScript(value: String => js.Any): Self = this.set("evalTwineScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParse(value: String => String): Self = this.set("parse", js.Any.fromFunction1(value))
  }
}
