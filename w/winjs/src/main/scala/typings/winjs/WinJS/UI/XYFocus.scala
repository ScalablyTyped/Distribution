package typings.winjs.WinJS.UI

import typings.std.CustomEvent
import typings.std.HTMLElement
import typings.winjs.anon.KeyCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides utility functions for generic directional focus movement
**/
object XYFocus {
  
  @js.native
  trait IRect extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object IRect {
    
    @scala.inline
    def apply(height: Double, left: Double, top: Double, width: Double): IRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRect]
    }
    
    @scala.inline
    implicit class IRectMutableBuilder[Self <: IRect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XYFocusEvent
    extends CustomEvent[js.Any] {
    
    @JSName("detail")
    var detail_XYFocusEvent: KeyCode = js.native
  }
  
  @js.native
  trait XYFocusOptions extends StObject {
    
    /**
      * The focus scope, only children of this element are considered in the calculation.
      **/
    var focusRoot: js.UndefOr[HTMLElement] = js.native
    
    /**
      * A rectangle indicating where focus came from before the current state.
      **/
    var historyRect: js.UndefOr[IRect] = js.native
    
    /**
      * The element from which to calculate the next focusable element; if specified, referenceRect is ignored.
      **/
    var referenceElement: js.UndefOr[HTMLElement] = js.native
    
    /**
      * The rectangle from which to calculate next focusable element; ignored if referenceElement is also specified.
      **/
    var referenceRect: js.UndefOr[IRect] = js.native
  }
  object XYFocusOptions {
    
    @scala.inline
    def apply(): XYFocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XYFocusOptions]
    }
    
    @scala.inline
    implicit class XYFocusOptionsMutableBuilder[Self <: XYFocusOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusRoot(value: HTMLElement): Self = StObject.set(x, "focusRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusRootUndefined: Self = StObject.set(x, "focusRoot", js.undefined)
      
      @scala.inline
      def setHistoryRect(value: IRect): Self = StObject.set(x, "historyRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryRectUndefined: Self = StObject.set(x, "historyRect", js.undefined)
      
      @scala.inline
      def setReferenceElement(value: HTMLElement): Self = StObject.set(x, "referenceElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceElementUndefined: Self = StObject.set(x, "referenceElement", js.undefined)
      
      @scala.inline
      def setReferenceRect(value: IRect): Self = StObject.set(x, "referenceRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceRectUndefined: Self = StObject.set(x, "referenceRect", js.undefined)
    }
  }
}
