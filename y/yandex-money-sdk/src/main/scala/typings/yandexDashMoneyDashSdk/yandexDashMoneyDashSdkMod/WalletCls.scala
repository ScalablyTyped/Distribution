package typings.yandexDashMoneyDashSdk.yandexDashMoneyDashSdkMod

import typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.AccountInfoResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.IncomingTransferAcceptResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.IncomingTransferRejectResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.OperationDetailsResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.OperationHistoryOptions
import typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.OperationHistoryResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.ProcessPaymentOptions
import typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.ProcessPaymentResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.RequestPaymentOptions
import typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.RequestPaymentResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet.SendAuthenticatedRequestParams
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

