package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBackgroundTransferBase extends js.Object {
  var costPolicy: BackgroundTransferCostPolicy
  var group: java.lang.String
  var method: java.lang.String
  var proxyCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
  var serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
  def setRequestHeader(headerName: java.lang.String, headerValue: java.lang.String): scala.Unit
}

