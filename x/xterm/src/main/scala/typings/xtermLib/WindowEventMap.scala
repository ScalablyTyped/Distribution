package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEventMap
  extends GlobalEventHandlersEventMap
     with WindowEventHandlersEventMap {
  var MSGestureChange: Event
  var MSGestureDoubleTap: Event
  var MSGestureEnd: Event
  var MSGestureHold: Event
  var MSGestureStart: Event
  var MSGestureTap: Event
  var MSInertiaStart: Event
  var MSPointerCancel: Event
  var MSPointerDown: Event
  var MSPointerEnter: Event
  var MSPointerLeave: Event
  var MSPointerMove: Event
  var MSPointerOut: Event
  var MSPointerOver: Event
  var MSPointerUp: Event
  var compassneedscalibration: Event
  var devicelight: DeviceLightEvent
  var devicemotion: DeviceMotionEvent
  var deviceorientation: DeviceOrientationEvent
  var mousewheel: Event
  var orientationchange: Event
  var readystatechange: ProgressEvent
  var vrdisplayactivate: Event
  var vrdisplayblur: Event
  var vrdisplayconnect: Event
  var vrdisplaydeactivate: Event
  var vrdisplaydisconnect: Event
  var vrdisplayfocus: Event
  var vrdisplaypointerrestricted: Event
  var vrdisplaypointerunrestricted: Event
  var vrdisplaypresentchange: Event
}

object WindowEventMap {
  @scala.inline
  def apply(
    GlobalEventHandlersEventMap: GlobalEventHandlersEventMap = null,
    MSGestureChange: Event,
    MSGestureDoubleTap: Event,
    MSGestureEnd: Event,
    MSGestureHold: Event,
    MSGestureStart: Event,
    MSGestureTap: Event,
    MSInertiaStart: Event,
    MSPointerCancel: Event,
    MSPointerDown: Event,
    MSPointerEnter: Event,
    MSPointerLeave: Event,
    MSPointerMove: Event,
    MSPointerOut: Event,
    MSPointerOver: Event,
    MSPointerUp: Event,
    WindowEventHandlersEventMap: WindowEventHandlersEventMap = null,
    abort: UIEvent,
    afterprint: Event,
    beforeprint: Event,
    beforeunload: BeforeUnloadEvent,
    blur: FocusEvent,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    compassneedscalibration: Event,
    contextmenu: MouseEvent,
    dblclick: MouseEvent,
    devicelight: DeviceLightEvent,
    devicemotion: DeviceMotionEvent,
    deviceorientation: DeviceOrientationEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    hashchange: HashChangeEvent,
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    message: MessageEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    mousewheel: Event,
    offline: Event,
    online: Event,
    orientationchange: Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    pause: Event,
    play: Event,
    playing: Event,
    popstate: PopStateEvent,
    progress: ProgressEvent,
    ratechange: Event,
    readystatechange: ProgressEvent,
    reset: Event,
    resize: UIEvent,
    scroll: UIEvent,
    seeked: Event,
    seeking: Event,
    select: UIEvent,
    stalled: Event,
    storage: StorageEvent,
    submit: Event,
    suspend: Event,
    timeupdate: Event,
    unload: Event,
    volumechange: Event,
    vrdisplayactivate: Event,
    vrdisplayblur: Event,
    vrdisplayconnect: Event,
    vrdisplaydeactivate: Event,
    vrdisplaydisconnect: Event,
    vrdisplayfocus: Event,
    vrdisplaypointerrestricted: Event,
    vrdisplaypointerunrestricted: Event,
    vrdisplaypresentchange: Event,
    waiting: Event
  ): WindowEventMap = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, GlobalEventHandlersEventMap)
    __obj.updateDynamic("MSGestureChange")(MSGestureChange)
    __obj.updateDynamic("MSGestureDoubleTap")(MSGestureDoubleTap)
    __obj.updateDynamic("MSGestureEnd")(MSGestureEnd)
    __obj.updateDynamic("MSGestureHold")(MSGestureHold)
    __obj.updateDynamic("MSGestureStart")(MSGestureStart)
    __obj.updateDynamic("MSGestureTap")(MSGestureTap)
    __obj.updateDynamic("MSInertiaStart")(MSInertiaStart)
    __obj.updateDynamic("MSPointerCancel")(MSPointerCancel)
    __obj.updateDynamic("MSPointerDown")(MSPointerDown)
    __obj.updateDynamic("MSPointerEnter")(MSPointerEnter)
    __obj.updateDynamic("MSPointerLeave")(MSPointerLeave)
    __obj.updateDynamic("MSPointerMove")(MSPointerMove)
    __obj.updateDynamic("MSPointerOut")(MSPointerOut)
    __obj.updateDynamic("MSPointerOver")(MSPointerOver)
    __obj.updateDynamic("MSPointerUp")(MSPointerUp)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, WindowEventHandlersEventMap)
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("afterprint")(afterprint)
    __obj.updateDynamic("beforeprint")(beforeprint)
    __obj.updateDynamic("beforeunload")(beforeunload)
    __obj.updateDynamic("blur")(blur)
    __obj.updateDynamic("canplay")(canplay)
    __obj.updateDynamic("canplaythrough")(canplaythrough)
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("click")(click)
    __obj.updateDynamic("compassneedscalibration")(compassneedscalibration)
    __obj.updateDynamic("contextmenu")(contextmenu)
    __obj.updateDynamic("dblclick")(dblclick)
    __obj.updateDynamic("devicelight")(devicelight)
    __obj.updateDynamic("devicemotion")(devicemotion)
    __obj.updateDynamic("deviceorientation")(deviceorientation)
    __obj.updateDynamic("drag")(drag)
    __obj.updateDynamic("dragend")(dragend)
    __obj.updateDynamic("dragenter")(dragenter)
    __obj.updateDynamic("dragleave")(dragleave)
    __obj.updateDynamic("dragover")(dragover)
    __obj.updateDynamic("dragstart")(dragstart)
    __obj.updateDynamic("drop")(drop)
    __obj.updateDynamic("durationchange")(durationchange)
    __obj.updateDynamic("emptied")(emptied)
    __obj.updateDynamic("ended")(ended)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("focus")(focus)
    __obj.updateDynamic("hashchange")(hashchange)
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("invalid")(invalid)
    __obj.updateDynamic("keydown")(keydown)
    __obj.updateDynamic("keypress")(keypress)
    __obj.updateDynamic("keyup")(keyup)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("loadeddata")(loadeddata)
    __obj.updateDynamic("loadedmetadata")(loadedmetadata)
    __obj.updateDynamic("loadstart")(loadstart)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("mousedown")(mousedown)
    __obj.updateDynamic("mouseenter")(mouseenter)
    __obj.updateDynamic("mouseleave")(mouseleave)
    __obj.updateDynamic("mousemove")(mousemove)
    __obj.updateDynamic("mouseout")(mouseout)
    __obj.updateDynamic("mouseover")(mouseover)
    __obj.updateDynamic("mouseup")(mouseup)
    __obj.updateDynamic("mousewheel")(mousewheel)
    __obj.updateDynamic("offline")(offline)
    __obj.updateDynamic("online")(online)
    __obj.updateDynamic("orientationchange")(orientationchange)
    __obj.updateDynamic("pagehide")(pagehide)
    __obj.updateDynamic("pageshow")(pageshow)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("playing")(playing)
    __obj.updateDynamic("popstate")(popstate)
    __obj.updateDynamic("progress")(progress)
    __obj.updateDynamic("ratechange")(ratechange)
    __obj.updateDynamic("readystatechange")(readystatechange)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("resize")(resize)
    __obj.updateDynamic("scroll")(scroll)
    __obj.updateDynamic("seeked")(seeked)
    __obj.updateDynamic("seeking")(seeking)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("stalled")(stalled)
    __obj.updateDynamic("storage")(storage)
    __obj.updateDynamic("submit")(submit)
    __obj.updateDynamic("suspend")(suspend)
    __obj.updateDynamic("timeupdate")(timeupdate)
    __obj.updateDynamic("unload")(unload)
    __obj.updateDynamic("volumechange")(volumechange)
    __obj.updateDynamic("vrdisplayactivate")(vrdisplayactivate)
    __obj.updateDynamic("vrdisplayblur")(vrdisplayblur)
    __obj.updateDynamic("vrdisplayconnect")(vrdisplayconnect)
    __obj.updateDynamic("vrdisplaydeactivate")(vrdisplaydeactivate)
    __obj.updateDynamic("vrdisplaydisconnect")(vrdisplaydisconnect)
    __obj.updateDynamic("vrdisplayfocus")(vrdisplayfocus)
    __obj.updateDynamic("vrdisplaypointerrestricted")(vrdisplaypointerrestricted)
    __obj.updateDynamic("vrdisplaypointerunrestricted")(vrdisplaypointerunrestricted)
    __obj.updateDynamic("vrdisplaypresentchange")(vrdisplaypresentchange)
    __obj.updateDynamic("waiting")(waiting)
    __obj.asInstanceOf[WindowEventMap]
  }
}

