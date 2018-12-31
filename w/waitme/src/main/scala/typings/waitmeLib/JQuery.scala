package typings
package waitmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * $(container).waitMe({param1 : value1, param2 : value2, ...});
    */
  @JSName("waitMe")
  var waitMe_Original: waitmeLib.WaitMeNs.WaitMeStatic = js.native
  /**
    * execution after closed.
    * Use: $('.waitMe').on('close', function() {});
    * @param event 
    * @param handler 
    * @returns {this} 
    */
  @JSName("on")
  def on_close(event: waitmeLib.waitmeLibStrings.close, handler: js.Function0[scala.Unit]): this.type = js.native
  /**
    * init with default options
    * Use: $(container).waitMe();
    *
    * init with custom options
    * Use: $(container).waitMe({param1 : value1, param2 : value2, ...});
    *
    * for close waitMe.
    * Use: $(container).waitMe("hide");
    *
    * @param options
    * @returns {JQuery}
    */
  /**
    * $(container).waitMe({param1 : value1, param2 : value2, ...});
    */
  def waitMe(): JQuery = js.native
  def waitMe(options: waitmeLib.WaitMeNs.WaitMeOptions): JQuery = js.native
  @JSName("waitMe")
  def waitMe_hide(options: waitmeLib.waitmeLibStrings.hide): JQuery = js.native
}

