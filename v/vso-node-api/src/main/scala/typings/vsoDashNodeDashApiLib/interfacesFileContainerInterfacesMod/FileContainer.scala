package typings
package vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileContainer extends js.Object {
  /**
    * Uri of the artifact associated with the container.
    */
  var artifactUri: java.lang.String
  /**
    * Download Url for the content of this item.
    */
  var contentLocation: java.lang.String
  /**
    * Owner.
    */
  var createdBy: java.lang.String
  /**
    * Creation date.
    */
  var dateCreated: stdLib.Date
  /**
    * Description.
    */
  var description: java.lang.String
  /**
    * Id.
    */
  var id: scala.Double
  /**
    * Location of the item resource.
    */
  var itemLocation: java.lang.String
  /**
    * ItemStore Locator for this container.
    */
  var locatorPath: java.lang.String
  /**
    * Name.
    */
  var name: java.lang.String
  /**
    * Options the container can have.
    */
  var options: ContainerOptions
  /**
    * Project Id.
    */
  var scopeIdentifier: java.lang.String
  /**
    * Security token of the artifact associated with the container.
    */
  var securityToken: java.lang.String
  /**
    * Identifier of the optional encryption key.
    */
  var signingKeyId: java.lang.String
  /**
    * Total size of the files in bytes.
    */
  var size: scala.Double
}

object FileContainer {
  @scala.inline
  def apply(
    artifactUri: java.lang.String,
    contentLocation: java.lang.String,
    createdBy: java.lang.String,
    dateCreated: stdLib.Date,
    description: java.lang.String,
    id: scala.Double,
    itemLocation: java.lang.String,
    locatorPath: java.lang.String,
    name: java.lang.String,
    options: ContainerOptions,
    scopeIdentifier: java.lang.String,
    securityToken: java.lang.String,
    signingKeyId: java.lang.String,
    size: scala.Double
  ): FileContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifactUri")(artifactUri)
    __obj.updateDynamic("contentLocation")(contentLocation)
    __obj.updateDynamic("createdBy")(createdBy)
    __obj.updateDynamic("dateCreated")(dateCreated)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("itemLocation")(itemLocation)
    __obj.updateDynamic("locatorPath")(locatorPath)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("scopeIdentifier")(scopeIdentifier)
    __obj.updateDynamic("securityToken")(securityToken)
    __obj.updateDynamic("signingKeyId")(signingKeyId)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[FileContainer]
  }
}

