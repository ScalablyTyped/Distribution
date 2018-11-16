package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress")
@js.native
abstract class XboxLiveDeviceAddress () extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var isLocal: scala.Boolean = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var isValid: scala.Boolean = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var networkAccessKind: XboxLiveNetworkAccessKind = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @JSName("onsnapshotchanged")
  var onsnapshotchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[XboxLiveDeviceAddress, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_snapshotchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.snapshotchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[XboxLiveDeviceAddress, _]
  ): scala.Unit = js.native
  /**
                   * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @param otherDeviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   */
  def compare(otherDeviceAddress: XboxLiveDeviceAddress): scala.Double = js.native
  /**
                   * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   */
  def getSnapshotAsBase64(): java.lang.String = js.native
  /**
                   * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   */
  def getSnapshotAsBuffer(): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
                   * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   */
  def getSnapshotAsBytes(): winrtDashUwpLib.Anon_Buffer = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  def onsnapshotchanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[XboxLiveDeviceAddress]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_snapshotchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.snapshotchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[XboxLiveDeviceAddress, _]
  ): scala.Unit = js.native
}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Networking.XboxLive.XboxLiveDeviceAddress")
@js.native
object XboxLiveDeviceAddress extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var maxSnapshotBytesSize: scala.Double = js.native
  /**
                   * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @param base64 This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   */
  def createFromSnapshotBase64(base64: java.lang.String): winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveDeviceAddress = js.native
  /**
                   * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @param buffer This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   */
  def createFromSnapshotBuffer(buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveDeviceAddress = js.native
  /**
                   * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @param buffer This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   */
  def createFromSnapshotBytes(buffer: js.Array[scala.Double]): winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveDeviceAddress = js.native
  /**
                   * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                   */
  def getLocal(): winrtDashUwpLib.WindowsNs.NetworkingNs.XboxLiveNs.XboxLiveDeviceAddress = js.native
}

