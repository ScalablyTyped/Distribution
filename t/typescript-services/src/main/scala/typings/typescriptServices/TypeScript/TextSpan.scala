package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSpan extends js.Object {
  var _length: js.Any
  var _start: js.Any
  def containsPosition(position: Double): Boolean
  def containsTextSpan(span: TextSpan): Boolean
  def end(): Double
  def intersection(span: TextSpan): TextSpan
  def intersectsWith(start: Double, length: Double): Boolean
  def intersectsWithPosition(position: Double): Boolean
  def intersectsWithTextSpan(span: TextSpan): Boolean
  def isEmpty(): Boolean
  def length(): Double
  def overlap(span: TextSpan): TextSpan
  def overlapsWith(span: TextSpan): Boolean
  def start(): Double
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
}

