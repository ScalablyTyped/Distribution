package typings.yandexDashMoneyDashSdk.yandexDashMoneyDashSdkMod

import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.WalletNs.AccountInfoResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.WalletNs.IncomingTransferAcceptResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.WalletNs.IncomingTransferRejectResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.WalletNs.OperationDetailsResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.WalletNs.OperationHistoryOptions
import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.WalletNs.OperationHistoryResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.WalletNs.ProcessPaymentOptions
import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.WalletNs.ProcessPaymentResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.WalletNs.RequestPaymentOptions
import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.WalletNs.RequestPaymentResult
import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.WalletNs.SendAuthenticatedRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wallet extends js.Object {
  def accountInfo(callback: ResponseCallback[AccountInfoResult]): Unit
  def incomingTransferAccept(
    operation_id: String,
    protectionCode: String,
    callback: ResponseCallback[IncomingTransferAcceptResult]
  ): Unit
  def incomingTransferReject(operation_id: String, callback: ResponseCallback[IncomingTransferRejectResult]): Unit
  def operationDetails(operation_id: String, callback: ResponseCallback[OperationDetailsResult]): Unit
  def operationHistory(options: OperationHistoryOptions, callback: ResponseCallback[OperationHistoryResult]): Unit
  def processPayment(options: ProcessPaymentOptions, callback: ResponseCallback[ProcessPaymentResult]): Unit
  def requestPayment(options: RequestPaymentOptions, callback: ResponseCallback[RequestPaymentResult]): Unit
  def sendAuthenticatedRequest(params: SendAuthenticatedRequestParams, callback: ResponseCallback[_]): Unit
}

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

object Wallet {
  @scala.inline
  def apply(
    accountInfo: ResponseCallback[AccountInfoResult] => Unit,
    incomingTransferAccept: (String, String, ResponseCallback[IncomingTransferAcceptResult]) => Unit,
    incomingTransferReject: (String, ResponseCallback[IncomingTransferRejectResult]) => Unit,
    operationDetails: (String, ResponseCallback[OperationDetailsResult]) => Unit,
    operationHistory: (OperationHistoryOptions, ResponseCallback[OperationHistoryResult]) => Unit,
    processPayment: (ProcessPaymentOptions, ResponseCallback[ProcessPaymentResult]) => Unit,
    requestPayment: (RequestPaymentOptions, ResponseCallback[RequestPaymentResult]) => Unit,
    sendAuthenticatedRequest: (SendAuthenticatedRequestParams, ResponseCallback[_]) => Unit
  ): Wallet = {
    val __obj = js.Dynamic.literal(accountInfo = js.Any.fromFunction1(accountInfo), incomingTransferAccept = js.Any.fromFunction3(incomingTransferAccept), incomingTransferReject = js.Any.fromFunction2(incomingTransferReject), operationDetails = js.Any.fromFunction2(operationDetails), operationHistory = js.Any.fromFunction2(operationHistory), processPayment = js.Any.fromFunction2(processPayment), requestPayment = js.Any.fromFunction2(requestPayment), sendAuthenticatedRequest = js.Any.fromFunction2(sendAuthenticatedRequest))
  
    __obj.asInstanceOf[Wallet]
  }
}

