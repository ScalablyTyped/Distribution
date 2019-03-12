package typings
package winrtLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUICommandFactory extends js.Object {
  def create(label: java.lang.String): UICommand
  def createWithHandler(label: java.lang.String, action: UICommandInvokedHandler): UICommand
  def createWithHandlerAndId(label: java.lang.String, action: UICommandInvokedHandler, commandId: js.Any): UICommand
}

object IUICommandFactory {
  @scala.inline
  def apply(
    create: java.lang.String => UICommand,
    createWithHandler: (java.lang.String, UICommandInvokedHandler) => UICommand,
    createWithHandlerAndId: (java.lang.String, UICommandInvokedHandler, js.Any) => UICommand
  ): IUICommandFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithHandler = js.Any.fromFunction2(createWithHandler), createWithHandlerAndId = js.Any.fromFunction3(createWithHandlerAndId))
  
    __obj.asInstanceOf[IUICommandFactory]
  }
}

