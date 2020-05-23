package typings.testingLibraryDom.eventsMod

import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.Node
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in @testing-library/dom.@testing-library/dom/events.EventType ]: (element : std.Document | std.Element | std.Window | std.Node, options? : {}): std.Event} */
trait CreateObject extends js.Object {
  var abort: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var animationEnd: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var animationIteration: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var animationStart: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var blur: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var canPlay: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var canPlayThrough: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var change: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var click: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var compositionEnd: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var compositionStart: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var compositionUpdate: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var contextMenu: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var copy: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var cut: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var dblClick: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var doubleClick: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var drag: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var dragEnd: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var dragEnter: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var dragExit: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var dragLeave: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var dragOver: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var dragStart: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var drop: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var durationChange: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var emptied: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var encrypted: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var ended: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var error: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var focus: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var focusIn: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var focusOut: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var gotPointerCapture: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var input: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var invalid: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var keyDown: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var keyPress: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var keyUp: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var load: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var loadStart: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var loadedData: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var loadedMetadata: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var lostPointerCapture: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var mouseDown: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var mouseEnter: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var mouseLeave: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var mouseMove: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var mouseOut: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var mouseOver: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var mouseUp: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var paste: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var pause: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var play: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var playing: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var pointerCancel: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var pointerDown: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var pointerEnter: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var pointerLeave: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var pointerMove: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var pointerOut: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var pointerOver: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var pointerUp: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var popState: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var progress: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var rateChange: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var reset: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var scroll: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var seeked: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var seeking: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var select: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var stalled: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var submit: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var suspend: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var timeUpdate: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var touchCancel: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var touchEnd: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var touchMove: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var touchStart: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var transitionEnd: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var volumeChange: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var waiting: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
  var wheel: js.Function2[
    /* element */ Document | Element | Window | Node, 
    /* options */ js.UndefOr[js.Object], 
    Event
  ]
}

object CreateObject {
  @scala.inline
  def apply(
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
    transitionEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
    volumeChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
    waiting: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
    wheel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
  ): CreateObject = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), animationEnd = js.Any.fromFunction2(animationEnd), animationIteration = js.Any.fromFunction2(animationIteration), animationStart = js.Any.fromFunction2(animationStart), blur = js.Any.fromFunction2(blur), canPlay = js.Any.fromFunction2(canPlay), canPlayThrough = js.Any.fromFunction2(canPlayThrough), change = js.Any.fromFunction2(change), click = js.Any.fromFunction2(click), compositionEnd = js.Any.fromFunction2(compositionEnd), compositionStart = js.Any.fromFunction2(compositionStart), compositionUpdate = js.Any.fromFunction2(compositionUpdate), contextMenu = js.Any.fromFunction2(contextMenu), copy = js.Any.fromFunction2(copy), cut = js.Any.fromFunction2(cut), dblClick = js.Any.fromFunction2(dblClick), doubleClick = js.Any.fromFunction2(doubleClick), drag = js.Any.fromFunction2(drag), dragEnd = js.Any.fromFunction2(dragEnd), dragEnter = js.Any.fromFunction2(dragEnter), dragExit = js.Any.fromFunction2(dragExit), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), dragStart = js.Any.fromFunction2(dragStart), drop = js.Any.fromFunction2(drop), durationChange = js.Any.fromFunction2(durationChange), emptied = js.Any.fromFunction2(emptied), encrypted = js.Any.fromFunction2(encrypted), ended = js.Any.fromFunction2(ended), error = js.Any.fromFunction2(error), focus = js.Any.fromFunction2(focus), focusIn = js.Any.fromFunction2(focusIn), focusOut = js.Any.fromFunction2(focusOut), gotPointerCapture = js.Any.fromFunction2(gotPointerCapture), input = js.Any.fromFunction2(input), invalid = js.Any.fromFunction2(invalid), keyDown = js.Any.fromFunction2(keyDown), keyPress = js.Any.fromFunction2(keyPress), keyUp = js.Any.fromFunction2(keyUp), load = js.Any.fromFunction2(load), loadStart = js.Any.fromFunction2(loadStart), loadedData = js.Any.fromFunction2(loadedData), loadedMetadata = js.Any.fromFunction2(loadedMetadata), lostPointerCapture = js.Any.fromFunction2(lostPointerCapture), mouseDown = js.Any.fromFunction2(mouseDown), mouseEnter = js.Any.fromFunction2(mouseEnter), mouseLeave = js.Any.fromFunction2(mouseLeave), mouseMove = js.Any.fromFunction2(mouseMove), mouseOut = js.Any.fromFunction2(mouseOut), mouseOver = js.Any.fromFunction2(mouseOver), mouseUp = js.Any.fromFunction2(mouseUp), paste = js.Any.fromFunction2(paste), pause = js.Any.fromFunction2(pause), play = js.Any.fromFunction2(play), playing = js.Any.fromFunction2(playing), pointerCancel = js.Any.fromFunction2(pointerCancel), pointerDown = js.Any.fromFunction2(pointerDown), pointerEnter = js.Any.fromFunction2(pointerEnter), pointerLeave = js.Any.fromFunction2(pointerLeave), pointerMove = js.Any.fromFunction2(pointerMove), pointerOut = js.Any.fromFunction2(pointerOut), pointerOver = js.Any.fromFunction2(pointerOver), pointerUp = js.Any.fromFunction2(pointerUp), popState = js.Any.fromFunction2(popState), progress = js.Any.fromFunction2(progress), rateChange = js.Any.fromFunction2(rateChange), reset = js.Any.fromFunction2(reset), scroll = js.Any.fromFunction2(scroll), seeked = js.Any.fromFunction2(seeked), seeking = js.Any.fromFunction2(seeking), select = js.Any.fromFunction2(select), stalled = js.Any.fromFunction2(stalled), submit = js.Any.fromFunction2(submit), suspend = js.Any.fromFunction2(suspend), timeUpdate = js.Any.fromFunction2(timeUpdate), touchCancel = js.Any.fromFunction2(touchCancel), touchEnd = js.Any.fromFunction2(touchEnd), touchMove = js.Any.fromFunction2(touchMove), touchStart = js.Any.fromFunction2(touchStart), transitionEnd = js.Any.fromFunction2(transitionEnd), volumeChange = js.Any.fromFunction2(volumeChange), waiting = js.Any.fromFunction2(waiting), wheel = js.Any.fromFunction2(wheel))
    __obj.asInstanceOf[CreateObject]
  }
}

