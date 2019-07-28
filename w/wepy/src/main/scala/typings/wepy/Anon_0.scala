package typings.wepy

import typings.wepy.wepyStrings.`0`
import typings.wepy.wepyStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var bankAccount: String
  var bankName: String
  var companyAddress: String
  var errMsg: String
  var taxNumber: String
  var telephone: String
  var title: String
  var `type`: `0` | `1`
}

object Anon_0 {
  @scala.inline
  def apply(
    bankAccount: String,
    bankName: String,
    companyAddress: String,
    errMsg: String,
    taxNumber: String,
    telephone: String,
    title: String,
    `type`: `0` | `1`
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(bankAccount = bankAccount, bankName = bankName, companyAddress = companyAddress, errMsg = errMsg, taxNumber = taxNumber, telephone = telephone, title = title)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0]
  }
}

