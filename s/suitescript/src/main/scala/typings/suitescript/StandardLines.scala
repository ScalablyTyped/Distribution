package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardLines extends js.Object {
  def getCount(): Double = js.native
  def getLine(index: Double): StandardLine = js.native
}

object StandardLines {
  @scala.inline
  def apply(getCount: () => Double, getLine: Double => StandardLine): StandardLines = {
    val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction0(getCount), getLine = js.Any.fromFunction1(getLine))
    __obj.asInstanceOf[StandardLines]
  }
  @scala.inline
  implicit class StandardLinesOps[Self <: StandardLines] (val x: Self) extends AnyVal {
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
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLine(value: Double => StandardLine): Self = this.set("getLine", js.Any.fromFunction1(value))
  }
  
}

