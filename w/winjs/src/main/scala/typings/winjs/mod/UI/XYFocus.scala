package typings.winjs.mod.UI

import typings.std.CustomEvent
import typings.std.EventListener
import typings.std.HTMLElement
import typings.winjs.anon.KeyCode
import typings.winjs.winjsStrings.down
import typings.winjs.winjsStrings.left
import typings.winjs.winjsStrings.right
import typings.winjs.winjsStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides utility functions for generic directional focus movement
**/
object XYFocus {
  
  @JSImport("winjs", "UI.XYFocus")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEventListener(`type`: String, handler: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dispatchEvent(`type`: String, eventProperties: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(`type`.asInstanceOf[js.Any], eventProperties.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def findNextFocusElement(direction: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("findNextFocusElement")(direction.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def findNextFocusElement(direction: String, options: typings.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("findNextFocusElement")(direction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def findNextFocusElement_down(direction: down): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("findNextFocusElement")(direction.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def findNextFocusElement_down(direction: down, options: typings.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("findNextFocusElement")(direction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def findNextFocusElement_left(direction: left): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("findNextFocusElement")(direction.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def findNextFocusElement_left(direction: left, options: typings.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("findNextFocusElement")(direction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def findNextFocusElement_right(direction: right): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("findNextFocusElement")(direction.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def findNextFocusElement_right(direction: right, options: typings.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("findNextFocusElement")(direction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def findNextFocusElement_up(direction: up): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("findNextFocusElement")(direction.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def findNextFocusElement_up(direction: up, options: typings.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("findNextFocusElement")(direction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  @JSImport("winjs", "UI.XYFocus.focusRoot")
  @js.native
  def focusRoot: HTMLElement = js.native
  inline def focusRoot_=(x: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusRoot")(x.asInstanceOf[js.Any])
  
  object keyCodeMap {
    
    @JSImport("winjs", "UI.XYFocus.keyCodeMap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The array of keycodes that cause XYFocus to accept.
      **/
    @JSImport("winjs", "UI.XYFocus.keyCodeMap.accept")
    @js.native
    def accept: js.Array[Double] = js.native
    inline def accept_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accept")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to cancel.
      **/
    @JSImport("winjs", "UI.XYFocus.keyCodeMap.cancel")
    @js.native
    def cancel: js.Array[Double] = js.native
    inline def cancel_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancel")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to navigate down.
      **/
    @JSImport("winjs", "UI.XYFocus.keyCodeMap.down")
    @js.native
    def down: js.Array[Double] = js.native
    inline def down_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("down")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to navigate left.
      **/
    @JSImport("winjs", "UI.XYFocus.keyCodeMap.left")
    @js.native
    def left: js.Array[Double] = js.native
    inline def left_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to navigate right.
      **/
    @JSImport("winjs", "UI.XYFocus.keyCodeMap.right")
    @js.native
    def right: js.Array[Double] = js.native
    inline def right_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to navigate up.
      **/
    @JSImport("winjs", "UI.XYFocus.keyCodeMap.up")
    @js.native
    def up: js.Array[Double] = js.native
    inline def up_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("up")(x.asInstanceOf[js.Any])
  }
  
  inline def moveFocus(direction: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("moveFocus")(direction.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def moveFocus(direction: String, options: typings.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("moveFocus")(direction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def moveFocus_down(direction: down): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("moveFocus")(direction.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def moveFocus_down(direction: down, options: typings.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("moveFocus")(direction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def moveFocus_left(direction: left): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("moveFocus")(direction.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def moveFocus_left(direction: left, options: typings.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("moveFocus")(direction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def moveFocus_right(direction: right): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("moveFocus")(direction.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def moveFocus_right(direction: right, options: typings.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("moveFocus")(direction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def moveFocus_up(direction: up): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("moveFocus")(direction.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def moveFocus_up(direction: up, options: typings.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("moveFocus")(direction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def onfocuschanged(eventInfo: CustomEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onfocuschanged")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def onfocuschanging(eventInfo: CustomEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onfocuschanging")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeEventListener(`type`: String, handler: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
    var historyRect: js.UndefOr[typings.winjs.WinJS.UI.XYFocus.IRect] = js.undefined
    
    /**
      * The element from which to calculate the next focusable element; if specified, referenceRect is ignored.
      **/
    var referenceElement: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * The rectangle from which to calculate next focusable element; ignored if referenceElement is also specified.
      **/
    var referenceRect: js.UndefOr[typings.winjs.WinJS.UI.XYFocus.IRect] = js.undefined
  }
  object XYFocusOptions {
    
    inline def apply(): XYFocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XYFocusOptions]
    }
    
    extension [Self <: XYFocusOptions](x: Self) {
      
      inline def setFocusRoot(value: HTMLElement): Self = StObject.set(x, "focusRoot", value.asInstanceOf[js.Any])
      
      inline def setFocusRootUndefined: Self = StObject.set(x, "focusRoot", js.undefined)
      
      inline def setHistoryRect(value: typings.winjs.WinJS.UI.XYFocus.IRect): Self = StObject.set(x, "historyRect", value.asInstanceOf[js.Any])
      
      inline def setHistoryRectUndefined: Self = StObject.set(x, "historyRect", js.undefined)
      
      inline def setReferenceElement(value: HTMLElement): Self = StObject.set(x, "referenceElement", value.asInstanceOf[js.Any])
      
      inline def setReferenceElementUndefined: Self = StObject.set(x, "referenceElement", js.undefined)
      
      inline def setReferenceRect(value: typings.winjs.WinJS.UI.XYFocus.IRect): Self = StObject.set(x, "referenceRect", value.asInstanceOf[js.Any])
      
      inline def setReferenceRectUndefined: Self = StObject.set(x, "referenceRect", js.undefined)
    }
  }
}
