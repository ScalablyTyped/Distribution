package typings.winjs.WinJS.UI

import typings.std.CustomEvent
import typings.std.HTMLElement
import typings.winjs.anon.KeyCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides utility functions for generic directional focus movement
**/
object XYFocus {
  
  trait IRect extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var height: Double
    
    var left: Double
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: Double
    
    var width: Double
  }
  object IRect {
    
    inline def apply(height: Double, left: Double, top: Double, width: Double): IRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRect]
    }
    
    extension [Self <: IRect](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XYFocusEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_XYFocusEvent: KeyCode = js.native
  }
  
  trait XYFocusOptions extends StObject {
    
    /**
      * The focus scope, only children of this element are considered in the calculation.
      **/
    var focusRoot: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * A rectangle indicating where focus came from before the current state.
      **/
    var historyRect: js.UndefOr[IRect] = js.undefined
    
    /**
      * The element from which to calculate the next focusable element; if specified, referenceRect is ignored.
      **/
    var referenceElement: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * The rectangle from which to calculate next focusable element; ignored if referenceElement is also specified.
      **/
    var referenceRect: js.UndefOr[IRect] = js.undefined
  }
  object XYFocusOptions {
    
    inline def apply(): XYFocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XYFocusOptions]
    }
    
    extension [Self <: XYFocusOptions](x: Self) {
      
      inline def setFocusRoot(value: HTMLElement): Self = StObject.set(x, "focusRoot", value.asInstanceOf[js.Any])
      
      inline def setFocusRootUndefined: Self = StObject.set(x, "focusRoot", js.undefined)
      
      inline def setHistoryRect(value: IRect): Self = StObject.set(x, "historyRect", value.asInstanceOf[js.Any])
      
      inline def setHistoryRectUndefined: Self = StObject.set(x, "historyRect", js.undefined)
      
      inline def setReferenceElement(value: HTMLElement): Self = StObject.set(x, "referenceElement", value.asInstanceOf[js.Any])
      
      inline def setReferenceElementUndefined: Self = StObject.set(x, "referenceElement", js.undefined)
      
      inline def setReferenceRect(value: IRect): Self = StObject.set(x, "referenceRect", value.asInstanceOf[js.Any])
      
      inline def setReferenceRectUndefined: Self = StObject.set(x, "referenceRect", js.undefined)
    }
  }
}
