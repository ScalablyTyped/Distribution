package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelGroupList extends js.Object {
  var cgid: Double
  var iconid: Double
  var n_member_addp: Double
  var n_member_removep: Double
  var n_modifyp: Double
  var name: String
  var namemode: Double
  var savedb: Double
  var sortid: Double
  var `type`: Double
}

object ChannelGroupList {
  @scala.inline
  def apply(
    cgid: Double,
    iconid: Double,
    n_member_addp: Double,
    n_member_removep: Double,
    n_modifyp: Double,
    name: String,
    namemode: Double,
    savedb: Double,
    sortid: Double,
    `type`: Double
  ): ChannelGroupList = {
    val __obj = js.Dynamic.literal(cgid = cgid, iconid = iconid, n_member_addp = n_member_addp, n_member_removep = n_member_removep, n_modifyp = n_modifyp, name = name, namemode = namemode, savedb = savedb, sortid = sortid)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChannelGroupList]
  }
}

