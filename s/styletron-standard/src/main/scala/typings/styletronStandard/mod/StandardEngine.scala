package typings.styletronStandard.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardEngine extends js.Object {
  def renderFontFace(fontFace: FontFace): String = js.native
  def renderKeyframes(keyframes: KeyframesObject): String = js.native
  def renderStyle(style: StyleObject): String = js.native
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
  @scala.inline
  implicit class StandardEngineOps[Self <: StandardEngine] (val x: Self) extends AnyVal {
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
    def setRenderFontFace(value: FontFace => String): Self = this.set("renderFontFace", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderKeyframes(value: KeyframesObject => String): Self = this.set("renderKeyframes", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderStyle(value: StyleObject => String): Self = this.set("renderStyle", js.Any.fromFunction1(value))
  }
  
}

