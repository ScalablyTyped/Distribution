package typings.swiper

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.swiper.swiperStrings.auto
import typings.swiper.typesSharedMod.CSSSelector
import typings.swiper.typesSwiperClassMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesScrollbarMod {
  
  @js.native
  trait ScrollbarEvents extends StObject {
    
    /**
      * Event will be fired on draggable scrollbar drag end
      */
    def scrollbarDragEnd(swiper: default, event: MouseEvent): Unit = js.native
    def scrollbarDragEnd(swiper: default, event: PointerEvent): Unit = js.native
    def scrollbarDragEnd(swiper: default, event: TouchEvent): Unit = js.native
    
    /**
      * Event will be fired on draggable scrollbar drag move
      */
    def scrollbarDragMove(swiper: default, event: MouseEvent): Unit = js.native
    def scrollbarDragMove(swiper: default, event: PointerEvent): Unit = js.native
    def scrollbarDragMove(swiper: default, event: TouchEvent): Unit = js.native
    
    /**
      * Event will be fired on draggable scrollbar drag start
      */
    def scrollbarDragStart(swiper: default, event: MouseEvent): Unit = js.native
    def scrollbarDragStart(swiper: default, event: PointerEvent): Unit = js.native
    def scrollbarDragStart(swiper: default, event: TouchEvent): Unit = js.native
  }
  
  trait ScrollbarMethods extends StObject {
    
    /**
      * Destroy scrollbar
      */
    def destroy(): Unit
    
    /**
      * HTMLElement of Scrollbar draggable handler element
      */
    var dragEl: HTMLElement
    
    /**
      * HTMLElement of Scrollbar container element
      */
    var el: HTMLElement
    
    /**
      * Initialize scrollbar
      */
    def init(): Unit
    
    /**
      * Updates scrollbar translate
      */
    def setTranslate(): Unit
    
    /**
      * Updates scrollbar track and handler sizes
      */
    def updateSize(): Unit
  }
  object ScrollbarMethods {
    
    inline def apply(
      destroy: () => Unit,
      dragEl: HTMLElement,
      el: HTMLElement,
      init: () => Unit,
      setTranslate: () => Unit,
      updateSize: () => Unit
    ): ScrollbarMethods = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), dragEl = dragEl.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), setTranslate = js.Any.fromFunction0(setTranslate), updateSize = js.Any.fromFunction0(updateSize))
      __obj.asInstanceOf[ScrollbarMethods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollbarMethods] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDragEl(value: HTMLElement): Self = StObject.set(x, "dragEl", value.asInstanceOf[js.Any])
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setSetTranslate(value: () => Unit): Self = StObject.set(x, "setTranslate", js.Any.fromFunction0(value))
      
      inline def setUpdateSize(value: () => Unit): Self = StObject.set(x, "updateSize", js.Any.fromFunction0(value))
    }
  }
  
  trait ScrollbarOptions extends StObject {
    
    /**
      * Scrollbar draggable element CSS class
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
      * Set to `true` to enable make scrollbar draggable that allows you to control slider position
      *
      * @default false
      */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * String with CSS selector or HTML element of the container with scrollbar.
      *
      * @default null
      */
    var el: js.UndefOr[CSSSelector | HTMLElement | Null] = js.undefined
    
    /**
      * Boolean property to use with breakpoints to enable/disable scrollbar on certain breakpoints
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hide scrollbar automatically after user interaction
      *
      * @default true
      */
    var hide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name set to scrollbar in horizontal Swiper
      *
      * @default 'swiper-scrollbar-horizontal'
      */
    var horizontalClass: js.UndefOr[String] = js.undefined
    
    /**
      * Scrollbar element additional CSS class when it is disabled
      *
      * @default 'swiper-scrollbar-lock'
      */
    var lockClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name added on swiper container and scrollbar element when scrollbar is disabled by breakpoint
      *
      * @default 'swiper-scrollbar-disabled'
      */
    var scrollbarDisabledClass: js.UndefOr[String] = js.undefined
    
    /**
      * Set to `true` to snap slider position to slides when you release scrollbar
      *
      * @default false
      */
    var snapOnRelease: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name set to scrollbar in vertical Swiper
      *
      * @default 'swiper-scrollbar-vertical'
      */
    var verticalClass: js.UndefOr[String] = js.undefined
  }
  object ScrollbarOptions {
    
    inline def apply(): ScrollbarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollbarOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollbarOptions] (val x: Self) extends AnyVal {
      
      inline def setDragClass(value: String): Self = StObject.set(x, "dragClass", value.asInstanceOf[js.Any])
      
      inline def setDragClassUndefined: Self = StObject.set(x, "dragClass", js.undefined)
      
      inline def setDragSize(value: auto | Double): Self = StObject.set(x, "dragSize", value.asInstanceOf[js.Any])
      
      inline def setDragSizeUndefined: Self = StObject.set(x, "dragSize", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEl(value: CSSSelector | HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElNull: Self = StObject.set(x, "el", null)
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setHorizontalClass(value: String): Self = StObject.set(x, "horizontalClass", value.asInstanceOf[js.Any])
      
      inline def setHorizontalClassUndefined: Self = StObject.set(x, "horizontalClass", js.undefined)
      
      inline def setLockClass(value: String): Self = StObject.set(x, "lockClass", value.asInstanceOf[js.Any])
      
      inline def setLockClassUndefined: Self = StObject.set(x, "lockClass", js.undefined)
      
      inline def setScrollbarDisabledClass(value: String): Self = StObject.set(x, "scrollbarDisabledClass", value.asInstanceOf[js.Any])
      
      inline def setScrollbarDisabledClassUndefined: Self = StObject.set(x, "scrollbarDisabledClass", js.undefined)
      
      inline def setSnapOnRelease(value: Boolean): Self = StObject.set(x, "snapOnRelease", value.asInstanceOf[js.Any])
      
      inline def setSnapOnReleaseUndefined: Self = StObject.set(x, "snapOnRelease", js.undefined)
      
      inline def setVerticalClass(value: String): Self = StObject.set(x, "verticalClass", value.asInstanceOf[js.Any])
      
      inline def setVerticalClassUndefined: Self = StObject.set(x, "verticalClass", js.undefined)
    }
  }
}
