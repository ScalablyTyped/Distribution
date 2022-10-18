package typings.testingLibraryDom

import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.Node
import typings.std.Window
import typings.testingLibraryDom.anon.DefaultInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventsMod {
  
  @JSImport("@testing-library/dom/types/events", "createEvent")
  @js.native
  val createEvent: CreateObject & CreateFunction = js.native
  
  @JSImport("@testing-library/dom/types/events", "fireEvent")
  @js.native
  val fireEvent: FireFunction & FireObject = js.native
  
  type CreateFunction = js.Function4[
    /* eventName */ String, 
    /* node */ Document | Element | Window | Node, 
    /* init */ js.UndefOr[js.Object], 
    /* options */ js.UndefOr[DefaultInit], 
    Event
  ]
  
  /* Inlined {[ K in @testing-library/dom.@testing-library/dom/types/events.EventType ]: (element : std.Document | std.Element | std.Window | std.Node, options : {} | undefined): std.Event} */
  trait CreateObject extends StObject {
    
    def abort(element: Document): Event
    def abort(element: Document, options: js.Object): Event
    def abort(element: Element): Event
    def abort(element: Element, options: js.Object): Event
    def abort(element: Node): Event
    def abort(element: Node, options: js.Object): Event
    def abort(element: Window): Event
    def abort(element: Window, options: js.Object): Event
    @JSName("abort")
    var abort_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def animationEnd(element: Document): Event
    def animationEnd(element: Document, options: js.Object): Event
    def animationEnd(element: Element): Event
    def animationEnd(element: Element, options: js.Object): Event
    def animationEnd(element: Node): Event
    def animationEnd(element: Node, options: js.Object): Event
    def animationEnd(element: Window): Event
    def animationEnd(element: Window, options: js.Object): Event
    @JSName("animationEnd")
    var animationEnd_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def animationIteration(element: Document): Event
    def animationIteration(element: Document, options: js.Object): Event
    def animationIteration(element: Element): Event
    def animationIteration(element: Element, options: js.Object): Event
    def animationIteration(element: Node): Event
    def animationIteration(element: Node, options: js.Object): Event
    def animationIteration(element: Window): Event
    def animationIteration(element: Window, options: js.Object): Event
    @JSName("animationIteration")
    var animationIteration_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def animationStart(element: Document): Event
    def animationStart(element: Document, options: js.Object): Event
    def animationStart(element: Element): Event
    def animationStart(element: Element, options: js.Object): Event
    def animationStart(element: Node): Event
    def animationStart(element: Node, options: js.Object): Event
    def animationStart(element: Window): Event
    def animationStart(element: Window, options: js.Object): Event
    @JSName("animationStart")
    var animationStart_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def blur(element: Document): Event
    def blur(element: Document, options: js.Object): Event
    def blur(element: Element): Event
    def blur(element: Element, options: js.Object): Event
    def blur(element: Node): Event
    def blur(element: Node, options: js.Object): Event
    def blur(element: Window): Event
    def blur(element: Window, options: js.Object): Event
    @JSName("blur")
    var blur_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def canPlay(element: Document): Event
    def canPlay(element: Document, options: js.Object): Event
    def canPlay(element: Element): Event
    def canPlay(element: Element, options: js.Object): Event
    def canPlay(element: Node): Event
    def canPlay(element: Node, options: js.Object): Event
    def canPlay(element: Window): Event
    def canPlay(element: Window, options: js.Object): Event
    
    def canPlayThrough(element: Document): Event
    def canPlayThrough(element: Document, options: js.Object): Event
    def canPlayThrough(element: Element): Event
    def canPlayThrough(element: Element, options: js.Object): Event
    def canPlayThrough(element: Node): Event
    def canPlayThrough(element: Node, options: js.Object): Event
    def canPlayThrough(element: Window): Event
    def canPlayThrough(element: Window, options: js.Object): Event
    @JSName("canPlayThrough")
    var canPlayThrough_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    @JSName("canPlay")
    var canPlay_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def change(element: Document): Event
    def change(element: Document, options: js.Object): Event
    def change(element: Element): Event
    def change(element: Element, options: js.Object): Event
    def change(element: Node): Event
    def change(element: Node, options: js.Object): Event
    def change(element: Window): Event
    def change(element: Window, options: js.Object): Event
    @JSName("change")
    var change_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def click(element: Document): Event
    def click(element: Document, options: js.Object): Event
    def click(element: Element): Event
    def click(element: Element, options: js.Object): Event
    def click(element: Node): Event
    def click(element: Node, options: js.Object): Event
    def click(element: Window): Event
    def click(element: Window, options: js.Object): Event
    @JSName("click")
    var click_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def compositionEnd(element: Document): Event
    def compositionEnd(element: Document, options: js.Object): Event
    def compositionEnd(element: Element): Event
    def compositionEnd(element: Element, options: js.Object): Event
    def compositionEnd(element: Node): Event
    def compositionEnd(element: Node, options: js.Object): Event
    def compositionEnd(element: Window): Event
    def compositionEnd(element: Window, options: js.Object): Event
    @JSName("compositionEnd")
    var compositionEnd_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def compositionStart(element: Document): Event
    def compositionStart(element: Document, options: js.Object): Event
    def compositionStart(element: Element): Event
    def compositionStart(element: Element, options: js.Object): Event
    def compositionStart(element: Node): Event
    def compositionStart(element: Node, options: js.Object): Event
    def compositionStart(element: Window): Event
    def compositionStart(element: Window, options: js.Object): Event
    @JSName("compositionStart")
    var compositionStart_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def compositionUpdate(element: Document): Event
    def compositionUpdate(element: Document, options: js.Object): Event
    def compositionUpdate(element: Element): Event
    def compositionUpdate(element: Element, options: js.Object): Event
    def compositionUpdate(element: Node): Event
    def compositionUpdate(element: Node, options: js.Object): Event
    def compositionUpdate(element: Window): Event
    def compositionUpdate(element: Window, options: js.Object): Event
    @JSName("compositionUpdate")
    var compositionUpdate_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def contextMenu(element: Document): Event
    def contextMenu(element: Document, options: js.Object): Event
    def contextMenu(element: Element): Event
    def contextMenu(element: Element, options: js.Object): Event
    def contextMenu(element: Node): Event
    def contextMenu(element: Node, options: js.Object): Event
    def contextMenu(element: Window): Event
    def contextMenu(element: Window, options: js.Object): Event
    @JSName("contextMenu")
    var contextMenu_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def copy(element: Document): Event
    def copy(element: Document, options: js.Object): Event
    def copy(element: Element): Event
    def copy(element: Element, options: js.Object): Event
    def copy(element: Node): Event
    def copy(element: Node, options: js.Object): Event
    def copy(element: Window): Event
    def copy(element: Window, options: js.Object): Event
    @JSName("copy")
    var copy_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def cut(element: Document): Event
    def cut(element: Document, options: js.Object): Event
    def cut(element: Element): Event
    def cut(element: Element, options: js.Object): Event
    def cut(element: Node): Event
    def cut(element: Node, options: js.Object): Event
    def cut(element: Window): Event
    def cut(element: Window, options: js.Object): Event
    @JSName("cut")
    var cut_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def dblClick(element: Document): Event
    def dblClick(element: Document, options: js.Object): Event
    def dblClick(element: Element): Event
    def dblClick(element: Element, options: js.Object): Event
    def dblClick(element: Node): Event
    def dblClick(element: Node, options: js.Object): Event
    def dblClick(element: Window): Event
    def dblClick(element: Window, options: js.Object): Event
    @JSName("dblClick")
    var dblClick_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def doubleClick(element: Document): Event
    def doubleClick(element: Document, options: js.Object): Event
    def doubleClick(element: Element): Event
    def doubleClick(element: Element, options: js.Object): Event
    def doubleClick(element: Node): Event
    def doubleClick(element: Node, options: js.Object): Event
    def doubleClick(element: Window): Event
    def doubleClick(element: Window, options: js.Object): Event
    @JSName("doubleClick")
    var doubleClick_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def drag(element: Document): Event
    def drag(element: Document, options: js.Object): Event
    def drag(element: Element): Event
    def drag(element: Element, options: js.Object): Event
    def drag(element: Node): Event
    def drag(element: Node, options: js.Object): Event
    def drag(element: Window): Event
    def drag(element: Window, options: js.Object): Event
    
    def dragEnd(element: Document): Event
    def dragEnd(element: Document, options: js.Object): Event
    def dragEnd(element: Element): Event
    def dragEnd(element: Element, options: js.Object): Event
    def dragEnd(element: Node): Event
    def dragEnd(element: Node, options: js.Object): Event
    def dragEnd(element: Window): Event
    def dragEnd(element: Window, options: js.Object): Event
    @JSName("dragEnd")
    var dragEnd_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def dragEnter(element: Document): Event
    def dragEnter(element: Document, options: js.Object): Event
    def dragEnter(element: Element): Event
    def dragEnter(element: Element, options: js.Object): Event
    def dragEnter(element: Node): Event
    def dragEnter(element: Node, options: js.Object): Event
    def dragEnter(element: Window): Event
    def dragEnter(element: Window, options: js.Object): Event
    @JSName("dragEnter")
    var dragEnter_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def dragExit(element: Document): Event
    def dragExit(element: Document, options: js.Object): Event
    def dragExit(element: Element): Event
    def dragExit(element: Element, options: js.Object): Event
    def dragExit(element: Node): Event
    def dragExit(element: Node, options: js.Object): Event
    def dragExit(element: Window): Event
    def dragExit(element: Window, options: js.Object): Event
    @JSName("dragExit")
    var dragExit_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def dragLeave(element: Document): Event
    def dragLeave(element: Document, options: js.Object): Event
    def dragLeave(element: Element): Event
    def dragLeave(element: Element, options: js.Object): Event
    def dragLeave(element: Node): Event
    def dragLeave(element: Node, options: js.Object): Event
    def dragLeave(element: Window): Event
    def dragLeave(element: Window, options: js.Object): Event
    @JSName("dragLeave")
    var dragLeave_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def dragOver(element: Document): Event
    def dragOver(element: Document, options: js.Object): Event
    def dragOver(element: Element): Event
    def dragOver(element: Element, options: js.Object): Event
    def dragOver(element: Node): Event
    def dragOver(element: Node, options: js.Object): Event
    def dragOver(element: Window): Event
    def dragOver(element: Window, options: js.Object): Event
    @JSName("dragOver")
    var dragOver_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def dragStart(element: Document): Event
    def dragStart(element: Document, options: js.Object): Event
    def dragStart(element: Element): Event
    def dragStart(element: Element, options: js.Object): Event
    def dragStart(element: Node): Event
    def dragStart(element: Node, options: js.Object): Event
    def dragStart(element: Window): Event
    def dragStart(element: Window, options: js.Object): Event
    @JSName("dragStart")
    var dragStart_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    @JSName("drag")
    var drag_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def drop(element: Document): Event
    def drop(element: Document, options: js.Object): Event
    def drop(element: Element): Event
    def drop(element: Element, options: js.Object): Event
    def drop(element: Node): Event
    def drop(element: Node, options: js.Object): Event
    def drop(element: Window): Event
    def drop(element: Window, options: js.Object): Event
    @JSName("drop")
    var drop_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def durationChange(element: Document): Event
    def durationChange(element: Document, options: js.Object): Event
    def durationChange(element: Element): Event
    def durationChange(element: Element, options: js.Object): Event
    def durationChange(element: Node): Event
    def durationChange(element: Node, options: js.Object): Event
    def durationChange(element: Window): Event
    def durationChange(element: Window, options: js.Object): Event
    @JSName("durationChange")
    var durationChange_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def emptied(element: Document): Event
    def emptied(element: Document, options: js.Object): Event
    def emptied(element: Element): Event
    def emptied(element: Element, options: js.Object): Event
    def emptied(element: Node): Event
    def emptied(element: Node, options: js.Object): Event
    def emptied(element: Window): Event
    def emptied(element: Window, options: js.Object): Event
    @JSName("emptied")
    var emptied_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def encrypted(element: Document): Event
    def encrypted(element: Document, options: js.Object): Event
    def encrypted(element: Element): Event
    def encrypted(element: Element, options: js.Object): Event
    def encrypted(element: Node): Event
    def encrypted(element: Node, options: js.Object): Event
    def encrypted(element: Window): Event
    def encrypted(element: Window, options: js.Object): Event
    @JSName("encrypted")
    var encrypted_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def ended(element: Document): Event
    def ended(element: Document, options: js.Object): Event
    def ended(element: Element): Event
    def ended(element: Element, options: js.Object): Event
    def ended(element: Node): Event
    def ended(element: Node, options: js.Object): Event
    def ended(element: Window): Event
    def ended(element: Window, options: js.Object): Event
    @JSName("ended")
    var ended_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def error(element: Document): Event
    def error(element: Document, options: js.Object): Event
    def error(element: Element): Event
    def error(element: Element, options: js.Object): Event
    def error(element: Node): Event
    def error(element: Node, options: js.Object): Event
    def error(element: Window): Event
    def error(element: Window, options: js.Object): Event
    @JSName("error")
    var error_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def focus(element: Document): Event
    def focus(element: Document, options: js.Object): Event
    def focus(element: Element): Event
    def focus(element: Element, options: js.Object): Event
    def focus(element: Node): Event
    def focus(element: Node, options: js.Object): Event
    def focus(element: Window): Event
    def focus(element: Window, options: js.Object): Event
    
    def focusIn(element: Document): Event
    def focusIn(element: Document, options: js.Object): Event
    def focusIn(element: Element): Event
    def focusIn(element: Element, options: js.Object): Event
    def focusIn(element: Node): Event
    def focusIn(element: Node, options: js.Object): Event
    def focusIn(element: Window): Event
    def focusIn(element: Window, options: js.Object): Event
    @JSName("focusIn")
    var focusIn_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def focusOut(element: Document): Event
    def focusOut(element: Document, options: js.Object): Event
    def focusOut(element: Element): Event
    def focusOut(element: Element, options: js.Object): Event
    def focusOut(element: Node): Event
    def focusOut(element: Node, options: js.Object): Event
    def focusOut(element: Window): Event
    def focusOut(element: Window, options: js.Object): Event
    @JSName("focusOut")
    var focusOut_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    @JSName("focus")
    var focus_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def gotPointerCapture(element: Document): Event
    def gotPointerCapture(element: Document, options: js.Object): Event
    def gotPointerCapture(element: Element): Event
    def gotPointerCapture(element: Element, options: js.Object): Event
    def gotPointerCapture(element: Node): Event
    def gotPointerCapture(element: Node, options: js.Object): Event
    def gotPointerCapture(element: Window): Event
    def gotPointerCapture(element: Window, options: js.Object): Event
    @JSName("gotPointerCapture")
    var gotPointerCapture_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def input(element: Document): Event
    def input(element: Document, options: js.Object): Event
    def input(element: Element): Event
    def input(element: Element, options: js.Object): Event
    def input(element: Node): Event
    def input(element: Node, options: js.Object): Event
    def input(element: Window): Event
    def input(element: Window, options: js.Object): Event
    @JSName("input")
    var input_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def invalid(element: Document): Event
    def invalid(element: Document, options: js.Object): Event
    def invalid(element: Element): Event
    def invalid(element: Element, options: js.Object): Event
    def invalid(element: Node): Event
    def invalid(element: Node, options: js.Object): Event
    def invalid(element: Window): Event
    def invalid(element: Window, options: js.Object): Event
    @JSName("invalid")
    var invalid_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def keyDown(element: Document): Event
    def keyDown(element: Document, options: js.Object): Event
    def keyDown(element: Element): Event
    def keyDown(element: Element, options: js.Object): Event
    def keyDown(element: Node): Event
    def keyDown(element: Node, options: js.Object): Event
    def keyDown(element: Window): Event
    def keyDown(element: Window, options: js.Object): Event
    @JSName("keyDown")
    var keyDown_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def keyPress(element: Document): Event
    def keyPress(element: Document, options: js.Object): Event
    def keyPress(element: Element): Event
    def keyPress(element: Element, options: js.Object): Event
    def keyPress(element: Node): Event
    def keyPress(element: Node, options: js.Object): Event
    def keyPress(element: Window): Event
    def keyPress(element: Window, options: js.Object): Event
    @JSName("keyPress")
    var keyPress_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def keyUp(element: Document): Event
    def keyUp(element: Document, options: js.Object): Event
    def keyUp(element: Element): Event
    def keyUp(element: Element, options: js.Object): Event
    def keyUp(element: Node): Event
    def keyUp(element: Node, options: js.Object): Event
    def keyUp(element: Window): Event
    def keyUp(element: Window, options: js.Object): Event
    @JSName("keyUp")
    var keyUp_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def load(element: Document): Event
    def load(element: Document, options: js.Object): Event
    def load(element: Element): Event
    def load(element: Element, options: js.Object): Event
    def load(element: Node): Event
    def load(element: Node, options: js.Object): Event
    def load(element: Window): Event
    def load(element: Window, options: js.Object): Event
    
    def loadStart(element: Document): Event
    def loadStart(element: Document, options: js.Object): Event
    def loadStart(element: Element): Event
    def loadStart(element: Element, options: js.Object): Event
    def loadStart(element: Node): Event
    def loadStart(element: Node, options: js.Object): Event
    def loadStart(element: Window): Event
    def loadStart(element: Window, options: js.Object): Event
    @JSName("loadStart")
    var loadStart_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    @JSName("load")
    var load_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def loadedData(element: Document): Event
    def loadedData(element: Document, options: js.Object): Event
    def loadedData(element: Element): Event
    def loadedData(element: Element, options: js.Object): Event
    def loadedData(element: Node): Event
    def loadedData(element: Node, options: js.Object): Event
    def loadedData(element: Window): Event
    def loadedData(element: Window, options: js.Object): Event
    @JSName("loadedData")
    var loadedData_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def loadedMetadata(element: Document): Event
    def loadedMetadata(element: Document, options: js.Object): Event
    def loadedMetadata(element: Element): Event
    def loadedMetadata(element: Element, options: js.Object): Event
    def loadedMetadata(element: Node): Event
    def loadedMetadata(element: Node, options: js.Object): Event
    def loadedMetadata(element: Window): Event
    def loadedMetadata(element: Window, options: js.Object): Event
    @JSName("loadedMetadata")
    var loadedMetadata_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def lostPointerCapture(element: Document): Event
    def lostPointerCapture(element: Document, options: js.Object): Event
    def lostPointerCapture(element: Element): Event
    def lostPointerCapture(element: Element, options: js.Object): Event
    def lostPointerCapture(element: Node): Event
    def lostPointerCapture(element: Node, options: js.Object): Event
    def lostPointerCapture(element: Window): Event
    def lostPointerCapture(element: Window, options: js.Object): Event
    @JSName("lostPointerCapture")
    var lostPointerCapture_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def mouseDown(element: Document): Event
    def mouseDown(element: Document, options: js.Object): Event
    def mouseDown(element: Element): Event
    def mouseDown(element: Element, options: js.Object): Event
    def mouseDown(element: Node): Event
    def mouseDown(element: Node, options: js.Object): Event
    def mouseDown(element: Window): Event
    def mouseDown(element: Window, options: js.Object): Event
    @JSName("mouseDown")
    var mouseDown_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def mouseEnter(element: Document): Event
    def mouseEnter(element: Document, options: js.Object): Event
    def mouseEnter(element: Element): Event
    def mouseEnter(element: Element, options: js.Object): Event
    def mouseEnter(element: Node): Event
    def mouseEnter(element: Node, options: js.Object): Event
    def mouseEnter(element: Window): Event
    def mouseEnter(element: Window, options: js.Object): Event
    @JSName("mouseEnter")
    var mouseEnter_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def mouseLeave(element: Document): Event
    def mouseLeave(element: Document, options: js.Object): Event
    def mouseLeave(element: Element): Event
    def mouseLeave(element: Element, options: js.Object): Event
    def mouseLeave(element: Node): Event
    def mouseLeave(element: Node, options: js.Object): Event
    def mouseLeave(element: Window): Event
    def mouseLeave(element: Window, options: js.Object): Event
    @JSName("mouseLeave")
    var mouseLeave_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def mouseMove(element: Document): Event
    def mouseMove(element: Document, options: js.Object): Event
    def mouseMove(element: Element): Event
    def mouseMove(element: Element, options: js.Object): Event
    def mouseMove(element: Node): Event
    def mouseMove(element: Node, options: js.Object): Event
    def mouseMove(element: Window): Event
    def mouseMove(element: Window, options: js.Object): Event
    @JSName("mouseMove")
    var mouseMove_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def mouseOut(element: Document): Event
    def mouseOut(element: Document, options: js.Object): Event
    def mouseOut(element: Element): Event
    def mouseOut(element: Element, options: js.Object): Event
    def mouseOut(element: Node): Event
    def mouseOut(element: Node, options: js.Object): Event
    def mouseOut(element: Window): Event
    def mouseOut(element: Window, options: js.Object): Event
    @JSName("mouseOut")
    var mouseOut_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def mouseOver(element: Document): Event
    def mouseOver(element: Document, options: js.Object): Event
    def mouseOver(element: Element): Event
    def mouseOver(element: Element, options: js.Object): Event
    def mouseOver(element: Node): Event
    def mouseOver(element: Node, options: js.Object): Event
    def mouseOver(element: Window): Event
    def mouseOver(element: Window, options: js.Object): Event
    @JSName("mouseOver")
    var mouseOver_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def mouseUp(element: Document): Event
    def mouseUp(element: Document, options: js.Object): Event
    def mouseUp(element: Element): Event
    def mouseUp(element: Element, options: js.Object): Event
    def mouseUp(element: Node): Event
    def mouseUp(element: Node, options: js.Object): Event
    def mouseUp(element: Window): Event
    def mouseUp(element: Window, options: js.Object): Event
    @JSName("mouseUp")
    var mouseUp_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def paste(element: Document): Event
    def paste(element: Document, options: js.Object): Event
    def paste(element: Element): Event
    def paste(element: Element, options: js.Object): Event
    def paste(element: Node): Event
    def paste(element: Node, options: js.Object): Event
    def paste(element: Window): Event
    def paste(element: Window, options: js.Object): Event
    @JSName("paste")
    var paste_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def pause(element: Document): Event
    def pause(element: Document, options: js.Object): Event
    def pause(element: Element): Event
    def pause(element: Element, options: js.Object): Event
    def pause(element: Node): Event
    def pause(element: Node, options: js.Object): Event
    def pause(element: Window): Event
    def pause(element: Window, options: js.Object): Event
    @JSName("pause")
    var pause_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def play(element: Document): Event
    def play(element: Document, options: js.Object): Event
    def play(element: Element): Event
    def play(element: Element, options: js.Object): Event
    def play(element: Node): Event
    def play(element: Node, options: js.Object): Event
    def play(element: Window): Event
    def play(element: Window, options: js.Object): Event
    @JSName("play")
    var play_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def playing(element: Document): Event
    def playing(element: Document, options: js.Object): Event
    def playing(element: Element): Event
    def playing(element: Element, options: js.Object): Event
    def playing(element: Node): Event
    def playing(element: Node, options: js.Object): Event
    def playing(element: Window): Event
    def playing(element: Window, options: js.Object): Event
    @JSName("playing")
    var playing_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def pointerCancel(element: Document): Event
    def pointerCancel(element: Document, options: js.Object): Event
    def pointerCancel(element: Element): Event
    def pointerCancel(element: Element, options: js.Object): Event
    def pointerCancel(element: Node): Event
    def pointerCancel(element: Node, options: js.Object): Event
    def pointerCancel(element: Window): Event
    def pointerCancel(element: Window, options: js.Object): Event
    @JSName("pointerCancel")
    var pointerCancel_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def pointerDown(element: Document): Event
    def pointerDown(element: Document, options: js.Object): Event
    def pointerDown(element: Element): Event
    def pointerDown(element: Element, options: js.Object): Event
    def pointerDown(element: Node): Event
    def pointerDown(element: Node, options: js.Object): Event
    def pointerDown(element: Window): Event
    def pointerDown(element: Window, options: js.Object): Event
    @JSName("pointerDown")
    var pointerDown_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def pointerEnter(element: Document): Event
    def pointerEnter(element: Document, options: js.Object): Event
    def pointerEnter(element: Element): Event
    def pointerEnter(element: Element, options: js.Object): Event
    def pointerEnter(element: Node): Event
    def pointerEnter(element: Node, options: js.Object): Event
    def pointerEnter(element: Window): Event
    def pointerEnter(element: Window, options: js.Object): Event
    @JSName("pointerEnter")
    var pointerEnter_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def pointerLeave(element: Document): Event
    def pointerLeave(element: Document, options: js.Object): Event
    def pointerLeave(element: Element): Event
    def pointerLeave(element: Element, options: js.Object): Event
    def pointerLeave(element: Node): Event
    def pointerLeave(element: Node, options: js.Object): Event
    def pointerLeave(element: Window): Event
    def pointerLeave(element: Window, options: js.Object): Event
    @JSName("pointerLeave")
    var pointerLeave_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def pointerMove(element: Document): Event
    def pointerMove(element: Document, options: js.Object): Event
    def pointerMove(element: Element): Event
    def pointerMove(element: Element, options: js.Object): Event
    def pointerMove(element: Node): Event
    def pointerMove(element: Node, options: js.Object): Event
    def pointerMove(element: Window): Event
    def pointerMove(element: Window, options: js.Object): Event
    @JSName("pointerMove")
    var pointerMove_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def pointerOut(element: Document): Event
    def pointerOut(element: Document, options: js.Object): Event
    def pointerOut(element: Element): Event
    def pointerOut(element: Element, options: js.Object): Event
    def pointerOut(element: Node): Event
    def pointerOut(element: Node, options: js.Object): Event
    def pointerOut(element: Window): Event
    def pointerOut(element: Window, options: js.Object): Event
    @JSName("pointerOut")
    var pointerOut_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def pointerOver(element: Document): Event
    def pointerOver(element: Document, options: js.Object): Event
    def pointerOver(element: Element): Event
    def pointerOver(element: Element, options: js.Object): Event
    def pointerOver(element: Node): Event
    def pointerOver(element: Node, options: js.Object): Event
    def pointerOver(element: Window): Event
    def pointerOver(element: Window, options: js.Object): Event
    @JSName("pointerOver")
    var pointerOver_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def pointerUp(element: Document): Event
    def pointerUp(element: Document, options: js.Object): Event
    def pointerUp(element: Element): Event
    def pointerUp(element: Element, options: js.Object): Event
    def pointerUp(element: Node): Event
    def pointerUp(element: Node, options: js.Object): Event
    def pointerUp(element: Window): Event
    def pointerUp(element: Window, options: js.Object): Event
    @JSName("pointerUp")
    var pointerUp_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def popState(element: Document): Event
    def popState(element: Document, options: js.Object): Event
    def popState(element: Element): Event
    def popState(element: Element, options: js.Object): Event
    def popState(element: Node): Event
    def popState(element: Node, options: js.Object): Event
    def popState(element: Window): Event
    def popState(element: Window, options: js.Object): Event
    @JSName("popState")
    var popState_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def progress(element: Document): Event
    def progress(element: Document, options: js.Object): Event
    def progress(element: Element): Event
    def progress(element: Element, options: js.Object): Event
    def progress(element: Node): Event
    def progress(element: Node, options: js.Object): Event
    def progress(element: Window): Event
    def progress(element: Window, options: js.Object): Event
    @JSName("progress")
    var progress_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def rateChange(element: Document): Event
    def rateChange(element: Document, options: js.Object): Event
    def rateChange(element: Element): Event
    def rateChange(element: Element, options: js.Object): Event
    def rateChange(element: Node): Event
    def rateChange(element: Node, options: js.Object): Event
    def rateChange(element: Window): Event
    def rateChange(element: Window, options: js.Object): Event
    @JSName("rateChange")
    var rateChange_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def reset(element: Document): Event
    def reset(element: Document, options: js.Object): Event
    def reset(element: Element): Event
    def reset(element: Element, options: js.Object): Event
    def reset(element: Node): Event
    def reset(element: Node, options: js.Object): Event
    def reset(element: Window): Event
    def reset(element: Window, options: js.Object): Event
    @JSName("reset")
    var reset_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def resize(element: Document): Event
    def resize(element: Document, options: js.Object): Event
    def resize(element: Element): Event
    def resize(element: Element, options: js.Object): Event
    def resize(element: Node): Event
    def resize(element: Node, options: js.Object): Event
    def resize(element: Window): Event
    def resize(element: Window, options: js.Object): Event
    @JSName("resize")
    var resize_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def scroll(element: Document): Event
    def scroll(element: Document, options: js.Object): Event
    def scroll(element: Element): Event
    def scroll(element: Element, options: js.Object): Event
    def scroll(element: Node): Event
    def scroll(element: Node, options: js.Object): Event
    def scroll(element: Window): Event
    def scroll(element: Window, options: js.Object): Event
    @JSName("scroll")
    var scroll_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def seeked(element: Document): Event
    def seeked(element: Document, options: js.Object): Event
    def seeked(element: Element): Event
    def seeked(element: Element, options: js.Object): Event
    def seeked(element: Node): Event
    def seeked(element: Node, options: js.Object): Event
    def seeked(element: Window): Event
    def seeked(element: Window, options: js.Object): Event
    @JSName("seeked")
    var seeked_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def seeking(element: Document): Event
    def seeking(element: Document, options: js.Object): Event
    def seeking(element: Element): Event
    def seeking(element: Element, options: js.Object): Event
    def seeking(element: Node): Event
    def seeking(element: Node, options: js.Object): Event
    def seeking(element: Window): Event
    def seeking(element: Window, options: js.Object): Event
    @JSName("seeking")
    var seeking_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def select(element: Document): Event
    def select(element: Document, options: js.Object): Event
    def select(element: Element): Event
    def select(element: Element, options: js.Object): Event
    def select(element: Node): Event
    def select(element: Node, options: js.Object): Event
    def select(element: Window): Event
    def select(element: Window, options: js.Object): Event
    @JSName("select")
    var select_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def stalled(element: Document): Event
    def stalled(element: Document, options: js.Object): Event
    def stalled(element: Element): Event
    def stalled(element: Element, options: js.Object): Event
    def stalled(element: Node): Event
    def stalled(element: Node, options: js.Object): Event
    def stalled(element: Window): Event
    def stalled(element: Window, options: js.Object): Event
    @JSName("stalled")
    var stalled_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def submit(element: Document): Event
    def submit(element: Document, options: js.Object): Event
    def submit(element: Element): Event
    def submit(element: Element, options: js.Object): Event
    def submit(element: Node): Event
    def submit(element: Node, options: js.Object): Event
    def submit(element: Window): Event
    def submit(element: Window, options: js.Object): Event
    @JSName("submit")
    var submit_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def suspend(element: Document): Event
    def suspend(element: Document, options: js.Object): Event
    def suspend(element: Element): Event
    def suspend(element: Element, options: js.Object): Event
    def suspend(element: Node): Event
    def suspend(element: Node, options: js.Object): Event
    def suspend(element: Window): Event
    def suspend(element: Window, options: js.Object): Event
    @JSName("suspend")
    var suspend_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def timeUpdate(element: Document): Event
    def timeUpdate(element: Document, options: js.Object): Event
    def timeUpdate(element: Element): Event
    def timeUpdate(element: Element, options: js.Object): Event
    def timeUpdate(element: Node): Event
    def timeUpdate(element: Node, options: js.Object): Event
    def timeUpdate(element: Window): Event
    def timeUpdate(element: Window, options: js.Object): Event
    @JSName("timeUpdate")
    var timeUpdate_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def touchCancel(element: Document): Event
    def touchCancel(element: Document, options: js.Object): Event
    def touchCancel(element: Element): Event
    def touchCancel(element: Element, options: js.Object): Event
    def touchCancel(element: Node): Event
    def touchCancel(element: Node, options: js.Object): Event
    def touchCancel(element: Window): Event
    def touchCancel(element: Window, options: js.Object): Event
    @JSName("touchCancel")
    var touchCancel_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def touchEnd(element: Document): Event
    def touchEnd(element: Document, options: js.Object): Event
    def touchEnd(element: Element): Event
    def touchEnd(element: Element, options: js.Object): Event
    def touchEnd(element: Node): Event
    def touchEnd(element: Node, options: js.Object): Event
    def touchEnd(element: Window): Event
    def touchEnd(element: Window, options: js.Object): Event
    @JSName("touchEnd")
    var touchEnd_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def touchMove(element: Document): Event
    def touchMove(element: Document, options: js.Object): Event
    def touchMove(element: Element): Event
    def touchMove(element: Element, options: js.Object): Event
    def touchMove(element: Node): Event
    def touchMove(element: Node, options: js.Object): Event
    def touchMove(element: Window): Event
    def touchMove(element: Window, options: js.Object): Event
    @JSName("touchMove")
    var touchMove_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def touchStart(element: Document): Event
    def touchStart(element: Document, options: js.Object): Event
    def touchStart(element: Element): Event
    def touchStart(element: Element, options: js.Object): Event
    def touchStart(element: Node): Event
    def touchStart(element: Node, options: js.Object): Event
    def touchStart(element: Window): Event
    def touchStart(element: Window, options: js.Object): Event
    @JSName("touchStart")
    var touchStart_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def transitionCancel(element: Document): Event
    def transitionCancel(element: Document, options: js.Object): Event
    def transitionCancel(element: Element): Event
    def transitionCancel(element: Element, options: js.Object): Event
    def transitionCancel(element: Node): Event
    def transitionCancel(element: Node, options: js.Object): Event
    def transitionCancel(element: Window): Event
    def transitionCancel(element: Window, options: js.Object): Event
    @JSName("transitionCancel")
    var transitionCancel_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def transitionEnd(element: Document): Event
    def transitionEnd(element: Document, options: js.Object): Event
    def transitionEnd(element: Element): Event
    def transitionEnd(element: Element, options: js.Object): Event
    def transitionEnd(element: Node): Event
    def transitionEnd(element: Node, options: js.Object): Event
    def transitionEnd(element: Window): Event
    def transitionEnd(element: Window, options: js.Object): Event
    @JSName("transitionEnd")
    var transitionEnd_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def transitionRun(element: Document): Event
    def transitionRun(element: Document, options: js.Object): Event
    def transitionRun(element: Element): Event
    def transitionRun(element: Element, options: js.Object): Event
    def transitionRun(element: Node): Event
    def transitionRun(element: Node, options: js.Object): Event
    def transitionRun(element: Window): Event
    def transitionRun(element: Window, options: js.Object): Event
    @JSName("transitionRun")
    var transitionRun_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def transitionStart(element: Document): Event
    def transitionStart(element: Document, options: js.Object): Event
    def transitionStart(element: Element): Event
    def transitionStart(element: Element, options: js.Object): Event
    def transitionStart(element: Node): Event
    def transitionStart(element: Node, options: js.Object): Event
    def transitionStart(element: Window): Event
    def transitionStart(element: Window, options: js.Object): Event
    @JSName("transitionStart")
    var transitionStart_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def volumeChange(element: Document): Event
    def volumeChange(element: Document, options: js.Object): Event
    def volumeChange(element: Element): Event
    def volumeChange(element: Element, options: js.Object): Event
    def volumeChange(element: Node): Event
    def volumeChange(element: Node, options: js.Object): Event
    def volumeChange(element: Window): Event
    def volumeChange(element: Window, options: js.Object): Event
    @JSName("volumeChange")
    var volumeChange_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def waiting(element: Document): Event
    def waiting(element: Document, options: js.Object): Event
    def waiting(element: Element): Event
    def waiting(element: Element, options: js.Object): Event
    def waiting(element: Node): Event
    def waiting(element: Node, options: js.Object): Event
    def waiting(element: Window): Event
    def waiting(element: Window, options: js.Object): Event
    @JSName("waiting")
    var waiting_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
    
    def wheel(element: Document): Event
    def wheel(element: Document, options: js.Object): Event
    def wheel(element: Element): Event
    def wheel(element: Element, options: js.Object): Event
    def wheel(element: Node): Event
    def wheel(element: Node, options: js.Object): Event
    def wheel(element: Window): Event
    def wheel(element: Window, options: js.Object): Event
    @JSName("wheel")
    var wheel_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ]
  }
  object CreateObject {
    
    inline def apply(
      abort: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      animationEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      animationIteration: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      animationStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      blur: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      canPlay: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      canPlayThrough: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      change: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      click: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      compositionEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      compositionStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      compositionUpdate: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      contextMenu: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      copy: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      cut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dblClick: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      doubleClick: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      drag: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragExit: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      drop: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      durationChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      emptied: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      encrypted: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      ended: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      error: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      focus: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      focusIn: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      focusOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      gotPointerCapture: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      input: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      invalid: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      keyDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      keyPress: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      keyUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      load: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      loadStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      loadedData: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      loadedMetadata: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      lostPointerCapture: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      paste: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pause: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      play: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      playing: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerCancel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      popState: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      progress: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      rateChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      reset: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      resize: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      scroll: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      seeked: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      seeking: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      select: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      stalled: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      submit: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      suspend: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      timeUpdate: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      touchCancel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      touchEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      touchMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      touchStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      transitionCancel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      transitionEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      transitionRun: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      transitionStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      volumeChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      waiting: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      wheel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
    ): CreateObject = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), animationEnd = js.Any.fromFunction2(animationEnd), animationIteration = js.Any.fromFunction2(animationIteration), animationStart = js.Any.fromFunction2(animationStart), blur = js.Any.fromFunction2(blur), canPlay = js.Any.fromFunction2(canPlay), canPlayThrough = js.Any.fromFunction2(canPlayThrough), change = js.Any.fromFunction2(change), click = js.Any.fromFunction2(click), compositionEnd = js.Any.fromFunction2(compositionEnd), compositionStart = js.Any.fromFunction2(compositionStart), compositionUpdate = js.Any.fromFunction2(compositionUpdate), contextMenu = js.Any.fromFunction2(contextMenu), copy = js.Any.fromFunction2(copy), cut = js.Any.fromFunction2(cut), dblClick = js.Any.fromFunction2(dblClick), doubleClick = js.Any.fromFunction2(doubleClick), drag = js.Any.fromFunction2(drag), dragEnd = js.Any.fromFunction2(dragEnd), dragEnter = js.Any.fromFunction2(dragEnter), dragExit = js.Any.fromFunction2(dragExit), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), dragStart = js.Any.fromFunction2(dragStart), drop = js.Any.fromFunction2(drop), durationChange = js.Any.fromFunction2(durationChange), emptied = js.Any.fromFunction2(emptied), encrypted = js.Any.fromFunction2(encrypted), ended = js.Any.fromFunction2(ended), error = js.Any.fromFunction2(error), focus = js.Any.fromFunction2(focus), focusIn = js.Any.fromFunction2(focusIn), focusOut = js.Any.fromFunction2(focusOut), gotPointerCapture = js.Any.fromFunction2(gotPointerCapture), input = js.Any.fromFunction2(input), invalid = js.Any.fromFunction2(invalid), keyDown = js.Any.fromFunction2(keyDown), keyPress = js.Any.fromFunction2(keyPress), keyUp = js.Any.fromFunction2(keyUp), load = js.Any.fromFunction2(load), loadStart = js.Any.fromFunction2(loadStart), loadedData = js.Any.fromFunction2(loadedData), loadedMetadata = js.Any.fromFunction2(loadedMetadata), lostPointerCapture = js.Any.fromFunction2(lostPointerCapture), mouseDown = js.Any.fromFunction2(mouseDown), mouseEnter = js.Any.fromFunction2(mouseEnter), mouseLeave = js.Any.fromFunction2(mouseLeave), mouseMove = js.Any.fromFunction2(mouseMove), mouseOut = js.Any.fromFunction2(mouseOut), mouseOver = js.Any.fromFunction2(mouseOver), mouseUp = js.Any.fromFunction2(mouseUp), paste = js.Any.fromFunction2(paste), pause = js.Any.fromFunction2(pause), play = js.Any.fromFunction2(play), playing = js.Any.fromFunction2(playing), pointerCancel = js.Any.fromFunction2(pointerCancel), pointerDown = js.Any.fromFunction2(pointerDown), pointerEnter = js.Any.fromFunction2(pointerEnter), pointerLeave = js.Any.fromFunction2(pointerLeave), pointerMove = js.Any.fromFunction2(pointerMove), pointerOut = js.Any.fromFunction2(pointerOut), pointerOver = js.Any.fromFunction2(pointerOver), pointerUp = js.Any.fromFunction2(pointerUp), popState = js.Any.fromFunction2(popState), progress = js.Any.fromFunction2(progress), rateChange = js.Any.fromFunction2(rateChange), reset = js.Any.fromFunction2(reset), resize = js.Any.fromFunction2(resize), scroll = js.Any.fromFunction2(scroll), seeked = js.Any.fromFunction2(seeked), seeking = js.Any.fromFunction2(seeking), select = js.Any.fromFunction2(select), stalled = js.Any.fromFunction2(stalled), submit = js.Any.fromFunction2(submit), suspend = js.Any.fromFunction2(suspend), timeUpdate = js.Any.fromFunction2(timeUpdate), touchCancel = js.Any.fromFunction2(touchCancel), touchEnd = js.Any.fromFunction2(touchEnd), touchMove = js.Any.fromFunction2(touchMove), touchStart = js.Any.fromFunction2(touchStart), transitionCancel = js.Any.fromFunction2(transitionCancel), transitionEnd = js.Any.fromFunction2(transitionEnd), transitionRun = js.Any.fromFunction2(transitionRun), transitionStart = js.Any.fromFunction2(transitionStart), volumeChange = js.Any.fromFunction2(volumeChange), waiting = js.Any.fromFunction2(waiting), wheel = js.Any.fromFunction2(wheel))
      __obj.asInstanceOf[CreateObject]
    }
    
    extension [Self <: CreateObject](x: Self) {
      
      inline def setAbort(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "abort", js.Any.fromFunction2(value))
      
      inline def setAnimationEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "animationEnd", js.Any.fromFunction2(value))
      
      inline def setAnimationIteration(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "animationIteration", js.Any.fromFunction2(value))
      
      inline def setAnimationStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "animationStart", js.Any.fromFunction2(value))
      
      inline def setBlur(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      inline def setCanPlay(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "canPlay", js.Any.fromFunction2(value))
      
      inline def setCanPlayThrough(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "canPlayThrough", js.Any.fromFunction2(value))
      
      inline def setChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      inline def setClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
      
      inline def setCompositionEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "compositionEnd", js.Any.fromFunction2(value))
      
      inline def setCompositionStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "compositionStart", js.Any.fromFunction2(value))
      
      inline def setCompositionUpdate(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "compositionUpdate", js.Any.fromFunction2(value))
      
      inline def setContextMenu(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "contextMenu", js.Any.fromFunction2(value))
      
      inline def setCopy(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
      
      inline def setCut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "cut", js.Any.fromFunction2(value))
      
      inline def setDblClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dblClick", js.Any.fromFunction2(value))
      
      inline def setDoubleClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "doubleClick", js.Any.fromFunction2(value))
      
      inline def setDrag(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
      
      inline def setDragEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2(value))
      
      inline def setDragEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
      
      inline def setDragExit(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragExit", js.Any.fromFunction2(value))
      
      inline def setDragLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
      
      inline def setDragOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
      
      inline def setDragStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
      
      inline def setDrop(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
      
      inline def setDurationChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "durationChange", js.Any.fromFunction2(value))
      
      inline def setEmptied(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "emptied", js.Any.fromFunction2(value))
      
      inline def setEncrypted(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "encrypted", js.Any.fromFunction2(value))
      
      inline def setEnded(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "ended", js.Any.fromFunction2(value))
      
      inline def setError(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setFocus(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
      
      inline def setFocusIn(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "focusIn", js.Any.fromFunction2(value))
      
      inline def setFocusOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "focusOut", js.Any.fromFunction2(value))
      
      inline def setGotPointerCapture(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "gotPointerCapture", js.Any.fromFunction2(value))
      
      inline def setInput(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
      
      inline def setInvalid(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "invalid", js.Any.fromFunction2(value))
      
      inline def setKeyDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "keyDown", js.Any.fromFunction2(value))
      
      inline def setKeyPress(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "keyPress", js.Any.fromFunction2(value))
      
      inline def setKeyUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "keyUp", js.Any.fromFunction2(value))
      
      inline def setLoad(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      inline def setLoadStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "loadStart", js.Any.fromFunction2(value))
      
      inline def setLoadedData(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "loadedData", js.Any.fromFunction2(value))
      
      inline def setLoadedMetadata(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "loadedMetadata", js.Any.fromFunction2(value))
      
      inline def setLostPointerCapture(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "lostPointerCapture", js.Any.fromFunction2(value))
      
      inline def setMouseDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseDown", js.Any.fromFunction2(value))
      
      inline def setMouseEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction2(value))
      
      inline def setMouseLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction2(value))
      
      inline def setMouseMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseMove", js.Any.fromFunction2(value))
      
      inline def setMouseOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseOut", js.Any.fromFunction2(value))
      
      inline def setMouseOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseOver", js.Any.fromFunction2(value))
      
      inline def setMouseUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseUp", js.Any.fromFunction2(value))
      
      inline def setPaste(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "paste", js.Any.fromFunction2(value))
      
      inline def setPause(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pause", js.Any.fromFunction2(value))
      
      inline def setPlay(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "play", js.Any.fromFunction2(value))
      
      inline def setPlaying(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "playing", js.Any.fromFunction2(value))
      
      inline def setPointerCancel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerCancel", js.Any.fromFunction2(value))
      
      inline def setPointerDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerDown", js.Any.fromFunction2(value))
      
      inline def setPointerEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerEnter", js.Any.fromFunction2(value))
      
      inline def setPointerLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerLeave", js.Any.fromFunction2(value))
      
      inline def setPointerMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerMove", js.Any.fromFunction2(value))
      
      inline def setPointerOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerOut", js.Any.fromFunction2(value))
      
      inline def setPointerOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerOver", js.Any.fromFunction2(value))
      
      inline def setPointerUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerUp", js.Any.fromFunction2(value))
      
      inline def setPopState(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "popState", js.Any.fromFunction2(value))
      
      inline def setProgress(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      inline def setRateChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "rateChange", js.Any.fromFunction2(value))
      
      inline def setReset(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "reset", js.Any.fromFunction2(value))
      
      inline def setResize(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
      
      inline def setScroll(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction2(value))
      
      inline def setSeeked(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "seeked", js.Any.fromFunction2(value))
      
      inline def setSeeking(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "seeking", js.Any.fromFunction2(value))
      
      inline def setSelect(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      inline def setStalled(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "stalled", js.Any.fromFunction2(value))
      
      inline def setSubmit(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "submit", js.Any.fromFunction2(value))
      
      inline def setSuspend(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "suspend", js.Any.fromFunction2(value))
      
      inline def setTimeUpdate(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "timeUpdate", js.Any.fromFunction2(value))
      
      inline def setTouchCancel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "touchCancel", js.Any.fromFunction2(value))
      
      inline def setTouchEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "touchEnd", js.Any.fromFunction2(value))
      
      inline def setTouchMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "touchMove", js.Any.fromFunction2(value))
      
      inline def setTouchStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "touchStart", js.Any.fromFunction2(value))
      
      inline def setTransitionCancel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "transitionCancel", js.Any.fromFunction2(value))
      
      inline def setTransitionEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction2(value))
      
      inline def setTransitionRun(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "transitionRun", js.Any.fromFunction2(value))
      
      inline def setTransitionStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "transitionStart", js.Any.fromFunction2(value))
      
      inline def setVolumeChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "volumeChange", js.Any.fromFunction2(value))
      
      inline def setWaiting(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "waiting", js.Any.fromFunction2(value))
      
      inline def setWheel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "wheel", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.testingLibraryDom.testingLibraryDomStrings.copy
    - typings.testingLibraryDom.testingLibraryDomStrings.cut
    - typings.testingLibraryDom.testingLibraryDomStrings.paste
    - typings.testingLibraryDom.testingLibraryDomStrings.compositionEnd
    - typings.testingLibraryDom.testingLibraryDomStrings.compositionStart
    - typings.testingLibraryDom.testingLibraryDomStrings.compositionUpdate
    - typings.testingLibraryDom.testingLibraryDomStrings.keyDown
    - typings.testingLibraryDom.testingLibraryDomStrings.keyPress
    - typings.testingLibraryDom.testingLibraryDomStrings.keyUp
    - typings.testingLibraryDom.testingLibraryDomStrings.focus
    - typings.testingLibraryDom.testingLibraryDomStrings.blur
    - typings.testingLibraryDom.testingLibraryDomStrings.focusIn
    - typings.testingLibraryDom.testingLibraryDomStrings.focusOut
    - typings.testingLibraryDom.testingLibraryDomStrings.change
    - typings.testingLibraryDom.testingLibraryDomStrings.input
    - typings.testingLibraryDom.testingLibraryDomStrings.invalid
    - typings.testingLibraryDom.testingLibraryDomStrings.submit
    - typings.testingLibraryDom.testingLibraryDomStrings.reset
    - typings.testingLibraryDom.testingLibraryDomStrings.click
    - typings.testingLibraryDom.testingLibraryDomStrings.contextMenu
    - typings.testingLibraryDom.testingLibraryDomStrings.dblClick
    - typings.testingLibraryDom.testingLibraryDomStrings.drag
    - typings.testingLibraryDom.testingLibraryDomStrings.dragEnd
    - typings.testingLibraryDom.testingLibraryDomStrings.dragEnter
    - typings.testingLibraryDom.testingLibraryDomStrings.dragExit
    - typings.testingLibraryDom.testingLibraryDomStrings.dragLeave
    - typings.testingLibraryDom.testingLibraryDomStrings.dragOver
    - typings.testingLibraryDom.testingLibraryDomStrings.dragStart
    - typings.testingLibraryDom.testingLibraryDomStrings.drop
    - typings.testingLibraryDom.testingLibraryDomStrings.mouseDown
    - typings.testingLibraryDom.testingLibraryDomStrings.mouseEnter
    - typings.testingLibraryDom.testingLibraryDomStrings.mouseLeave
    - typings.testingLibraryDom.testingLibraryDomStrings.mouseMove
    - typings.testingLibraryDom.testingLibraryDomStrings.mouseOut
    - typings.testingLibraryDom.testingLibraryDomStrings.mouseOver
    - typings.testingLibraryDom.testingLibraryDomStrings.mouseUp
    - typings.testingLibraryDom.testingLibraryDomStrings.popState
    - typings.testingLibraryDom.testingLibraryDomStrings.select
    - typings.testingLibraryDom.testingLibraryDomStrings.touchCancel
    - typings.testingLibraryDom.testingLibraryDomStrings.touchEnd
    - typings.testingLibraryDom.testingLibraryDomStrings.touchMove
    - typings.testingLibraryDom.testingLibraryDomStrings.touchStart
    - typings.testingLibraryDom.testingLibraryDomStrings.resize
    - typings.testingLibraryDom.testingLibraryDomStrings.scroll
    - typings.testingLibraryDom.testingLibraryDomStrings.wheel
    - typings.testingLibraryDom.testingLibraryDomStrings.abort
    - typings.testingLibraryDom.testingLibraryDomStrings.canPlay
    - typings.testingLibraryDom.testingLibraryDomStrings.canPlayThrough
    - typings.testingLibraryDom.testingLibraryDomStrings.durationChange
    - typings.testingLibraryDom.testingLibraryDomStrings.emptied
    - typings.testingLibraryDom.testingLibraryDomStrings.encrypted
    - typings.testingLibraryDom.testingLibraryDomStrings.ended
    - typings.testingLibraryDom.testingLibraryDomStrings.loadedData
    - typings.testingLibraryDom.testingLibraryDomStrings.loadedMetadata
    - typings.testingLibraryDom.testingLibraryDomStrings.loadStart
    - typings.testingLibraryDom.testingLibraryDomStrings.pause
    - typings.testingLibraryDom.testingLibraryDomStrings.play
    - typings.testingLibraryDom.testingLibraryDomStrings.playing
    - typings.testingLibraryDom.testingLibraryDomStrings.progress
    - typings.testingLibraryDom.testingLibraryDomStrings.rateChange
    - typings.testingLibraryDom.testingLibraryDomStrings.seeked
    - typings.testingLibraryDom.testingLibraryDomStrings.seeking
    - typings.testingLibraryDom.testingLibraryDomStrings.stalled
    - typings.testingLibraryDom.testingLibraryDomStrings.suspend
    - typings.testingLibraryDom.testingLibraryDomStrings.timeUpdate
    - typings.testingLibraryDom.testingLibraryDomStrings.volumeChange
    - typings.testingLibraryDom.testingLibraryDomStrings.waiting
    - typings.testingLibraryDom.testingLibraryDomStrings.load
    - typings.testingLibraryDom.testingLibraryDomStrings.error
    - typings.testingLibraryDom.testingLibraryDomStrings.animationStart
    - typings.testingLibraryDom.testingLibraryDomStrings.animationEnd
    - typings.testingLibraryDom.testingLibraryDomStrings.animationIteration
    - typings.testingLibraryDom.testingLibraryDomStrings.transitionCancel
    - typings.testingLibraryDom.testingLibraryDomStrings.transitionEnd
    - typings.testingLibraryDom.testingLibraryDomStrings.transitionRun
    - typings.testingLibraryDom.testingLibraryDomStrings.transitionStart
    - typings.testingLibraryDom.testingLibraryDomStrings.doubleClick
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerOver
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerEnter
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerDown
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerMove
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerUp
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerCancel
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerOut
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerLeave
    - typings.testingLibraryDom.testingLibraryDomStrings.gotPointerCapture
    - typings.testingLibraryDom.testingLibraryDomStrings.lostPointerCapture
  */
  trait EventType extends StObject
  object EventType {
    
    inline def abort: typings.testingLibraryDom.testingLibraryDomStrings.abort = "abort".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.abort]
    
    inline def animationEnd: typings.testingLibraryDom.testingLibraryDomStrings.animationEnd = "animationEnd".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.animationEnd]
    
    inline def animationIteration: typings.testingLibraryDom.testingLibraryDomStrings.animationIteration = "animationIteration".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.animationIteration]
    
    inline def animationStart: typings.testingLibraryDom.testingLibraryDomStrings.animationStart = "animationStart".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.animationStart]
    
    inline def blur: typings.testingLibraryDom.testingLibraryDomStrings.blur = "blur".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.blur]
    
    inline def canPlay: typings.testingLibraryDom.testingLibraryDomStrings.canPlay = "canPlay".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.canPlay]
    
    inline def canPlayThrough: typings.testingLibraryDom.testingLibraryDomStrings.canPlayThrough = "canPlayThrough".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.canPlayThrough]
    
    inline def change: typings.testingLibraryDom.testingLibraryDomStrings.change = "change".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.change]
    
    inline def click: typings.testingLibraryDom.testingLibraryDomStrings.click = "click".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.click]
    
    inline def compositionEnd: typings.testingLibraryDom.testingLibraryDomStrings.compositionEnd = "compositionEnd".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.compositionEnd]
    
    inline def compositionStart: typings.testingLibraryDom.testingLibraryDomStrings.compositionStart = "compositionStart".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.compositionStart]
    
    inline def compositionUpdate: typings.testingLibraryDom.testingLibraryDomStrings.compositionUpdate = "compositionUpdate".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.compositionUpdate]
    
    inline def contextMenu: typings.testingLibraryDom.testingLibraryDomStrings.contextMenu = "contextMenu".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.contextMenu]
    
    inline def copy: typings.testingLibraryDom.testingLibraryDomStrings.copy = "copy".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.copy]
    
    inline def cut: typings.testingLibraryDom.testingLibraryDomStrings.cut = "cut".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.cut]
    
    inline def dblClick: typings.testingLibraryDom.testingLibraryDomStrings.dblClick = "dblClick".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.dblClick]
    
    inline def doubleClick: typings.testingLibraryDom.testingLibraryDomStrings.doubleClick = "doubleClick".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.doubleClick]
    
    inline def drag: typings.testingLibraryDom.testingLibraryDomStrings.drag = "drag".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.drag]
    
    inline def dragEnd: typings.testingLibraryDom.testingLibraryDomStrings.dragEnd = "dragEnd".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.dragEnd]
    
    inline def dragEnter: typings.testingLibraryDom.testingLibraryDomStrings.dragEnter = "dragEnter".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.dragEnter]
    
    inline def dragExit: typings.testingLibraryDom.testingLibraryDomStrings.dragExit = "dragExit".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.dragExit]
    
    inline def dragLeave: typings.testingLibraryDom.testingLibraryDomStrings.dragLeave = "dragLeave".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.dragLeave]
    
    inline def dragOver: typings.testingLibraryDom.testingLibraryDomStrings.dragOver = "dragOver".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.dragOver]
    
    inline def dragStart: typings.testingLibraryDom.testingLibraryDomStrings.dragStart = "dragStart".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.dragStart]
    
    inline def drop: typings.testingLibraryDom.testingLibraryDomStrings.drop = "drop".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.drop]
    
    inline def durationChange: typings.testingLibraryDom.testingLibraryDomStrings.durationChange = "durationChange".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.durationChange]
    
    inline def emptied: typings.testingLibraryDom.testingLibraryDomStrings.emptied = "emptied".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.emptied]
    
    inline def encrypted: typings.testingLibraryDom.testingLibraryDomStrings.encrypted = "encrypted".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.encrypted]
    
    inline def ended: typings.testingLibraryDom.testingLibraryDomStrings.ended = "ended".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.ended]
    
    inline def error: typings.testingLibraryDom.testingLibraryDomStrings.error = "error".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.error]
    
    inline def focus: typings.testingLibraryDom.testingLibraryDomStrings.focus = "focus".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.focus]
    
    inline def focusIn: typings.testingLibraryDom.testingLibraryDomStrings.focusIn = "focusIn".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.focusIn]
    
    inline def focusOut: typings.testingLibraryDom.testingLibraryDomStrings.focusOut = "focusOut".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.focusOut]
    
    inline def gotPointerCapture: typings.testingLibraryDom.testingLibraryDomStrings.gotPointerCapture = "gotPointerCapture".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.gotPointerCapture]
    
    inline def input: typings.testingLibraryDom.testingLibraryDomStrings.input = "input".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.input]
    
    inline def invalid: typings.testingLibraryDom.testingLibraryDomStrings.invalid = "invalid".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.invalid]
    
    inline def keyDown: typings.testingLibraryDom.testingLibraryDomStrings.keyDown = "keyDown".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.keyDown]
    
    inline def keyPress: typings.testingLibraryDom.testingLibraryDomStrings.keyPress = "keyPress".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.keyPress]
    
    inline def keyUp: typings.testingLibraryDom.testingLibraryDomStrings.keyUp = "keyUp".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.keyUp]
    
    inline def load: typings.testingLibraryDom.testingLibraryDomStrings.load = "load".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.load]
    
    inline def loadStart: typings.testingLibraryDom.testingLibraryDomStrings.loadStart = "loadStart".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.loadStart]
    
    inline def loadedData: typings.testingLibraryDom.testingLibraryDomStrings.loadedData = "loadedData".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.loadedData]
    
    inline def loadedMetadata: typings.testingLibraryDom.testingLibraryDomStrings.loadedMetadata = "loadedMetadata".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.loadedMetadata]
    
    inline def lostPointerCapture: typings.testingLibraryDom.testingLibraryDomStrings.lostPointerCapture = "lostPointerCapture".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.lostPointerCapture]
    
    inline def mouseDown: typings.testingLibraryDom.testingLibraryDomStrings.mouseDown = "mouseDown".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.mouseDown]
    
    inline def mouseEnter: typings.testingLibraryDom.testingLibraryDomStrings.mouseEnter = "mouseEnter".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.mouseEnter]
    
    inline def mouseLeave: typings.testingLibraryDom.testingLibraryDomStrings.mouseLeave = "mouseLeave".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.mouseLeave]
    
    inline def mouseMove: typings.testingLibraryDom.testingLibraryDomStrings.mouseMove = "mouseMove".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.mouseMove]
    
    inline def mouseOut: typings.testingLibraryDom.testingLibraryDomStrings.mouseOut = "mouseOut".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.mouseOut]
    
    inline def mouseOver: typings.testingLibraryDom.testingLibraryDomStrings.mouseOver = "mouseOver".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.mouseOver]
    
    inline def mouseUp: typings.testingLibraryDom.testingLibraryDomStrings.mouseUp = "mouseUp".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.mouseUp]
    
    inline def paste: typings.testingLibraryDom.testingLibraryDomStrings.paste = "paste".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.paste]
    
    inline def pause: typings.testingLibraryDom.testingLibraryDomStrings.pause = "pause".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pause]
    
    inline def play: typings.testingLibraryDom.testingLibraryDomStrings.play = "play".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.play]
    
    inline def playing: typings.testingLibraryDom.testingLibraryDomStrings.playing = "playing".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.playing]
    
    inline def pointerCancel: typings.testingLibraryDom.testingLibraryDomStrings.pointerCancel = "pointerCancel".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerCancel]
    
    inline def pointerDown: typings.testingLibraryDom.testingLibraryDomStrings.pointerDown = "pointerDown".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerDown]
    
    inline def pointerEnter: typings.testingLibraryDom.testingLibraryDomStrings.pointerEnter = "pointerEnter".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerEnter]
    
    inline def pointerLeave: typings.testingLibraryDom.testingLibraryDomStrings.pointerLeave = "pointerLeave".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerLeave]
    
    inline def pointerMove: typings.testingLibraryDom.testingLibraryDomStrings.pointerMove = "pointerMove".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerMove]
    
    inline def pointerOut: typings.testingLibraryDom.testingLibraryDomStrings.pointerOut = "pointerOut".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerOut]
    
    inline def pointerOver: typings.testingLibraryDom.testingLibraryDomStrings.pointerOver = "pointerOver".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerOver]
    
    inline def pointerUp: typings.testingLibraryDom.testingLibraryDomStrings.pointerUp = "pointerUp".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerUp]
    
    inline def popState: typings.testingLibraryDom.testingLibraryDomStrings.popState = "popState".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.popState]
    
    inline def progress: typings.testingLibraryDom.testingLibraryDomStrings.progress = "progress".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.progress]
    
    inline def rateChange: typings.testingLibraryDom.testingLibraryDomStrings.rateChange = "rateChange".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.rateChange]
    
    inline def reset: typings.testingLibraryDom.testingLibraryDomStrings.reset = "reset".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.reset]
    
    inline def resize: typings.testingLibraryDom.testingLibraryDomStrings.resize = "resize".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.resize]
    
    inline def scroll: typings.testingLibraryDom.testingLibraryDomStrings.scroll = "scroll".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.scroll]
    
    inline def seeked: typings.testingLibraryDom.testingLibraryDomStrings.seeked = "seeked".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.seeked]
    
    inline def seeking: typings.testingLibraryDom.testingLibraryDomStrings.seeking = "seeking".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.seeking]
    
    inline def select: typings.testingLibraryDom.testingLibraryDomStrings.select = "select".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.select]
    
    inline def stalled: typings.testingLibraryDom.testingLibraryDomStrings.stalled = "stalled".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.stalled]
    
    inline def submit: typings.testingLibraryDom.testingLibraryDomStrings.submit = "submit".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.submit]
    
    inline def suspend: typings.testingLibraryDom.testingLibraryDomStrings.suspend = "suspend".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.suspend]
    
    inline def timeUpdate: typings.testingLibraryDom.testingLibraryDomStrings.timeUpdate = "timeUpdate".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.timeUpdate]
    
    inline def touchCancel: typings.testingLibraryDom.testingLibraryDomStrings.touchCancel = "touchCancel".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.touchCancel]
    
    inline def touchEnd: typings.testingLibraryDom.testingLibraryDomStrings.touchEnd = "touchEnd".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.touchEnd]
    
    inline def touchMove: typings.testingLibraryDom.testingLibraryDomStrings.touchMove = "touchMove".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.touchMove]
    
    inline def touchStart: typings.testingLibraryDom.testingLibraryDomStrings.touchStart = "touchStart".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.touchStart]
    
    inline def transitionCancel: typings.testingLibraryDom.testingLibraryDomStrings.transitionCancel = "transitionCancel".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.transitionCancel]
    
    inline def transitionEnd: typings.testingLibraryDom.testingLibraryDomStrings.transitionEnd = "transitionEnd".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.transitionEnd]
    
    inline def transitionRun: typings.testingLibraryDom.testingLibraryDomStrings.transitionRun = "transitionRun".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.transitionRun]
    
    inline def transitionStart: typings.testingLibraryDom.testingLibraryDomStrings.transitionStart = "transitionStart".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.transitionStart]
    
    inline def volumeChange: typings.testingLibraryDom.testingLibraryDomStrings.volumeChange = "volumeChange".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.volumeChange]
    
    inline def waiting: typings.testingLibraryDom.testingLibraryDomStrings.waiting = "waiting".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.waiting]
    
    inline def wheel: typings.testingLibraryDom.testingLibraryDomStrings.wheel = "wheel".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.wheel]
  }
  
  type FireFunction = js.Function2[/* element */ Document | Element | Window | Node, /* event */ Event, Boolean]
  
  /* Inlined {[ K in @testing-library/dom.@testing-library/dom/types/events.EventType ]: (element : std.Document | std.Element | std.Window | std.Node, options : {} | undefined): boolean} */
  trait FireObject extends StObject {
    
    def abort(element: Document): Boolean
    def abort(element: Document, options: js.Object): Boolean
    def abort(element: Element): Boolean
    def abort(element: Element, options: js.Object): Boolean
    def abort(element: Node): Boolean
    def abort(element: Node, options: js.Object): Boolean
    def abort(element: Window): Boolean
    def abort(element: Window, options: js.Object): Boolean
    @JSName("abort")
    var abort_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def animationEnd(element: Document): Boolean
    def animationEnd(element: Document, options: js.Object): Boolean
    def animationEnd(element: Element): Boolean
    def animationEnd(element: Element, options: js.Object): Boolean
    def animationEnd(element: Node): Boolean
    def animationEnd(element: Node, options: js.Object): Boolean
    def animationEnd(element: Window): Boolean
    def animationEnd(element: Window, options: js.Object): Boolean
    @JSName("animationEnd")
    var animationEnd_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def animationIteration(element: Document): Boolean
    def animationIteration(element: Document, options: js.Object): Boolean
    def animationIteration(element: Element): Boolean
    def animationIteration(element: Element, options: js.Object): Boolean
    def animationIteration(element: Node): Boolean
    def animationIteration(element: Node, options: js.Object): Boolean
    def animationIteration(element: Window): Boolean
    def animationIteration(element: Window, options: js.Object): Boolean
    @JSName("animationIteration")
    var animationIteration_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def animationStart(element: Document): Boolean
    def animationStart(element: Document, options: js.Object): Boolean
    def animationStart(element: Element): Boolean
    def animationStart(element: Element, options: js.Object): Boolean
    def animationStart(element: Node): Boolean
    def animationStart(element: Node, options: js.Object): Boolean
    def animationStart(element: Window): Boolean
    def animationStart(element: Window, options: js.Object): Boolean
    @JSName("animationStart")
    var animationStart_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def blur(element: Document): Boolean
    def blur(element: Document, options: js.Object): Boolean
    def blur(element: Element): Boolean
    def blur(element: Element, options: js.Object): Boolean
    def blur(element: Node): Boolean
    def blur(element: Node, options: js.Object): Boolean
    def blur(element: Window): Boolean
    def blur(element: Window, options: js.Object): Boolean
    @JSName("blur")
    var blur_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def canPlay(element: Document): Boolean
    def canPlay(element: Document, options: js.Object): Boolean
    def canPlay(element: Element): Boolean
    def canPlay(element: Element, options: js.Object): Boolean
    def canPlay(element: Node): Boolean
    def canPlay(element: Node, options: js.Object): Boolean
    def canPlay(element: Window): Boolean
    def canPlay(element: Window, options: js.Object): Boolean
    
    def canPlayThrough(element: Document): Boolean
    def canPlayThrough(element: Document, options: js.Object): Boolean
    def canPlayThrough(element: Element): Boolean
    def canPlayThrough(element: Element, options: js.Object): Boolean
    def canPlayThrough(element: Node): Boolean
    def canPlayThrough(element: Node, options: js.Object): Boolean
    def canPlayThrough(element: Window): Boolean
    def canPlayThrough(element: Window, options: js.Object): Boolean
    @JSName("canPlayThrough")
    var canPlayThrough_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    @JSName("canPlay")
    var canPlay_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def change(element: Document): Boolean
    def change(element: Document, options: js.Object): Boolean
    def change(element: Element): Boolean
    def change(element: Element, options: js.Object): Boolean
    def change(element: Node): Boolean
    def change(element: Node, options: js.Object): Boolean
    def change(element: Window): Boolean
    def change(element: Window, options: js.Object): Boolean
    @JSName("change")
    var change_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def click(element: Document): Boolean
    def click(element: Document, options: js.Object): Boolean
    def click(element: Element): Boolean
    def click(element: Element, options: js.Object): Boolean
    def click(element: Node): Boolean
    def click(element: Node, options: js.Object): Boolean
    def click(element: Window): Boolean
    def click(element: Window, options: js.Object): Boolean
    @JSName("click")
    var click_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def compositionEnd(element: Document): Boolean
    def compositionEnd(element: Document, options: js.Object): Boolean
    def compositionEnd(element: Element): Boolean
    def compositionEnd(element: Element, options: js.Object): Boolean
    def compositionEnd(element: Node): Boolean
    def compositionEnd(element: Node, options: js.Object): Boolean
    def compositionEnd(element: Window): Boolean
    def compositionEnd(element: Window, options: js.Object): Boolean
    @JSName("compositionEnd")
    var compositionEnd_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def compositionStart(element: Document): Boolean
    def compositionStart(element: Document, options: js.Object): Boolean
    def compositionStart(element: Element): Boolean
    def compositionStart(element: Element, options: js.Object): Boolean
    def compositionStart(element: Node): Boolean
    def compositionStart(element: Node, options: js.Object): Boolean
    def compositionStart(element: Window): Boolean
    def compositionStart(element: Window, options: js.Object): Boolean
    @JSName("compositionStart")
    var compositionStart_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def compositionUpdate(element: Document): Boolean
    def compositionUpdate(element: Document, options: js.Object): Boolean
    def compositionUpdate(element: Element): Boolean
    def compositionUpdate(element: Element, options: js.Object): Boolean
    def compositionUpdate(element: Node): Boolean
    def compositionUpdate(element: Node, options: js.Object): Boolean
    def compositionUpdate(element: Window): Boolean
    def compositionUpdate(element: Window, options: js.Object): Boolean
    @JSName("compositionUpdate")
    var compositionUpdate_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def contextMenu(element: Document): Boolean
    def contextMenu(element: Document, options: js.Object): Boolean
    def contextMenu(element: Element): Boolean
    def contextMenu(element: Element, options: js.Object): Boolean
    def contextMenu(element: Node): Boolean
    def contextMenu(element: Node, options: js.Object): Boolean
    def contextMenu(element: Window): Boolean
    def contextMenu(element: Window, options: js.Object): Boolean
    @JSName("contextMenu")
    var contextMenu_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def copy(element: Document): Boolean
    def copy(element: Document, options: js.Object): Boolean
    def copy(element: Element): Boolean
    def copy(element: Element, options: js.Object): Boolean
    def copy(element: Node): Boolean
    def copy(element: Node, options: js.Object): Boolean
    def copy(element: Window): Boolean
    def copy(element: Window, options: js.Object): Boolean
    @JSName("copy")
    var copy_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def cut(element: Document): Boolean
    def cut(element: Document, options: js.Object): Boolean
    def cut(element: Element): Boolean
    def cut(element: Element, options: js.Object): Boolean
    def cut(element: Node): Boolean
    def cut(element: Node, options: js.Object): Boolean
    def cut(element: Window): Boolean
    def cut(element: Window, options: js.Object): Boolean
    @JSName("cut")
    var cut_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def dblClick(element: Document): Boolean
    def dblClick(element: Document, options: js.Object): Boolean
    def dblClick(element: Element): Boolean
    def dblClick(element: Element, options: js.Object): Boolean
    def dblClick(element: Node): Boolean
    def dblClick(element: Node, options: js.Object): Boolean
    def dblClick(element: Window): Boolean
    def dblClick(element: Window, options: js.Object): Boolean
    @JSName("dblClick")
    var dblClick_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def doubleClick(element: Document): Boolean
    def doubleClick(element: Document, options: js.Object): Boolean
    def doubleClick(element: Element): Boolean
    def doubleClick(element: Element, options: js.Object): Boolean
    def doubleClick(element: Node): Boolean
    def doubleClick(element: Node, options: js.Object): Boolean
    def doubleClick(element: Window): Boolean
    def doubleClick(element: Window, options: js.Object): Boolean
    @JSName("doubleClick")
    var doubleClick_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def drag(element: Document): Boolean
    def drag(element: Document, options: js.Object): Boolean
    def drag(element: Element): Boolean
    def drag(element: Element, options: js.Object): Boolean
    def drag(element: Node): Boolean
    def drag(element: Node, options: js.Object): Boolean
    def drag(element: Window): Boolean
    def drag(element: Window, options: js.Object): Boolean
    
    def dragEnd(element: Document): Boolean
    def dragEnd(element: Document, options: js.Object): Boolean
    def dragEnd(element: Element): Boolean
    def dragEnd(element: Element, options: js.Object): Boolean
    def dragEnd(element: Node): Boolean
    def dragEnd(element: Node, options: js.Object): Boolean
    def dragEnd(element: Window): Boolean
    def dragEnd(element: Window, options: js.Object): Boolean
    @JSName("dragEnd")
    var dragEnd_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def dragEnter(element: Document): Boolean
    def dragEnter(element: Document, options: js.Object): Boolean
    def dragEnter(element: Element): Boolean
    def dragEnter(element: Element, options: js.Object): Boolean
    def dragEnter(element: Node): Boolean
    def dragEnter(element: Node, options: js.Object): Boolean
    def dragEnter(element: Window): Boolean
    def dragEnter(element: Window, options: js.Object): Boolean
    @JSName("dragEnter")
    var dragEnter_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def dragExit(element: Document): Boolean
    def dragExit(element: Document, options: js.Object): Boolean
    def dragExit(element: Element): Boolean
    def dragExit(element: Element, options: js.Object): Boolean
    def dragExit(element: Node): Boolean
    def dragExit(element: Node, options: js.Object): Boolean
    def dragExit(element: Window): Boolean
    def dragExit(element: Window, options: js.Object): Boolean
    @JSName("dragExit")
    var dragExit_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def dragLeave(element: Document): Boolean
    def dragLeave(element: Document, options: js.Object): Boolean
    def dragLeave(element: Element): Boolean
    def dragLeave(element: Element, options: js.Object): Boolean
    def dragLeave(element: Node): Boolean
    def dragLeave(element: Node, options: js.Object): Boolean
    def dragLeave(element: Window): Boolean
    def dragLeave(element: Window, options: js.Object): Boolean
    @JSName("dragLeave")
    var dragLeave_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def dragOver(element: Document): Boolean
    def dragOver(element: Document, options: js.Object): Boolean
    def dragOver(element: Element): Boolean
    def dragOver(element: Element, options: js.Object): Boolean
    def dragOver(element: Node): Boolean
    def dragOver(element: Node, options: js.Object): Boolean
    def dragOver(element: Window): Boolean
    def dragOver(element: Window, options: js.Object): Boolean
    @JSName("dragOver")
    var dragOver_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def dragStart(element: Document): Boolean
    def dragStart(element: Document, options: js.Object): Boolean
    def dragStart(element: Element): Boolean
    def dragStart(element: Element, options: js.Object): Boolean
    def dragStart(element: Node): Boolean
    def dragStart(element: Node, options: js.Object): Boolean
    def dragStart(element: Window): Boolean
    def dragStart(element: Window, options: js.Object): Boolean
    @JSName("dragStart")
    var dragStart_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    @JSName("drag")
    var drag_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def drop(element: Document): Boolean
    def drop(element: Document, options: js.Object): Boolean
    def drop(element: Element): Boolean
    def drop(element: Element, options: js.Object): Boolean
    def drop(element: Node): Boolean
    def drop(element: Node, options: js.Object): Boolean
    def drop(element: Window): Boolean
    def drop(element: Window, options: js.Object): Boolean
    @JSName("drop")
    var drop_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def durationChange(element: Document): Boolean
    def durationChange(element: Document, options: js.Object): Boolean
    def durationChange(element: Element): Boolean
    def durationChange(element: Element, options: js.Object): Boolean
    def durationChange(element: Node): Boolean
    def durationChange(element: Node, options: js.Object): Boolean
    def durationChange(element: Window): Boolean
    def durationChange(element: Window, options: js.Object): Boolean
    @JSName("durationChange")
    var durationChange_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def emptied(element: Document): Boolean
    def emptied(element: Document, options: js.Object): Boolean
    def emptied(element: Element): Boolean
    def emptied(element: Element, options: js.Object): Boolean
    def emptied(element: Node): Boolean
    def emptied(element: Node, options: js.Object): Boolean
    def emptied(element: Window): Boolean
    def emptied(element: Window, options: js.Object): Boolean
    @JSName("emptied")
    var emptied_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def encrypted(element: Document): Boolean
    def encrypted(element: Document, options: js.Object): Boolean
    def encrypted(element: Element): Boolean
    def encrypted(element: Element, options: js.Object): Boolean
    def encrypted(element: Node): Boolean
    def encrypted(element: Node, options: js.Object): Boolean
    def encrypted(element: Window): Boolean
    def encrypted(element: Window, options: js.Object): Boolean
    @JSName("encrypted")
    var encrypted_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def ended(element: Document): Boolean
    def ended(element: Document, options: js.Object): Boolean
    def ended(element: Element): Boolean
    def ended(element: Element, options: js.Object): Boolean
    def ended(element: Node): Boolean
    def ended(element: Node, options: js.Object): Boolean
    def ended(element: Window): Boolean
    def ended(element: Window, options: js.Object): Boolean
    @JSName("ended")
    var ended_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def error(element: Document): Boolean
    def error(element: Document, options: js.Object): Boolean
    def error(element: Element): Boolean
    def error(element: Element, options: js.Object): Boolean
    def error(element: Node): Boolean
    def error(element: Node, options: js.Object): Boolean
    def error(element: Window): Boolean
    def error(element: Window, options: js.Object): Boolean
    @JSName("error")
    var error_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def focus(element: Document): Boolean
    def focus(element: Document, options: js.Object): Boolean
    def focus(element: Element): Boolean
    def focus(element: Element, options: js.Object): Boolean
    def focus(element: Node): Boolean
    def focus(element: Node, options: js.Object): Boolean
    def focus(element: Window): Boolean
    def focus(element: Window, options: js.Object): Boolean
    
    def focusIn(element: Document): Boolean
    def focusIn(element: Document, options: js.Object): Boolean
    def focusIn(element: Element): Boolean
    def focusIn(element: Element, options: js.Object): Boolean
    def focusIn(element: Node): Boolean
    def focusIn(element: Node, options: js.Object): Boolean
    def focusIn(element: Window): Boolean
    def focusIn(element: Window, options: js.Object): Boolean
    @JSName("focusIn")
    var focusIn_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def focusOut(element: Document): Boolean
    def focusOut(element: Document, options: js.Object): Boolean
    def focusOut(element: Element): Boolean
    def focusOut(element: Element, options: js.Object): Boolean
    def focusOut(element: Node): Boolean
    def focusOut(element: Node, options: js.Object): Boolean
    def focusOut(element: Window): Boolean
    def focusOut(element: Window, options: js.Object): Boolean
    @JSName("focusOut")
    var focusOut_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    @JSName("focus")
    var focus_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def gotPointerCapture(element: Document): Boolean
    def gotPointerCapture(element: Document, options: js.Object): Boolean
    def gotPointerCapture(element: Element): Boolean
    def gotPointerCapture(element: Element, options: js.Object): Boolean
    def gotPointerCapture(element: Node): Boolean
    def gotPointerCapture(element: Node, options: js.Object): Boolean
    def gotPointerCapture(element: Window): Boolean
    def gotPointerCapture(element: Window, options: js.Object): Boolean
    @JSName("gotPointerCapture")
    var gotPointerCapture_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def input(element: Document): Boolean
    def input(element: Document, options: js.Object): Boolean
    def input(element: Element): Boolean
    def input(element: Element, options: js.Object): Boolean
    def input(element: Node): Boolean
    def input(element: Node, options: js.Object): Boolean
    def input(element: Window): Boolean
    def input(element: Window, options: js.Object): Boolean
    @JSName("input")
    var input_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def invalid(element: Document): Boolean
    def invalid(element: Document, options: js.Object): Boolean
    def invalid(element: Element): Boolean
    def invalid(element: Element, options: js.Object): Boolean
    def invalid(element: Node): Boolean
    def invalid(element: Node, options: js.Object): Boolean
    def invalid(element: Window): Boolean
    def invalid(element: Window, options: js.Object): Boolean
    @JSName("invalid")
    var invalid_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def keyDown(element: Document): Boolean
    def keyDown(element: Document, options: js.Object): Boolean
    def keyDown(element: Element): Boolean
    def keyDown(element: Element, options: js.Object): Boolean
    def keyDown(element: Node): Boolean
    def keyDown(element: Node, options: js.Object): Boolean
    def keyDown(element: Window): Boolean
    def keyDown(element: Window, options: js.Object): Boolean
    @JSName("keyDown")
    var keyDown_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def keyPress(element: Document): Boolean
    def keyPress(element: Document, options: js.Object): Boolean
    def keyPress(element: Element): Boolean
    def keyPress(element: Element, options: js.Object): Boolean
    def keyPress(element: Node): Boolean
    def keyPress(element: Node, options: js.Object): Boolean
    def keyPress(element: Window): Boolean
    def keyPress(element: Window, options: js.Object): Boolean
    @JSName("keyPress")
    var keyPress_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def keyUp(element: Document): Boolean
    def keyUp(element: Document, options: js.Object): Boolean
    def keyUp(element: Element): Boolean
    def keyUp(element: Element, options: js.Object): Boolean
    def keyUp(element: Node): Boolean
    def keyUp(element: Node, options: js.Object): Boolean
    def keyUp(element: Window): Boolean
    def keyUp(element: Window, options: js.Object): Boolean
    @JSName("keyUp")
    var keyUp_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def load(element: Document): Boolean
    def load(element: Document, options: js.Object): Boolean
    def load(element: Element): Boolean
    def load(element: Element, options: js.Object): Boolean
    def load(element: Node): Boolean
    def load(element: Node, options: js.Object): Boolean
    def load(element: Window): Boolean
    def load(element: Window, options: js.Object): Boolean
    
    def loadStart(element: Document): Boolean
    def loadStart(element: Document, options: js.Object): Boolean
    def loadStart(element: Element): Boolean
    def loadStart(element: Element, options: js.Object): Boolean
    def loadStart(element: Node): Boolean
    def loadStart(element: Node, options: js.Object): Boolean
    def loadStart(element: Window): Boolean
    def loadStart(element: Window, options: js.Object): Boolean
    @JSName("loadStart")
    var loadStart_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    @JSName("load")
    var load_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def loadedData(element: Document): Boolean
    def loadedData(element: Document, options: js.Object): Boolean
    def loadedData(element: Element): Boolean
    def loadedData(element: Element, options: js.Object): Boolean
    def loadedData(element: Node): Boolean
    def loadedData(element: Node, options: js.Object): Boolean
    def loadedData(element: Window): Boolean
    def loadedData(element: Window, options: js.Object): Boolean
    @JSName("loadedData")
    var loadedData_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def loadedMetadata(element: Document): Boolean
    def loadedMetadata(element: Document, options: js.Object): Boolean
    def loadedMetadata(element: Element): Boolean
    def loadedMetadata(element: Element, options: js.Object): Boolean
    def loadedMetadata(element: Node): Boolean
    def loadedMetadata(element: Node, options: js.Object): Boolean
    def loadedMetadata(element: Window): Boolean
    def loadedMetadata(element: Window, options: js.Object): Boolean
    @JSName("loadedMetadata")
    var loadedMetadata_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def lostPointerCapture(element: Document): Boolean
    def lostPointerCapture(element: Document, options: js.Object): Boolean
    def lostPointerCapture(element: Element): Boolean
    def lostPointerCapture(element: Element, options: js.Object): Boolean
    def lostPointerCapture(element: Node): Boolean
    def lostPointerCapture(element: Node, options: js.Object): Boolean
    def lostPointerCapture(element: Window): Boolean
    def lostPointerCapture(element: Window, options: js.Object): Boolean
    @JSName("lostPointerCapture")
    var lostPointerCapture_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def mouseDown(element: Document): Boolean
    def mouseDown(element: Document, options: js.Object): Boolean
    def mouseDown(element: Element): Boolean
    def mouseDown(element: Element, options: js.Object): Boolean
    def mouseDown(element: Node): Boolean
    def mouseDown(element: Node, options: js.Object): Boolean
    def mouseDown(element: Window): Boolean
    def mouseDown(element: Window, options: js.Object): Boolean
    @JSName("mouseDown")
    var mouseDown_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def mouseEnter(element: Document): Boolean
    def mouseEnter(element: Document, options: js.Object): Boolean
    def mouseEnter(element: Element): Boolean
    def mouseEnter(element: Element, options: js.Object): Boolean
    def mouseEnter(element: Node): Boolean
    def mouseEnter(element: Node, options: js.Object): Boolean
    def mouseEnter(element: Window): Boolean
    def mouseEnter(element: Window, options: js.Object): Boolean
    @JSName("mouseEnter")
    var mouseEnter_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def mouseLeave(element: Document): Boolean
    def mouseLeave(element: Document, options: js.Object): Boolean
    def mouseLeave(element: Element): Boolean
    def mouseLeave(element: Element, options: js.Object): Boolean
    def mouseLeave(element: Node): Boolean
    def mouseLeave(element: Node, options: js.Object): Boolean
    def mouseLeave(element: Window): Boolean
    def mouseLeave(element: Window, options: js.Object): Boolean
    @JSName("mouseLeave")
    var mouseLeave_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def mouseMove(element: Document): Boolean
    def mouseMove(element: Document, options: js.Object): Boolean
    def mouseMove(element: Element): Boolean
    def mouseMove(element: Element, options: js.Object): Boolean
    def mouseMove(element: Node): Boolean
    def mouseMove(element: Node, options: js.Object): Boolean
    def mouseMove(element: Window): Boolean
    def mouseMove(element: Window, options: js.Object): Boolean
    @JSName("mouseMove")
    var mouseMove_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def mouseOut(element: Document): Boolean
    def mouseOut(element: Document, options: js.Object): Boolean
    def mouseOut(element: Element): Boolean
    def mouseOut(element: Element, options: js.Object): Boolean
    def mouseOut(element: Node): Boolean
    def mouseOut(element: Node, options: js.Object): Boolean
    def mouseOut(element: Window): Boolean
    def mouseOut(element: Window, options: js.Object): Boolean
    @JSName("mouseOut")
    var mouseOut_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def mouseOver(element: Document): Boolean
    def mouseOver(element: Document, options: js.Object): Boolean
    def mouseOver(element: Element): Boolean
    def mouseOver(element: Element, options: js.Object): Boolean
    def mouseOver(element: Node): Boolean
    def mouseOver(element: Node, options: js.Object): Boolean
    def mouseOver(element: Window): Boolean
    def mouseOver(element: Window, options: js.Object): Boolean
    @JSName("mouseOver")
    var mouseOver_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def mouseUp(element: Document): Boolean
    def mouseUp(element: Document, options: js.Object): Boolean
    def mouseUp(element: Element): Boolean
    def mouseUp(element: Element, options: js.Object): Boolean
    def mouseUp(element: Node): Boolean
    def mouseUp(element: Node, options: js.Object): Boolean
    def mouseUp(element: Window): Boolean
    def mouseUp(element: Window, options: js.Object): Boolean
    @JSName("mouseUp")
    var mouseUp_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def paste(element: Document): Boolean
    def paste(element: Document, options: js.Object): Boolean
    def paste(element: Element): Boolean
    def paste(element: Element, options: js.Object): Boolean
    def paste(element: Node): Boolean
    def paste(element: Node, options: js.Object): Boolean
    def paste(element: Window): Boolean
    def paste(element: Window, options: js.Object): Boolean
    @JSName("paste")
    var paste_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def pause(element: Document): Boolean
    def pause(element: Document, options: js.Object): Boolean
    def pause(element: Element): Boolean
    def pause(element: Element, options: js.Object): Boolean
    def pause(element: Node): Boolean
    def pause(element: Node, options: js.Object): Boolean
    def pause(element: Window): Boolean
    def pause(element: Window, options: js.Object): Boolean
    @JSName("pause")
    var pause_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def play(element: Document): Boolean
    def play(element: Document, options: js.Object): Boolean
    def play(element: Element): Boolean
    def play(element: Element, options: js.Object): Boolean
    def play(element: Node): Boolean
    def play(element: Node, options: js.Object): Boolean
    def play(element: Window): Boolean
    def play(element: Window, options: js.Object): Boolean
    @JSName("play")
    var play_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def playing(element: Document): Boolean
    def playing(element: Document, options: js.Object): Boolean
    def playing(element: Element): Boolean
    def playing(element: Element, options: js.Object): Boolean
    def playing(element: Node): Boolean
    def playing(element: Node, options: js.Object): Boolean
    def playing(element: Window): Boolean
    def playing(element: Window, options: js.Object): Boolean
    @JSName("playing")
    var playing_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def pointerCancel(element: Document): Boolean
    def pointerCancel(element: Document, options: js.Object): Boolean
    def pointerCancel(element: Element): Boolean
    def pointerCancel(element: Element, options: js.Object): Boolean
    def pointerCancel(element: Node): Boolean
    def pointerCancel(element: Node, options: js.Object): Boolean
    def pointerCancel(element: Window): Boolean
    def pointerCancel(element: Window, options: js.Object): Boolean
    @JSName("pointerCancel")
    var pointerCancel_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def pointerDown(element: Document): Boolean
    def pointerDown(element: Document, options: js.Object): Boolean
    def pointerDown(element: Element): Boolean
    def pointerDown(element: Element, options: js.Object): Boolean
    def pointerDown(element: Node): Boolean
    def pointerDown(element: Node, options: js.Object): Boolean
    def pointerDown(element: Window): Boolean
    def pointerDown(element: Window, options: js.Object): Boolean
    @JSName("pointerDown")
    var pointerDown_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def pointerEnter(element: Document): Boolean
    def pointerEnter(element: Document, options: js.Object): Boolean
    def pointerEnter(element: Element): Boolean
    def pointerEnter(element: Element, options: js.Object): Boolean
    def pointerEnter(element: Node): Boolean
    def pointerEnter(element: Node, options: js.Object): Boolean
    def pointerEnter(element: Window): Boolean
    def pointerEnter(element: Window, options: js.Object): Boolean
    @JSName("pointerEnter")
    var pointerEnter_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def pointerLeave(element: Document): Boolean
    def pointerLeave(element: Document, options: js.Object): Boolean
    def pointerLeave(element: Element): Boolean
    def pointerLeave(element: Element, options: js.Object): Boolean
    def pointerLeave(element: Node): Boolean
    def pointerLeave(element: Node, options: js.Object): Boolean
    def pointerLeave(element: Window): Boolean
    def pointerLeave(element: Window, options: js.Object): Boolean
    @JSName("pointerLeave")
    var pointerLeave_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def pointerMove(element: Document): Boolean
    def pointerMove(element: Document, options: js.Object): Boolean
    def pointerMove(element: Element): Boolean
    def pointerMove(element: Element, options: js.Object): Boolean
    def pointerMove(element: Node): Boolean
    def pointerMove(element: Node, options: js.Object): Boolean
    def pointerMove(element: Window): Boolean
    def pointerMove(element: Window, options: js.Object): Boolean
    @JSName("pointerMove")
    var pointerMove_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def pointerOut(element: Document): Boolean
    def pointerOut(element: Document, options: js.Object): Boolean
    def pointerOut(element: Element): Boolean
    def pointerOut(element: Element, options: js.Object): Boolean
    def pointerOut(element: Node): Boolean
    def pointerOut(element: Node, options: js.Object): Boolean
    def pointerOut(element: Window): Boolean
    def pointerOut(element: Window, options: js.Object): Boolean
    @JSName("pointerOut")
    var pointerOut_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def pointerOver(element: Document): Boolean
    def pointerOver(element: Document, options: js.Object): Boolean
    def pointerOver(element: Element): Boolean
    def pointerOver(element: Element, options: js.Object): Boolean
    def pointerOver(element: Node): Boolean
    def pointerOver(element: Node, options: js.Object): Boolean
    def pointerOver(element: Window): Boolean
    def pointerOver(element: Window, options: js.Object): Boolean
    @JSName("pointerOver")
    var pointerOver_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def pointerUp(element: Document): Boolean
    def pointerUp(element: Document, options: js.Object): Boolean
    def pointerUp(element: Element): Boolean
    def pointerUp(element: Element, options: js.Object): Boolean
    def pointerUp(element: Node): Boolean
    def pointerUp(element: Node, options: js.Object): Boolean
    def pointerUp(element: Window): Boolean
    def pointerUp(element: Window, options: js.Object): Boolean
    @JSName("pointerUp")
    var pointerUp_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def popState(element: Document): Boolean
    def popState(element: Document, options: js.Object): Boolean
    def popState(element: Element): Boolean
    def popState(element: Element, options: js.Object): Boolean
    def popState(element: Node): Boolean
    def popState(element: Node, options: js.Object): Boolean
    def popState(element: Window): Boolean
    def popState(element: Window, options: js.Object): Boolean
    @JSName("popState")
    var popState_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def progress(element: Document): Boolean
    def progress(element: Document, options: js.Object): Boolean
    def progress(element: Element): Boolean
    def progress(element: Element, options: js.Object): Boolean
    def progress(element: Node): Boolean
    def progress(element: Node, options: js.Object): Boolean
    def progress(element: Window): Boolean
    def progress(element: Window, options: js.Object): Boolean
    @JSName("progress")
    var progress_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def rateChange(element: Document): Boolean
    def rateChange(element: Document, options: js.Object): Boolean
    def rateChange(element: Element): Boolean
    def rateChange(element: Element, options: js.Object): Boolean
    def rateChange(element: Node): Boolean
    def rateChange(element: Node, options: js.Object): Boolean
    def rateChange(element: Window): Boolean
    def rateChange(element: Window, options: js.Object): Boolean
    @JSName("rateChange")
    var rateChange_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def reset(element: Document): Boolean
    def reset(element: Document, options: js.Object): Boolean
    def reset(element: Element): Boolean
    def reset(element: Element, options: js.Object): Boolean
    def reset(element: Node): Boolean
    def reset(element: Node, options: js.Object): Boolean
    def reset(element: Window): Boolean
    def reset(element: Window, options: js.Object): Boolean
    @JSName("reset")
    var reset_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def resize(element: Document): Boolean
    def resize(element: Document, options: js.Object): Boolean
    def resize(element: Element): Boolean
    def resize(element: Element, options: js.Object): Boolean
    def resize(element: Node): Boolean
    def resize(element: Node, options: js.Object): Boolean
    def resize(element: Window): Boolean
    def resize(element: Window, options: js.Object): Boolean
    @JSName("resize")
    var resize_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def scroll(element: Document): Boolean
    def scroll(element: Document, options: js.Object): Boolean
    def scroll(element: Element): Boolean
    def scroll(element: Element, options: js.Object): Boolean
    def scroll(element: Node): Boolean
    def scroll(element: Node, options: js.Object): Boolean
    def scroll(element: Window): Boolean
    def scroll(element: Window, options: js.Object): Boolean
    @JSName("scroll")
    var scroll_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def seeked(element: Document): Boolean
    def seeked(element: Document, options: js.Object): Boolean
    def seeked(element: Element): Boolean
    def seeked(element: Element, options: js.Object): Boolean
    def seeked(element: Node): Boolean
    def seeked(element: Node, options: js.Object): Boolean
    def seeked(element: Window): Boolean
    def seeked(element: Window, options: js.Object): Boolean
    @JSName("seeked")
    var seeked_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def seeking(element: Document): Boolean
    def seeking(element: Document, options: js.Object): Boolean
    def seeking(element: Element): Boolean
    def seeking(element: Element, options: js.Object): Boolean
    def seeking(element: Node): Boolean
    def seeking(element: Node, options: js.Object): Boolean
    def seeking(element: Window): Boolean
    def seeking(element: Window, options: js.Object): Boolean
    @JSName("seeking")
    var seeking_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def select(element: Document): Boolean
    def select(element: Document, options: js.Object): Boolean
    def select(element: Element): Boolean
    def select(element: Element, options: js.Object): Boolean
    def select(element: Node): Boolean
    def select(element: Node, options: js.Object): Boolean
    def select(element: Window): Boolean
    def select(element: Window, options: js.Object): Boolean
    @JSName("select")
    var select_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def stalled(element: Document): Boolean
    def stalled(element: Document, options: js.Object): Boolean
    def stalled(element: Element): Boolean
    def stalled(element: Element, options: js.Object): Boolean
    def stalled(element: Node): Boolean
    def stalled(element: Node, options: js.Object): Boolean
    def stalled(element: Window): Boolean
    def stalled(element: Window, options: js.Object): Boolean
    @JSName("stalled")
    var stalled_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def submit(element: Document): Boolean
    def submit(element: Document, options: js.Object): Boolean
    def submit(element: Element): Boolean
    def submit(element: Element, options: js.Object): Boolean
    def submit(element: Node): Boolean
    def submit(element: Node, options: js.Object): Boolean
    def submit(element: Window): Boolean
    def submit(element: Window, options: js.Object): Boolean
    @JSName("submit")
    var submit_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def suspend(element: Document): Boolean
    def suspend(element: Document, options: js.Object): Boolean
    def suspend(element: Element): Boolean
    def suspend(element: Element, options: js.Object): Boolean
    def suspend(element: Node): Boolean
    def suspend(element: Node, options: js.Object): Boolean
    def suspend(element: Window): Boolean
    def suspend(element: Window, options: js.Object): Boolean
    @JSName("suspend")
    var suspend_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def timeUpdate(element: Document): Boolean
    def timeUpdate(element: Document, options: js.Object): Boolean
    def timeUpdate(element: Element): Boolean
    def timeUpdate(element: Element, options: js.Object): Boolean
    def timeUpdate(element: Node): Boolean
    def timeUpdate(element: Node, options: js.Object): Boolean
    def timeUpdate(element: Window): Boolean
    def timeUpdate(element: Window, options: js.Object): Boolean
    @JSName("timeUpdate")
    var timeUpdate_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def touchCancel(element: Document): Boolean
    def touchCancel(element: Document, options: js.Object): Boolean
    def touchCancel(element: Element): Boolean
    def touchCancel(element: Element, options: js.Object): Boolean
    def touchCancel(element: Node): Boolean
    def touchCancel(element: Node, options: js.Object): Boolean
    def touchCancel(element: Window): Boolean
    def touchCancel(element: Window, options: js.Object): Boolean
    @JSName("touchCancel")
    var touchCancel_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def touchEnd(element: Document): Boolean
    def touchEnd(element: Document, options: js.Object): Boolean
    def touchEnd(element: Element): Boolean
    def touchEnd(element: Element, options: js.Object): Boolean
    def touchEnd(element: Node): Boolean
    def touchEnd(element: Node, options: js.Object): Boolean
    def touchEnd(element: Window): Boolean
    def touchEnd(element: Window, options: js.Object): Boolean
    @JSName("touchEnd")
    var touchEnd_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def touchMove(element: Document): Boolean
    def touchMove(element: Document, options: js.Object): Boolean
    def touchMove(element: Element): Boolean
    def touchMove(element: Element, options: js.Object): Boolean
    def touchMove(element: Node): Boolean
    def touchMove(element: Node, options: js.Object): Boolean
    def touchMove(element: Window): Boolean
    def touchMove(element: Window, options: js.Object): Boolean
    @JSName("touchMove")
    var touchMove_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def touchStart(element: Document): Boolean
    def touchStart(element: Document, options: js.Object): Boolean
    def touchStart(element: Element): Boolean
    def touchStart(element: Element, options: js.Object): Boolean
    def touchStart(element: Node): Boolean
    def touchStart(element: Node, options: js.Object): Boolean
    def touchStart(element: Window): Boolean
    def touchStart(element: Window, options: js.Object): Boolean
    @JSName("touchStart")
    var touchStart_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def transitionCancel(element: Document): Boolean
    def transitionCancel(element: Document, options: js.Object): Boolean
    def transitionCancel(element: Element): Boolean
    def transitionCancel(element: Element, options: js.Object): Boolean
    def transitionCancel(element: Node): Boolean
    def transitionCancel(element: Node, options: js.Object): Boolean
    def transitionCancel(element: Window): Boolean
    def transitionCancel(element: Window, options: js.Object): Boolean
    @JSName("transitionCancel")
    var transitionCancel_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def transitionEnd(element: Document): Boolean
    def transitionEnd(element: Document, options: js.Object): Boolean
    def transitionEnd(element: Element): Boolean
    def transitionEnd(element: Element, options: js.Object): Boolean
    def transitionEnd(element: Node): Boolean
    def transitionEnd(element: Node, options: js.Object): Boolean
    def transitionEnd(element: Window): Boolean
    def transitionEnd(element: Window, options: js.Object): Boolean
    @JSName("transitionEnd")
    var transitionEnd_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def transitionRun(element: Document): Boolean
    def transitionRun(element: Document, options: js.Object): Boolean
    def transitionRun(element: Element): Boolean
    def transitionRun(element: Element, options: js.Object): Boolean
    def transitionRun(element: Node): Boolean
    def transitionRun(element: Node, options: js.Object): Boolean
    def transitionRun(element: Window): Boolean
    def transitionRun(element: Window, options: js.Object): Boolean
    @JSName("transitionRun")
    var transitionRun_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def transitionStart(element: Document): Boolean
    def transitionStart(element: Document, options: js.Object): Boolean
    def transitionStart(element: Element): Boolean
    def transitionStart(element: Element, options: js.Object): Boolean
    def transitionStart(element: Node): Boolean
    def transitionStart(element: Node, options: js.Object): Boolean
    def transitionStart(element: Window): Boolean
    def transitionStart(element: Window, options: js.Object): Boolean
    @JSName("transitionStart")
    var transitionStart_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def volumeChange(element: Document): Boolean
    def volumeChange(element: Document, options: js.Object): Boolean
    def volumeChange(element: Element): Boolean
    def volumeChange(element: Element, options: js.Object): Boolean
    def volumeChange(element: Node): Boolean
    def volumeChange(element: Node, options: js.Object): Boolean
    def volumeChange(element: Window): Boolean
    def volumeChange(element: Window, options: js.Object): Boolean
    @JSName("volumeChange")
    var volumeChange_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def waiting(element: Document): Boolean
    def waiting(element: Document, options: js.Object): Boolean
    def waiting(element: Element): Boolean
    def waiting(element: Element, options: js.Object): Boolean
    def waiting(element: Node): Boolean
    def waiting(element: Node, options: js.Object): Boolean
    def waiting(element: Window): Boolean
    def waiting(element: Window, options: js.Object): Boolean
    @JSName("waiting")
    var waiting_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
    
    def wheel(element: Document): Boolean
    def wheel(element: Document, options: js.Object): Boolean
    def wheel(element: Element): Boolean
    def wheel(element: Element, options: js.Object): Boolean
    def wheel(element: Node): Boolean
    def wheel(element: Node, options: js.Object): Boolean
    def wheel(element: Window): Boolean
    def wheel(element: Window, options: js.Object): Boolean
    @JSName("wheel")
    var wheel_Original: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ]
  }
  object FireObject {
    
    inline def apply(
      abort: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      animationEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      animationIteration: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      animationStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      blur: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      canPlay: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      canPlayThrough: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      change: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      click: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      compositionEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      compositionStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      compositionUpdate: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      contextMenu: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      copy: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      cut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dblClick: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      doubleClick: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      drag: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragExit: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      drop: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      durationChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      emptied: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      encrypted: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      ended: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      error: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      focus: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      focusIn: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      focusOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      gotPointerCapture: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      input: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      invalid: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      keyDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      keyPress: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      keyUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      load: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      loadStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      loadedData: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      loadedMetadata: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      lostPointerCapture: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      paste: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pause: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      play: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      playing: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerCancel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      popState: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      progress: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      rateChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      reset: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      resize: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      scroll: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      seeked: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      seeking: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      select: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      stalled: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      submit: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      suspend: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      timeUpdate: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      touchCancel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      touchEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      touchMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      touchStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      transitionCancel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      transitionEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      transitionRun: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      transitionStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      volumeChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      waiting: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      wheel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
    ): FireObject = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), animationEnd = js.Any.fromFunction2(animationEnd), animationIteration = js.Any.fromFunction2(animationIteration), animationStart = js.Any.fromFunction2(animationStart), blur = js.Any.fromFunction2(blur), canPlay = js.Any.fromFunction2(canPlay), canPlayThrough = js.Any.fromFunction2(canPlayThrough), change = js.Any.fromFunction2(change), click = js.Any.fromFunction2(click), compositionEnd = js.Any.fromFunction2(compositionEnd), compositionStart = js.Any.fromFunction2(compositionStart), compositionUpdate = js.Any.fromFunction2(compositionUpdate), contextMenu = js.Any.fromFunction2(contextMenu), copy = js.Any.fromFunction2(copy), cut = js.Any.fromFunction2(cut), dblClick = js.Any.fromFunction2(dblClick), doubleClick = js.Any.fromFunction2(doubleClick), drag = js.Any.fromFunction2(drag), dragEnd = js.Any.fromFunction2(dragEnd), dragEnter = js.Any.fromFunction2(dragEnter), dragExit = js.Any.fromFunction2(dragExit), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), dragStart = js.Any.fromFunction2(dragStart), drop = js.Any.fromFunction2(drop), durationChange = js.Any.fromFunction2(durationChange), emptied = js.Any.fromFunction2(emptied), encrypted = js.Any.fromFunction2(encrypted), ended = js.Any.fromFunction2(ended), error = js.Any.fromFunction2(error), focus = js.Any.fromFunction2(focus), focusIn = js.Any.fromFunction2(focusIn), focusOut = js.Any.fromFunction2(focusOut), gotPointerCapture = js.Any.fromFunction2(gotPointerCapture), input = js.Any.fromFunction2(input), invalid = js.Any.fromFunction2(invalid), keyDown = js.Any.fromFunction2(keyDown), keyPress = js.Any.fromFunction2(keyPress), keyUp = js.Any.fromFunction2(keyUp), load = js.Any.fromFunction2(load), loadStart = js.Any.fromFunction2(loadStart), loadedData = js.Any.fromFunction2(loadedData), loadedMetadata = js.Any.fromFunction2(loadedMetadata), lostPointerCapture = js.Any.fromFunction2(lostPointerCapture), mouseDown = js.Any.fromFunction2(mouseDown), mouseEnter = js.Any.fromFunction2(mouseEnter), mouseLeave = js.Any.fromFunction2(mouseLeave), mouseMove = js.Any.fromFunction2(mouseMove), mouseOut = js.Any.fromFunction2(mouseOut), mouseOver = js.Any.fromFunction2(mouseOver), mouseUp = js.Any.fromFunction2(mouseUp), paste = js.Any.fromFunction2(paste), pause = js.Any.fromFunction2(pause), play = js.Any.fromFunction2(play), playing = js.Any.fromFunction2(playing), pointerCancel = js.Any.fromFunction2(pointerCancel), pointerDown = js.Any.fromFunction2(pointerDown), pointerEnter = js.Any.fromFunction2(pointerEnter), pointerLeave = js.Any.fromFunction2(pointerLeave), pointerMove = js.Any.fromFunction2(pointerMove), pointerOut = js.Any.fromFunction2(pointerOut), pointerOver = js.Any.fromFunction2(pointerOver), pointerUp = js.Any.fromFunction2(pointerUp), popState = js.Any.fromFunction2(popState), progress = js.Any.fromFunction2(progress), rateChange = js.Any.fromFunction2(rateChange), reset = js.Any.fromFunction2(reset), resize = js.Any.fromFunction2(resize), scroll = js.Any.fromFunction2(scroll), seeked = js.Any.fromFunction2(seeked), seeking = js.Any.fromFunction2(seeking), select = js.Any.fromFunction2(select), stalled = js.Any.fromFunction2(stalled), submit = js.Any.fromFunction2(submit), suspend = js.Any.fromFunction2(suspend), timeUpdate = js.Any.fromFunction2(timeUpdate), touchCancel = js.Any.fromFunction2(touchCancel), touchEnd = js.Any.fromFunction2(touchEnd), touchMove = js.Any.fromFunction2(touchMove), touchStart = js.Any.fromFunction2(touchStart), transitionCancel = js.Any.fromFunction2(transitionCancel), transitionEnd = js.Any.fromFunction2(transitionEnd), transitionRun = js.Any.fromFunction2(transitionRun), transitionStart = js.Any.fromFunction2(transitionStart), volumeChange = js.Any.fromFunction2(volumeChange), waiting = js.Any.fromFunction2(waiting), wheel = js.Any.fromFunction2(wheel))
      __obj.asInstanceOf[FireObject]
    }
    
    extension [Self <: FireObject](x: Self) {
      
      inline def setAbort(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "abort", js.Any.fromFunction2(value))
      
      inline def setAnimationEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "animationEnd", js.Any.fromFunction2(value))
      
      inline def setAnimationIteration(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "animationIteration", js.Any.fromFunction2(value))
      
      inline def setAnimationStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "animationStart", js.Any.fromFunction2(value))
      
      inline def setBlur(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      inline def setCanPlay(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "canPlay", js.Any.fromFunction2(value))
      
      inline def setCanPlayThrough(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "canPlayThrough", js.Any.fromFunction2(value))
      
      inline def setChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      inline def setClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
      
      inline def setCompositionEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "compositionEnd", js.Any.fromFunction2(value))
      
      inline def setCompositionStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "compositionStart", js.Any.fromFunction2(value))
      
      inline def setCompositionUpdate(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "compositionUpdate", js.Any.fromFunction2(value))
      
      inline def setContextMenu(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "contextMenu", js.Any.fromFunction2(value))
      
      inline def setCopy(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
      
      inline def setCut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "cut", js.Any.fromFunction2(value))
      
      inline def setDblClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dblClick", js.Any.fromFunction2(value))
      
      inline def setDoubleClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "doubleClick", js.Any.fromFunction2(value))
      
      inline def setDrag(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
      
      inline def setDragEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2(value))
      
      inline def setDragEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
      
      inline def setDragExit(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragExit", js.Any.fromFunction2(value))
      
      inline def setDragLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
      
      inline def setDragOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
      
      inline def setDragStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
      
      inline def setDrop(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
      
      inline def setDurationChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "durationChange", js.Any.fromFunction2(value))
      
      inline def setEmptied(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "emptied", js.Any.fromFunction2(value))
      
      inline def setEncrypted(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "encrypted", js.Any.fromFunction2(value))
      
      inline def setEnded(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "ended", js.Any.fromFunction2(value))
      
      inline def setError(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setFocus(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
      
      inline def setFocusIn(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "focusIn", js.Any.fromFunction2(value))
      
      inline def setFocusOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "focusOut", js.Any.fromFunction2(value))
      
      inline def setGotPointerCapture(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "gotPointerCapture", js.Any.fromFunction2(value))
      
      inline def setInput(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
      
      inline def setInvalid(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "invalid", js.Any.fromFunction2(value))
      
      inline def setKeyDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "keyDown", js.Any.fromFunction2(value))
      
      inline def setKeyPress(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "keyPress", js.Any.fromFunction2(value))
      
      inline def setKeyUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "keyUp", js.Any.fromFunction2(value))
      
      inline def setLoad(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      inline def setLoadStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "loadStart", js.Any.fromFunction2(value))
      
      inline def setLoadedData(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "loadedData", js.Any.fromFunction2(value))
      
      inline def setLoadedMetadata(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "loadedMetadata", js.Any.fromFunction2(value))
      
      inline def setLostPointerCapture(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "lostPointerCapture", js.Any.fromFunction2(value))
      
      inline def setMouseDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseDown", js.Any.fromFunction2(value))
      
      inline def setMouseEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction2(value))
      
      inline def setMouseLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction2(value))
      
      inline def setMouseMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseMove", js.Any.fromFunction2(value))
      
      inline def setMouseOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseOut", js.Any.fromFunction2(value))
      
      inline def setMouseOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseOver", js.Any.fromFunction2(value))
      
      inline def setMouseUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseUp", js.Any.fromFunction2(value))
      
      inline def setPaste(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "paste", js.Any.fromFunction2(value))
      
      inline def setPause(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pause", js.Any.fromFunction2(value))
      
      inline def setPlay(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "play", js.Any.fromFunction2(value))
      
      inline def setPlaying(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "playing", js.Any.fromFunction2(value))
      
      inline def setPointerCancel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerCancel", js.Any.fromFunction2(value))
      
      inline def setPointerDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerDown", js.Any.fromFunction2(value))
      
      inline def setPointerEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerEnter", js.Any.fromFunction2(value))
      
      inline def setPointerLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerLeave", js.Any.fromFunction2(value))
      
      inline def setPointerMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerMove", js.Any.fromFunction2(value))
      
      inline def setPointerOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerOut", js.Any.fromFunction2(value))
      
      inline def setPointerOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerOver", js.Any.fromFunction2(value))
      
      inline def setPointerUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerUp", js.Any.fromFunction2(value))
      
      inline def setPopState(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "popState", js.Any.fromFunction2(value))
      
      inline def setProgress(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      inline def setRateChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "rateChange", js.Any.fromFunction2(value))
      
      inline def setReset(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "reset", js.Any.fromFunction2(value))
      
      inline def setResize(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
      
      inline def setScroll(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction2(value))
      
      inline def setSeeked(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "seeked", js.Any.fromFunction2(value))
      
      inline def setSeeking(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "seeking", js.Any.fromFunction2(value))
      
      inline def setSelect(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      inline def setStalled(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "stalled", js.Any.fromFunction2(value))
      
      inline def setSubmit(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "submit", js.Any.fromFunction2(value))
      
      inline def setSuspend(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "suspend", js.Any.fromFunction2(value))
      
      inline def setTimeUpdate(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "timeUpdate", js.Any.fromFunction2(value))
      
      inline def setTouchCancel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "touchCancel", js.Any.fromFunction2(value))
      
      inline def setTouchEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "touchEnd", js.Any.fromFunction2(value))
      
      inline def setTouchMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "touchMove", js.Any.fromFunction2(value))
      
      inline def setTouchStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "touchStart", js.Any.fromFunction2(value))
      
      inline def setTransitionCancel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "transitionCancel", js.Any.fromFunction2(value))
      
      inline def setTransitionEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction2(value))
      
      inline def setTransitionRun(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "transitionRun", js.Any.fromFunction2(value))
      
      inline def setTransitionStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "transitionStart", js.Any.fromFunction2(value))
      
      inline def setVolumeChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "volumeChange", js.Any.fromFunction2(value))
      
      inline def setWaiting(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "waiting", js.Any.fromFunction2(value))
      
      inline def setWheel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "wheel", js.Any.fromFunction2(value))
    }
  }
}
