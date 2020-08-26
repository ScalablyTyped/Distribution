package typings.vegaTypings.titleMod

import typings.vegaTypings.encodeMod.Encode
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.encodeMod.TextEncodeEntry
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Title extends BaseTitle {
  /**
    * Mark definitions for custom title encoding.
    */
  var encode: js.UndefOr[TitleEncode | Encode[TextEncodeEntry]] = js.native
  /**
    * A boolean flag indicating if the title element should respond to input events such as mouse hover. (**Deprecated.**)
    */
  var interactive: js.UndefOr[Boolean] = js.native
  /**
    * A mark name property to apply to the title text mark. (**Deprecated.**)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A mark style property to apply to the title text mark. If not specified, a default style of `"group-title"` is applied. (**Deprecated**)
    */
  var style: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The subtitle text.
    */
  var subtitle: js.UndefOr[Text | SignalRef] = js.native
  /**
    * The title text.
    */
  var text: Text | SignalRef = js.native
}

object Title {
  @scala.inline
  def apply(text: Text | SignalRef): Title = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  @scala.inline
  implicit class TitleOps[Self <: Title] (val x: Self) extends AnyVal {
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
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setText(value: Text | SignalRef): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncode(value: TitleEncode | Encode[TextEncodeEntry]): Self = this.set("encode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStyleVarargs(value: String*): Self = this.set("style", js.Array(value :_*))
    @scala.inline
    def setStyle(value: String | js.Array[String]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSubtitleVarargs(value: String*): Self = this.set("subtitle", js.Array(value :_*))
    @scala.inline
    def setSubtitle(value: Text | SignalRef): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
  }
  
}

