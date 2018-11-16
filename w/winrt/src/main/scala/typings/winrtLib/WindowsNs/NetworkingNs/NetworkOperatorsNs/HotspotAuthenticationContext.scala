package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext")
@js.native
class HotspotAuthenticationContext () extends IHotspotAuthenticationContext {
  /* CompleteClass */
  override var authenticationUrl: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var networkAdapter: winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter = js.native
  /* CompleteClass */
  override var redirectMessageUrl: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var redirectMessageXml: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
  /* CompleteClass */
  override var wirelessNetworkId: stdLib.Uint8Array = js.native
  /* CompleteClass */
  override def abortAuthentication(markAsManual: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def issueCredentials(
    userName: java.lang.String,
    password: java.lang.String,
    extraParameters: java.lang.String,
    markAsManualConnectOnFailure: scala.Boolean
  ): scala.Unit = js.native
  /* CompleteClass */
  override def skipAuthentication(): scala.Unit = js.native
  /* CompleteClass */
  override def triggerAttentionRequired(packageRelativeApplicationId: java.lang.String, applicationParameters: java.lang.String): scala.Unit = js.native
}

@JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext")
@js.native
object HotspotAuthenticationContext extends js.Object {
  def tryGetAuthenticationContext(evenToken: java.lang.String): winrtLib.Anon_IsValid = js.native
}

