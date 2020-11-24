package typings.webxr.mod

import typings.std.AddEventListenerOptions
import typings.std.DOMHighResTimeStamp
import typings.std.Event
import typings.std.EventListenerOptions
import typings.webxr.anon.PlaneDetectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRSession extends js.Object {
  
  def addEventListener(`type`: XREventType, listener: XREventHandler): Unit = js.native
  def addEventListener(`type`: XREventType, listener: XREventHandler, options: Boolean): Unit = js.native
  def addEventListener(`type`: XREventType, listener: XREventHandler, options: AddEventListenerOptions): Unit = js.native
  
  /**
    * Removes a callback from the animation frame painting callback from
    * XRSession's set of animation frame rendering callbacks, given the
    * identifying handle returned by a previous call to requestAnimationFrame().
    */
  def cancelAnimationFrame(handle: Double): Unit = js.native
  
  /**
    * Ends the WebXR session. Returns a promise which resolves when the
    * session has been shut down.
    */
  def end(): js.Promise[Unit] = js.native
  
  /**
    * Returns a list of this session's XRInputSources, each representing an input device
    * used to control the camera and/or scene.
    */
  val inputSources: js.Array[XRInputSource] = js.native
  
  def onend(event: Event): js.Any = js.native
  @JSName("onend")
  var onend_Original: XREventHandler = js.native
  
  def oninputsourceschange(event: Event): js.Any = js.native
  @JSName("oninputsourceschange")
  var oninputsourceschange_Original: XREventHandler = js.native
  
  def onselect(event: Event): js.Any = js.native
  @JSName("onselect")
  var onselect_Original: XREventHandler = js.native
  
  def onselectend(event: Event): js.Any = js.native
  @JSName("onselectend")
  var onselectend_Original: XREventHandler = js.native
  
  def onselectstart(event: Event): js.Any = js.native
  @JSName("onselectstart")
  var onselectstart_Original: XREventHandler = js.native
  
  def onsqueeze(event: Event): js.Any = js.native
  @JSName("onsqueeze")
  var onsqueeze_Original: XREventHandler = js.native
  
  def onsqueezeend(event: Event): js.Any = js.native
  @JSName("onsqueezeend")
  var onsqueezeend_Original: XREventHandler = js.native
  
  def onsqueezestart(event: Event): js.Any = js.native
  @JSName("onsqueezestart")
  var onsqueezestart_Original: XREventHandler = js.native
  
  def onvisibilitychange(event: Event): js.Any = js.native
  @JSName("onvisibilitychange")
  var onvisibilitychange_Original: XREventHandler = js.native
  
  def removeEventListener(`type`: XREventType, listener: XREventHandler): Unit = js.native
  def removeEventListener(`type`: XREventType, listener: XREventHandler, options: Boolean): Unit = js.native
  def removeEventListener(`type`: XREventType, listener: XREventHandler, options: EventListenerOptions): Unit = js.native
  
  /**
    * object which contains options affecting how the imagery is rendered.
    * This includes things such as the near and far clipping planes
    */
  val renderState: XRRenderState = js.native
  
  /**
    * Schedules the specified method to be called the next time the user agent
    * is working on rendering an animation frame for the WebXR device. Returns an
    * integer value which can be used to identify the request for the purposes of
    * canceling the callback using cancelAnimationFrame(). This method is comparable
    * to the Window.requestAnimationFrame() method.
    */
  def requestAnimationFrame(time: DOMHighResTimeStamp, frame: XRFrame): Unit = js.native
  /**
    * Schedules the specified method to be called the next time the user agent
    * is working on rendering an animation frame for the WebXR device. Returns an
    * integer value which can be used to identify the request for the purposes of
    * canceling the callback using cancelAnimationFrame(). This method is comparable
    * to the Window.requestAnimationFrame() method.
    */
  @JSName("requestAnimationFrame")
  var requestAnimationFrame_Original: XRFrameRequestCallback = js.native
  
  // legacy AR hit test
  var requestHitTest: js.UndefOr[
    js.Function2[
      /* ray */ XRRay, 
      /* referenceSpace */ XRReferenceSpace, 
      js.Promise[js.Array[XRHitResult]]
    ]
  ] = js.native
  
  // hit test
  var requestHitTestSource: js.UndefOr[js.Function1[/* options */ XRHitTestOptionsInit, js.Promise[XRHitTestSource]]] = js.native
  
  var requestHitTestSourceForTransientInput: js.UndefOr[
    js.Function1[
      /* options */ XRTransientInputHitTestOptionsInit, 
      js.Promise[XRTransientInputHitTestSource]
    ]
  ] = js.native
  
  /**
    * Requests that a new XRReferenceSpace of the specified export type be created.
    * Returns a promise which resolves with the XRReferenceSpace or
    * XRBoundedReferenceSpace which was requested, or throws a NotSupportedError if
    * the requested space export type isn't supported by the device.
    */
  def requestReferenceSpace(`type`: XRReferenceSpaceType): js.Promise[XRReferenceSpace | XRBoundedReferenceSpace] = js.native
  
  def updateRenderState(XRRenderStateInit: XRRenderState): js.Promise[Unit] = js.native
  
  // legacy plane detection
  var updateWorldTrackingState: js.UndefOr[js.Function1[/* options */ PlaneDetectionState, Unit]] = js.native
  
  val visibilityState: XRVisibilityState = js.native
}
