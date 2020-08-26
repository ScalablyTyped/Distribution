package typings.tinymce.mod.dom

import typings.std.Document
import typings.std.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeUtils extends js.Object {
  def compareRanges(rng1: Range, rng2: Range): Boolean = js.native
  def getCaretRangeFromPoint(clientX: Double, clientY: Double, doc: Document): Range = js.native
}

object RangeUtils {
  @scala.inline
  def apply(
    compareRanges: (Range, Range) => Boolean,
    getCaretRangeFromPoint: (Double, Double, Document) => Range
  ): RangeUtils = {
    val __obj = js.Dynamic.literal(compareRanges = js.Any.fromFunction2(compareRanges), getCaretRangeFromPoint = js.Any.fromFunction3(getCaretRangeFromPoint))
    __obj.asInstanceOf[RangeUtils]
  }
  @scala.inline
  implicit class RangeUtilsOps[Self <: RangeUtils] (val x: Self) extends AnyVal {
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
    def setCompareRanges(value: (Range, Range) => Boolean): Self = this.set("compareRanges", js.Any.fromFunction2(value))
    @scala.inline
    def setGetCaretRangeFromPoint(value: (Double, Double, Document) => Range): Self = this.set("getCaretRangeFromPoint", js.Any.fromFunction3(value))
  }
  
}

