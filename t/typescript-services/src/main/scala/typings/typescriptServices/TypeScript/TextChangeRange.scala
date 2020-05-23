package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextChangeRange extends js.Object {
  var _newLength: js.Any
  var _span: js.Any
  def isUnchanged(): Boolean
  def newLength(): Double
  def newSpan(): TextSpan
  def span(): TextSpan
}

object TextChangeRange {
  @scala.inline
  def apply(
    _newLength: js.Any,
    _span: js.Any,
    isUnchanged: () => Boolean,
    newLength: () => Double,
    newSpan: () => TextSpan,
    span: () => TextSpan
  ): TextChangeRange = {
    val __obj = js.Dynamic.literal(_newLength = _newLength.asInstanceOf[js.Any], _span = _span.asInstanceOf[js.Any], isUnchanged = js.Any.fromFunction0(isUnchanged), newLength = js.Any.fromFunction0(newLength), newSpan = js.Any.fromFunction0(newSpan), span = js.Any.fromFunction0(span))
    __obj.asInstanceOf[TextChangeRange]
  }
}

