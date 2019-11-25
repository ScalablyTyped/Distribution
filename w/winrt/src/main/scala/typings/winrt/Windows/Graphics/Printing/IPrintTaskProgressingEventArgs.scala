package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskProgressingEventArgs extends js.Object {
  var documentPageCount: Double
}

object IPrintTaskProgressingEventArgs {
  @scala.inline
  def apply(documentPageCount: Double): IPrintTaskProgressingEventArgs = {
    val __obj = js.Dynamic.literal(documentPageCount = documentPageCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPrintTaskProgressingEventArgs]
  }
}

