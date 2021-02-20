package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.vsoNodeApi.galleryInterfacesMod.PublishedExtension
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionEvent extends StObject {
  
  /**
    * The extension which has been updated
    */
  var extension: PublishedExtension = js.native
  
  /**
    * The current version of the extension that was updated
    */
  var extensionVersion: String = js.native
  
  /**
    * Name of the collection for which the extension was requested
    */
  var host: ExtensionHost = js.native
  
  /**
    * Gallery host url
    */
  var links: ExtensionEventUrls = js.native
  
  /**
    * Represents the user who initiated the update
    */
  var modifiedBy: IdentityRef = js.native
  
  /**
    * The type of update that was made
    */
  var updateType: ExtensionUpdateType = js.native
}
object ExtensionEvent {
  
  @scala.inline
  def apply(
    extension: PublishedExtension,
    extensionVersion: String,
    host: ExtensionHost,
    links: ExtensionEventUrls,
    modifiedBy: IdentityRef,
    updateType: ExtensionUpdateType
  ): ExtensionEvent = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], extensionVersion = extensionVersion.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEvent]
  }
  
  @scala.inline
  implicit class ExtensionEventMutableBuilder[Self <: ExtensionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: PublishedExtension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionVersion(value: String): Self = StObject.set(x, "extensionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: ExtensionHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: ExtensionEventUrls): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedBy(value: IdentityRef): Self = StObject.set(x, "modifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateType(value: ExtensionUpdateType): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
  }
}
