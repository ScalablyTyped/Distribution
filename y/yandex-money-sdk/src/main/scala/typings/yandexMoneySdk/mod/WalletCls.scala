package typings.yandexMoneySdk.mod

import typings.yandexMoneySdk.YandexMoneySDK.Wallet.AccountInfoResult
import typings.yandexMoneySdk.YandexMoneySDK.Wallet.IncomingTransferAcceptResult
import typings.yandexMoneySdk.YandexMoneySDK.Wallet.IncomingTransferRejectResult
import typings.yandexMoneySdk.YandexMoneySDK.Wallet.OperationDetailsResult
import typings.yandexMoneySdk.YandexMoneySDK.Wallet.OperationHistoryOptions
import typings.yandexMoneySdk.YandexMoneySDK.Wallet.OperationHistoryResult
import typings.yandexMoneySdk.YandexMoneySDK.Wallet.ProcessPaymentOptions
import typings.yandexMoneySdk.YandexMoneySDK.Wallet.ProcessPaymentResult
import typings.yandexMoneySdk.YandexMoneySDK.Wallet.RequestPaymentOptions
import typings.yandexMoneySdk.YandexMoneySDK.Wallet.RequestPaymentResult
import typings.yandexMoneySdk.YandexMoneySDK.Wallet.SendAuthenticatedRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-money-sdk", "Wallet")
@js.native
class WalletCls protected () extends Wallet {
  def this(accessToken: String) = this()
  /* CompleteClass */
  override def accountInfo(callback: ResponseCallback[AccountInfoResult]): Unit = js.native
  /* CompleteClass */
  override def incomingTransferAccept(
    operation_id: String,
    protectionCode: String,
    callback: ResponseCallback[IncomingTransferAcceptResult]
  ): Unit = js.native
  /* CompleteClass */
  override def incomingTransferReject(operation_id: String, callback: ResponseCallback[IncomingTransferRejectResult]): Unit = js.native
  /* CompleteClass */
  override def operationDetails(operation_id: String, callback: ResponseCallback[OperationDetailsResult]): Unit = js.native
  /* CompleteClass */
  override def operationHistory(options: OperationHistoryOptions, callback: ResponseCallback[OperationHistoryResult]): Unit = js.native
  /* CompleteClass */
  override def processPayment(options: ProcessPaymentOptions, callback: ResponseCallback[ProcessPaymentResult]): Unit = js.native
  /* CompleteClass */
  override def requestPayment(options: RequestPaymentOptions, callback: ResponseCallback[RequestPaymentResult]): Unit = js.native
  /* CompleteClass */
  override def sendAuthenticatedRequest(params: SendAuthenticatedRequestParams, callback: ResponseCallback[_]): Unit = js.native
}

