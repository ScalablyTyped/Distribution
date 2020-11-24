package typings.wallop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Override class for "next" button.
    *
    * @default 'Wallop-buttonNext'
    */
  var buttonNextClass: js.UndefOr[String] = js.native
  
  /**
    * Override class for "previous" button.
    *
    * @default 'Wallop-buttonPrevious'
    */
  var buttonPreviousClass: js.UndefOr[String] = js.native
  
  /**
    * Enable/disable carousel mode.
    *
    * @default true
    */
  var carousel: js.UndefOr[Boolean] = js.native
  
  /**
    * Override class for current item.
    *
    * @default 'Wallop-item--current'
    */
  var currentItemClass: js.UndefOr[String] = js.native
  
  /**
    * Override class that hides next item.
    *
    * @default 'Wallop-item--hideNext'
    */
  var hideNextClass: js.UndefOr[String] = js.native
  
  /**
    * Override class that hides previous item.
    *
    * @default 'Wallop-item--hidePrevious'
    */
  var hidePreviousClass: js.UndefOr[String] = js.native
  
  /**
    * Override class for item.
    *
    * @default 'Wallop-item'
    */
  var itemClass: js.UndefOr[String] = js.native
  
  /**
    * Override class for item that will show next.
    *
    * @default 'Wallop-item--showNext'
    */
  var showNextClass: js.UndefOr[String] = js.native
  
  /**
    * Override class for item that will showed previously.
    *
    * @default 'Wallop-item--showPrevious'
    */
  var showPreviousClass: js.UndefOr[String] = js.native
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
    def setButtonNextClass(value: String): Self = this.set("buttonNextClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonNextClass: Self = this.set("buttonNextClass", js.undefined)
    
    @scala.inline
    def setButtonPreviousClass(value: String): Self = this.set("buttonPreviousClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonPreviousClass: Self = this.set("buttonPreviousClass", js.undefined)
    
    @scala.inline
    def setCarousel(value: Boolean): Self = this.set("carousel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarousel: Self = this.set("carousel", js.undefined)
    
    @scala.inline
    def setCurrentItemClass(value: String): Self = this.set("currentItemClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentItemClass: Self = this.set("currentItemClass", js.undefined)
    
    @scala.inline
    def setHideNextClass(value: String): Self = this.set("hideNextClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideNextClass: Self = this.set("hideNextClass", js.undefined)
    
    @scala.inline
    def setHidePreviousClass(value: String): Self = this.set("hidePreviousClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidePreviousClass: Self = this.set("hidePreviousClass", js.undefined)
    
    @scala.inline
    def setItemClass(value: String): Self = this.set("itemClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemClass: Self = this.set("itemClass", js.undefined)
    
    @scala.inline
    def setShowNextClass(value: String): Self = this.set("showNextClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNextClass: Self = this.set("showNextClass", js.undefined)
    
    @scala.inline
    def setShowPreviousClass(value: String): Self = this.set("showPreviousClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPreviousClass: Self = this.set("showPreviousClass", js.undefined)
  }
}
