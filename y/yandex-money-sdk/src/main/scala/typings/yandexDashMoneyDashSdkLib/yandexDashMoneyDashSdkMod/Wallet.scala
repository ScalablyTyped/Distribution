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

object Wallet {
  @scala.inline
  def apply(
    accountInfo: js.Function1[
      ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.AccountInfoResult], 
      scala.Unit
    ],
    incomingTransferAccept: js.Function3[
      java.lang.String, 
      java.lang.String, 
      ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.IncomingTransferAcceptResult], 
      scala.Unit
    ],
    incomingTransferReject: js.Function2[
      java.lang.String, 
      ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.IncomingTransferRejectResult], 
      scala.Unit
    ],
    operationDetails: js.Function2[
      java.lang.String, 
      ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.OperationDetailsResult], 
      scala.Unit
    ],
    operationHistory: js.Function2[
      yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.OperationHistoryOptions, 
      ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.OperationHistoryResult], 
      scala.Unit
    ],
    processPayment: js.Function2[
      yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.ProcessPaymentOptions, 
      ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.ProcessPaymentResult], 
      scala.Unit
    ],
    requestPayment: js.Function2[
      yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.RequestPaymentOptions, 
      ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.RequestPaymentResult], 
      scala.Unit
    ],
    sendAuthenticatedRequest: js.Function2[
      yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.SendAuthenticatedRequestParams, 
      ResponseCallback[_], 
      scala.Unit
    ]
  ): Wallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accountInfo")(accountInfo)
    __obj.updateDynamic("incomingTransferAccept")(incomingTransferAccept)
    __obj.updateDynamic("incomingTransferReject")(incomingTransferReject)
    __obj.updateDynamic("operationDetails")(operationDetails)
    __obj.updateDynamic("operationHistory")(operationHistory)
    __obj.updateDynamic("processPayment")(processPayment)
    __obj.updateDynamic("requestPayment")(requestPayment)
    __obj.updateDynamic("sendAuthenticatedRequest")(sendAuthenticatedRequest)
    __obj.asInstanceOf[Wallet]
  }
}

