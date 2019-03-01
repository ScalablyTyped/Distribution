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
    create: js.Function1[java.lang.String, UICommand],
    createWithHandler: js.Function2[java.lang.String, UICommandInvokedHandler, UICommand],
    createWithHandlerAndId: js.Function3[java.lang.String, UICommandInvokedHandler, js.Any, UICommand]
  ): IUICommandFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("createWithHandler")(createWithHandler)
    __obj.updateDynamic("createWithHandlerAndId")(createWithHandlerAndId)
    __obj.asInstanceOf[IUICommandFactory]
  }
}

