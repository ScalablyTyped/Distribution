package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import typings.vsoNodeApi.interfacesGalleryInterfacesMod.PublishedExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionEvent extends StObject {
  
  /**
    * The extension which has been updated
    */
  var `extension`: PublishedExtension
  
  /**
    * The current version of the extension that was updated
    */
  var extensionVersion: String
  
  /**
    * Name of the collection for which the extension was requested
    */
  var host: ExtensionHost
  
  /**
    * Gallery host url
    */
  var links: ExtensionEventUrls
  
  /**
    * Represents the user who initiated the update
    */
  var modifiedBy: IdentityRef
  
  /**
    * The type of update that was made
    */
  var updateType: ExtensionUpdateType
}
object ExtensionEvent {
  
  inline def apply(
    `extension`: PublishedExtension,
    extensionVersion: String,
    host: ExtensionHost,
    links: ExtensionEventUrls,
    modifiedBy: IdentityRef,
    updateType: ExtensionUpdateType
  ): ExtensionEvent = {
    val __obj = js.Dynamic.literal(extensionVersion = extensionVersion.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], updateType = updateType.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEvent]
  }
  
  extension [Self <: ExtensionEvent](x: Self) {
    
    inline def setExtension(value: PublishedExtension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionVersion(value: String): Self = StObject.set(x, "extensionVersion", value.asInstanceOf[js.Any])
    
    inline def setHost(value: ExtensionHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: ExtensionEventUrls): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setModifiedBy(value: IdentityRef): Self = StObject.set(x, "modifiedBy", value.asInstanceOf[js.Any])
    
    inline def setUpdateType(value: ExtensionUpdateType): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
  }
}
