package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemModel extends js.Object {
  var _links: js.Any
  var contentMetadata: FileContentMetadata
  var isFolder: scala.Boolean
  var isSymLink: scala.Boolean
  var path: java.lang.String
  var url: java.lang.String
}

object ItemModel {
  @scala.inline
  def apply(
    _links: js.Any,
    contentMetadata: FileContentMetadata,
    isFolder: scala.Boolean,
    isSymLink: scala.Boolean,
    path: java.lang.String,
    url: java.lang.String
  ): ItemModel = {
    val __obj = js.Dynamic.literal(_links = _links, contentMetadata = contentMetadata, isFolder = isFolder, isSymLink = isSymLink, path = path, url = url)
  
    __obj.asInstanceOf[ItemModel]
  }
}

