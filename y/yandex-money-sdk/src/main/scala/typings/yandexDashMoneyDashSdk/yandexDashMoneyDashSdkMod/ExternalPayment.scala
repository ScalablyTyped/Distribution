package typings.yandexDashMoneyDashSdk.yandexDashMoneyDashSdkMod

import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.ExternalPaymentNs.ProcessOptions
import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.ExternalPaymentNs.ProcessResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.ExternalPaymentNs.RequestOptions
import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.ExternalPaymentNs.RequestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalPayment extends js.Object {
  def process(options: ProcessOptions, callback: ResponseCallback[ProcessResult]): Unit
  def request(options: RequestOptions, callback: ResponseCallback[RequestResult]): Unit
}

@JSImport("yandex-money-sdk", "ExternalPayment")
@js.native
class ExternalPaymentCls protected () extends ExternalPayment {
  def this(instanceId: String) = this()
  /* CompleteClass */
  override def process(options: ProcessOptions, callback: ResponseCallback[ProcessResult]): Unit = js.native
  /* CompleteClass */
  override def request(options: RequestOptions, callback: ResponseCallback[RequestResult]): Unit = js.native
}

object ExternalPayment {
  @scala.inline
  def apply(
    process: (ProcessOptions, ResponseCallback[ProcessResult]) => Unit,
    request: (RequestOptions, ResponseCallback[RequestResult]) => Unit
  ): ExternalPayment = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction2(process), request = js.Any.fromFunction2(request))
  
    __obj.asInstanceOf[ExternalPayment]
  }
}

