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

