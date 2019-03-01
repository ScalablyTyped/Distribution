package typings
package winrtLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageDialogFactory extends js.Object {
  def create(content: java.lang.String): MessageDialog
  def createWithTitle(content: java.lang.String, title: java.lang.String): MessageDialog
}

object IMessageDialogFactory {
  @scala.inline
  def apply(
    create: js.Function1[java.lang.String, MessageDialog],
    createWithTitle: js.Function2[java.lang.String, java.lang.String, MessageDialog]
  ): IMessageDialogFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("createWithTitle")(createWithTitle)
    __obj.asInstanceOf[IMessageDialogFactory]
  }
}

