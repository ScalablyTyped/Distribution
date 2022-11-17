package typings.webxr

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventTarget
import typings.webxr.anon.PlaneDetectionState
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
  @scala.annotation.targetName("addEventListener_inputsourceschange")
  def addEventListener(
    `type`: "inputsourceschange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_end")
  def addEventListener(`type`: "end", listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_select")
  def addEventListener(
    `type`: "select",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_visibilitychange")
  def addEventListener(
    `type`: "visibilitychange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_frameratechange")
  def addEventListener(
    `type`: "frameratechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_selectend")
  def addEventListener(
    `type`: "selectend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_squeezestart")
  def addEventListener(
    `type`: "squeezestart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_squeeze")
  def addEventListener(
    `type`: "squeeze",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_squeezeend")
  def addEventListener(
    `type`: "squeezeend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_selectstart")
  def addEventListener(
    `type`: "selectstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_visibilitychange")
  def addEventListener(
    `type`: "visibilitychange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_squeezeend")
  def addEventListener(
    `type`: "squeezeend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_select")
  def addEventListener(
    `type`: "select",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_squeeze")
  def addEventListener(
    `type`: "squeeze",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_selectstart")
  def addEventListener(
    `type`: "selectstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_frameratechange")
  def addEventListener(
    `type`: "frameratechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_inputsourceschange")
  def addEventListener(
    `type`: "inputsourceschange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceChangeEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_end")
  def addEventListener(
    `type`: "end",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_selectend")
  def addEventListener(
    `type`: "selectend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_squeezestart")
  def addEventListener(
    `type`: "squeezestart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_select")
  def addEventListener(
    `type`: "select",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_squeezeend")
  def addEventListener(
    `type`: "squeezeend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_selectend")
  def addEventListener(
    `type`: "selectend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_squeezestart")
  def addEventListener(
    `type`: "squeezestart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_frameratechange")
  def addEventListener(
    `type`: "frameratechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_end")
  def addEventListener(
    `type`: "end",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_inputsourceschange")
  def addEventListener(
    `type`: "inputsourceschange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_squeeze")
  def addEventListener(
    `type`: "squeeze",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_selectstart")
  def addEventListener(
    `type`: "selectstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_visibilitychange")
  def addEventListener(
    `type`: "visibilitychange",
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
  @scala.annotation.targetName("removeEventListener_squeeze")
  def removeEventListener(
    `type`: "squeeze",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_inputsourceschange")
  def removeEventListener(
    `type`: "inputsourceschange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_select")
  def removeEventListener(
    `type`: "select",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_selectend")
  def removeEventListener(
    `type`: "selectend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_visibilitychange")
  def removeEventListener(
    `type`: "visibilitychange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_squeezestart")
  def removeEventListener(
    `type`: "squeezestart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_selectstart")
  def removeEventListener(
    `type`: "selectstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_squeezeend")
  def removeEventListener(
    `type`: "squeezeend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_frameratechange")
  def removeEventListener(
    `type`: "frameratechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_end")
  def removeEventListener(`type`: "end", listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_squeezestart")
  def removeEventListener(
    `type`: "squeezestart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_selectend")
  def removeEventListener(
    `type`: "selectend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_end")
  def removeEventListener(
    `type`: "end",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_squeezeend")
  def removeEventListener(
    `type`: "squeezeend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_squeeze")
  def removeEventListener(
    `type`: "squeeze",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_selectstart")
  def removeEventListener(
    `type`: "selectstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_frameratechange")
  def removeEventListener(
    `type`: "frameratechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_select")
  def removeEventListener(
    `type`: "select",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_visibilitychange")
  def removeEventListener(
    `type`: "visibilitychange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_inputsourceschange")
  def removeEventListener(
    `type`: "inputsourceschange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceChangeEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_squeezestart")
  def removeEventListener(
    `type`: "squeezestart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_end")
  def removeEventListener(
    `type`: "end",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_selectend")
  def removeEventListener(
    `type`: "selectend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_inputsourceschange")
  def removeEventListener(
    `type`: "inputsourceschange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceChangeEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_squeezeend")
  def removeEventListener(
    `type`: "squeezeend",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_selectstart")
  def removeEventListener(
    `type`: "selectstart",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_select")
  def removeEventListener(
    `type`: "select",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_frameratechange")
  def removeEventListener(
    `type`: "frameratechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRSessionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_squeeze")
  def removeEventListener(
    `type`: "squeeze",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ XRInputSourceEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_visibilitychange")
  def removeEventListener(
    `type`: "visibilitychange",
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
