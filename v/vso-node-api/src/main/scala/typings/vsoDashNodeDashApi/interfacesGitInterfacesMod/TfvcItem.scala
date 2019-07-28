package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
    val __obj = js.Dynamic.literal(_links = _links, changeDate = changeDate, contentMetadata = contentMetadata, deletionId = deletionId, hashValue = hashValue, isBranch = isBranch, isFolder = isFolder, isPendingChange = isPendingChange, isSymLink = isSymLink, path = path, size = size, url = url, version = version)
  
    __obj.asInstanceOf[TfvcItem]
  }
}

