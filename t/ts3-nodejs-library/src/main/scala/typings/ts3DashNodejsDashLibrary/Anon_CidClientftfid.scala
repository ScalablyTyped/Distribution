package typings.ts3DashNodejsDashLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CidClientftfid extends js.Object {
  var cid: js.UndefOr[Double] = js.undefined
  var clientftfid: js.UndefOr[Double] = js.undefined
  var cpw: js.UndefOr[String] = js.undefined
  var name: String
  var seekpos: js.UndefOr[Double] = js.undefined
}

object Anon_CidClientftfid {
  @scala.inline
  def apply(
    name: String,
    cid: Int | Double = null,
    clientftfid: Int | Double = null,
    cpw: String = null,
    seekpos: Int | Double = null
  ): Anon_CidClientftfid = {
    val __obj = js.Dynamic.literal(name = name)
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (clientftfid != null) __obj.updateDynamic("clientftfid")(clientftfid.asInstanceOf[js.Any])
    if (cpw != null) __obj.updateDynamic("cpw")(cpw)
    if (seekpos != null) __obj.updateDynamic("seekpos")(seekpos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CidClientftfid]
  }
}

