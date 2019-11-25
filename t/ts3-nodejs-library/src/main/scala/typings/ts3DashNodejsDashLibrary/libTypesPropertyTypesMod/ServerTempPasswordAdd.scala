package typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerTempPasswordAdd extends js.Object {
  /** description of the password */
  var desc: js.UndefOr[String] = js.undefined
  /** the duration the password is valid in seconds */
  var duration: Double
  /** the temporary password */
  var pw: String
  /** the channel to let the user join */
  var tcid: js.UndefOr[Double] = js.undefined
  /** the password to the channel */
  var tcpw: js.UndefOr[String] = js.undefined
}

object ServerTempPasswordAdd {
  @scala.inline
  def apply(duration: Double, pw: String, desc: String = null, tcid: Int | Double = null, tcpw: String = null): ServerTempPasswordAdd = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], pw = pw.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (tcid != null) __obj.updateDynamic("tcid")(tcid.asInstanceOf[js.Any])
    if (tcpw != null) __obj.updateDynamic("tcpw")(tcpw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerTempPasswordAdd]
  }
}

