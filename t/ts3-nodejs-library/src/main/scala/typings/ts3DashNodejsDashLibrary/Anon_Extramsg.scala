package typings.ts3DashNodejsDashLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extramsg extends js.Object {
  var extra_msg: js.UndefOr[String] = js.undefined
  var failed_permid: js.UndefOr[Double] = js.undefined
  var id: Double
  var message: String
  var msg: String
}

object Anon_Extramsg {
  @scala.inline
  def apply(
    id: Double,
    message: String,
    msg: String,
    extra_msg: String = null,
    failed_permid: Int | Double = null
  ): Anon_Extramsg = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    if (extra_msg != null) __obj.updateDynamic("extra_msg")(extra_msg.asInstanceOf[js.Any])
    if (failed_permid != null) __obj.updateDynamic("failed_permid")(failed_permid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Extramsg]
  }
}

