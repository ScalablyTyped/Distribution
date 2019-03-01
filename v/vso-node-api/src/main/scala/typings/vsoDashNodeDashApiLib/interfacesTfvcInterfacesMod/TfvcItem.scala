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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("changeDate")(changeDate)
    __obj.updateDynamic("contentMetadata")(contentMetadata)
    __obj.updateDynamic("deletionId")(deletionId)
    __obj.updateDynamic("hashValue")(hashValue)
    __obj.updateDynamic("isBranch")(isBranch)
    __obj.updateDynamic("isFolder")(isFolder)
    __obj.updateDynamic("isPendingChange")(isPendingChange)
    __obj.updateDynamic("isSymLink")(isSymLink)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[TfvcItem]
  }
}

