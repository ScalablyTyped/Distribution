package typings.ts3DashNodejsDashLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cid extends js.Object {
  var cid: js.UndefOr[Double] = js.undefined
  var clientftfid: js.UndefOr[js.Any] = js.undefined
  var cpw: js.UndefOr[String] = js.undefined
  var name: String
  var overwrite: js.UndefOr[Double] = js.undefined
  var resume: js.UndefOr[Double] = js.undefined
  var size: Double
}

object Anon_Cid {
  @scala.inline
  def apply(
    name: String,
    size: Double,
    cid: Int | Double = null,
    clientftfid: js.Any = null,
    cpw: String = null,
    overwrite: Int | Double = null,
    resume: Int | Double = null
  ): Anon_Cid = {
    val __obj = js.Dynamic.literal(name = name, size = size)
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (clientftfid != null) __obj.updateDynamic("clientftfid")(clientftfid)
    if (cpw != null) __obj.updateDynamic("cpw")(cpw)
    if (overwrite != null) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (resume != null) __obj.updateDynamic("resume")(resume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cid]
  }
}

