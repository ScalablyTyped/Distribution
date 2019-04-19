package typings
package ts3DashNodejsDashLibraryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CidClientftfid extends js.Object {
  var cid: js.UndefOr[scala.Double] = js.undefined
  var clientftfid: js.UndefOr[scala.Double] = js.undefined
  var cpw: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var seekpos: js.UndefOr[scala.Double] = js.undefined
}

object Anon_CidClientftfid {
  @scala.inline
  def apply(
    name: java.lang.String,
    cid: scala.Int | scala.Double = null,
    clientftfid: scala.Int | scala.Double = null,
    cpw: java.lang.String = null,
    seekpos: scala.Int | scala.Double = null
  ): Anon_CidClientftfid = {
    val __obj = js.Dynamic.literal(name = name)
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (clientftfid != null) __obj.updateDynamic("clientftfid")(clientftfid.asInstanceOf[js.Any])
    if (cpw != null) __obj.updateDynamic("cpw")(cpw)
    if (seekpos != null) __obj.updateDynamic("seekpos")(seekpos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CidClientftfid]
  }
}

