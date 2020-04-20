package typings.winrt.Windows.UI.Popups

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageDialogFactory extends js.Object {
  def create(content: String): MessageDialog
  def createWithTitle(content: String, title: String): MessageDialog
}

object IMessageDialogFactory {
  @scala.inline
  def apply(create: String => MessageDialog, createWithTitle: (String, String) => MessageDialog): IMessageDialogFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createWithTitle = js.Any.fromFunction2(createWithTitle))
    __obj.asInstanceOf[IMessageDialogFactory]
  }
}

