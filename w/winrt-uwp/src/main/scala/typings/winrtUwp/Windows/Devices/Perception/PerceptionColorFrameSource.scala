package typings.winrtUwp.Windows.Devices.Perception

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Media.Devices.Core.CameraIntrinsics
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.anon.Result
import typings.winrtUwp.winrtUwpStrings.activechanged
import typings.winrtUwp.winrtUwpStrings.availablechanged
import typings.winrtUwp.winrtUwpStrings.cameraintrinsicschanged
import typings.winrtUwp.winrtUwpStrings.propertieschanged
import typings.winrtUwp.winrtUwpStrings.videoprofilechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A frame source that provides color frames. */
@js.native
trait PerceptionColorFrameSource extends js.Object {
  /** Gets a boolean value indicating whether or not the source is active. */
  var active: Boolean = js.native
  /** Gets a boolean value indicating whether or not the source is available. */
  var available: Boolean = js.native
  /** Gets a read-only collection of video profiles that are currently available from the color frame source. */
  var availableVideoProfiles: IVectorView[PerceptionVideoProfile] = js.native
  /** Gets a CameraIntrinsics value specifying the intrinsic properties of the color frame source camera device. */
  var cameraIntrinsics: CameraIntrinsics = js.native
  var deviceId: js.Any = js.native
   /* unmapped type */ /** Gets a string value indicating the kind of physical device that generates the color frames for this source. */
  var deviceKind: String = js.native
  /** Gets a string value indicating the display name of the color frame source. */
  var displayName: String = js.native
  /** Gets a string value indicating the unique ID of the color frame source. */
  var id: String = js.native
  /** Gets a boolean value indicating whether or not the source is the subject of controller mode. */
  var isControlled: Boolean = js.native
  /** Subscribes to the ActiveChanged event. */
  @JSName("onactivechanged")
  var onactivechanged_Original: TypedEventHandler[PerceptionColorFrameSource, _] = js.native
  /** Subscribes to the AvailableChanged event. */
  @JSName("onavailablechanged")
  var onavailablechanged_Original: TypedEventHandler[PerceptionColorFrameSource, _] = js.native
  /** Subscribes to the CameraIntrinsicsChanged event. */
  @JSName("oncameraintrinsicschanged")
  var oncameraintrinsicschanged_Original: TypedEventHandler[PerceptionColorFrameSource, _] = js.native
  /** Subscribes to the PropertiesChanged event. */
  @JSName("onpropertieschanged")
  var onpropertieschanged_Original: TypedEventHandler[PerceptionColorFrameSource, PerceptionFrameSourcePropertiesChangedEventArgs] = js.native
  /** Subscribes to the VideoProfileChanged event. */
  @JSName("onvideoprofilechanged")
  var onvideoprofilechanged_Original: TypedEventHandler[PerceptionColorFrameSource, _] = js.native
  /** Gets a read-only collection of frame source properties. */
  var properties: IMapView[String, _] = js.native
  /** Gets a read-only collection of video profiles that are supported by the color frame source. */
  var supportedVideoProfiles: IVectorView[PerceptionVideoProfile] = js.native
  /** Gets a PerceptionVideoProfile object indicating the current video profile. */
  var videoProfile: PerceptionVideoProfile = js.native
  /**
    * Attempts to acquire Controller Mode on the color frame source.
    * @return If the attempt is successful, this returns a PerceptionControlSession object that can be used to control properties of the color frame source. Otherwise, this returns null.
    */
  def acquireControlSession(): PerceptionControlSession = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activechanged(`type`: activechanged, listener: TypedEventHandler[PerceptionColorFrameSource, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_availablechanged(`type`: availablechanged, listener: TypedEventHandler[PerceptionColorFrameSource, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cameraintrinsicschanged(`type`: cameraintrinsicschanged, listener: TypedEventHandler[PerceptionColorFrameSource, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_propertieschanged(
    `type`: propertieschanged,
    listener: TypedEventHandler[PerceptionColorFrameSource, PerceptionFrameSourcePropertiesChangedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_videoprofilechanged(`type`: videoprofilechanged, listener: TypedEventHandler[PerceptionColorFrameSource, _]): Unit = js.native
  /**
    * This method returns a boolean value indicating whether or not the color frame source can be controlled separately from another frame source.
    * @param targetId A string representing the unique ID of the other frame source.
    * @return Returns true if the two sources can be controlled independently of one another, otherwise returns false.
    */
  def canControlIndependentlyFrom(targetId: String): Boolean = js.native
  /**
    * Checks whether or not the color frame source is correlated with the target entity. If the result is true, a transform matrix can be retrieved to change coordinate basis from this color frame source to the entity, or vice versa.
    * @param targetId The unique ID of the target entity.
    * @return Returns true if a correlation exists, otherwise returns false.
    */
  def isCorrelatedWith(targetId: String): Boolean = js.native
  /** Subscribes to the ActiveChanged event. */
  def onactivechanged(ev: js.Any with WinRTEvent[PerceptionColorFrameSource]): Unit = js.native
  /** Subscribes to the AvailableChanged event. */
  def onavailablechanged(ev: js.Any with WinRTEvent[PerceptionColorFrameSource]): Unit = js.native
  /** Subscribes to the CameraIntrinsicsChanged event. */
  def oncameraintrinsicschanged(ev: js.Any with WinRTEvent[PerceptionColorFrameSource]): Unit = js.native
  /** Subscribes to the PropertiesChanged event. */
  def onpropertieschanged(ev: PerceptionFrameSourcePropertiesChangedEventArgs with WinRTEvent[PerceptionColorFrameSource]): Unit = js.native
  /** Subscribes to the VideoProfileChanged event. */
  def onvideoprofilechanged(ev: js.Any with WinRTEvent[PerceptionColorFrameSource]): Unit = js.native
  /**
    * Gets a frame reader that reads frames from this color frame source.
    * @return Returns a frame reader that reads frames from this color frame source.
    */
  def openReader(): PerceptionColorFrameReader = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_activechanged(`type`: activechanged, listener: TypedEventHandler[PerceptionColorFrameSource, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_availablechanged(`type`: availablechanged, listener: TypedEventHandler[PerceptionColorFrameSource, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cameraintrinsicschanged(`type`: cameraintrinsicschanged, listener: TypedEventHandler[PerceptionColorFrameSource, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_propertieschanged(
    `type`: propertieschanged,
    listener: TypedEventHandler[PerceptionColorFrameSource, PerceptionFrameSourcePropertiesChangedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_videoprofilechanged(`type`: videoprofilechanged, listener: TypedEventHandler[PerceptionColorFrameSource, _]): Unit = js.native
  /**
    * Attempts to get the intrinsic properties of the depth camera that is correlated with this color source.
    * @param correlatedDepthFrameSource The depth frame source to try to get intrinsic properties of.
    * @return If the attempt is successful, this will return a read-only collection of PerceptionDepthCorrelatedCameraIntrinsics objects specifying the intrinsic properties of the camera used by the correlated depth frame source. Otherwise, this returns null.
    */
  def tryGetDepthCorrelatedCameraIntrinsicsAsync(correlatedDepthFrameSource: PerceptionDepthFrameSource): IPromiseWithIAsyncOperation[PerceptionDepthCorrelatedCameraIntrinsics] = js.native
  /**
    * Attempts to get a coordinate mapper that maps from color frame image space to depth frame space.
    * @param targetSourceId The unique ID of the depth frame source to try to map to.
    * @param correlatedDepthFrameSource The depth frame source to try to map to. This should be in a correlation group with the color frame source.
    * @return If the two sources are correlated, this method returns a PerceptionDepthCorrelatedCoordinateMapper. Otherwise, it returns null. This method returns asynchronously.
    */
  def tryGetDepthCorrelatedCoordinateMapperAsync(targetSourceId: String, correlatedDepthFrameSource: PerceptionDepthFrameSource): IPromiseWithIAsyncOperation[PerceptionDepthCorrelatedCoordinateMapper] = js.native
  /**
    * This method returns the transform from the color frame source to the target entity and sets hasResult to true, if a correlation exists. If a correlation does not exist, hasResult is set to false and result is not modified.
    * @param targetId The unique ID of the target entity.
    */
  def tryGetTransformTo(targetId: String): Result = js.native
  /**
    * Attempts to set a video profile on this color frame source. Requires an active Controller Mode control session on this frame source.
    * @param controlSession A PerceptionControlSession representing active control of this frame source.
    * @param profile The video profile to set.
    * @return This method returns an PerceptionFrameSourcePropertyChangeResult object asynchonously. If the control session was still active when the video profile was set, and if the video profile is supported and can be activated, this will be a result that indicates success.
    */
  def trySetVideoProfileAsync(controlSession: PerceptionControlSession, profile: PerceptionVideoProfile): IPromiseWithIAsyncOperation[PerceptionFrameSourcePropertyChangeResult] = js.native
}

