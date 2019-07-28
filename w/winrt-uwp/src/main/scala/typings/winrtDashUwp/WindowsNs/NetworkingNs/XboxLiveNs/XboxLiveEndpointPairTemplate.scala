package typings.winrtDashUwp.WindowsNs.NetworkingNs.XboxLiveNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.inboundendpointpaircreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate")
@js.native
abstract class XboxLiveEndpointPairTemplate () extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var acceptorBoundPortRangeLower: Double = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var acceptorBoundPortRangeUpper: Double = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var endpointPairs: IVectorView[XboxLiveEndpointPair] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var initiatorBoundPortRangeLower: Double = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var initiatorBoundPortRangeUpper: Double = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var name: String = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSName("oninboundendpointpaircreated")
  var oninboundendpointpaircreated_Original: TypedEventHandler[XboxLiveEndpointPairTemplate, XboxLiveInboundEndpointPairCreatedEventArgs] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var socketKind: XboxLiveSocketKind = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_inboundendpointpaircreated(
    `type`: inboundendpointpaircreated,
    listener: TypedEventHandler[XboxLiveEndpointPairTemplate, XboxLiveInboundEndpointPairCreatedEventArgs]
  ): Unit = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def createEndpointPairAsync(deviceAddress: XboxLiveDeviceAddress): IPromiseWithIAsyncOperation[XboxLiveEndpointPairCreationResult] = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param behaviors This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def createEndpointPairAsync(deviceAddress: XboxLiveDeviceAddress, behaviors: XboxLiveEndpointPairCreationBehaviors): IPromiseWithIAsyncOperation[XboxLiveEndpointPairCreationResult] = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param initiatorPort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param acceptorPort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def createEndpointPairForPortsAsync(deviceAddress: XboxLiveDeviceAddress, initiatorPort: String, acceptorPort: String): IPromiseWithIAsyncOperation[XboxLiveEndpointPairCreationResult] = js.native
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
    initiatorPort: String,
    acceptorPort: String,
    behaviors: XboxLiveEndpointPairCreationBehaviors
  ): IPromiseWithIAsyncOperation[XboxLiveEndpointPairCreationResult] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  def oninboundendpointpaircreated(ev: XboxLiveInboundEndpointPairCreatedEventArgs with WinRTEvent[XboxLiveEndpointPairTemplate]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_inboundendpointpaircreated(
    `type`: inboundendpointpaircreated,
    listener: TypedEventHandler[XboxLiveEndpointPairTemplate, XboxLiveInboundEndpointPairCreatedEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPairTemplate")
@js.native
object XboxLiveEndpointPairTemplate extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var templates: IVectorView[XboxLiveEndpointPairTemplate] = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param name This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getTemplateByName(name: String): XboxLiveEndpointPairTemplate = js.native
}

