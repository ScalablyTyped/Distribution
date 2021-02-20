package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.vsoNodeApi.galleryInterfacesMod.PublishedExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionRequestEvent extends StObject {
  
  /**
    * The extension which has been requested
    */
  var extension: PublishedExtension = js.native
  
  /**
    * Information about the host for which this extension is requested
    */
  var host: ExtensionHost = js.native
  
  /**
    * Name of the collection for which the extension was requested
    */
  var hostName: String = js.native
  
  /**
    * Gallery host url
    */
  var links: ExtensionRequestUrls = js.native
  
  /**
    * The extension request object
    */
  var request: ExtensionRequest = js.native
  
  /**
    * The type of update that was made
    */
  var updateType: ExtensionRequestUpdateType = js.native
}
object ExtensionRequestEvent {
  
  @scala.inline
  def apply(
    extension: PublishedExtension,
    host: ExtensionHost,
    hostName: String,
    links: ExtensionRequestUrls,
    request: ExtensionRequest,
    updateType: ExtensionRequestUpdateType
  ): ExtensionRequestEvent = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionRequestEvent]
  }
  
  @scala.inline
  implicit class ExtensionRequestEventMutableBuilder[Self <: ExtensionRequestEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: PublishedExtension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: ExtensionHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: ExtensionRequestUrls): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ExtensionRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateType(value: ExtensionRequestUpdateType): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
  }
}
