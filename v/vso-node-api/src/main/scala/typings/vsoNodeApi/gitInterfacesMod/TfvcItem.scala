package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcItem extends ItemModel {
  
  var changeDate: Date = js.native
  
  var deletionId: Double = js.native
  
  /**
    * MD5 hash as a base 64 string, applies to files only.
    */
  var hashValue: String = js.native
  
  var isBranch: Boolean = js.native
  
  var isPendingChange: Boolean = js.native
  
  /**
    * The size of the file, if applicable.
    */
  var size: Double = js.native
  
  var version: Double = js.native
}
object TfvcItem {
  
  @scala.inline
  def apply(
    _links: js.Any,
    changeDate: Date,
    contentMetadata: FileContentMetadata,
    deletionId: Double,
    hashValue: String,
    isBranch: Boolean,
    isFolder: Boolean,
    isPendingChange: Boolean,
    isSymLink: Boolean,
    path: String,
    size: Double,
    url: String,
    version: Double
  ): TfvcItem = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], changeDate = changeDate.asInstanceOf[js.Any], contentMetadata = contentMetadata.asInstanceOf[js.Any], deletionId = deletionId.asInstanceOf[js.Any], hashValue = hashValue.asInstanceOf[js.Any], isBranch = isBranch.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], isPendingChange = isPendingChange.asInstanceOf[js.Any], isSymLink = isSymLink.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcItem]
  }
  
  @scala.inline
  implicit class TfvcItemMutableBuilder[Self <: TfvcItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeDate(value: Date): Self = StObject.set(x, "changeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionId(value: Double): Self = StObject.set(x, "deletionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashValue(value: String): Self = StObject.set(x, "hashValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBranch(value: Boolean): Self = StObject.set(x, "isBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPendingChange(value: Boolean): Self = StObject.set(x, "isPendingChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
