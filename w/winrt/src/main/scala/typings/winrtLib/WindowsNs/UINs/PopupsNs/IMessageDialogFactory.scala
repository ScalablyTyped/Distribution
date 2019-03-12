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
    create: java.lang.String => MessageDialog,
    createWithTitle: (java.lang.String, java.lang.String) => MessageDialog
  ): IMessageDialogFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithTitle = js.Any.fromFunction2(createWithTitle))
  
    __obj.asInstanceOf[IMessageDialogFactory]
  }
}

