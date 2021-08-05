package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTransferOperation extends StObject {
  
  var costPolicy: BackgroundTransferCostPolicy
  
  def getResponseInformation(): ResponseInformation
  
  def getResultStreamAt(position: Double): IInputStream
  
  var group: String
  
  var guid: String
  
  var method: String
  
  var requestedUri: Uri
}
object IBackgroundTransferOperation {
  
  inline def apply(
    costPolicy: BackgroundTransferCostPolicy,
    getResponseInformation: () => ResponseInformation,
    getResultStreamAt: Double => IInputStream,
    group: String,
    guid: String,
    method: String,
    requestedUri: Uri
  ): IBackgroundTransferOperation = {
    val __obj = js.Dynamic.literal(costPolicy = costPolicy.asInstanceOf[js.Any], getResponseInformation = js.Any.fromFunction0(getResponseInformation), getResultStreamAt = js.Any.fromFunction1(getResultStreamAt), group = group.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], requestedUri = requestedUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTransferOperation]
  }
  
  extension [Self <: IBackgroundTransferOperation](x: Self) {
    
    inline def setCostPolicy(value: BackgroundTransferCostPolicy): Self = StObject.set(x, "costPolicy", value.asInstanceOf[js.Any])
    
    inline def setGetResponseInformation(value: () => ResponseInformation): Self = StObject.set(x, "getResponseInformation", js.Any.fromFunction0(value))
    
    inline def setGetResultStreamAt(value: Double => IInputStream): Self = StObject.set(x, "getResultStreamAt", js.Any.fromFunction1(value))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setRequestedUri(value: Uri): Self = StObject.set(x, "requestedUri", value.asInstanceOf[js.Any])
  }
}
