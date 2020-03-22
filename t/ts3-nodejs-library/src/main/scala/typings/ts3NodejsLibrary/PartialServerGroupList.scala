package typings.ts3NodejsLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ServerGroupList> */
trait PartialServerGroupList extends js.Object {
  var iconid: js.UndefOr[Double] = js.undefined
  var n_member_addp: js.UndefOr[Double] = js.undefined
  var n_member_removep: js.UndefOr[Double] = js.undefined
  var n_modifyp: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namemode: js.UndefOr[Double] = js.undefined
  var savedb: js.UndefOr[Double] = js.undefined
  var sgid: js.UndefOr[Double] = js.undefined
  var sortid: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[Double] = js.undefined
}

object PartialServerGroupList {
  @scala.inline
  def apply(
    iconid: Int | Double = null,
    n_member_addp: Int | Double = null,
    n_member_removep: Int | Double = null,
    n_modifyp: Int | Double = null,
    name: String = null,
    namemode: Int | Double = null,
    savedb: Int | Double = null,
    sgid: Int | Double = null,
    sortid: Int | Double = null,
    `type`: Int | Double = null
  ): PartialServerGroupList = {
    val __obj = js.Dynamic.literal()
    if (iconid != null) __obj.updateDynamic("iconid")(iconid.asInstanceOf[js.Any])
    if (n_member_addp != null) __obj.updateDynamic("n_member_addp")(n_member_addp.asInstanceOf[js.Any])
    if (n_member_removep != null) __obj.updateDynamic("n_member_removep")(n_member_removep.asInstanceOf[js.Any])
    if (n_modifyp != null) __obj.updateDynamic("n_modifyp")(n_modifyp.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namemode != null) __obj.updateDynamic("namemode")(namemode.asInstanceOf[js.Any])
    if (savedb != null) __obj.updateDynamic("savedb")(savedb.asInstanceOf[js.Any])
    if (sgid != null) __obj.updateDynamic("sgid")(sgid.asInstanceOf[js.Any])
    if (sortid != null) __obj.updateDynamic("sortid")(sortid.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialServerGroupList]
  }
}

