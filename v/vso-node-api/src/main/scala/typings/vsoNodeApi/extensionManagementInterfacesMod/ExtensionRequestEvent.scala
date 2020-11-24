package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.vsoNodeApi.galleryInterfacesMod.PublishedExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionRequestEvent extends js.Object {
  
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
  implicit class ExtensionRequestEventOps[Self <: ExtensionRequestEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtension(value: PublishedExtension): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: ExtensionHost): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostName(value: String): Self = this.set("hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: ExtensionRequestUrls): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ExtensionRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateType(value: ExtensionRequestUpdateType): Self = this.set("updateType", value.asInstanceOf[js.Any])
  }
}
