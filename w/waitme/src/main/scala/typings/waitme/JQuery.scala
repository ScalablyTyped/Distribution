package typings.waitme

import typings.waitme.WaitMe.WaitMeOptions
import typings.waitme.WaitMe.WaitMeStatic
import typings.waitme.waitmeStrings.close
import typings.waitme.waitmeStrings.hide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * execution after closed.
    * Use: $('.waitMe').on('close', function() {});
    * @param event 
    * @param handler 
    * @returns {this} 
    */
  @JSName("on")
  def on_close(event: close, handler: js.Function0[Unit]): this.type
  
  /**
    * $(container).waitMe({param1 : value1, param2 : value2, ...});
    */
  def waitMe(): JQuery
  def waitMe(options: WaitMeOptions): JQuery
  /**
    * $(container).waitMe({param1 : value1, param2 : value2, ...});
    */
  @JSName("waitMe")
  var waitMe_Original: WaitMeStatic
  @JSName("waitMe")
  def waitMe_hide(options: hide): JQuery
}
object JQuery {
  
  inline def apply(
    on: (close, js.Function0[Unit]) => JQuery,
    waitMe: /* options */ js.UndefOr[WaitMeOptions | hide] => JQuery
  ): JQuery = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), waitMe = js.Any.fromFunction1(waitMe))
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    inline def setOn(value: (close, js.Function0[Unit]) => JQuery): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setWaitMe(value: /* options */ js.UndefOr[WaitMeOptions | hide] => JQuery): Self = StObject.set(x, "waitMe", js.Any.fromFunction1(value))
  }
}
