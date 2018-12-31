package typings
package yandexDashMoneyDashSdkLib.yandexDashMoneyDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalPayment extends js.Object {
  def process(
    options: yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.ProcessOptions,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.ProcessResult]
  ): scala.Unit
  def request(
    options: yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.RequestOptions,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.RequestResult]
  ): scala.Unit
}

