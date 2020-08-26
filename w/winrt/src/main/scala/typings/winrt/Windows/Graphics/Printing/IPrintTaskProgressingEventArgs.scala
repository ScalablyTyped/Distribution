package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskProgressingEventArgs extends js.Object {
  var documentPageCount: Double = js.native
}

object IPrintTaskProgressingEventArgs {
  @scala.inline
  def apply(documentPageCount: Double): IPrintTaskProgressingEventArgs = {
    val __obj = js.Dynamic.literal(documentPageCount = documentPageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskProgressingEventArgs]
  }
  @scala.inline
  implicit class IPrintTaskProgressingEventArgsOps[Self <: IPrintTaskProgressingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocumentPageCount(value: Double): Self = this.set("documentPageCount", value.asInstanceOf[js.Any])
  }
  
}

