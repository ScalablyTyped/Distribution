package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionList extends js.Object {
  var permdesc: String
  var permid: Double
  var permname: String
}

object PermissionList {
  @scala.inline
  def apply(permdesc: String, permid: Double, permname: String): PermissionList = {
    val __obj = js.Dynamic.literal(permdesc = permdesc, permid = permid, permname = permname)
  
    __obj.asInstanceOf[PermissionList]
  }
}

