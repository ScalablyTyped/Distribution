package typings.vsoNodeApi

import typings.std.Date
import typings.vsoNodeApi.anon.EnumValuesAny
import typings.vsoNodeApi.anon.EnumValuesCreated
import typings.vsoNodeApi.anon.EnumValuesNone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileContainerInterfacesMod {
  
  @js.native
  sealed trait ContainerItemStatus extends StObject
  @JSImport("vso-node-api/interfaces/FileContainerInterfaces", "ContainerItemStatus")
  @js.native
  object ContainerItemStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContainerItemStatus with Double] = js.native
    
    /**
      * Item is created.
      */
    @js.native
    sealed trait Created extends ContainerItemStatus
    /* 1 */ val Created: typings.vsoNodeApi.fileContainerInterfacesMod.ContainerItemStatus.Created with Double = js.native
    
    /**
      * Item is a file pending for upload.
      */
    @js.native
    sealed trait PendingUpload extends ContainerItemStatus
    /* 2 */ val PendingUpload: typings.vsoNodeApi.fileContainerInterfacesMod.ContainerItemStatus.PendingUpload with Double = js.native
  }
  
  @js.native
  sealed trait ContainerItemType extends StObject
  @JSImport("vso-node-api/interfaces/FileContainerInterfaces", "ContainerItemType")
  @js.native
  object ContainerItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContainerItemType with Double] = js.native
    
    /**
      * Any item type.
      */
    @js.native
    sealed trait Any extends ContainerItemType
    /* 0 */ val Any: typings.vsoNodeApi.fileContainerInterfacesMod.ContainerItemType.Any with Double = js.native
    
    /**
      * Item is a file which is stored in the file service.
      */
    @js.native
    sealed trait File extends ContainerItemType
    /* 2 */ val File: typings.vsoNodeApi.fileContainerInterfacesMod.ContainerItemType.File with Double = js.native
    
    /**
      * Item is a folder which can have child items.
      */
    @js.native
    sealed trait Folder extends ContainerItemType
    /* 1 */ val Folder: typings.vsoNodeApi.fileContainerInterfacesMod.ContainerItemType.Folder with Double = js.native
  }
  
  @js.native
  sealed trait ContainerOptions extends StObject
  @JSImport("vso-node-api/interfaces/FileContainerInterfaces", "ContainerOptions")
  @js.native
  object ContainerOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContainerOptions with Double] = js.native
    
    /**
      * No option.
      */
    @js.native
    sealed trait None extends ContainerOptions
    /* 0 */ val None: typings.vsoNodeApi.fileContainerInterfacesMod.ContainerOptions.None with Double = js.native
  }
  
  object TypeInfo {
    
    @JSImport("vso-node-api/interfaces/FileContainerInterfaces", "TypeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/FileContainerInterfaces", "TypeInfo.ContainerItemStatus")
    @js.native
    def ContainerItemStatus: EnumValuesCreated = js.native
    @scala.inline
    def ContainerItemStatus_=(x: EnumValuesCreated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContainerItemStatus")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/FileContainerInterfaces", "TypeInfo.ContainerItemType")
    @js.native
    def ContainerItemType: EnumValuesAny = js.native
    @scala.inline
    def ContainerItemType_=(x: EnumValuesAny): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContainerItemType")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/FileContainerInterfaces", "TypeInfo.ContainerOptions")
    @js.native
    def ContainerOptions: EnumValuesNone = js.native
    @scala.inline
    def ContainerOptions_=(x: EnumValuesNone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContainerOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/FileContainerInterfaces", "TypeInfo.FileContainer")
    @js.native
    def FileContainer: js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/FileContainerInterfaces", "TypeInfo.FileContainerItem")
    @js.native
    def FileContainerItem: js.Any = js.native
    @scala.inline
    def FileContainerItem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FileContainerItem")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def FileContainer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FileContainer")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FileContainer extends StObject {
    
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
    implicit class FileContainerMutableBuilder[Self <: FileContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtifactUri(value: String): Self = StObject.set(x, "artifactUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLocation(value: String): Self = StObject.set(x, "contentLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateCreated(value: Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemLocation(value: String): Self = StObject.set(x, "itemLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocatorPath(value: String): Self = StObject.set(x, "locatorPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: ContainerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeIdentifier(value: String): Self = StObject.set(x, "scopeIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityToken(value: String): Self = StObject.set(x, "securityToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningKeyId(value: String): Self = StObject.set(x, "signingKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileContainerItem extends StObject {
    
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
    implicit class FileContainerItemMutableBuilder[Self <: FileContainerItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerId(value: Double): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentId(value: js.Array[Double]): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentIdVarargs(value: Double*): Self = StObject.set(x, "contentId", js.Array(value :_*))
      
      @scala.inline
      def setContentLocation(value: String): Self = StObject.set(x, "contentLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateCreated(value: Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateLastModified(value: Date): Self = StObject.set(x, "dateLastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileEncoding(value: Double): Self = StObject.set(x, "fileEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileHash(value: js.Array[Double]): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileHashVarargs(value: Double*): Self = StObject.set(x, "fileHash", js.Array(value :_*))
      
      @scala.inline
      def setFileId(value: Double): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileLength(value: Double): Self = StObject.set(x, "fileLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileType(value: Double): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemLocation(value: String): Self = StObject.set(x, "itemLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemType(value: ContainerItemType): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedBy(value: String): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeIdentifier(value: String): Self = StObject.set(x, "scopeIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: ContainerItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicket(value: String): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
    }
  }
}
