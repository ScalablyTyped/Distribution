package typings
package vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcItem extends ItemModel {
  var changeDate: stdLib.Date
  var deletionId: scala.Double
  /**
    * MD5 hash as a base 64 string, applies to files only.
    */
  var hashValue: java.lang.String
  var isBranch: scala.Boolean
  var isPendingChange: scala.Boolean
  /**
    * The size of the file, if applicable.
    */
  var size: scala.Double
  var version: scala.Double
}

object TfvcItem {
  @scala.inline
  def apply(
    _links: js.Any,
    changeDate: stdLib.Date,
    contentMetadata: FileContentMetadata,
    deletionId: scala.Double,
    hashValue: java.lang.String,
    isBranch: scala.Boolean,
    isFolder: scala.Boolean,
    isPendingChange: scala.Boolean,
    isSymLink: scala.Boolean,
    path: java.lang.String,
    size: scala.Double,
    url: java.lang.String,
    version: scala.Double
  ): TfvcItem = {
    val __obj = js.Dynamic.literal(_links = _links, changeDate = changeDate, contentMetadata = contentMetadata, deletionId = deletionId, hashValue = hashValue, isBranch = isBranch, isFolder = isFolder, isPendingChange = isPendingChange, isSymLink = isSymLink, path = path, size = size, url = url, version = version)
  
    __obj.asInstanceOf[TfvcItem]
  }
}

