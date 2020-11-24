package typings.uifabricMergeStyles.irawstylebaseMod

import typings.uifabricMergeStyles.uifabricMergeStylesStrings.auto
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.block
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.fallback
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.optional
import typings.uifabricMergeStyles.uifabricMergeStylesStrings.swap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFontFace extends IRawFontStyle {
  
  /**
    * Determines how a font face is displayed based on whether and when it is downloaded
    * and ready to use.
    */
  var fontDisplay: js.UndefOr[auto | block | swap | fallback | optional] = js.native
  
  /**
    * Feature settings for the font.
    */
  var fontFeatureSettings: js.UndefOr[String] = js.native
  
  /**
    * Specifies the src of the font.
    */
  var src: js.UndefOr[String] = js.native
  
  /**
    * unicode-range allows you to set a specific range of characters to be downloaded
    * from a font (embedded using \@font-face) and made available for use on the current
    * page.
    */
  var unicodeRange: js.UndefOr[ICSSRule | String] = js.native
}
object IFontFace {
  
  @scala.inline
  def apply(): IFontFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFontFace]
  }
  
  @scala.inline
  implicit class IFontFaceOps[Self <: IFontFace] (val x: Self) extends AnyVal {
    
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
    def setFontDisplay(value: auto | block | swap | fallback | optional): Self = this.set("fontDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontDisplay: Self = this.set("fontDisplay", js.undefined)
    
    @scala.inline
    def setFontFeatureSettings(value: String): Self = this.set("fontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFeatureSettings: Self = this.set("fontFeatureSettings", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setUnicodeRange(value: ICSSRule | String): Self = this.set("unicodeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicodeRange: Self = this.set("unicodeRange", js.undefined)
  }
}
