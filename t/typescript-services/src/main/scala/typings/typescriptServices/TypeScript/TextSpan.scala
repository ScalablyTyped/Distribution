package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextSpan extends js.Object {
  var _length: js.Any = js.native
  var _start: js.Any = js.native
  def containsPosition(position: Double): Boolean = js.native
  def containsTextSpan(span: TextSpan): Boolean = js.native
  def end(): Double = js.native
  def intersection(span: TextSpan): TextSpan = js.native
  def intersectsWith(start: Double, length: Double): Boolean = js.native
  def intersectsWithPosition(position: Double): Boolean = js.native
  def intersectsWithTextSpan(span: TextSpan): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def length(): Double = js.native
  def overlap(span: TextSpan): TextSpan = js.native
  def overlapsWith(span: TextSpan): Boolean = js.native
  def start(): Double = js.native
}

object TextSpan {
  @scala.inline
  def apply(
    _length: js.Any,
    _start: js.Any,
    containsPosition: Double => Boolean,
    containsTextSpan: TextSpan => Boolean,
    end: () => Double,
    intersection: TextSpan => TextSpan,
    intersectsWith: (Double, Double) => Boolean,
    intersectsWithPosition: Double => Boolean,
    intersectsWithTextSpan: TextSpan => Boolean,
    isEmpty: () => Boolean,
    length: () => Double,
    overlap: TextSpan => TextSpan,
    overlapsWith: TextSpan => Boolean,
    start: () => Double
  ): TextSpan = {
    val __obj = js.Dynamic.literal(_length = _length.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], containsPosition = js.Any.fromFunction1(containsPosition), containsTextSpan = js.Any.fromFunction1(containsTextSpan), end = js.Any.fromFunction0(end), intersection = js.Any.fromFunction1(intersection), intersectsWith = js.Any.fromFunction2(intersectsWith), intersectsWithPosition = js.Any.fromFunction1(intersectsWithPosition), intersectsWithTextSpan = js.Any.fromFunction1(intersectsWithTextSpan), isEmpty = js.Any.fromFunction0(isEmpty), length = js.Any.fromFunction0(length), overlap = js.Any.fromFunction1(overlap), overlapsWith = js.Any.fromFunction1(overlapsWith), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[TextSpan]
  }
  @scala.inline
  implicit class TextSpanOps[Self <: TextSpan] (val x: Self) extends AnyVal {
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
    def set_length(value: js.Any): Self = this.set("_length", value.asInstanceOf[js.Any])
    @scala.inline
    def set_start(value: js.Any): Self = this.set("_start", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainsPosition(value: Double => Boolean): Self = this.set("containsPosition", js.Any.fromFunction1(value))
    @scala.inline
    def setContainsTextSpan(value: TextSpan => Boolean): Self = this.set("containsTextSpan", js.Any.fromFunction1(value))
    @scala.inline
    def setEnd(value: () => Double): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def setIntersection(value: TextSpan => TextSpan): Self = this.set("intersection", js.Any.fromFunction1(value))
    @scala.inline
    def setIntersectsWith(value: (Double, Double) => Boolean): Self = this.set("intersectsWith", js.Any.fromFunction2(value))
    @scala.inline
    def setIntersectsWithPosition(value: Double => Boolean): Self = this.set("intersectsWithPosition", js.Any.fromFunction1(value))
    @scala.inline
    def setIntersectsWithTextSpan(value: TextSpan => Boolean): Self = this.set("intersectsWithTextSpan", js.Any.fromFunction1(value))
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
    @scala.inline
    def setOverlap(value: TextSpan => TextSpan): Self = this.set("overlap", js.Any.fromFunction1(value))
    @scala.inline
    def setOverlapsWith(value: TextSpan => Boolean): Self = this.set("overlapsWith", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: () => Double): Self = this.set("start", js.Any.fromFunction0(value))
  }
  
}

