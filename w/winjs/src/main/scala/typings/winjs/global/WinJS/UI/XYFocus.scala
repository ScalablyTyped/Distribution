package typings.winjs.global.WinJS.UI

import typings.std.CustomEvent
import typings.std.EventListener
import typings.std.HTMLElement
import typings.winjs.WinJS.UI.XYFocus.XYFocusOptions
import typings.winjs.winjsStrings.down
import typings.winjs.winjsStrings.left
import typings.winjs.winjsStrings.right
import typings.winjs.winjsStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides utility functions for generic directional focus movement
**/
object XYFocus {
  
  @JSGlobal("WinJS.UI.XYFocus")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("WinJS.UI.XYFocus.addEventListener")
  @js.native
  def addEventListener(`type`: String, handler: EventListener): Unit = js.native
  
  @JSGlobal("WinJS.UI.XYFocus.dispatchEvent")
  @js.native
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  
  @JSGlobal("WinJS.UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement(direction: String): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement(direction: String, options: XYFocusOptions): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_down(direction: down): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_down(direction: down, options: XYFocusOptions): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_left(direction: left): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_left(direction: left, options: XYFocusOptions): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_right(direction: right): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_right(direction: right, options: XYFocusOptions): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_up(direction: up): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_up(direction: up, options: XYFocusOptions): HTMLElement = js.native
  
  @JSGlobal("WinJS.UI.XYFocus.focusRoot")
  @js.native
  def focusRoot: HTMLElement = js.native
  @scala.inline
  def focusRoot_=(x: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusRoot")(x.asInstanceOf[js.Any])
  
  object keyCodeMap {
    
    @JSGlobal("WinJS.UI.XYFocus.keyCodeMap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The array of keycodes that cause XYFocus to accept.
      **/
    @JSGlobal("WinJS.UI.XYFocus.keyCodeMap.accept")
    @js.native
    def accept: js.Array[Double] = js.native
    @scala.inline
    def accept_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accept")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to cancel.
      **/
    @JSGlobal("WinJS.UI.XYFocus.keyCodeMap.cancel")
    @js.native
    def cancel: js.Array[Double] = js.native
    @scala.inline
    def cancel_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancel")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to navigate down.
      **/
    @JSGlobal("WinJS.UI.XYFocus.keyCodeMap.down")
    @js.native
    def down: js.Array[Double] = js.native
    @scala.inline
    def down_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("down")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to navigate left.
      **/
    @JSGlobal("WinJS.UI.XYFocus.keyCodeMap.left")
    @js.native
    def left: js.Array[Double] = js.native
    @scala.inline
    def left_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to navigate right.
      **/
    @JSGlobal("WinJS.UI.XYFocus.keyCodeMap.right")
    @js.native
    def right: js.Array[Double] = js.native
    @scala.inline
    def right_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to navigate up.
      **/
    @JSGlobal("WinJS.UI.XYFocus.keyCodeMap.up")
    @js.native
    def up: js.Array[Double] = js.native
    @scala.inline
    def up_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("up")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("WinJS.UI.XYFocus.moveFocus")
  @js.native
  def moveFocus(direction: String): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.moveFocus")
  @js.native
  def moveFocus(direction: String, options: XYFocusOptions): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_down(direction: down): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_down(direction: down, options: XYFocusOptions): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_left(direction: left): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_left(direction: left, options: XYFocusOptions): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_right(direction: right): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_right(direction: right, options: XYFocusOptions): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_up(direction: up): HTMLElement = js.native
  @JSGlobal("WinJS.UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_up(direction: up, options: XYFocusOptions): HTMLElement = js.native
  
  @JSGlobal("WinJS.UI.XYFocus.onfocuschanged")
  @js.native
  def onfocuschanged(eventInfo: CustomEvent[_]): Unit = js.native
  
  @JSGlobal("WinJS.UI.XYFocus.onfocuschanging")
  @js.native
  def onfocuschanging(eventInfo: CustomEvent[_]): Unit = js.native
  
  @JSGlobal("WinJS.UI.XYFocus.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, handler: EventListener): Unit = js.native
}
