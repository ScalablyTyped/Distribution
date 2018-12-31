package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Wi-Fi Direct Services (WFDS) session. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSession")
@js.native
abstract class WiFiDirectServiceSession () extends js.Object {
  /** Gets the advertisement ID for the session. */
  var advertisementId: scala.Double = js.native
  /** Gets the error status of the session. */
  var errorStatus: WiFiDirectServiceSessionErrorStatus = js.native
  /** Event raised when a new remote port is added to the session. Your event handler should respond by establishing the appropriate socket connection to the new remote port. */
  @JSName("onremoteportadded")
  var onremoteportadded_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceSession, WiFiDirectServiceRemotePortAddedEventArgs] = js.native
  /** Event raised when the session status changes. */
  @JSName("onsessionstatuschanged")
  var onsessionstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceSession, _] = js.native
  /** Gets the service address for this session. */
  var serviceAddress: java.lang.String = js.native
  /** Gets the service name of the advertiser service involved in the session. */
  var serviceName: java.lang.String = js.native
  /** Gets the session address for the session. */
  var sessionAddress: java.lang.String = js.native
  /** Gets the session ID. */
  var sessionId: scala.Double = js.native
  /** Gets the session status. */
  var status: WiFiDirectServiceSessionStatus = js.native
  /**
    * Adds a DatagramSocket to the session. Your code creates the DatagramSocket before calling this method. Associating a socket to the session causes port information to be sent to the remote device(s) in the session. (In terms of this API, a RemotePortAdded event is raised on each remote device in the session, specifying the UDP protocol.) A remote device can use that information to open a socket and connect back to the local machine.
    * @param value The DatagramSocket instance to associate with this session.
    * @return An asynchronous association action. Returns on successful completion of the association.
    */
  def addDatagramSocketAsync(value: winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.DatagramSocket): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_remoteportadded(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.remoteportadded,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceSession, WiFiDirectServiceRemotePortAddedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sessionstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sessionstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceSession, _]
  ): scala.Unit = js.native
  /**
    * Adds a StreamSocketListener to the session. Your code creates the StreamSocketListener before calling this method. Associating a socket to the session causes port information to be sent to the remote device(s) in the session. (In terms of this API, a RemotePortAdded event is raised on each remote device in the session, specifying the TCP protocol.) A remote device can use that information to open a socket and connect back to the local machine.
    * @param value The StreamSocketListener instance to be associated with the session.
    * @return An asynchronous association action. Returns on successful completion of the association.
    */
  def addStreamSocketListenerAsync(value: winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.StreamSocketListener): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Closes the session. */
  def close(): scala.Unit = js.native
  /**
    * Gets a list of connection endpoint pairs for the session. Your code uses IVectorView operations to enumerate the endpoint pairs in the list.
    * @return An immutable snapshot list of endpoint pairs involved in the session.
    */
  def getConnectionEndpointPairs(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.NetworkingNs.EndpointPair] = js.native
  /** Event raised when a new remote port is added to the session. Your event handler should respond by establishing the appropriate socket connection to the new remote port. */
  def onremoteportadded(
    ev: WiFiDirectServiceRemotePortAddedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[WiFiDirectServiceSession]
  ): scala.Unit = js.native
  /** Event raised when the session status changes. */
  def onsessionstatuschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[WiFiDirectServiceSession]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_remoteportadded(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.remoteportadded,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceSession, WiFiDirectServiceRemotePortAddedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sessionstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sessionstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectServiceSession, _]
  ): scala.Unit = js.native
}

