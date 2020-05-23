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

/** A frame source that provides infrared frames. */
@js.native
trait PerceptionInfraredFrameSource extends js.Object {
  /** Gets a boolean value indicating whether or not the source is active. */
  var active: Boolean = js.native
  /** Gets a boolean value indicating whether or not the source is available. */
  var available: Boolean = js.native
  /** Gets a read-only collection of video profiles that are currently available from the infrared frame source. */
  var availableVideoProfiles: IVectorView[PerceptionVideoProfile] = js.native
  /** Gets a CameraIntrinsics value specifying the intrinsic properties of the infrared frame source camera device. */
  var cameraIntrinsics: CameraIntrinsics = js.native
  var deviceId: js.Any = js.native
   /* unmapped type */ /** Gets a string value indicating the kind of physical device that generates the infrared frames. */
  var deviceKind: String = js.native
  /** Gets a string value indicating the display name of the infrared frame source. */
  var displayName: String = js.native
  /** Gets a string value indicating the unique ID of the infrared frame source. */
  var id: String = js.native
  /** Gets a boolean value indicating whether or not the source is the subject of controller mode. */
  var isControlled: Boolean = js.native
  /** Subscribes to the ActiveChanged event. */
  @JSName("onactivechanged")
  var onactivechanged_Original: TypedEventHandler[PerceptionInfraredFrameSource, _] = js.native
  /** Subscribes to the AvailableChanged event. */
  @JSName("onavailablechanged")
  var onavailablechanged_Original: TypedEventHandler[PerceptionInfraredFrameSource, _] = js.native
  /** Subscribes to the CameraIntrinsicsChanged event. */
  @JSName("oncameraintrinsicschanged")
  var oncameraintrinsicschanged_Original: TypedEventHandler[PerceptionInfraredFrameSource, _] = js.native
  /** Subscribes to the PropertiesChanged event. */
  @JSName("onpropertieschanged")
  var onpropertieschanged_Original: TypedEventHandler[PerceptionInfraredFrameSource, PerceptionFrameSourcePropertiesChangedEventArgs] = js.native
  /** Subscribes to the VideoProfileChanged event. */
  @JSName("onvideoprofilechanged")
  var onvideoprofilechanged_Original: TypedEventHandler[PerceptionInfraredFrameSource, _] = js.native
  /** Gets a read-only collection of frame source properties. */
  var properties: IMapView[String, _] = js.native
  /** Gets a read-only collection of video profiles that are supported by the infrared frame source. */
  var supportedVideoProfiles: IVectorView[PerceptionVideoProfile] = js.native
  /** Gets a PerceptionVideoProfile object indicating the current video profile. */
  var videoProfile: PerceptionVideoProfile = js.native
  /**
    * Attempts to acquire Controller Mode on the infrared frame source.
    * @return If the attempt is successful, this returns a PerceptionControlSession object that can be used to control properties of the infrared frame source. Otherwise, this returns null.
    */
  def acquireControlSession(): PerceptionControlSession = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activechanged(`type`: activechanged, listener: TypedEventHandler[PerceptionInfraredFrameSource, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_availablechanged(`type`: availablechanged, listener: TypedEventHandler[PerceptionInfraredFrameSource, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cameraintrinsicschanged(`type`: cameraintrinsicschanged, listener: TypedEventHandler[PerceptionInfraredFrameSource, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_propertieschanged(
    `type`: propertieschanged,
    listener: TypedEventHandler[PerceptionInfraredFrameSource, PerceptionFrameSourcePropertiesChangedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_videoprofilechanged(`type`: videoprofilechanged, listener: TypedEventHandler[PerceptionInfraredFrameSource, _]): Unit = js.native
  /**
    * Retrieves a boolean value indicating whether or not the infrared frame source can be controlled separately from another frame source.
    * @param targetId A string representing the unique ID of the other frame source.
    * @return True if the two sources can be controlled independently of one another, otherwise false.
    */
  def canControlIndependentlyFrom(targetId: String): Boolean = js.native
  /**
    * Checks whether or not the infrared frame source is correlated with the target entity.
    * @param targetId The unique ID of the target entity.
    * @return True if a correlation exists, otherwise false. If the result is true, a transform matrix can be retrieved to change coordinate basis from this infrared frame source to the entity, or vice versa.
    */
  def isCorrelatedWith(targetId: String): Boolean = js.native
  /** Subscribes to the ActiveChanged event. */
  def onactivechanged(ev: js.Any with WinRTEvent[PerceptionInfraredFrameSource]): Unit = js.native
  /** Subscribes to the AvailableChanged event. */
  def onavailablechanged(ev: js.Any with WinRTEvent[PerceptionInfraredFrameSource]): Unit = js.native
  /** Subscribes to the CameraIntrinsicsChanged event. */
  def oncameraintrinsicschanged(ev: js.Any with WinRTEvent[PerceptionInfraredFrameSource]): Unit = js.native
  /** Subscribes to the PropertiesChanged event. */
  def onpropertieschanged(ev: PerceptionFrameSourcePropertiesChangedEventArgs with WinRTEvent[PerceptionInfraredFrameSource]): Unit = js.native
  /** Subscribes to the VideoProfileChanged event. */
  def onvideoprofilechanged(ev: js.Any with WinRTEvent[PerceptionInfraredFrameSource]): Unit = js.native
  /**
    * Gets a frame reader that reads frames from this infrared frame source.
    * @return A frame reader that reads frames from this infrared frame source.
    */
  def openReader(): PerceptionInfraredFrameReader = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_activechanged(`type`: activechanged, listener: TypedEventHandler[PerceptionInfraredFrameSource, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_availablechanged(`type`: availablechanged, listener: TypedEventHandler[PerceptionInfraredFrameSource, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cameraintrinsicschanged(`type`: cameraintrinsicschanged, listener: TypedEventHandler[PerceptionInfraredFrameSource, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_propertieschanged(
    `type`: propertieschanged,
    listener: TypedEventHandler[PerceptionInfraredFrameSource, PerceptionFrameSourcePropertiesChangedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_videoprofilechanged(`type`: videoprofilechanged, listener: TypedEventHandler[PerceptionInfraredFrameSource, _]): Unit = js.native
  /**
    * Attempts to get the intrinsic properties of the depth camera that is correlated with this infrared source.
    * @param target The depth frame source to try to get intrinsic properties of.
    * @return If the attempt is successful, this returns a read-only collection of PerceptionDepthCorrelatedCameraIntrinsics objects specifying the intrinsic properties of the camera used by the correlated depth frame source. Otherwise, this returns null.
    */
  def tryGetDepthCorrelatedCameraIntrinsicsAsync(target: PerceptionDepthFrameSource): IPromiseWithIAsyncOperation[PerceptionDepthCorrelatedCameraIntrinsics] = js.native
  /**
    * Attempts to get a coordinate mapper that maps from infrared frame image space to depth frame space.
    * @param targetId The unique ID of the depth frame source to try to map to.
    * @param depthFrameSourceToMapWith The depth frame source to try to map to. This should be in a correlation group with the infrared frame source.
    * @return If the two sources are correlated, this method returns a PerceptionDepthCorrelatedCoordinateMapper. Otherwise, it returns null. This method returns asynchronously.
    */
  def tryGetDepthCorrelatedCoordinateMapperAsync(targetId: String, depthFrameSourceToMapWith: PerceptionDepthFrameSource): IPromiseWithIAsyncOperation[PerceptionDepthCorrelatedCoordinateMapper] = js.native
  /**
    * Gets the transform from the infrared frame source to the target entity and sets hasResult to true, if a correlation exists. If a correlation does not exist, hasResult is set to false and result is not modified.
    * @param targetId The unique ID of the target entity.
    */
  def tryGetTransformTo(targetId: String): Result = js.native
  /**
    * Attempts to set a video profile on this infrared frame source. Requires an active Controller Mode control session on this frame source.
    * @param controlSession A PerceptionControlSession representing active control of this frame source.
    * @param profile The video profile to set.
    * @return This method returns an PerceptionFrameSourcePropertyChangeResult object asynchonously. If the control session was still active when the video profile was set, and if the video profile is supported and can be activated, this will be a success result.
    */
  def trySetVideoProfileAsync(controlSession: PerceptionControlSession, profile: PerceptionVideoProfile): IPromiseWithIAsyncOperation[PerceptionFrameSourcePropertyChangeResult] = js.native
}

