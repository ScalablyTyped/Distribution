package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseInvoiceTitleRes extends js.Object {
  /**
    * 银行账号
    */
  var bankAccount: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 银行名称
    */
  var bankName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 单位地址
    */
  var companyAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用结果
    */
  var errMsg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 抬头税号
    */
  var taxNumber: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 手机号码
    */
  var telephone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 抬头名称
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 抬头类型（0：单位，1：个人）
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ChooseInvoiceTitleRes {
  @scala.inline
  def apply(
    bankAccount: java.lang.String = null,
    bankName: java.lang.String = null,
    companyAddress: java.lang.String = null,
    errMsg: java.lang.String = null,
    taxNumber: java.lang.String = null,
    telephone: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
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

