package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(_links = _links, comment = comment, commentTruncated = commentTruncated, createdDate = createdDate, id = id, name = name, owner = owner, url = url)
  
    __obj.asInstanceOf[TfvcShelvesetRef]
  }
}

