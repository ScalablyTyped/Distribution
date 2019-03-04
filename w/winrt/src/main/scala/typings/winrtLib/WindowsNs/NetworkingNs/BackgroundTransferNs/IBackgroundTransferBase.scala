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

object IBackgroundTransferBase {
  @scala.inline
  def apply(
    costPolicy: BackgroundTransferCostPolicy,
    group: java.lang.String,
    method: java.lang.String,
    proxyCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    setRequestHeader: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): IBackgroundTransferBase = {
    val __obj = js.Dynamic.literal(costPolicy = costPolicy, group = group, method = method, proxyCredential = proxyCredential, serverCredential = serverCredential, setRequestHeader = setRequestHeader)
  
    __obj.asInstanceOf[IBackgroundTransferBase]
  }
}

