package typings.winjs.global.WinJS.UI

import typings.std.CustomEvent
import typings.std.EventListener
import typings.std.HTMLElement
import typings.winjs.WinJS.UI.XYFocus.XYFocusOptions
import typings.winjs.winjsStrings.down
import typings.winjs.winjsStrings.left
import typings.winjs.winjsStrings.right
import typings.winjs.winjsStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides utility functions for generic directional focus movement
**/
@JSGlobal("WinJS.UI.XYFocus")
@js.native
object XYFocus extends js.Object {
  
  def addEventListener(`type`: String, handler: EventListener): Unit = js.native
  
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  
  def findNextFocusElement(direction: String): HTMLElement = js.native
  def findNextFocusElement(direction: String, options: XYFocusOptions): HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_down(direction: down): HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_down(direction: down, options: XYFocusOptions): HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_left(direction: left): HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_left(direction: left, options: XYFocusOptions): HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_right(direction: right): HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_right(direction: right, options: XYFocusOptions): HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_up(direction: up): HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_up(direction: up, options: XYFocusOptions): HTMLElement = js.native
  
  var focusRoot: HTMLElement = js.native
  
  def moveFocus(direction: String): HTMLElement = js.native
  def moveFocus(direction: String, options: XYFocusOptions): HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_down(direction: down): HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_down(direction: down, options: XYFocusOptions): HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_left(direction: left): HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_left(direction: left, options: XYFocusOptions): HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_right(direction: right): HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_right(direction: right, options: XYFocusOptions): HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_up(direction: up): HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_up(direction: up, options: XYFocusOptions): HTMLElement = js.native
  
  def onfocuschanged(eventInfo: CustomEvent[_]): Unit = js.native
  
  def onfocuschanging(eventInfo: CustomEvent[_]): Unit = js.native
  
  def removeEventListener(`type`: String, handler: EventListener): Unit = js.native
  
  @js.native
  object keyCodeMap extends js.Object {
    
    /**
      * The array of keycodes that cause XYFocus to accept.
      **/
    var accept: js.Array[Double] = js.native
    
    /**
      * The array of keycodes that cause XYFocus to cancel.
      **/
    var cancel: js.Array[Double] = js.native
    
    /**
      * The array of keycodes that cause XYFocus to navigate down.
      **/
    var down: js.Array[Double] = js.native
    
    /**
      * The array of keycodes that cause XYFocus to navigate left.
      **/
    var left: js.Array[Double] = js.native
    
    /**
      * The array of keycodes that cause XYFocus to navigate right.
      **/
    var right: js.Array[Double] = js.native
    
    /**
      * The array of keycodes that cause XYFocus to navigate up.
      **/
    var up: js.Array[Double] = js.native
  }
}
