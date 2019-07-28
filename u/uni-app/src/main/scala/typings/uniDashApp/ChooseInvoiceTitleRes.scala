package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseInvoiceTitleRes extends js.Object {
  /**
    * 银行账号
    */
  var bankAccount: js.UndefOr[String] = js.undefined
  /**
    * 银行名称
    */
  var bankName: js.UndefOr[String] = js.undefined
  /**
    * 单位地址
    */
  var companyAddress: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  /**
    * 抬头税号
    */
  var taxNumber: js.UndefOr[String] = js.undefined
  /**
    * 手机号码
    */
  var telephone: js.UndefOr[String] = js.undefined
  /**
    * 抬头名称
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * 抬头类型（0：单位，1：个人）
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ChooseInvoiceTitleRes {
  @scala.inline
  def apply(
    bankAccount: String = null,
    bankName: String = null,
    companyAddress: String = null,
    errMsg: String = null,
    taxNumber: String = null,
    telephone: String = null,
    title: String = null,
    `type`: String = null
  ): ChooseInvoiceTitleRes = {
    val __obj = js.Dynamic.literal()
    if (bankAccount != null) __obj.updateDynamic("bankAccount")(bankAccount)
    if (bankName != null) __obj.updateDynamic("bankName")(bankName)
    if (companyAddress != null) __obj.updateDynamic("companyAddress")(companyAddress)
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg)
    if (taxNumber != null) __obj.updateDynamic("taxNumber")(taxNumber)
    if (telephone != null) __obj.updateDynamic("telephone")(telephone)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChooseInvoiceTitleRes]
  }
}

