package typings
package vsoDashNodeDashApiLib.interfacesFileContainerInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileContainerItem extends js.Object {
  /**
    * Container Id.
    */
  var containerId: scala.Double
  var contentId: js.Array[scala.Double]
  /**
    * Download Url for the content of this item.
    */
  var contentLocation: java.lang.String
  /**
    * Creator.
    */
  var createdBy: java.lang.String
  /**
    * Creation date.
    */
  var dateCreated: stdLib.Date
  /**
    * Last modified date.
    */
  var dateLastModified: stdLib.Date
  /**
    * Encoding of the file. Zero if not a file.
    */
  var fileEncoding: scala.Double
  /**
    * Hash value of the file. Null if not a file.
    */
  var fileHash: js.Array[scala.Double]
  /**
    * Id of the file content.
    */
  var fileId: scala.Double
  /**
    * Length of the file. Zero if not of a file.
    */
  var fileLength: scala.Double
  /**
    * Type of the file. Zero if not a file.
    */
  var fileType: scala.Double
  /**
    * Location of the item resource.
    */
  var itemLocation: java.lang.String
  /**
    * Type of the item: Folder, File or String.
    */
  var itemType: ContainerItemType
  /**
    * Modifier.
    */
  var lastModifiedBy: java.lang.String
  /**
    * Unique path that identifies the item.
    */
  var path: java.lang.String
  /**
    * Project Id.
    */
  var scopeIdentifier: java.lang.String
  /**
    * Status of the item: Created or Pending Upload.
    */
  var status: ContainerItemStatus
  var ticket: java.lang.String
}

object FileContainerItem {
  @scala.inline
  def apply(
    containerId: scala.Double,
    contentId: js.Array[scala.Double],
    contentLocation: java.lang.String,
    createdBy: java.lang.String,
    dateCreated: stdLib.Date,
    dateLastModified: stdLib.Date,
    fileEncoding: scala.Double,
    fileHash: js.Array[scala.Double],
    fileId: scala.Double,
    fileLength: scala.Double,
    fileType: scala.Double,
    itemLocation: java.lang.String,
    itemType: ContainerItemType,
    lastModifiedBy: java.lang.String,
    path: java.lang.String,
    scopeIdentifier: java.lang.String,
    status: ContainerItemStatus,
    ticket: java.lang.String
  ): FileContainerItem = {
    val __obj = js.Dynamic.literal(containerId = containerId, contentId = contentId, contentLocation = contentLocation, createdBy = createdBy, dateCreated = dateCreated, dateLastModified = dateLastModified, fileEncoding = fileEncoding, fileHash = fileHash, fileId = fileId, fileLength = fileLength, fileType = fileType, itemLocation = itemLocation, itemType = itemType, lastModifiedBy = lastModifiedBy, path = path, scopeIdentifier = scopeIdentifier, status = status, ticket = ticket)
  
    __obj.asInstanceOf[FileContainerItem]
  }
}

