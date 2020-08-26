package typings.winrt.Windows.Graphics.Printing

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskSourceRequestedArgs extends js.Object {
  var deadline: Date = js.native
  def getDeferral(): PrintTaskSourceRequestedDeferral = js.native
  def setSource(source: IPrintDocumentSource): Unit = js.native
}

object IPrintTaskSourceRequestedArgs {
  @scala.inline
  def apply(
    deadline: Date,
    getDeferral: () => PrintTaskSourceRequestedDeferral,
    setSource: IPrintDocumentSource => Unit
  ): IPrintTaskSourceRequestedArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[IPrintTaskSourceRequestedArgs]
  }
  @scala.inline
  implicit class IPrintTaskSourceRequestedArgsOps[Self <: IPrintTaskSourceRequestedArgs] (val x: Self) extends AnyVal {
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
    def setDeadline(value: Date): Self = this.set("deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeferral(value: () => PrintTaskSourceRequestedDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setSetSource(value: IPrintDocumentSource => Unit): Self = this.set("setSource", js.Any.fromFunction1(value))
  }
  
}

