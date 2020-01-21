package typings.vsoNodeApi.fileContainerInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileContainer extends js.Object {
  /**
    * Uri of the artifact associated with the container.
    */
  var artifactUri: String
  /**
    * Download Url for the content of this item.
    */
  var contentLocation: String
  /**
    * Owner.
    */
  var createdBy: String
  /**
    * Creation date.
    */
  var dateCreated: Date
  /**
    * Description.
    */
  var description: String
  /**
    * Id.
    */
  var id: Double
  /**
    * Location of the item resource.
    */
  var itemLocation: String
  /**
    * ItemStore Locator for this container.
    */
  var locatorPath: String
  /**
    * Name.
    */
  var name: String
  /**
    * Options the container can have.
    */
  var options: ContainerOptions
  /**
    * Project Id.
    */
  var scopeIdentifier: String
  /**
    * Security token of the artifact associated with the container.
    */
  var securityToken: String
  /**
    * Identifier of the optional encryption key.
    */
  var signingKeyId: String
  /**
    * Total size of the files in bytes.
    */
  var size: Double
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
}

