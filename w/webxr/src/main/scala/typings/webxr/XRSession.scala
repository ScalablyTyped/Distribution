package typings.webxr

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventTarget
import typings.webxr.anon.PlaneDetectionState
import typings.webxr.webxrStrings.end
import typings.webxr.webxrStrings.frameratechange
import typings.webxr.webxrStrings.inputsourceschange
import typings.webxr.webxrStrings.select
import typings.webxr.webxrStrings.selectend
import typings.webxr.webxrStrings.selectstart
import typings.webxr.webxrStrings.squeeze
import typings.webxr.webxrStrings.squeezeend
import typings.webxr.webxrStrings.squeezestart
import typings.webxr.webxrStrings.visibilitychange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Any interaction with XR hardware is done via an XRSession object, which can only be
  * retrieved by calling requestSession() on the XRSystem object. Once a session has been
  * successfully acquired, it can be used to poll the viewer pose, query information about
  * the user's environment, and present imagery to the user.
  *
  * ref: https://immersive-web.github.io/webxr/#xrsession-interface
  */
@js.native
trait XRSession
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_end(`type`: end, listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_frameratechange(
    `type`: frameratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_frameratechange(
    `type`: frameratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_frameratechange(
    `type`: frameratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_inputsourceschange(
    `type`: inputsourceschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_inputsourceschange(
    `type`: inputsourceschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceChangeEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_inputsourceschange(
    `type`: inputsourceschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectend(
    `type`: selectend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectend(
    `type`: selectend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectend(
    `type`: selectend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_squeeze(
    `type`: squeeze,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_squeeze(
    `type`: squeeze,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_squeeze(
    `type`: squeeze,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_squeezeend(
    `type`: squeezeend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_squeezeend(
    `type`: squeezeend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_squeezeend(
    `type`: squeezeend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_squeezestart(
    `type`: squeezestart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_squeezestart(
    `type`: squeezestart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_squeezestart(
    `type`: squeezestart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Removes a callback from the animation frame painting callback from
    * XRSession's set of animation frame rendering callbacks, given the
    * identifying handle returned by a previous call to requestAnimationFrame().
    */
  def cancelAnimationFrame(id: Double): Unit = js.native
  
  val domOverlayState: js.UndefOr[XRDOMOverlayState] = js.native
  
  /**
    * Ends the WebXR session. Returns a promise which resolves when the
    * session has been shut down.
    */
  def end(): js.Promise[Unit] = js.native
  
  val environmentBlendMode: XREnvironmentBlendMode = js.native
  
  val frameRate: js.UndefOr[Double] = js.native
  
  /**
    * Returns a list of this session's XRInputSources, each representing an input device
    * used to control the camera and/or scene.
    */
  val inputSources: XRInputSourceArray = js.native
  
  def onend(evt: XRSessionEvent): Any = js.native
  @JSName("onend")
  var onend_Original: XRSessionEventHandler = js.native
  
  def onframeratechange(evt: XRSessionEvent): Any = js.native
  @JSName("onframeratechange")
  var onframeratechange_Original: XRSessionEventHandler = js.native
  
  def oninputsourceschange(evt: XRInputSourceChangeEvent): Any = js.native
  @JSName("oninputsourceschange")
  var oninputsourceschange_Original: XRInputSourceChangeEventHandler = js.native
  
  def onselect(evt: XRInputSourceEvent): Any = js.native
  @JSName("onselect")
  var onselect_Original: XRInputSourceEventHandler = js.native
  
  def onselectend(evt: XRInputSourceEvent): Any = js.native
  @JSName("onselectend")
  var onselectend_Original: XRInputSourceEventHandler = js.native
  
  def onselectstart(evt: XRInputSourceEvent): Any = js.native
  @JSName("onselectstart")
  var onselectstart_Original: XRInputSourceEventHandler = js.native
  
  def onsqueeze(evt: XRInputSourceEvent): Any = js.native
  @JSName("onsqueeze")
  var onsqueeze_Original: XRInputSourceEventHandler = js.native
  
  def onsqueezeend(evt: XRInputSourceEvent): Any = js.native
  @JSName("onsqueezeend")
  var onsqueezeend_Original: XRInputSourceEventHandler = js.native
  
  def onsqueezestart(evt: XRInputSourceEvent): Any = js.native
  @JSName("onsqueezestart")
  var onsqueezestart_Original: XRInputSourceEventHandler = js.native
  
  def onvisibilitychange(evt: XRSessionEvent): Any = js.native
  @JSName("onvisibilitychange")
  var onvisibilitychange_Original: XRSessionEventHandler = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_end(`type`: end, listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_frameratechange(
    `type`: frameratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_frameratechange(
    `type`: frameratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_frameratechange(
    `type`: frameratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_inputsourceschange(
    `type`: inputsourceschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_inputsourceschange(
    `type`: inputsourceschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceChangeEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_inputsourceschange(
    `type`: inputsourceschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceChangeEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectend(
    `type`: selectend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectend(
    `type`: selectend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectend(
    `type`: selectend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_squeeze(
    `type`: squeeze,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_squeeze(
    `type`: squeeze,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_squeeze(
    `type`: squeeze,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_squeezeend(
    `type`: squeezeend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_squeezeend(
    `type`: squeezeend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_squeezeend(
    `type`: squeezeend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_squeezestart(
    `type`: squeezestart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_squeezestart(
    `type`: squeezestart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_squeezestart(
    `type`: squeezestart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
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
  def requestAnimationFrame(callback: XRFrameRequestCallback): Double = js.native
  
  // Legacy
  var requestHitTest: js.UndefOr[
    js.Function2[
      /* ray */ XRRay, 
      /* referenceSpace */ XRReferenceSpace, 
      js.UndefOr[js.Promise[js.Array[XRHitResult]]]
    ]
  ] = js.native
  
  var requestHitTestSource: js.UndefOr[
    js.Function1[/* options */ XRHitTestOptionsInit, js.UndefOr[js.Promise[XRHitTestSource]]]
  ] = js.native
  
  var requestHitTestSourceForTransientInput: js.UndefOr[
    js.Function1[
      /* options */ XRTransientInputHitTestOptionsInit, 
      js.UndefOr[js.Promise[XRTransientInputHitTestSource]]
    ]
  ] = js.native
  
  /**
    * Requests that a new XRReferenceSpace of the specified type be created.
    * Returns a promise which resolves with the XRReferenceSpace or
    * XRBoundedReferenceSpace which was requested, or throws a NotSupportedError if
    * the requested space type isn't supported by the device.
    */
  def requestReferenceSpace(`type`: XRReferenceSpaceType): js.Promise[XRReferenceSpace | XRBoundedReferenceSpace] = js.native
  
  val supportedFrameRates: js.UndefOr[js.typedarray.Float32Array] = js.native
  
  def updateRenderState(): js.Promise[Unit] = js.native
  def updateRenderState(renderStateInit: XRRenderStateInit): js.Promise[Unit] = js.native
  
  def updateTargetFrameRate(rate: Double): js.Promise[Unit] = js.native
  
  // Legacy
  var updateWorldTrackingState: js.UndefOr[js.Function1[/* options */ PlaneDetectionState, js.UndefOr[Unit]]] = js.native
  
  val visibilityState: XRVisibilityState = js.native
}
