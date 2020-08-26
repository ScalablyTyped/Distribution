package typings.vsoNodeApi.tfvcInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcShelvesetRef extends js.Object {
  var _links: js.Any = js.native
  var comment: String = js.native
  var commentTruncated: Boolean = js.native
  var createdDate: Date = js.native
  var id: String = js.native
  var name: String = js.native
  var owner: IdentityRef = js.native
  var url: String = js.native
}

object TfvcShelvesetRef {
  @scala.inline
  def apply(
    _links: js.Any,
    comment: String,
    commentTruncated: Boolean,
    createdDate: Date,
    id: String,
    name: String,
    owner: IdentityRef,
    url: String
  ): TfvcShelvesetRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcShelvesetRef]
  }
  @scala.inline
  implicit class TfvcShelvesetRefOps[Self <: TfvcShelvesetRef] (val x: Self) extends AnyVal {
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommentTruncated(value: Boolean): Self = this.set("commentTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedDate(value: Date): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: IdentityRef): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

