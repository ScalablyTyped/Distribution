package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A frame source that provides infrared frames. */
@JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrameSource")
@js.native
abstract class PerceptionInfraredFrameSource () extends js.Object {
  /** Gets a boolean value indicating whether or not the source is active. */
  var active: scala.Boolean = js.native
  /** Gets a boolean value indicating whether or not the source is available. */
  var available: scala.Boolean = js.native
  /** Gets a read-only collection of video profiles that are currently available from the infrared frame source. */
  var availableVideoProfiles: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PerceptionVideoProfile] = js.native
  /** Gets a CameraIntrinsics value specifying the intrinsic properties of the infrared frame source camera device. */
  var cameraIntrinsics: winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs.CameraIntrinsics = js.native
  var deviceId: js.Any = js.native
   /* unmapped type *//** Gets a string value indicating the kind of physical device that generates the infrared frames. */
  var deviceKind: java.lang.String = js.native
  /** Gets a string value indicating the display name of the infrared frame source. */
  var displayName: java.lang.String = js.native
  /** Gets a string value indicating the unique ID of the infrared frame source. */
  var id: java.lang.String = js.native
  /** Gets a boolean value indicating whether or not the source is the subject of controller mode. */
  var isControlled: scala.Boolean = js.native
  /** Subscribes to the ActiveChanged event. */
  @JSName("onactivechanged")
  var onactivechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, _] = js.native
  /** Subscribes to the AvailableChanged event. */
  @JSName("onavailablechanged")
  var onavailablechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, _] = js.native
  /** Subscribes to the CameraIntrinsicsChanged event. */
  @JSName("oncameraintrinsicschanged")
  var oncameraintrinsicschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, _] = js.native
  /** Subscribes to the PropertiesChanged event. */
  @JSName("onpropertieschanged")
  var onpropertieschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, PerceptionFrameSourcePropertiesChangedEventArgs] = js.native
  /** Subscribes to the VideoProfileChanged event. */
  @JSName("onvideoprofilechanged")
  var onvideoprofilechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, _] = js.native
  /** Gets a read-only collection of frame source properties. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
  /** Gets a read-only collection of video profiles that are supported by the infrared frame source. */
  var supportedVideoProfiles: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PerceptionVideoProfile] = js.native
  /** Gets a PerceptionVideoProfile object indicating the current video profile. */
  var videoProfile: PerceptionVideoProfile = js.native
  /**
                   * Attempts to acquire Controller Mode on the infrared frame source.
                   * @return If the attempt is successful, this returns a PerceptionControlSession object that can be used to control properties of the infrared frame source. Otherwise, this returns null.
                   */
  def acquireControlSession(): PerceptionControlSession = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.activechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_availablechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.availablechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cameraintrinsicschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.cameraintrinsicschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_propertieschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.propertieschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, PerceptionFrameSourcePropertiesChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_videoprofilechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.videoprofilechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, _]
  ): scala.Unit = js.native
  /**
                   * Retrieves a boolean value indicating whether or not the infrared frame source can be controlled separately from another frame source.
                   * @param targetId A string representing the unique ID of the other frame source.
                   * @return True if the two sources can be controlled independently of one another, otherwise false.
                   */
  def canControlIndependentlyFrom(targetId: java.lang.String): scala.Boolean = js.native
  /**
                   * Checks whether or not the infrared frame source is correlated with the target entity.
                   * @param targetId The unique ID of the target entity.
                   * @return True if a correlation exists, otherwise false. If the result is true, a transform matrix can be retrieved to change coordinate basis from this infrared frame source to the entity, or vice versa.
                   */
  def isCorrelatedWith(targetId: java.lang.String): scala.Boolean = js.native
  /** Subscribes to the ActiveChanged event. */
  def onactivechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionInfraredFrameSource]): scala.Unit = js.native
  /** Subscribes to the AvailableChanged event. */
  def onavailablechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionInfraredFrameSource]): scala.Unit = js.native
  /** Subscribes to the CameraIntrinsicsChanged event. */
  def oncameraintrinsicschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionInfraredFrameSource]): scala.Unit = js.native
  /** Subscribes to the PropertiesChanged event. */
  def onpropertieschanged(
    ev: PerceptionFrameSourcePropertiesChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionInfraredFrameSource]
  ): scala.Unit = js.native
  /** Subscribes to the VideoProfileChanged event. */
  def onvideoprofilechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionInfraredFrameSource]): scala.Unit = js.native
  /**
                   * Gets a frame reader that reads frames from this infrared frame source.
                   * @return A frame reader that reads frames from this infrared frame source.
                   */
  def openReader(): PerceptionInfraredFrameReader = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_activechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.activechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_availablechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.availablechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cameraintrinsicschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.cameraintrinsicschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_propertieschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.propertieschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, PerceptionFrameSourcePropertiesChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_videoprofilechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.videoprofilechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionInfraredFrameSource, _]
  ): scala.Unit = js.native
  /**
                   * Attempts to get the intrinsic properties of the depth camera that is correlated with this infrared source.
                   * @param target The depth frame source to try to get intrinsic properties of.
                   * @return If the attempt is successful, this returns a read-only collection of PerceptionDepthCorrelatedCameraIntrinsics objects specifying the intrinsic properties of the camera used by the correlated depth frame source. Otherwise, this returns null.
                   */
  def tryGetDepthCorrelatedCameraIntrinsicsAsync(target: PerceptionDepthFrameSource): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[PerceptionDepthCorrelatedCameraIntrinsics] = js.native
  /**
                   * Attempts to get a coordinate mapper that maps from infrared frame image space to depth frame space.
                   * @param targetId The unique ID of the depth frame source to try to map to.
                   * @param depthFrameSourceToMapWith The depth frame source to try to map to. This should be in a correlation group with the infrared frame source.
                   * @return If the two sources are correlated, this method returns a PerceptionDepthCorrelatedCoordinateMapper. Otherwise, it returns null. This method returns asynchronously.
                   */
  def tryGetDepthCorrelatedCoordinateMapperAsync(targetId: java.lang.String, depthFrameSourceToMapWith: PerceptionDepthFrameSource): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[PerceptionDepthCorrelatedCoordinateMapper] = js.native
  /**
                   * Gets the transform from the infrared frame source to the target entity and sets hasResult to true, if a correlation exists. If a correlation does not exist, hasResult is set to false and result is not modified.
                   * @param targetId The unique ID of the target entity.
                   */
  def tryGetTransformTo(targetId: java.lang.String): winrtDashUwpLib.Anon_Result = js.native
  /**
                   * Attempts to set a video profile on this infrared frame source. Requires an active Controller Mode control session on this frame source.
                   * @param controlSession A PerceptionControlSession representing active control of this frame source.
                   * @param profile The video profile to set.
                   * @return This method returns an PerceptionFrameSourcePropertyChangeResult object asynchonously. If the control session was still active when the video profile was set, and if the video profile is supported and can be activated, this will be a success result.
                   */
  def trySetVideoProfileAsync(controlSession: PerceptionControlSession, profile: PerceptionVideoProfile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[PerceptionFrameSourcePropertyChangeResult] = js.native
}

/** A frame source that provides infrared frames. */
@JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrameSource")
@js.native
object PerceptionInfraredFrameSource extends js.Object {
  /**
                   * Creates a new infrared frame source watcher.
                   * @return A new infrared frame source watcher.
                   */
  def createWatcher(): winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionInfraredFrameSourceWatcher = js.native
  /**
                   * Finds all infrared frame sources.
                   * @return When the method completes, it asynchronously returns a list of infrared frame sources.
                   */
  def findAllAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Finds an infrared frame source by looking up its unique ID.
                   * @param id The unique ID of the infrared frame source.
                   * @return When the method completes, it asynchronously returns an infrared frame source if one exists with the specified ID. Otherwise, this method asynchronously returns nullptr.
                   */
  def fromIdAsync(id: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionInfraredFrameSource] = js.native
  /**
                   * Requests access to use infrared frame sources.
                   * @return When this method completes, it asynchronously returns a PerceptionFrameSourceAccessStatus indicating the result of the access request.
                   */
  def requestAccessAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourceAccessStatus
  ] = js.native
}

