package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import typings.vsoNodeApi.interfacesGalleryInterfacesMod.PublishedExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionRequestEvent extends StObject {
  
  /**
    * The extension which has been requested
    */
  var `extension`: PublishedExtension
  
  /**
    * Information about the host for which this extension is requested
    */
  var host: ExtensionHost
  
  /**
    * Name of the collection for which the extension was requested
    */
  var hostName: String
  
  /**
    * Gallery host url
    */
  var links: ExtensionRequestUrls
  
  /**
    * The extension request object
    */
  var request: ExtensionRequest
  
  /**
    * The type of update that was made
    */
  var updateType: ExtensionRequestUpdateType
}
object ExtensionRequestEvent {
  
  inline def apply(
    `extension`: PublishedExtension,
    host: ExtensionHost,
    hostName: String,
    links: ExtensionRequestUrls,
    request: ExtensionRequest,
    updateType: ExtensionRequestUpdateType
  ): ExtensionRequestEvent = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], updateType = updateType.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionRequestEvent]
  }
  
  extension [Self <: ExtensionRequestEvent](x: Self) {
    
    inline def setExtension(value: PublishedExtension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setHost(value: ExtensionHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: ExtensionRequestUrls): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ExtensionRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUpdateType(value: ExtensionRequestUpdateType): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
  }
}
