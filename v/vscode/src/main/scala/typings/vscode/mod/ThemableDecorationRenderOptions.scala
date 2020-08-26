package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemableDecorationRenderOptions extends js.Object {
  /**
    * Defines the rendering options of the attachment that is inserted after the decorated text.
    */
  var after: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.native
  /**
    * Background color of the decoration. Use rgba() and define transparent background colors to play well with other decorations.
    * Alternatively a color from the color registry can be [referenced](#ThemeColor).
    */
  var backgroundColor: js.UndefOr[String | ThemeColor] = js.native
  /**
    * Defines the rendering options of the attachment that is inserted before the decorated text.
    */
  var before: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var border: js.UndefOr[String] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderColor: js.UndefOr[String | ThemeColor] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderRadius: js.UndefOr[String] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderSpacing: js.UndefOr[String] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderStyle: js.UndefOr[String] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'border' for setting one or more of the individual border properties.
    */
  var borderWidth: js.UndefOr[String] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var color: js.UndefOr[String | ThemeColor] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var fontStyle: js.UndefOr[String] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var fontWeight: js.UndefOr[String] = js.native
  /**
    * An **absolute path** or an URI to an image to be rendered in the gutter.
    */
  var gutterIconPath: js.UndefOr[String | Uri] = js.native
  /**
    * Specifies the size of the gutter icon.
    * Available values are 'auto', 'contain', 'cover' and any percentage value.
    * For further information: https://msdn.microsoft.com/en-us/library/jj127316(v=vs.85).aspx
    */
  var gutterIconSize: js.UndefOr[String] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var letterSpacing: js.UndefOr[String] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var opacity: js.UndefOr[String] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var outline: js.UndefOr[String] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'outline' for setting one or more of the individual outline properties.
    */
  var outlineColor: js.UndefOr[String | ThemeColor] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'outline' for setting one or more of the individual outline properties.
    */
  var outlineStyle: js.UndefOr[String] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    * Better use 'outline' for setting one or more of the individual outline properties.
    */
  var outlineWidth: js.UndefOr[String] = js.native
  /**
    * The color of the decoration in the overview ruler. Use rgba() and define transparent colors to play well with other decorations.
    */
  var overviewRulerColor: js.UndefOr[String | ThemeColor] = js.native
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var textDecoration: js.UndefOr[String] = js.native
}

object ThemableDecorationRenderOptions {
  @scala.inline
  def apply(): ThemableDecorationRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemableDecorationRenderOptions]
  }
  @scala.inline
  implicit class ThemableDecorationRenderOptionsOps[Self <: ThemableDecorationRenderOptions] (val x: Self) extends AnyVal {
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
    def setAfter(value: ThemableDecorationAttachmentRenderOptions): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String | ThemeColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBefore(value: ThemableDecorationAttachmentRenderOptions): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setBorder(value: String): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setBorderColor(value: String | ThemeColor): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderRadius(value: String): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBorderSpacing(value: String): Self = this.set("borderSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderSpacing: Self = this.set("borderSpacing", js.undefined)
    @scala.inline
    def setBorderStyle(value: String): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    @scala.inline
    def setBorderWidth(value: String): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setColor(value: String | ThemeColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setGutterIconPath(value: String | Uri): Self = this.set("gutterIconPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutterIconPath: Self = this.set("gutterIconPath", js.undefined)
    @scala.inline
    def setGutterIconSize(value: String): Self = this.set("gutterIconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutterIconSize: Self = this.set("gutterIconSize", js.undefined)
    @scala.inline
    def setLetterSpacing(value: String): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    @scala.inline
    def setOpacity(value: String): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOutline(value: String): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setOutlineColor(value: String | ThemeColor): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    @scala.inline
    def setOutlineStyle(value: String): Self = this.set("outlineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineStyle: Self = this.set("outlineStyle", js.undefined)
    @scala.inline
    def setOutlineWidth(value: String): Self = this.set("outlineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineWidth: Self = this.set("outlineWidth", js.undefined)
    @scala.inline
    def setOverviewRulerColor(value: String | ThemeColor): Self = this.set("overviewRulerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverviewRulerColor: Self = this.set("overviewRulerColor", js.undefined)
    @scala.inline
    def setTextDecoration(value: String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
  }
  
}

