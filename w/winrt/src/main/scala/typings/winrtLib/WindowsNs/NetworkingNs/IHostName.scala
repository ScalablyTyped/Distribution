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
    isEqual: js.Function1[HostName, scala.Boolean],
    rawName: java.lang.String,
    `type`: HostNameType
  ): IHostName = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("canonicalName")(canonicalName)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("iPInformation")(iPInformation)
    __obj.updateDynamic("isEqual")(isEqual)
    __obj.updateDynamic("rawName")(rawName)
    __obj.asInstanceOf[IHostName]
  }
}

