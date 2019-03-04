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

object ExternalPayment {
  @scala.inline
  def apply(
    process: js.Function2[
      yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.ProcessOptions, 
      ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.ProcessResult], 
      scala.Unit
    ],
    request: js.Function2[
      yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.RequestOptions, 
      ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.RequestResult], 
      scala.Unit
    ]
  ): ExternalPayment = {
    val __obj = js.Dynamic.literal(process = process, request = request)
  
    __obj.asInstanceOf[ExternalPayment]
  }
}

