package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate")
@js.native
abstract class XboxLiveEndpointPairTemplate () extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var acceptorBoundPortRangeLower: scala.Double = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var acceptorBoundPortRangeUpper: scala.Double = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var endpointPairs: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[XboxLiveEndpointPair] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var initiatorBoundPortRangeLower: scala.Double = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var initiatorBoundPortRangeUpper: scala.Double = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var name: java.lang.String = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSName("oninboundendpointpaircreated")
  var oninboundendpointpaircreated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[XboxLiveEndpointPairTemplate, XboxLiveInboundEndpointPairCreatedEventArgs] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var socketKind: XboxLiveSocketKind = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_inboundendpointpaircreated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.inboundendpointpaircreated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[XboxLiveEndpointPairTemplate, XboxLiveInboundEndpointPairCreatedEventArgs]
  ): scala.Unit = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def createEndpointPairAsync(deviceAddress: XboxLiveDeviceAddress): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[XboxLiveEndpointPairCreationResult] = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param behaviors This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def createEndpointPairAsync(deviceAddress: XboxLiveDeviceAddress, behaviors: XboxLiveEndpointPairCreationBehaviors): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[XboxLiveEndpointPairCreationResult] = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param initiatorPort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param acceptorPort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def createEndpointPairForPortsAsync(
    deviceAddress: XboxLiveDeviceAddress,
    initiatorPort: java.lang.String,
    acceptorPort: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[XboxLiveEndpointPairCreationResult] = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param initiatorPort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param acceptorPort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param behaviors This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def createEndpointPairForPortsAsync(
    deviceAddress: XboxLiveDeviceAddress,
    initiatorPort: java.lang.String,
    acceptorPort: java.lang.String,
    behaviors: XboxLiveEndpointPairCreationBehaviors
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[XboxLiveEndpointPairCreationResult] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  def oninboundendpointpaircreated(
    ev: XboxLiveInboundEndpointPairCreatedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[XboxLiveEndpointPairTemplate]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_inboundendpointpaircreated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.inboundendpointpaircreated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[XboxLiveEndpointPairTemplate, XboxLiveInboundEndpointPairCreatedEventArgs]
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate")
@js.native
object XboxLiveEndpointPairTemplate extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var templates: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairTemplate] = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param name This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getTemplateByName(name: java.lang.String): winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPairTemplate = js.native
}

