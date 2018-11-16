package typings
package webvrDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRDisplay
  extends stdLib.EventTarget {
  /**
       * Dictionary of capabilities describing the VRDisplay.
       */
  val capabilities: VRDisplayCapabilities = js.native
  /**
       * z-depth defining the far plane of the eye view frustum
       * enables mapping of values in the render target depth
       * attachment to scene coordinates. Initially set to 10000.0.
       */
  var depthFar: scala.Double = js.native
  /**
       * z-depth defining the near plane of the eye view frustum
       * enables mapping of values in the render target depth
       * attachment to scene coordinates. Initially set to 0.01.
       */
  var depthNear: scala.Double = js.native
  /**
       * An identifier for this distinct VRDisplay. Used as an
       * association point in the Gamepad API.
       */
  val displayId: scala.Double = js.native
  /**
       * A display name, a user-readable name identifying it.
       */
  val displayName: java.lang.String = js.native
  val isConnected: scala.Boolean = js.native
  val isPresenting: scala.Boolean = js.native
  /**
       * If this VRDisplay supports room-scale experiences, the optional
       * stage attribute contains details on the room-scale parameters.
       */
  val stageParameters: VRStageParameters | scala.Null = js.native
  /**
       * Passing the value returned by `requestAnimationFrame` to
       * `cancelAnimationFrame` will unregister the callback.
       */
  def cancelAnimationFrame(handle: scala.Double): scala.Unit = js.native
  /**
       * Stops presenting to the VRDisplay.
       */
  def exitPresent(): stdLib.Promise[scala.Unit] = js.native
  /* Return the current VREyeParameters for the given eye. */
  def getEyeParameters(whichEye: VREye_dt_alias): VREyeParameters = js.native
  /**
       * Populates the passed VRFrameData with the information required to render
       * the current frame.
       */
  def getFrameData(frameData: VRFrameData): scala.Boolean = js.native
  /**
       * Return the current instantaneous pose of the VRDisplay, with no
       * prediction applied.
       */
  def getImmediatePose(): VRPose = js.native
  /**
       * Get the layers currently being presented.
       */
  def getLayers(): js.Array[VRLayer] = js.native
  /**
       * @deprecated
       * Return a VRPose containing the future predicted pose of the VRDisplay
       * when the current frame will be presented. The value returned will not
       * change until JavaScript has returned control to the browser.
       *
       * The VRPose will contain the position, orientation, velocity,
       * and acceleration of each of these properties.
       */
  def getPose(): VRPose = js.native
  /**
       * The callback passed to `requestAnimationFrame` will be called
       * any time a new frame should be rendered. When the VRDisplay is
       * presenting the callback will be called at the native refresh
       * rate of the HMD. When not presenting this function acts
       * identically to how window.requestAnimationFrame acts. Content should
       * make no assumptions of frame rate or vsync behavior as the HMD runs
       * asynchronously from other displays and at differing refresh rates.
       */
  def requestAnimationFrame(callback: stdLib.FrameRequestCallback): scala.Double = js.native
  /**
       * Begin presenting to the VRDisplay. Must be called in response to a user gesture.
       * Repeat calls while already presenting will update the VRLayers being displayed.
       */
  def requestPresent(layers: js.Array[VRLayer]): stdLib.Promise[scala.Unit] = js.native
  /**
       * Reset the pose for this display, treating its current position and
       * orientation as the "origin/zero" values. VRPose.position,
       * VRPose.orientation, and VRStageParameters.sittingToStandingTransform may be
       * updated when calling resetPose(). This should be called in only
       * sitting-space experiences.
       */
  def resetPose(): scala.Unit = js.native
  /**
       * The VRLayer provided to the VRDisplay will be captured and presented
       * in the HMD. Calling this function has the same effect on the source
       * canvas as any other operation that uses its source image, and canvases
       * created without preserveDrawingBuffer set to true will be cleared.
       */
  def submitFrame(): scala.Unit = js.native
  /**
       * The VRLayer provided to the VRDisplay will be captured and presented
       * in the HMD. Calling this function has the same effect on the source
       * canvas as any other operation that uses its source image, and canvases
       * created without preserveDrawingBuffer set to true will be cleared.
       */
  def submitFrame(pose: VRPose): scala.Unit = js.native
}

@JSGlobal("VRDisplay")
@js.native
object VRDisplay
  extends ScalablyTyped.runtime.Instantiable0[VRDisplay]

