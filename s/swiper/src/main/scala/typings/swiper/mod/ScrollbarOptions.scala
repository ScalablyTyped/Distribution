package typings.swiper.mod

import typings.swiper.swiperStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollbarOptions extends js.Object {
  
  /**
    *     Scrollbar draggable element CSS class
    *
    * @default 'swiper-scrollbar-drag'
    */
  var dragClass: js.UndefOr[String] = js.native
  
  /**
    * Size of scrollbar draggable element in px
    *
    * @default 'auto'
    */
  var dragSize: js.UndefOr[auto | Double] = js.native
  
  /**
    * Set to true to enable make scrollbar draggable that allows you to control slider position
    *
    * @default true
    */
  var draggable: js.UndefOr[Boolean] = js.native
  
  /**
    * String with CSS selector or HTML element of the container with scrollbar.
    */
  var el: SelectableElement = js.native
  
  /**
    * Hide scrollbar automatically after user interaction
    *
    * @default true
    */
  var hide: js.UndefOr[Boolean] = js.native
  
  /**
    * Scrollbar element additional CSS class when it is disabled
    *
    * @default 'swiper-scrollbar-lock'
    */
  var lockClass: js.UndefOr[String] = js.native
  
  /**
    * Set to true to snap slider position to slides when you release scrollbar
    *
    * @default false
    */
  var snapOnRelease: js.UndefOr[Boolean] = js.native
}
object ScrollbarOptions {
  
  @scala.inline
  def apply(el: SelectableElement): ScrollbarOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarOptions]
  }
  
  @scala.inline
  implicit class ScrollbarOptionsOps[Self <: ScrollbarOptions] (val x: Self) extends AnyVal {
    
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
    def setEl(value: SelectableElement): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragClass(value: String): Self = this.set("dragClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragClass: Self = this.set("dragClass", js.undefined)
    
    @scala.inline
    def setDragSize(value: auto | Double): Self = this.set("dragSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragSize: Self = this.set("dragSize", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setLockClass(value: String): Self = this.set("lockClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockClass: Self = this.set("lockClass", js.undefined)
    
    @scala.inline
    def setSnapOnRelease(value: Boolean): Self = this.set("snapOnRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapOnRelease: Self = this.set("snapOnRelease", js.undefined)
  }
}
