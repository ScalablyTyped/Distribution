package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var bankAccount: java.lang.String
  var bankName: java.lang.String
  var companyAddress: java.lang.String
  var errMsg: java.lang.String
  var taxNumber: java.lang.String
  var telephone: java.lang.String
  var title: java.lang.String
  var `type`: wepyLib.wepyLibStrings.`0` | wepyLib.wepyLibStrings.`1`
}

object Anon_0 {
  @scala.inline
  def apply(
    bankAccount: java.lang.String,
    bankName: java.lang.String,
    companyAddress: java.lang.String,
    errMsg: java.lang.String,
    taxNumber: java.lang.String,
    telephone: java.lang.String,
    title: java.lang.String,
    `type`: wepyLib.wepyLibStrings.`0` | wepyLib.wepyLibStrings.`1`
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("bankAccount")(bankAccount)
    __obj.updateDynamic("bankName")(bankName)
    __obj.updateDynamic("companyAddress")(companyAddress)
    __obj.updateDynamic("errMsg")(errMsg)
    __obj.updateDynamic("taxNumber")(taxNumber)
    __obj.updateDynamic("telephone")(telephone)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_0]
  }
}

