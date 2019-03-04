package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Folder extends js.Object {
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var createdOn: stdLib.Date
  var description: java.lang.String
  var lastChangedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var lastChangedDate: stdLib.Date
  var path: java.lang.String
}

object Folder {
  @scala.inline
  def apply(
    createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    createdOn: stdLib.Date,
    description: java.lang.String,
    lastChangedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    lastChangedDate: stdLib.Date,
    path: java.lang.String
  ): Folder = {
    val __obj = js.Dynamic.literal(createdBy = createdBy, createdOn = createdOn, description = description, lastChangedBy = lastChangedBy, lastChangedDate = lastChangedDate, path = path)
  
    __obj.asInstanceOf[Folder]
  }
}

