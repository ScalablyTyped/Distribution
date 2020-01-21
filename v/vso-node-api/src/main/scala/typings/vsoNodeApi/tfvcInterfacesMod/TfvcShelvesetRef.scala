package typings.vsoNodeApi.tfvcInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcShelvesetRef extends js.Object {
  var _links: js.Any
  var comment: String
  var commentTruncated: Boolean
  var createdDate: Date
  var id: String
  var name: String
  var owner: IdentityRef
  var url: String
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
}

