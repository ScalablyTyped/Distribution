package typings.ts3NodejsLibrary.anon

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
    iconid: js.UndefOr[Double] = js.undefined,
    n_member_addp: js.UndefOr[Double] = js.undefined,
    n_member_removep: js.UndefOr[Double] = js.undefined,
    n_modifyp: js.UndefOr[Double] = js.undefined,
    name: String = null,
    namemode: js.UndefOr[Double] = js.undefined,
    savedb: js.UndefOr[Double] = js.undefined,
    sgid: js.UndefOr[Double] = js.undefined,
    sortid: js.UndefOr[Double] = js.undefined,
    `type`: js.UndefOr[Double] = js.undefined
  ): PartialServerGroupList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(iconid)) __obj.updateDynamic("iconid")(iconid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(n_member_addp)) __obj.updateDynamic("n_member_addp")(n_member_addp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(n_member_removep)) __obj.updateDynamic("n_member_removep")(n_member_removep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(n_modifyp)) __obj.updateDynamic("n_modifyp")(n_modifyp.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(namemode)) __obj.updateDynamic("namemode")(namemode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(savedb)) __obj.updateDynamic("savedb")(savedb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sgid)) __obj.updateDynamic("sgid")(sgid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sortid)) __obj.updateDynamic("sortid")(sortid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialServerGroupList]
  }
}

