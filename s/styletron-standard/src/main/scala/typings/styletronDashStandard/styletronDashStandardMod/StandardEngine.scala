package typings.styletronDashStandard.styletronDashStandardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardEngine extends js.Object {
  def renderFontFace(fontFace: FontFace): String
  def renderKeyframes(keyframes: KeyframesObject): String
  def renderStyle(style: StyleObject): String
}

object StandardEngine {
  @scala.inline
  def apply(
    renderFontFace: FontFace => String,
    renderKeyframes: KeyframesObject => String,
    renderStyle: StyleObject => String
  ): StandardEngine = {
    val __obj = js.Dynamic.literal(renderFontFace = js.Any.fromFunction1(renderFontFace), renderKeyframes = js.Any.fromFunction1(renderKeyframes), renderStyle = js.Any.fromFunction1(renderStyle))
  
    __obj.asInstanceOf[StandardEngine]
  }
}

