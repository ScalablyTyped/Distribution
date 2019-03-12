package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowDialogFactory extends js.Object {
  def createWithTitle(title: java.lang.String): CoreWindowDialog
}

object ICoreWindowDialogFactory {
  @scala.inline
  def apply(createWithTitle: java.lang.String => CoreWindowDialog): ICoreWindowDialogFactory = {
    val __obj = js.Dynamic.literal(createWithTitle = js.Any.fromFunction1(createWithTitle))
  
    __obj.asInstanceOf[ICoreWindowDialogFactory]
  }
}

