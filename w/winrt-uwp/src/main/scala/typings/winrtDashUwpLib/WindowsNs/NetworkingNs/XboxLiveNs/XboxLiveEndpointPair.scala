package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPair")
@js.native
abstract class XboxLiveEndpointPair () extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var localHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var localPort: java.lang.String = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSName("onstatechanged")
  var onstatechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[XboxLiveEndpointPair, XboxLiveEndpointPairStateChangedEventArgs] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var remoteDeviceAddress: XboxLiveDeviceAddress = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var remoteHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var remotePort: java.lang.String = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var state: XboxLiveEndpointPairState = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var template: XboxLiveEndpointPairTemplate = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[XboxLiveEndpointPair, XboxLiveEndpointPairStateChangedEventArgs]
  ): scala.Unit = js.native
  /**
                   * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   */
  def deleteAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   */
  def getLocalSocketAddressBytes(): js.Array[scala.Double] = js.native
  /**
                   * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   */
  def getRemoteSocketAddressBytes(): js.Array[scala.Double] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  def onstatechanged(
    ev: XboxLiveEndpointPairStateChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[XboxLiveEndpointPair]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[XboxLiveEndpointPair, XboxLiveEndpointPairStateChangedEventArgs]
  ): scala.Unit = js.native
}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveEndpointPair")
@js.native
object XboxLiveEndpointPair extends js.Object {
  /**
                   * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @param localHostName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @param localPort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @param remoteHostName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @param remotePort This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   */
  def findEndpointPairByHostNamesAndPorts(
    localHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName,
    localPort: java.lang.String,
    remoteHostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName,
    remotePort: java.lang.String
  ): winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPair = js.native
  /**
                   * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @param localSocketAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @param remoteSocketAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   */
  def findEndpointPairBySocketAddressBytes(localSocketAddress: js.Array[scala.Double], remoteSocketAddress: js.Array[scala.Double]): winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveEndpointPair = js.native
}

