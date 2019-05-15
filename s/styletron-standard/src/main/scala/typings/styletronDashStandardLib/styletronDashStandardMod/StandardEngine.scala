package typings
package styletronDashStandardLib.styletronDashStandardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardEngine extends js.Object {
  def renderFontFace(fontFace: FontFace): java.lang.String
  def renderKeyframes(keyframes: KeyframesObject): java.lang.String
  def renderStyle(style: StyleObject): java.lang.String
}

object StandardEngine {
  @scala.inline
  def apply(
    renderFontFace: FontFace => java.lang.String,
    renderKeyframes: KeyframesObject => java.lang.String,
    renderStyle: StyleObject => java.lang.String
  ): StandardEngine = {
    val __obj = js.Dynamic.literal(renderFontFace = js.Any.fromFunction1(renderFontFace), renderKeyframes = js.Any.fromFunction1(renderKeyframes), renderStyle = js.Any.fromFunction1(renderStyle))
  
    __obj.asInstanceOf[StandardEngine]
  }
}

