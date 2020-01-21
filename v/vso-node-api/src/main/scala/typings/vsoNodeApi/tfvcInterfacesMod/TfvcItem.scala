package typings.vsoNodeApi.tfvcInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcItem extends ItemModel {
  var changeDate: Date
  var deletionId: Double
  /**
    * MD5 hash as a base 64 string, applies to files only.
    */
  var hashValue: String
  var isBranch: Boolean
  var isPendingChange: Boolean
  /**
    * The size of the file, if applicable.
    */
  var size: Double
  var version: Double
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
}

