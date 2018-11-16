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

