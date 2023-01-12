package typings.tooltipster

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    /** this is the distance between the bottom side of the origin and the top of the viewport */
    var bottom: Double
    
    var left: Double
    
    /** this is the distance between the right side of the origin and the left of the viewport */
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Click extends StObject {
    
    /**
      * When a mouse click happens anywhere in the page. However, if the interactive option is set to true, 
      * a click happening inside the tooltip will not close it.
      */
    var click: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When the mouse goes away from the origin. The delay option is taken into account as the delay before 
      * closing.
      */
    var mouseleave: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When the origin is clicked by a mouse. This mimics a behavior that browsers usually have and is meant 
      * to be used with the mouseenter open trigger.
      */
    var originClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When scrolling happens in the window or in a scrollable area which is a parent of the origin.
      */
    var scroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When the finger taps (ie presses and releases) anywhere in the touch screen.
      */
    var tap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When the finger is removed from the touch screen or if the interaction was stopped by the device. The 
      * delayTouch option is taken into account as the delay before closing.
      */
    var touchleave: js.UndefOr[Boolean] = js.undefined
  }
  object Click {
    
    inline def apply(): Click = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Click]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Click] (val x: Self) extends AnyVal {
      
      inline def setClick(value: Boolean): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setMouseleave(value: Boolean): Self = StObject.set(x, "mouseleave", value.asInstanceOf[js.Any])
      
      inline def setMouseleaveUndefined: Self = StObject.set(x, "mouseleave", js.undefined)
      
      inline def setOriginClick(value: Boolean): Self = StObject.set(x, "originClick", value.asInstanceOf[js.Any])
      
      inline def setOriginClickUndefined: Self = StObject.set(x, "originClick", js.undefined)
      
      inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setTap(value: Boolean): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
      
      inline def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
      
      inline def setTouchleave(value: Boolean): Self = StObject.set(x, "touchleave", value.asInstanceOf[js.Any])
      
      inline def setTouchleaveUndefined: Self = StObject.set(x, "touchleave", js.undefined)
    }
  }
  
  trait FixedLineage extends StObject {
    
    /** the origin has a fixed lineage if itself or one of its ancestors has a fixed position */
    var fixedLineage: Boolean
    
    var offset: Bottom
    
    var size: Height
    
    /** if the origin is a map area, this will hold the associated image element */
    var usemapImage: HTMLImageElement | Null
    
    var windowOffset: Bottom
  }
  object FixedLineage {
    
    inline def apply(fixedLineage: Boolean, offset: Bottom, size: Height, windowOffset: Bottom): FixedLineage = {
      val __obj = js.Dynamic.literal(fixedLineage = fixedLineage.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], windowOffset = windowOffset.asInstanceOf[js.Any], usemapImage = null)
      __obj.asInstanceOf[FixedLineage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FixedLineage] (val x: Self) extends AnyVal {
      
      inline def setFixedLineage(value: Boolean): Self = StObject.set(x, "fixedLineage", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Bottom): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUsemapImage(value: HTMLImageElement): Self = StObject.set(x, "usemapImage", value.asInstanceOf[js.Any])
      
      inline def setUsemapImageNull: Self = StObject.set(x, "usemapImage", null)
      
      inline def setWindowOffset(value: Bottom): Self = StObject.set(x, "windowOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object Left {
    
    inline def apply(left: Double, top: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mouseenter extends StObject {
    
    /**
      * When the origin is clicked by a mouse.
      */
    var click: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When a mouse comes over the origin. The delay option is taken into account as the delay before 
      * opening.
      */
    var mouseenter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When the origin is tapped (ie pressed and then released) on a touch screen.
      */
    var tap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When the origin is pressed on a touch screen. The delayTouch option is taken into account as the 
      * delay before opening.
      */
    var touchstart: js.UndefOr[Boolean] = js.undefined
  }
  object Mouseenter {
    
    inline def apply(): Mouseenter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mouseenter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mouseenter] (val x: Self) extends AnyVal {
      
      inline def setClick(value: Boolean): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setMouseenter(value: Boolean): Self = StObject.set(x, "mouseenter", value.asInstanceOf[js.Any])
      
      inline def setMouseenterUndefined: Self = StObject.set(x, "mouseenter", js.undefined)
      
      inline def setTap(value: Boolean): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
      
      inline def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
      
      inline def setTouchstart(value: Boolean): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
      
      inline def setTouchstartUndefined: Self = StObject.set(x, "touchstart", js.undefined)
    }
  }
  
  trait Scroll extends StObject {
    
    var scroll: Left
    
    var size: Height
  }
  object Scroll {
    
    inline def apply(scroll: Left, size: Height): Scroll = {
      val __obj = js.Dynamic.literal(scroll = scroll.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scroll]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scroll] (val x: Self) extends AnyVal {
      
      inline def setScroll(value: Left): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size extends StObject {
    
    var size: Height
  }
  object Size {
    
    inline def apply(size: Height): Size = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
