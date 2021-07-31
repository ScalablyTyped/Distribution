package typings.swiper.mod

import typings.swiper.swiperStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollbarOptions extends StObject {
  
  /**
    *     Scrollbar draggable element CSS class
    *
    * @default 'swiper-scrollbar-drag'
    */
  var dragClass: js.UndefOr[String] = js.undefined
  
  /**
    * Size of scrollbar draggable element in px
    *
    * @default 'auto'
    */
  var dragSize: js.UndefOr[auto | Double] = js.undefined
  
  /**
    * Set to true to enable make scrollbar draggable that allows you to control slider position
    *
    * @default true
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String with CSS selector or HTML element of the container with scrollbar.
    */
  var el: SelectableElement
  
  /**
    * Hide scrollbar automatically after user interaction
    *
    * @default true
    */
  var hide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Scrollbar element additional CSS class when it is disabled
    *
    * @default 'swiper-scrollbar-lock'
    */
  var lockClass: js.UndefOr[String] = js.undefined
  
  /**
    * Set to true to snap slider position to slides when you release scrollbar
    *
    * @default false
    */
  var snapOnRelease: js.UndefOr[Boolean] = js.undefined
}
object ScrollbarOptions {
  
  @scala.inline
  def apply(el: SelectableElement): ScrollbarOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarOptions]
  }
  
  @scala.inline
  implicit class ScrollbarOptionsMutableBuilder[Self <: ScrollbarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragClass(value: String): Self = StObject.set(x, "dragClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragClassUndefined: Self = StObject.set(x, "dragClass", js.undefined)
    
    @scala.inline
    def setDragSize(value: auto | Double): Self = StObject.set(x, "dragSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragSizeUndefined: Self = StObject.set(x, "dragSize", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setEl(value: SelectableElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setLockClass(value: String): Self = StObject.set(x, "lockClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockClassUndefined: Self = StObject.set(x, "lockClass", js.undefined)
    
    @scala.inline
    def setSnapOnRelease(value: Boolean): Self = StObject.set(x, "snapOnRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapOnReleaseUndefined: Self = StObject.set(x, "snapOnRelease", js.undefined)
  }
}
