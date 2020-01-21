package typings.ts3NodejsLibrary.responseTypesMod

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
    val __obj = js.Dynamic.literal(cgid = cgid.asInstanceOf[js.Any], iconid = iconid.asInstanceOf[js.Any], n_member_addp = n_member_addp.asInstanceOf[js.Any], n_member_removep = n_member_removep.asInstanceOf[js.Any], n_modifyp = n_modifyp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namemode = namemode.asInstanceOf[js.Any], savedb = savedb.asInstanceOf[js.Any], sortid = sortid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelGroupList]
  }
}

