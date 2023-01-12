package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestedExtension extends StObject {
  
  /**
    * The unique name of the extension
    */
  var extensionName: String
  
  /**
    * A list of each request for the extension
    */
  var extensionRequests: js.Array[ExtensionRequest]
  
  /**
    * DisplayName of the publisher that owns the extension being published.
    */
  var publisherDisplayName: String
  
  /**
    * Represents the Publisher of the requested extension
    */
  var publisherName: String
  
  /**
    * The total number of requests for an extension
    */
  var requestCount: Double
}
object RequestedExtension {
  
  inline def apply(
    extensionName: String,
    extensionRequests: js.Array[ExtensionRequest],
    publisherDisplayName: String,
    publisherName: String,
    requestCount: Double
  ): RequestedExtension = {
    val __obj = js.Dynamic.literal(extensionName = extensionName.asInstanceOf[js.Any], extensionRequests = extensionRequests.asInstanceOf[js.Any], publisherDisplayName = publisherDisplayName.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], requestCount = requestCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestedExtension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestedExtension] (val x: Self) extends AnyVal {
    
    inline def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    inline def setExtensionRequests(value: js.Array[ExtensionRequest]): Self = StObject.set(x, "extensionRequests", value.asInstanceOf[js.Any])
    
    inline def setExtensionRequestsVarargs(value: ExtensionRequest*): Self = StObject.set(x, "extensionRequests", js.Array(value*))
    
    inline def setPublisherDisplayName(value: String): Self = StObject.set(x, "publisherDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    inline def setRequestCount(value: Double): Self = StObject.set(x, "requestCount", value.asInstanceOf[js.Any])
  }
}
