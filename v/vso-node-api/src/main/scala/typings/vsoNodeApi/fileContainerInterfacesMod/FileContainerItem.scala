package typings.vsoNodeApi.fileContainerInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileContainerItem extends js.Object {
  
  /**
    * Container Id.
    */
  var containerId: Double = js.native
  
  var contentId: js.Array[Double] = js.native
  
  /**
    * Download Url for the content of this item.
    */
  var contentLocation: String = js.native
  
  /**
    * Creator.
    */
  var createdBy: String = js.native
  
  /**
    * Creation date.
    */
  var dateCreated: Date = js.native
  
  /**
    * Last modified date.
    */
  var dateLastModified: Date = js.native
  
  /**
    * Encoding of the file. Zero if not a file.
    */
  var fileEncoding: Double = js.native
  
  /**
    * Hash value of the file. Null if not a file.
    */
  var fileHash: js.Array[Double] = js.native
  
  /**
    * Id of the file content.
    */
  var fileId: Double = js.native
  
  /**
    * Length of the file. Zero if not of a file.
    */
  var fileLength: Double = js.native
  
  /**
    * Type of the file. Zero if not a file.
    */
  var fileType: Double = js.native
  
  /**
    * Location of the item resource.
    */
  var itemLocation: String = js.native
  
  /**
    * Type of the item: Folder, File or String.
    */
  var itemType: ContainerItemType = js.native
  
  /**
    * Modifier.
    */
  var lastModifiedBy: String = js.native
  
  /**
    * Unique path that identifies the item.
    */
  var path: String = js.native
  
  /**
    * Project Id.
    */
  var scopeIdentifier: String = js.native
  
  /**
    * Status of the item: Created or Pending Upload.
    */
  var status: ContainerItemStatus = js.native
  
  var ticket: String = js.native
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
  
  @scala.inline
  implicit class FileContainerItemOps[Self <: FileContainerItem] (val x: Self) extends AnyVal {
    
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
    def setContainerId(value: Double): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentIdVarargs(value: Double*): Self = this.set("contentId", js.Array(value :_*))
    
    @scala.inline
    def setContentId(value: js.Array[Double]): Self = this.set("contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLocation(value: String): Self = this.set("contentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: String): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreated(value: Date): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateLastModified(value: Date): Self = this.set("dateLastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileEncoding(value: Double): Self = this.set("fileEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileHashVarargs(value: Double*): Self = this.set("fileHash", js.Array(value :_*))
    
    @scala.inline
    def setFileHash(value: js.Array[Double]): Self = this.set("fileHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileId(value: Double): Self = this.set("fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileLength(value: Double): Self = this.set("fileLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileType(value: Double): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemLocation(value: String): Self = this.set("itemLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemType(value: ContainerItemType): Self = this.set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedBy(value: String): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeIdentifier(value: String): Self = this.set("scopeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ContainerItemStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicket(value: String): Self = this.set("ticket", value.asInstanceOf[js.Any])
  }
}
