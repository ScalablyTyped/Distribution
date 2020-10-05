package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrinterOptions extends js.Object {
  var newLine: js.UndefOr[NewLineKind] = js.native
  var noEmitHelpers: js.UndefOr[Boolean] = js.native
  var omitTrailingSemicolon: js.UndefOr[Boolean] = js.native
  var removeComments: js.UndefOr[Boolean] = js.native
}

object PrinterOptions {
  @scala.inline
  def apply(): PrinterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterOptions]
  }
  @scala.inline
  implicit class PrinterOptionsOps[Self <: PrinterOptions] (val x: Self) extends AnyVal {
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
    def setNewLine(value: NewLineKind): Self = this.set("newLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewLine: Self = this.set("newLine", js.undefined)
    @scala.inline
    def setNoEmitHelpers(value: Boolean): Self = this.set("noEmitHelpers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoEmitHelpers: Self = this.set("noEmitHelpers", js.undefined)
    @scala.inline
    def setOmitTrailingSemicolon(value: Boolean): Self = this.set("omitTrailingSemicolon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOmitTrailingSemicolon: Self = this.set("omitTrailingSemicolon", js.undefined)
    @scala.inline
    def setRemoveComments(value: Boolean): Self = this.set("removeComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveComments: Self = this.set("removeComments", js.undefined)
  }
  
}

