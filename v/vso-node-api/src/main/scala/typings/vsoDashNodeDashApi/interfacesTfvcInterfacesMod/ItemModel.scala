package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemModel extends js.Object {
  var _links: js.Any
  var contentMetadata: FileContentMetadata
  var isFolder: Boolean
  var isSymLink: Boolean
  var path: String
  var url: String
}

object ItemModel {
  @scala.inline
  def apply(
    _links: js.Any,
    contentMetadata: FileContentMetadata,
    isFolder: Boolean,
    isSymLink: Boolean,
    path: String,
    url: String
  ): ItemModel = {
    val __obj = js.Dynamic.literal(_links = _links, contentMetadata = contentMetadata, isFolder = isFolder, isSymLink = isSymLink, path = path, url = url)
  
    __obj.asInstanceOf[ItemModel]
  }
}

