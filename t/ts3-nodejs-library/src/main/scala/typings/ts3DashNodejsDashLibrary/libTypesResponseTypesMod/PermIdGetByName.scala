package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermIdGetByName extends js.Object {
  var permid: Double
  var permsid: String
}

object PermIdGetByName {
  @scala.inline
  def apply(permid: Double, permsid: String): PermIdGetByName = {
    val __obj = js.Dynamic.literal(permid = permid, permsid = permsid)
  
    __obj.asInstanceOf[PermIdGetByName]
  }
}

