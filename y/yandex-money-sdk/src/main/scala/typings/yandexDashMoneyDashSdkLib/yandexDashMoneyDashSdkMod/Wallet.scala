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

