package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.SyntaxKind
import typings.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenSpan extends TextSpan {
  var _kind: js.Any = js.native
  def kind(): SyntaxKind = js.native
}

object TokenSpan {
  @scala.inline
  def apply(
    _kind: js.Any,
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
    kind: () => SyntaxKind,
    length: () => Double,
    overlap: TextSpan => TextSpan,
    overlapsWith: TextSpan => Boolean,
    start: () => Double
  ): TokenSpan = {
    val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], _length = _length.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], containsPosition = js.Any.fromFunction1(containsPosition), containsTextSpan = js.Any.fromFunction1(containsTextSpan), end = js.Any.fromFunction0(end), intersection = js.Any.fromFunction1(intersection), intersectsWith = js.Any.fromFunction2(intersectsWith), intersectsWithPosition = js.Any.fromFunction1(intersectsWithPosition), intersectsWithTextSpan = js.Any.fromFunction1(intersectsWithTextSpan), isEmpty = js.Any.fromFunction0(isEmpty), kind = js.Any.fromFunction0(kind), length = js.Any.fromFunction0(length), overlap = js.Any.fromFunction1(overlap), overlapsWith = js.Any.fromFunction1(overlapsWith), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[TokenSpan]
  }
  @scala.inline
  implicit class TokenSpanOps[Self <: TokenSpan] (val x: Self) extends AnyVal {
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
    def set_kind(value: js.Any): Self = this.set("_kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: () => SyntaxKind): Self = this.set("kind", js.Any.fromFunction0(value))
  }
  
}

