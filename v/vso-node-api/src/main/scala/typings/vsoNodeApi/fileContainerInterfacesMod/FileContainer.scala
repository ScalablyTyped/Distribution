package typings.vsoNodeApi.fileContainerInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileContainer extends js.Object {
  
  /**
    * Uri of the artifact associated with the container.
    */
  var artifactUri: String = js.native
  
  /**
    * Download Url for the content of this item.
    */
  var contentLocation: String = js.native
  
  /**
    * Owner.
    */
  var createdBy: String = js.native
  
  /**
    * Creation date.
    */
  var dateCreated: Date = js.native
  
  /**
    * Description.
    */
  var description: String = js.native
  
  /**
    * Id.
    */
  var id: Double = js.native
  
  /**
    * Location of the item resource.
    */
  var itemLocation: String = js.native
  
  /**
    * ItemStore Locator for this container.
    */
  var locatorPath: String = js.native
  
  /**
    * Name.
    */
  var name: String = js.native
  
  /**
    * Options the container can have.
    */
  var options: ContainerOptions = js.native
  
  /**
    * Project Id.
    */
  var scopeIdentifier: String = js.native
  
  /**
    * Security token of the artifact associated with the container.
    */
  var securityToken: String = js.native
  
  /**
    * Identifier of the optional encryption key.
    */
  var signingKeyId: String = js.native
  
  /**
    * Total size of the files in bytes.
    */
  var size: Double = js.native
}
object FileContainer {
  
  @scala.inline
  def apply(
    artifactUri: String,
    contentLocation: String,
    createdBy: String,
    dateCreated: Date,
    description: String,
    id: Double,
    itemLocation: String,
    locatorPath: String,
    name: String,
    options: ContainerOptions,
    scopeIdentifier: String,
    securityToken: String,
    signingKeyId: String,
    size: Double
  ): FileContainer = {
    val __obj = js.Dynamic.literal(artifactUri = artifactUri.asInstanceOf[js.Any], contentLocation = contentLocation.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemLocation = itemLocation.asInstanceOf[js.Any], locatorPath = locatorPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any], securityToken = securityToken.asInstanceOf[js.Any], signingKeyId = signingKeyId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileContainer]
  }
  
  @scala.inline
  implicit class FileContainerOps[Self <: FileContainer] (val x: Self) extends AnyVal {
    
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
    def setArtifactUri(value: String): Self = this.set("artifactUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLocation(value: String): Self = this.set("contentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: String): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreated(value: Date): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemLocation(value: String): Self = this.set("itemLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocatorPath(value: String): Self = this.set("locatorPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ContainerOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeIdentifier(value: String): Self = this.set("scopeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityToken(value: String): Self = this.set("securityToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningKeyId(value: String): Self = this.set("signingKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
