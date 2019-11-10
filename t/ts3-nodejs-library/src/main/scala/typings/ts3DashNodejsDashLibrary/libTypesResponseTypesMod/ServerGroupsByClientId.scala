package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerGroupsByClientId extends js.Object {
  var cldbid: Double
  var name: String
  var sgid: Double
}

object ServerGroupsByClientId {
  @scala.inline
  def apply(cldbid: Double, name: String, sgid: Double): ServerGroupsByClientId = {
    val __obj = js.Dynamic.literal(cldbid = cldbid, name = name, sgid = sgid)
  
    __obj.asInstanceOf[ServerGroupsByClientId]
  }
}

