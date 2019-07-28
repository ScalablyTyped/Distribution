package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Folder extends js.Object {
  var createdBy: IdentityRef
  var createdOn: Date
  var description: String
  var lastChangedBy: IdentityRef
  var lastChangedDate: Date
  var path: String
}

object Folder {
  @scala.inline
  def apply(
    createdBy: IdentityRef,
    createdOn: Date,
    description: String,
    lastChangedBy: IdentityRef,
    lastChangedDate: Date,
    path: String
  ): Folder = {
    val __obj = js.Dynamic.literal(createdBy = createdBy, createdOn = createdOn, description = description, lastChangedBy = lastChangedBy, lastChangedDate = lastChangedDate, path = path)
  
    __obj.asInstanceOf[Folder]
  }
}

