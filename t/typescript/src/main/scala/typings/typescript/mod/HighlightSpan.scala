package typings.typescript.mod

import typings.typescript.typescriptBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightSpan extends js.Object {
  var contextSpan: js.UndefOr[TextSpan] = js.native
  var fileName: js.UndefOr[java.lang.String] = js.native
  var isInString: js.UndefOr[`true`] = js.native
  var kind: HighlightSpanKind = js.native
  var textSpan: TextSpan = js.native
}

object HighlightSpan {
  @scala.inline
  def apply(kind: HighlightSpanKind, textSpan: TextSpan): HighlightSpan = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightSpan]
  }
  @scala.inline
  implicit class HighlightSpanOps[Self <: HighlightSpan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: HighlightSpanKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextSpan(value: TextSpan): Self = this.set("textSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextSpan(value: TextSpan): Self = this.set("contextSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextSpan: Self = this.set("contextSpan", js.undefined)
    @scala.inline
    def setFileName(value: java.lang.String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setIsInString(value: `true`): Self = this.set("isInString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInString: Self = this.set("isInString", js.undefined)
  }
  
}

