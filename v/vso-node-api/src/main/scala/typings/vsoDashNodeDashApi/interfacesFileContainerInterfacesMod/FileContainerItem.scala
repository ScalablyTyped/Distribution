package typings.vsoDashNodeDashApi.interfacesFileContainerInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileContainerItem extends js.Object {
  /**
    * Container Id.
    */
  var containerId: Double
  var contentId: js.Array[Double]
  /**
    * Download Url for the content of this item.
    */
  var contentLocation: String
  /**
    * Creator.
    */
  var createdBy: String
  /**
    * Creation date.
    */
  var dateCreated: Date
  /**
    * Last modified date.
    */
  var dateLastModified: Date
  /**
    * Encoding of the file. Zero if not a file.
    */
  var fileEncoding: Double
  /**
    * Hash value of the file. Null if not a file.
    */
  var fileHash: js.Array[Double]
  /**
    * Id of the file content.
    */
  var fileId: Double
  /**
    * Length of the file. Zero if not of a file.
    */
  var fileLength: Double
  /**
    * Type of the file. Zero if not a file.
    */
  var fileType: Double
  /**
    * Location of the item resource.
    */
  var itemLocation: String
  /**
    * Type of the item: Folder, File or String.
    */
  var itemType: ContainerItemType
  /**
    * Modifier.
    */
  var lastModifiedBy: String
  /**
    * Unique path that identifies the item.
    */
  var path: String
  /**
    * Project Id.
    */
  var scopeIdentifier: String
  /**
    * Status of the item: Created or Pending Upload.
    */
  var status: ContainerItemStatus
  var ticket: String
}

object FileContainerItem {
  @scala.inline
  def apply(
    containerId: Double,
    contentId: js.Array[Double],
    contentLocation: String,
    createdBy: String,
    dateCreated: Date,
    dateLastModified: Date,
    fileEncoding: Double,
    fileHash: js.Array[Double],
    fileId: Double,
    fileLength: Double,
    fileType: Double,
    itemLocation: String,
    itemType: ContainerItemType,
    lastModifiedBy: String,
    path: String,
    scopeIdentifier: String,
    status: ContainerItemStatus,
    ticket: String
  ): FileContainerItem = {
    val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], contentId = contentId.asInstanceOf[js.Any], contentLocation = contentLocation.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateLastModified = dateLastModified.asInstanceOf[js.Any], fileEncoding = fileEncoding.asInstanceOf[js.Any], fileHash = fileHash.asInstanceOf[js.Any], fileId = fileId.asInstanceOf[js.Any], fileLength = fileLength.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], itemLocation = itemLocation.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileContainerItem]
  }
}

