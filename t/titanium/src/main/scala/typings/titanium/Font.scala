package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract datatype for specifying a text font.
  */
@js.native
trait Font extends js.Object {
  /**
    * Specifies the font family or specific font to use.
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.native
  /**
    * Font size, in platform-dependent units.
    */
  var fontSize: js.UndefOr[Double | java.lang.String] = js.native
  /**
    * Font style. Valid values are "italic" or "normal".
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.native
  /**
    * Font weight. Valid values are "bold", "semibold", "normal", "thin",
    * "light" and "ultralight".
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.native
  /**
    * The text style for the font.
    */
  var textStyle: js.UndefOr[java.lang.String] = js.native
}

object Font {
  @scala.inline
  def apply(): Font = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Font]
  }
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
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
    def setFontFamily(value: java.lang.String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double | java.lang.String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontStyle(value: java.lang.String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeight(value: java.lang.String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setTextStyle(value: java.lang.String): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

