package typings.atTestingDashLibraryDom

import typings.atTestingDashLibraryDom.eventsMod.CreateObject
import typings.atTestingDashLibraryDom.eventsMod.FireFunction
import typings.atTestingDashLibraryDom.eventsMod.FireObject
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.copy
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.cut
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.paste
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.compositionEnd
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.compositionStart
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.compositionUpdate
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.keyDown
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.keyPress
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.keyUp
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.focus
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.blur
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.focusIn
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.focusOut
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.change
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.input
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.invalid
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.submit
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.reset
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.click
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.contextMenu
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.dblClick
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.drag
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.dragEnd
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.dragEnter
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.dragExit
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.dragLeave
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.dragOver
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.dragStart
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.drop
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.mouseDown
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.mouseEnter
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.mouseLeave
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.mouseMove
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.mouseOut
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.mouseOver
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.mouseUp
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.select
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.touchCancel
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.touchEnd
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.touchMove
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.touchStart
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.scroll
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.wheel
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.abort
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.canPlay
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.canPlayThrough
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.durationChange
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.emptied
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.encrypted
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.ended
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.loadedData
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.loadedMetadata
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.loadStart
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.pause
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.play
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.playing
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.progress
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.rateChange
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.seeked
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.seeking
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.stalled
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.suspend
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.timeUpdate
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.volumeChange
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.waiting
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.load
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.error
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.animationStart
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.animationEnd
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.animationIteration
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.transitionEnd
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.doubleClick
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.pointerOver
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.pointerEnter
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.pointerDown
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.pointerMove
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.pointerUp
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.pointerCancel
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.pointerOut
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.pointerLeave
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.gotPointerCapture
    - typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.lostPointerCapture
  */
  trait EventType extends js.Object
  
  val createEvent: CreateObject = js.native
  val fireEvent: FireFunction with FireObject = js.native
  type CreateObject = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in @testing-library/dom.@testing-library/dom/events.EventType ]: (element : std.Document | std.Element | std.Window, options? : {}): std.Event}
    */ typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.CreateObject with js.Any
  type FireFunction = js.Function2[/* element */ Document | Element | Window, /* event */ Event, Boolean]
  type FireObject = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in @testing-library/dom.@testing-library/dom/events.EventType ]: (element : std.Document | std.Element | std.Window, options? : {}): boolean}
    */ typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.FireObject with js.Any
}

