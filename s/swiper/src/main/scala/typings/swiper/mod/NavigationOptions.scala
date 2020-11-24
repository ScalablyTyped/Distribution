package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationOptions extends js.Object {
  
  /**
    * CSS class name added to navigation button when it becomes disabled
    *
    * @default 'swiper-button-disabled'
    */
  var disabledClass: js.UndefOr[String] = js.native
  
  /**
    * CSS class name added to navigation button when it becomes hidden
    *
    * @default 'swiper-button-hidden'
    */
  var hiddenClass: js.UndefOr[String] = js.native
  
  /**
    * buttons visibility after click on Slider's container
    *
    * @default false Toggle navigation
    */
  var hideOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * String with CSS selector or HTML element of the element that will work
    * like "next" button after click on it
    *
    * @default null
    */
  var nextEl: js.UndefOr[SelectableElement] = js.native
  
  /**
    * String with CSS selector or HTML element of the element that will work
    * like "prev" button after click on it
    *
    * @default null
    */
  var prevEl: js.UndefOr[SelectableElement] = js.native
}
object NavigationOptions {
  
  @scala.inline
  def apply(): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions]
  }
  
  @scala.inline
  implicit class NavigationOptionsOps[Self <: NavigationOptions] (val x: Self) extends AnyVal {
    
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
    def setDisabledClass(value: String): Self = this.set("disabledClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledClass: Self = this.set("disabledClass", js.undefined)
    
    @scala.inline
    def setHiddenClass(value: String): Self = this.set("hiddenClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenClass: Self = this.set("hiddenClass", js.undefined)
    
    @scala.inline
    def setHideOnClick(value: Boolean): Self = this.set("hideOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnClick: Self = this.set("hideOnClick", js.undefined)
    
    @scala.inline
    def setNextEl(value: SelectableElement): Self = this.set("nextEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextEl: Self = this.set("nextEl", js.undefined)
    
    @scala.inline
    def setPrevEl(value: SelectableElement): Self = this.set("prevEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevEl: Self = this.set("prevEl", js.undefined)
  }
}
