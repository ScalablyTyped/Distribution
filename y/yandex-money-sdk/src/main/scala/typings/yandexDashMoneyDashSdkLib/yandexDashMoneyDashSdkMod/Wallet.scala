package typings
package yandexDashMoneyDashSdkLib.yandexDashMoneyDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wallet extends js.Object {
  def accountInfo(callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.AccountInfoResult]): scala.Unit
  def incomingTransferAccept(
    operation_id: java.lang.String,
    protectionCode: java.lang.String,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.IncomingTransferAcceptResult]
  ): scala.Unit
  def incomingTransferReject(
    operation_id: java.lang.String,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.IncomingTransferRejectResult]
  ): scala.Unit
  def operationDetails(
    operation_id: java.lang.String,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.OperationDetailsResult]
  ): scala.Unit
  def operationHistory(
    options: yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.OperationHistoryOptions,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.OperationHistoryResult]
  ): scala.Unit
  def processPayment(
    options: yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.ProcessPaymentOptions,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.ProcessPaymentResult]
  ): scala.Unit
  def requestPayment(
    options: yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.RequestPaymentOptions,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.RequestPaymentResult]
  ): scala.Unit
  def sendAuthenticatedRequest(
    params: yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.SendAuthenticatedRequestParams,
    callback: ResponseCallback[_]
  ): scala.Unit
}

@JSImport("yandex-money-sdk", "Wallet")
@js.native
class WalletCls protected () extends Wallet {
  def this(accessToken: java.lang.String) = this()
  /* CompleteClass */
  override def accountInfo(callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.AccountInfoResult]): scala.Unit = js.native
  /* CompleteClass */
  override def incomingTransferAccept(
    operation_id: java.lang.String,
    protectionCode: java.lang.String,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.IncomingTransferAcceptResult]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def incomingTransferReject(
    operation_id: java.lang.String,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.IncomingTransferRejectResult]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def operationDetails(
    operation_id: java.lang.String,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.OperationDetailsResult]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def operationHistory(
    options: yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.OperationHistoryOptions,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.OperationHistoryResult]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def processPayment(
    options: yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.ProcessPaymentOptions,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.ProcessPaymentResult]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def requestPayment(
    options: yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.RequestPaymentOptions,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.RequestPaymentResult]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def sendAuthenticatedRequest(
    params: yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.SendAuthenticatedRequestParams,
    callback: ResponseCallback[_]
  ): scala.Unit = js.native
}

object Wallet {
  @scala.inline
  def apply(
    accountInfo: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.AccountInfoResult] => scala.Unit,
    incomingTransferAccept: (java.lang.String, java.lang.String, ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.IncomingTransferAcceptResult]) => scala.Unit,
    incomingTransferReject: (java.lang.String, ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.IncomingTransferRejectResult]) => scala.Unit,
    operationDetails: (java.lang.String, ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.OperationDetailsResult]) => scala.Unit,
    operationHistory: (yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.OperationHistoryOptions, ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.OperationHistoryResult]) => scala.Unit,
    processPayment: (yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.ProcessPaymentOptions, ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.ProcessPaymentResult]) => scala.Unit,
    requestPayment: (yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.RequestPaymentOptions, ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.RequestPaymentResult]) => scala.Unit,
    sendAuthenticatedRequest: (yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.SendAuthenticatedRequestParams, ResponseCallback[_]) => scala.Unit
  ): Wallet = {
    val __obj = js.Dynamic.literal(accountInfo = js.Any.fromFunction1(accountInfo), incomingTransferAccept = js.Any.fromFunction3(incomingTransferAccept), incomingTransferReject = js.Any.fromFunction2(incomingTransferReject), operationDetails = js.Any.fromFunction2(operationDetails), operationHistory = js.Any.fromFunction2(operationHistory), processPayment = js.Any.fromFunction2(processPayment), requestPayment = js.Any.fromFunction2(requestPayment), sendAuthenticatedRequest = js.Any.fromFunction2(sendAuthenticatedRequest))
  
    __obj.asInstanceOf[Wallet]
  }
}

