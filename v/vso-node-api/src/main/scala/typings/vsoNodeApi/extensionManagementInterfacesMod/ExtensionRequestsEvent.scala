package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.vsoNodeApi.galleryInterfacesMod.PublishedExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionRequestsEvent extends StObject {
  
  /**
    * The extension which has been requested
    */
  var extension: PublishedExtension = js.native
  
  /**
    * Information about the host for which this extension is requested
    */
  var host: ExtensionHost = js.native
  
  /**
    * Gallery host url
    */
  var links: ExtensionRequestUrls = js.native
  
  /**
    * The extension request object
    */
  var requests: js.Array[ExtensionRequest] = js.native
  
  /**
    * The type of update that was made
    */
  var updateType: ExtensionRequestUpdateType = js.native
}
object ExtensionRequestsEvent {
  
  @scala.inline
  def apply(
    extension: PublishedExtension,
    host: ExtensionHost,
    links: ExtensionRequestUrls,
    requests: js.Array[ExtensionRequest],
    updateType: ExtensionRequestUpdateType
  ): ExtensionRequestsEvent = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionRequestsEvent]
  }
  
  @scala.inline
  implicit class ExtensionRequestsEventMutableBuilder[Self <: ExtensionRequestsEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: PublishedExtension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: ExtensionHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: ExtensionRequestUrls): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequests(value: js.Array[ExtensionRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsVarargs(value: ExtensionRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
    
    @scala.inline
    def setUpdateType(value: ExtensionRequestUpdateType): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
  }
}
