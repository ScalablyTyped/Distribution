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

@JSImport("yandex-money-sdk", "ExternalPayment")
@js.native
class ExternalPaymentCls protected () extends ExternalPayment {
  def this(instanceId: java.lang.String) = this()
  /* CompleteClass */
  override def process(
    options: yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.ProcessOptions,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.ProcessResult]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def request(
    options: yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.RequestOptions,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.RequestResult]
  ): scala.Unit = js.native
}

object ExternalPayment {
  @scala.inline
  def apply(
    process: (yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.ProcessOptions, ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.ProcessResult]) => scala.Unit,
    request: (yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.RequestOptions, ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs.RequestResult]) => scala.Unit
  ): ExternalPayment = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction2(process), request = js.Any.fromFunction2(request))
  
    __obj.asInstanceOf[ExternalPayment]
  }
}

