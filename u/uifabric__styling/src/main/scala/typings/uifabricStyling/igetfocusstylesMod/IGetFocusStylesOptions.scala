package typings.uifabricStyling.igetfocusstylesMod

import typings.uifabricMergeStyles.irawstyleMod.IRawStyle
import typings.uifabricStyling.uifabricStylingStrings.absolute
import typings.uifabricStyling.uifabricStylingStrings.relative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGetFocusStylesOptions extends js.Object {
  
  /**
    * Color of the border.
    * @defaultvalue theme.palette.white
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /**
    * Style for high contrast mode.
    */
  var highContrastStyle: js.UndefOr[IRawStyle] = js.native
  
  /**
    * The number of pixels to inset the border.
    * @defaultvalue 0
    */
  var inset: js.UndefOr[Double] = js.native
  
  /**
    * If the styles should apply on `:focus` pseudo element.
    * @defaultvalue true
    */
  var isFocusedOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Color of the outline.
    * @defaultvalue theme.palette.neutralSecondary
    */
  var outlineColor: js.UndefOr[String] = js.native
  
  /**
    * The positioning applied to the container.
    * Must be 'relative' or 'absolute' so that the focus border can live around it.
    * @defaultvalue 'relative'
    */
  var position: js.UndefOr[relative | absolute] = js.native
  
  /**
    * The width of the border in pixels.
    * @defaultvalue 1
    */
  var width: js.UndefOr[Double] = js.native
}
object IGetFocusStylesOptions {
  
  @scala.inline
  def apply(): IGetFocusStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetFocusStylesOptions]
  }
  
  @scala.inline
  implicit class IGetFocusStylesOptionsOps[Self <: IGetFocusStylesOptions] (val x: Self) extends AnyVal {
    
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setHighContrastStyle(value: IRawStyle): Self = this.set("highContrastStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighContrastStyle: Self = this.set("highContrastStyle", js.undefined)
    
    @scala.inline
    def setInset(value: Double): Self = this.set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    
    @scala.inline
    def setIsFocusedOnly(value: Boolean): Self = this.set("isFocusedOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFocusedOnly: Self = this.set("isFocusedOnly", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: String): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    
    @scala.inline
    def setPosition(value: relative | absolute): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
