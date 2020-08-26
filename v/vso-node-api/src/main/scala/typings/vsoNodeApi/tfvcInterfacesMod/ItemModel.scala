package typings.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemModel extends js.Object {
  var _links: js.Any = js.native
  var contentMetadata: FileContentMetadata = js.native
  var isFolder: Boolean = js.native
  var isSymLink: Boolean = js.native
  var path: String = js.native
  var url: String = js.native
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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], contentMetadata = contentMetadata.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], isSymLink = isSymLink.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemModel]
  }
  @scala.inline
  implicit class ItemModelOps[Self <: ItemModel] (val x: Self) extends AnyVal {
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentMetadata(value: FileContentMetadata): Self = this.set("contentMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFolder(value: Boolean): Self = this.set("isFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSymLink(value: Boolean): Self = this.set("isSymLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

