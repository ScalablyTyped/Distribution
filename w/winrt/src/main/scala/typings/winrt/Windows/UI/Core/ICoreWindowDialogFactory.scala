package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowDialogFactory extends js.Object {
  def createWithTitle(title: String): CoreWindowDialog
}

object ICoreWindowDialogFactory {
  @scala.inline
  def apply(createWithTitle: String => CoreWindowDialog): ICoreWindowDialogFactory = {
    val __obj = js.Dynamic.literal(createWithTitle = js.Any.fromFunction1(createWithTitle))
    __obj.asInstanceOf[ICoreWindowDialogFactory]
  }
}

