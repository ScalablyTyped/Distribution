package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentDirectory extends StObject {
  
  /**
    * The directory path on the device.
    */
  val directoryURI: String
  
  /**
    * The opaque content directory identifier.
    */
  val id: ContentDirectoryId
  
  /**
    * The last modified date for a directory.
    */
  val modifiedDate: js.Date | Null
  
  /**
    * The type of device storage.
    *
    * @note _deprecated_ 5.5 Deprecated since 5.5.
    */
  val storageType: ContentDirectoryStorageType
  
  /**
    * The directory name.
    */
  val title: String
}
object ContentDirectory {
  
  inline def apply(
    directoryURI: String,
    id: ContentDirectoryId,
    storageType: ContentDirectoryStorageType,
    title: String
  ): ContentDirectory = {
    val __obj = js.Dynamic.literal(directoryURI = directoryURI.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], storageType = storageType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], modifiedDate = null)
    __obj.asInstanceOf[ContentDirectory]
  }
  
  extension [Self <: ContentDirectory](x: Self) {
    
    inline def setDirectoryURI(value: String): Self = StObject.set(x, "directoryURI", value.asInstanceOf[js.Any])
    
    inline def setId(value: ContentDirectoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setModifiedDate(value: js.Date): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateNull: Self = StObject.set(x, "modifiedDate", null)
    
    inline def setStorageType(value: ContentDirectoryStorageType): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
