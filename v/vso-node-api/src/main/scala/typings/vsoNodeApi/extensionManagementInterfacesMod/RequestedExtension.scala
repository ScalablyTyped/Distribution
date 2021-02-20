package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestedExtension extends StObject {
  
  /**
    * The unique name of the extension
    */
  var extensionName: String = js.native
  
  /**
    * A list of each request for the extension
    */
  var extensionRequests: js.Array[ExtensionRequest] = js.native
  
  /**
    * DisplayName of the publisher that owns the extension being published.
    */
  var publisherDisplayName: String = js.native
  
  /**
    * Represents the Publisher of the requested extension
    */
  var publisherName: String = js.native
  
  /**
    * The total number of requests for an extension
    */
  var requestCount: Double = js.native
}
object RequestedExtension {
  
  @scala.inline
  def apply(
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
  implicit class RequestedExtensionMutableBuilder[Self <: RequestedExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionRequests(value: js.Array[ExtensionRequest]): Self = StObject.set(x, "extensionRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionRequestsVarargs(value: ExtensionRequest*): Self = StObject.set(x, "extensionRequests", js.Array(value :_*))
    
    @scala.inline
    def setPublisherDisplayName(value: String): Self = StObject.set(x, "publisherDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCount(value: Double): Self = StObject.set(x, "requestCount", value.asInstanceOf[js.Any])
  }
}
