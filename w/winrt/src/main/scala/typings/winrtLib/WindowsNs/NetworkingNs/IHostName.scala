package typings
package winrtLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHostName extends js.Object {
  var canonicalName: java.lang.String
  var displayName: java.lang.String
  var iPInformation: winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.IPInformation
  var rawName: java.lang.String
  var `type`: HostNameType
  def isEqual(hostName: HostName): scala.Boolean
}

object IHostName {
  @scala.inline
  def apply(
    canonicalName: java.lang.String,
    displayName: java.lang.String,
    iPInformation: winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.IPInformation,
    isEqual: HostName => scala.Boolean,
    rawName: java.lang.String,
    `type`: HostNameType
  ): IHostName = {
    val __obj = js.Dynamic.literal(canonicalName = canonicalName, displayName = displayName, iPInformation = iPInformation, isEqual = js.Any.fromFunction1(isEqual), rawName = rawName)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IHostName]
  }
}

