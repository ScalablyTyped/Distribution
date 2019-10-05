package typings.winrt.Windows.UI.Popups

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUICommandFactory extends js.Object {
  def create(label: String): UICommand
  def createWithHandler(label: String, action: UICommandInvokedHandler): UICommand
  def createWithHandlerAndId(label: String, action: UICommandInvokedHandler, commandId: js.Any): UICommand
}

object IUICommandFactory {
  @scala.inline
  def apply(
    create: String => UICommand,
    createWithHandler: (String, UICommandInvokedHandler) => UICommand,
    createWithHandlerAndId: (String, UICommandInvokedHandler, js.Any) => UICommand
  ): IUICommandFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithHandler = js.Any.fromFunction2(createWithHandler), createWithHandlerAndId = js.Any.fromFunction3(createWithHandlerAndId))
  
    __obj.asInstanceOf[IUICommandFactory]
  }
}

