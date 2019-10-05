package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTransferBase extends js.Object {
  var costPolicy: BackgroundTransferCostPolicy
  var group: String
  var method: String
  var proxyCredential: PasswordCredential
  var serverCredential: PasswordCredential
  def setRequestHeader(headerName: String, headerValue: String): Unit
}

object IBackgroundTransferBase {
  @scala.inline
  def apply(
    costPolicy: BackgroundTransferCostPolicy,
    group: String,
    method: String,
    proxyCredential: PasswordCredential,
    serverCredential: PasswordCredential,
    setRequestHeader: (String, String) => Unit
  ): IBackgroundTransferBase = {
    val __obj = js.Dynamic.literal(costPolicy = costPolicy, group = group, method = method, proxyCredential = proxyCredential, serverCredential = serverCredential, setRequestHeader = js.Any.fromFunction2(setRequestHeader))
  
    __obj.asInstanceOf[IBackgroundTransferBase]
  }
}

