package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerGroupList extends js.Object {
  var iconid: Double
  var n_member_addp: Double
  var n_member_removep: Double
  var n_modifyp: Double
  var name: String
  var namemode: Double
  var savedb: Double
  var sgid: Double
  var sortid: Double
  var `type`: Double
}

object ServerGroupList {
  @scala.inline
  def apply(
    iconid: Double,
    n_member_addp: Double,
    n_member_removep: Double,
    n_modifyp: Double,
    name: String,
    namemode: Double,
    savedb: Double,
    sgid: Double,
    sortid: Double,
    `type`: Double
  ): ServerGroupList = {
    val __obj = js.Dynamic.literal(iconid = iconid.asInstanceOf[js.Any], n_member_addp = n_member_addp.asInstanceOf[js.Any], n_member_removep = n_member_removep.asInstanceOf[js.Any], n_modifyp = n_modifyp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namemode = namemode.asInstanceOf[js.Any], savedb = savedb.asInstanceOf[js.Any], sgid = sgid.asInstanceOf[js.Any], sortid = sortid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupList]
  }
}

