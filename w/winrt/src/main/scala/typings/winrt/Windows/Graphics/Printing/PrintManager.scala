package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintManager extends IPrintManager

object PrintManager {
  @scala.inline
  def apply(onprinttaskrequested: js.Any): PrintManager = {
    val __obj = js.Dynamic.literal(onprinttaskrequested = onprinttaskrequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintManager]
  }
}

