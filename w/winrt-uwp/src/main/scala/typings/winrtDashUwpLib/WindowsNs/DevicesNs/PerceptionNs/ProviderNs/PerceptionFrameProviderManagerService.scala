package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static methods for managing IPerceptionFrameProvider registration and unregistration, PerceptionFaceAuthenticationGroup registration and unregistration, PerceptionControlGroup registration and unregistration, PerceptionCorrelationGroup registration and unregistration, IPerceptionFrameProvider availablity, and publishing a new PerceptionFrame for an IPerceptionFrameProvider. */
@JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService")
@js.native
abstract class PerceptionFrameProviderManagerService () extends js.Object

/* static members */
@JSGlobal("Windows.Devices.Perception.Provider.PerceptionFrameProviderManagerService")
@js.native
object PerceptionFrameProviderManagerService extends js.Object {
  /**
    * Sends the PerceptionFrame to the service to tell any apps listening for frames for the provided provider. Frames aren't expected to be published before IPerceptionFrameProvider::Start() is called or after IPerceptionFrameProvider::Stop() is called.
    * @param provider The IPerceptionFrameProvider which produced the frame.
    * @param frame The PerceptionFrame that was produced and should be sent to apps.
    */
  def publishFrameForProvider(
    provider: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.IPerceptionFrameProvider,
    frame: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.PerceptionFrame
  ): scala.Unit = js.native
  /**
    * Registers a PerceptionControlGroup associated with the IPerceptionFrameProviderManager.
    * @param manager The manager that owns the lifetime of the group.
    * @param controlGroup The group of IPerceptionFrameProvider(s) to control atomically.
    */
  def registerControlGroup(
    manager: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.IPerceptionFrameProviderManager,
    controlGroup: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.PerceptionControlGroup
  ): scala.Unit = js.native
  /**
    * Registers a PerceptionCorrelationGroup associated with the IPerceptionFrameProviderManager.
    * @param manager The manager that owns the lifetime of the group.
    * @param correlationGroup The group of PerceptionCorrelations(s) to control atomically.
    */
  def registerCorrelationGroup(
    manager: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.IPerceptionFrameProviderManager,
    correlationGroup: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.PerceptionCorrelationGroup
  ): scala.Unit = js.native
  /**
    * Registers a PerceptionFaceAuthenticationGroup associated with the given IPerceptionProviderManager.
    * @param manager The manager that owns the lifetime of the group.
    * @param faceAuthenticationGroup The group of IPerceptionFrameProvider(s) to atomically control.
    */
  def registerFaceAuthenticationGroup(
    manager: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.IPerceptionFrameProviderManager,
    faceAuthenticationGroup: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.PerceptionFaceAuthenticationGroup
  ): scala.Unit = js.native
  /**
    * Registers the PerceptionFrameProviderInfo in association with the given IPerceptionFrameProviderManager.
    * @param manager The manager which can provide the IPerceptionFrameProvider associated with the info.
    * @param frameProviderInfo The PerceptionFrameProviderInfo which identifies the available IPerceptionFrameProvider.
    */
  def registerFrameProviderInfo(
    manager: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.IPerceptionFrameProviderManager,
    frameProviderInfo: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.PerceptionFrameProviderInfo
  ): scala.Unit = js.native
  /**
    * Removes the registration of a previously registered PerceptionControlGroup.
    * @param manager The manager that owns the lifetime of the group.
    * @param controlGroup The group of IPerceptionFrameProvider(s) to prevent from being controlled.
    */
  def unregisterControlGroup(
    manager: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.IPerceptionFrameProviderManager,
    controlGroup: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.PerceptionControlGroup
  ): scala.Unit = js.native
  /**
    * Unregisters a PerceptionCorrelationGroup associated with the IPerceptionFrameProviderManager.
    * @param manager The manager that owns the lifetime of the group.
    * @param correlationGroup The PerceptionCorrelationGroup to unregister.
    */
  def unregisterCorrelationGroup(
    manager: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.IPerceptionFrameProviderManager,
    correlationGroup: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.PerceptionCorrelationGroup
  ): scala.Unit = js.native
  /**
    * Unregisters a PerceptionFaceAuthenticationGroup in association with the given IPerceptionProviderManager.
    * @param manager The manager that owns the lifetime of the group.
    * @param faceAuthenticationGroup The PerceptionFaceAuthenticationGroup to unregister.
    */
  def unregisterFaceAuthenticationGroup(
    manager: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.IPerceptionFrameProviderManager,
    faceAuthenticationGroup: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.PerceptionFaceAuthenticationGroup
  ): scala.Unit = js.native
  /**
    * Unregisters the PerceptionFrameProviderInfo in association with the given IPerceptionProviderManager.
    * @param manager The manager which previously registered this info.
    * @param frameProviderInfo The PerceptionFrameProviderInfo which identifies the IPerceptionFrameProvider.
    */
  def unregisterFrameProviderInfo(
    manager: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.IPerceptionFrameProviderManager,
    frameProviderInfo: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.PerceptionFrameProviderInfo
  ): scala.Unit = js.native
  /**
    * Sets whether or not the IPerceptionFrameProvider is available.
    * @param provider The provider to set availability for.
    * @param available Whether or not the provider is available.
    */
  def updateAvailabilityForProvider(
    provider: winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs.ProviderNs.IPerceptionFrameProvider,
    available: scala.Boolean
  ): scala.Unit = js.native
}

