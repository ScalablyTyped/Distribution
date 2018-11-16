package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A frame source that provides color frames. */
@JSGlobal("Windows.Devices.Perception.PerceptionColorFrameSource")
@js.native
abstract class PerceptionColorFrameSource () extends js.Object {
  /** Gets a boolean value indicating whether or not the source is active. */
  var active: scala.Boolean = js.native
  /** Gets a boolean value indicating whether or not the source is available. */
  var available: scala.Boolean = js.native
  /** Gets a read-only collection of video profiles that are currently available from the color frame source. */
  var availableVideoProfiles: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PerceptionVideoProfile] = js.native
  /** Gets a CameraIntrinsics value specifying the intrinsic properties of the color frame source camera device. */
  var cameraIntrinsics: winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs.CameraIntrinsics = js.native
  var deviceId: js.Any = js.native
   /* unmapped type *//** Gets a string value indicating the kind of physical device that generates the color frames for this source. */
  var deviceKind: java.lang.String = js.native
  /** Gets a string value indicating the display name of the color frame source. */
  var displayName: java.lang.String = js.native
  /** Gets a string value indicating the unique ID of the color frame source. */
  var id: java.lang.String = js.native
  /** Gets a boolean value indicating whether or not the source is the subject of controller mode. */
  var isControlled: scala.Boolean = js.native
  /** Subscribes to the ActiveChanged event. */
  @JSName("onactivechanged")
  var onactivechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, _] = js.native
  /** Subscribes to the AvailableChanged event. */
  @JSName("onavailablechanged")
  var onavailablechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, _] = js.native
  /** Subscribes to the CameraIntrinsicsChanged event. */
  @JSName("oncameraintrinsicschanged")
  var oncameraintrinsicschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, _] = js.native
  /** Subscribes to the PropertiesChanged event. */
  @JSName("onpropertieschanged")
  var onpropertieschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, PerceptionFrameSourcePropertiesChangedEventArgs] = js.native
  /** Subscribes to the VideoProfileChanged event. */
  @JSName("onvideoprofilechanged")
  var onvideoprofilechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, _] = js.native
  /** Gets a read-only collection of frame source properties. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
  /** Gets a read-only collection of video profiles that are supported by the color frame source. */
  var supportedVideoProfiles: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PerceptionVideoProfile] = js.native
  /** Gets a PerceptionVideoProfile object indicating the current video profile. */
  var videoProfile: PerceptionVideoProfile = js.native
  /**
                   * Attempts to acquire Controller Mode on the color frame source.
                   * @return If the attempt is successful, this returns a PerceptionControlSession object that can be used to control properties of the color frame source. Otherwise, this returns null.
                   */
  def acquireControlSession(): PerceptionControlSession = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_activechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.activechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_availablechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.availablechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cameraintrinsicschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.cameraintrinsicschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_propertieschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.propertieschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, PerceptionFrameSourcePropertiesChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_videoprofilechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.videoprofilechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, _]
  ): scala.Unit = js.native
  /**
                   * This method returns a boolean value indicating whether or not the color frame source can be controlled separately from another frame source.
                   * @param targetId A string representing the unique ID of the other frame source.
                   * @return Returns true if the two sources can be controlled independently of one another, otherwise returns false.
                   */
  def canControlIndependentlyFrom(targetId: java.lang.String): scala.Boolean = js.native
  /**
                   * Checks whether or not the color frame source is correlated with the target entity. If the result is true, a transform matrix can be retrieved to change coordinate basis from this color frame source to the entity, or vice versa.
                   * @param targetId The unique ID of the target entity.
                   * @return Returns true if a correlation exists, otherwise returns false.
                   */
  def isCorrelatedWith(targetId: java.lang.String): scala.Boolean = js.native
  /** Subscribes to the ActiveChanged event. */
  def onactivechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionColorFrameSource]): scala.Unit = js.native
  /** Subscribes to the AvailableChanged event. */
  def onavailablechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionColorFrameSource]): scala.Unit = js.native
  /** Subscribes to the CameraIntrinsicsChanged event. */
  def oncameraintrinsicschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionColorFrameSource]): scala.Unit = js.native
  /** Subscribes to the PropertiesChanged event. */
  def onpropertieschanged(
    ev: PerceptionFrameSourcePropertiesChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionColorFrameSource]
  ): scala.Unit = js.native
  /** Subscribes to the VideoProfileChanged event. */
  def onvideoprofilechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PerceptionColorFrameSource]): scala.Unit = js.native
  /**
                   * Gets a frame reader that reads frames from this color frame source.
                   * @return Returns a frame reader that reads frames from this color frame source.
                   */
  def openReader(): PerceptionColorFrameReader = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_activechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.activechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_availablechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.availablechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cameraintrinsicschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.cameraintrinsicschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_propertieschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.propertieschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, PerceptionFrameSourcePropertiesChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_videoprofilechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.videoprofilechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PerceptionColorFrameSource, _]
  ): scala.Unit = js.native
  /**
                   * Attempts to get the intrinsic properties of the depth camera that is correlated with this color source.
                   * @param correlatedDepthFrameSource The depth frame source to try to get intrinsic properties of.
                   * @return If the attempt is successful, this will return a read-only collection of PerceptionDepthCorrelatedCameraIntrinsics objects specifying the intrinsic properties of the camera used by the correlated depth frame source. Otherwise, this returns null.
                   */
  def tryGetDepthCorrelatedCameraIntrinsicsAsync(correlatedDepthFrameSource: PerceptionDepthFrameSource): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[PerceptionDepthCorrelatedCameraIntrinsics] = js.native
  /**
                   * Attempts to get a coordinate mapper that maps from color frame image space to depth frame space.
                   * @param targetSourceId The unique ID of the depth frame source to try to map to.
                   * @param correlatedDepthFrameSource The depth frame source to try to map to. This should be in a correlation group with the color frame source.
                   * @return If the two sources are correlated, this method returns a PerceptionDepthCorrelatedCoordinateMapper. Otherwise, it returns null. This method returns asynchronously.
                   */
  def tryGetDepthCorrelatedCoordinateMapperAsync(targetSourceId: java.lang.String, correlatedDepthFrameSource: PerceptionDepthFrameSource): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[PerceptionDepthCorrelatedCoordinateMapper] = js.native
  /**
                   * This method returns the transform from the color frame source to the target entity and sets hasResult to true, if a correlation exists. If a correlation does not exist, hasResult is set to false and result is not modified.
                   * @param targetId The unique ID of the target entity.
                   */
  def tryGetTransformTo(targetId: java.lang.String): winrtDashUwpLib.Anon_Result = js.native
  /**
                   * Attempts to set a video profile on this color frame source. Requires an active Controller Mode control session on this frame source.
                   * @param controlSession A PerceptionControlSession representing active control of this frame source.
                   * @param profile The video profile to set.
                   * @return This method returns an PerceptionFrameSourcePropertyChangeResult object asynchonously. If the control session was still active when the video profile was set, and if the video profile is supported and can be activated, this will be a result that indicates success.
                   */
  def trySetVideoProfileAsync(controlSession: PerceptionControlSession, profile: PerceptionVideoProfile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[PerceptionFrameSourcePropertyChangeResult] = js.native
}

/** A frame source that provides color frames. */
@JSGlobal("Windows.Devices.Perception.PerceptionColorFrameSource")
@js.native
object PerceptionColorFrameSource extends js.Object {
  /**
                   * Creates a new color frame source watcher.
                   * @return A new color frame source watcher.
                   */
  def createWatcher(): winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionColorFrameSourceWatcher = js.native
  /**
                   * Finds all color frame sources.
                   * @return When the method completes, it asynchronously returns a list of color frame sources.
                   */
  def findAllAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Finds an color frame source by looking up its unique ID.
                   * @param id The unique ID of the color frame source.
                   * @return When this method completes, it asynchronously returns a color frame source if one exists with the specified ID. Otherwise, this method asynchronously returns null.
                   */
  def fromIdAsync(id: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionColorFrameSource] = js.native
  /**
                   * Requests access to use color frame sources.
                   * @return When this method completes, it asynchronously returns a PerceptionFrameSourceAccessStatus indicating the result of the access request.
                   */
  def requestAccessAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.PerceptionFrameSourceAccessStatus
  ] = js.native
}

