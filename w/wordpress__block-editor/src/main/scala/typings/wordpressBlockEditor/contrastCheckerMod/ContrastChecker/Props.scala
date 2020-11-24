package typings.wordpressBlockEditor.contrastCheckerMod.ContrastChecker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  var fallbackBackgroundColor: js.UndefOr[String] = js.native
  
  var fallbackTextColor: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var isLargeText: js.UndefOr[Boolean] = js.native
  
  var textColor: js.UndefOr[String] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setFallbackBackgroundColor(value: String): Self = this.set("fallbackBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackBackgroundColor: Self = this.set("fallbackBackgroundColor", js.undefined)
    
    @scala.inline
    def setFallbackTextColor(value: String): Self = this.set("fallbackTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackTextColor: Self = this.set("fallbackTextColor", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setIsLargeText(value: Boolean): Self = this.set("isLargeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLargeText: Self = this.set("isLargeText", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
}
