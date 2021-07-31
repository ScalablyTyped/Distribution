package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Security.Credentials.PasswordCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTransferBase extends StObject {
  
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
    val __obj = js.Dynamic.literal(costPolicy = costPolicy.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], serverCredential = serverCredential.asInstanceOf[js.Any], setRequestHeader = js.Any.fromFunction2(setRequestHeader))
    __obj.asInstanceOf[IBackgroundTransferBase]
  }
  
  @scala.inline
  implicit class IBackgroundTransferBaseMutableBuilder[Self <: IBackgroundTransferBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCostPolicy(value: BackgroundTransferCostPolicy): Self = StObject.set(x, "costPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyCredential(value: PasswordCredential): Self = StObject.set(x, "proxyCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCredential(value: PasswordCredential): Self = StObject.set(x, "serverCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRequestHeader(value: (String, String) => Unit): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2(value))
  }
}
