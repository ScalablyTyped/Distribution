package typings
package vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcShelvesetRef extends js.Object {
  var _links: js.Any
  var comment: java.lang.String
  var commentTruncated: scala.Boolean
  var createdDate: stdLib.Date
  var id: java.lang.String
  var name: java.lang.String
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var url: java.lang.String
}

object TfvcShelvesetRef {
  @scala.inline
  def apply(
    _links: js.Any,
    comment: java.lang.String,
    commentTruncated: scala.Boolean,
    createdDate: stdLib.Date,
    id: java.lang.String,
    name: java.lang.String,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    url: java.lang.String
  ): TfvcShelvesetRef = {
    val __obj = js.Dynamic.literal(_links = _links, comment = comment, commentTruncated = commentTruncated, createdDate = createdDate, id = id, name = name, owner = owner, url = url)
  
    __obj.asInstanceOf[TfvcShelvesetRef]
  }
}

