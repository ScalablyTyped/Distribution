package typings.textToSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontOptions extends js.Object {
  
  /**
    * @default "left baseline"
    */
  var anchor: js.UndefOr[Anchor | Null] = js.native
  
  /**
    * Size of the text.
    * @default 72
    */
  var fontSize: js.UndefOr[Double | Null] = js.native
  
  /**
    * If true takes kerning information into account.
    * @default true
    */
  var kerning: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Letter-spacing value in em.
    */
  var letterSpacing: js.UndefOr[Double | Null] = js.native
  
  /**
    * Tracking value in (em / 1000).
    */
  var tracking: js.UndefOr[Double | Null] = js.native
  
  /**
    * Horizontal position of the beginning of the text.
    * @default 0
    */
  var x: js.UndefOr[Double | Null] = js.native
  
  /**
    * Vertical position of the baseline of the text.
    * @default 0
    */
  var y: js.UndefOr[Double | Null] = js.native
}
object FontOptions {
  
  @scala.inline
  def apply(): FontOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontOptions]
  }
  
  @scala.inline
  implicit class FontOptionsOps[Self <: FontOptions] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: Anchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAnchorNull: Self = this.set("anchor", null)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontSizeNull: Self = this.set("fontSize", null)
    
    @scala.inline
    def setKerning(value: Boolean): Self = this.set("kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKerning: Self = this.set("kerning", js.undefined)
    
    @scala.inline
    def setKerningNull: Self = this.set("kerning", null)
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLetterSpacingNull: Self = this.set("letterSpacing", null)
    
    @scala.inline
    def setTracking(value: Double): Self = this.set("tracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracking: Self = this.set("tracking", js.undefined)
    
    @scala.inline
    def setTrackingNull: Self = this.set("tracking", null)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXNull: Self = this.set("x", null)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYNull: Self = this.set("y", null)
  }
}
