package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermGet extends js.Object {
  var permid: Double
  var permsid: String
  var permvalue: Double
}

object PermGet {
  @scala.inline
  def apply(permid: Double, permsid: String, permvalue: Double): PermGet = {
    val __obj = js.Dynamic.literal(permid = permid, permsid = permsid, permvalue = permvalue)
  
    __obj.asInstanceOf[PermGet]
  }
}

