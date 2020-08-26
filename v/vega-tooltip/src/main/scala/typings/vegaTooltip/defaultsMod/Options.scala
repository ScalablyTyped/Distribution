package typings.vegaTooltip.defaultsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  offsetX :number,   offsetY :number,   id :string,   styleId :string,   theme :string,   disableDefaultStyle :boolean,   sanitize :typeof escapeHTML,   maxDepth :number}> */
@js.native
trait Options extends js.Object {
  var disableDefaultStyle: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var maxDepth: js.UndefOr[Double] = js.native
  var offsetX: js.UndefOr[Double] = js.native
  var offsetY: js.UndefOr[Double] = js.native
  var sanitize: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof escapeHTML */ js.Any
  ] = js.native
  var styleId: js.UndefOr[String] = js.native
  var theme: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDisableDefaultStyle(value: Boolean): Self = this.set("disableDefaultStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDefaultStyle: Self = this.set("disableDefaultStyle", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setSanitize(
      value: /* import warning: importer.ImportType#apply Failed type conversion: typeof escapeHTML */ js.Any
    ): Self = this.set("sanitize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSanitize: Self = this.set("sanitize", js.undefined)
    @scala.inline
    def setStyleId(value: String): Self = this.set("styleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleId: Self = this.set("styleId", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

