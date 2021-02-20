package typings.yandexMoneySdk

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.yandexMoneySdk.YandexMoneySDK.ExternalPayment.GetInstanceIdResult
import typings.yandexMoneySdk.YandexMoneySDK.ExternalPayment.ProcessOptions
import typings.yandexMoneySdk.YandexMoneySDK.ExternalPayment.ProcessResult
import typings.yandexMoneySdk.YandexMoneySDK.ExternalPayment.RequestOptions
import typings.yandexMoneySdk.YandexMoneySDK.ExternalPayment.RequestResult
import typings.yandexMoneySdk.YandexMoneySDK.Wallet.AccountInfoResult
import typings.yandexMoneySdk.YandexMoneySDK.Wallet.GetAccessTokenResult
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Config extends StObject {
    
    var MONEY_URL: String = js.native
    
    var SP_MONEY_URL: String = js.native
  }
  object Config {
    
    @JSImport("yandex-money-sdk", "Config")
    @js.native
    val ^ : Config = js.native
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMONEY_URL(value: String): Self = StObject.set(x, "MONEY_URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSP_MONEY_URL(value: String): Self = StObject.set(x, "SP_MONEY_URL", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExternalPayment extends StObject {
    
    def process(options: ProcessOptions, callback: ResponseCallback[ProcessResult]): Unit = js.native
    
    def request(options: RequestOptions, callback: ResponseCallback[RequestResult]): Unit = js.native
  }
  object ExternalPayment {
    
    @JSImport("yandex-money-sdk", "ExternalPayment")
    @js.native
    val ^ : ExternalPaymentStatic = js.native
    
    @scala.inline
    implicit class ExternalPaymentMutableBuilder[Self <: ExternalPayment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcess(value: (ProcessOptions, ResponseCallback[ProcessResult]) => Unit): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRequest(value: (RequestOptions, ResponseCallback[RequestResult]) => Unit): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("yandex-money-sdk", "ExternalPayment")
  @js.native
  class ExternalPaymentCls protected () extends ExternalPayment {
    def this(instanceId: String) = this()
  }
  
  @js.native
  trait Wallet extends StObject {
    
    def accountInfo(callback: ResponseCallback[AccountInfoResult]): Unit = js.native
    
    def incomingTransferAccept(
      operation_id: String,
      protectionCode: String,
      callback: ResponseCallback[IncomingTransferAcceptResult]
    ): Unit = js.native
    
    def incomingTransferReject(operation_id: String, callback: ResponseCallback[IncomingTransferRejectResult]): Unit = js.native
    
    def operationDetails(operation_id: String, callback: ResponseCallback[OperationDetailsResult]): Unit = js.native
    
    def operationHistory(options: OperationHistoryOptions, callback: ResponseCallback[OperationHistoryResult]): Unit = js.native
    
    def processPayment(options: ProcessPaymentOptions, callback: ResponseCallback[ProcessPaymentResult]): Unit = js.native
    
    def requestPayment(options: RequestPaymentOptions, callback: ResponseCallback[RequestPaymentResult]): Unit = js.native
    
    def sendAuthenticatedRequest(params: SendAuthenticatedRequestParams, callback: ResponseCallback[_]): Unit = js.native
  }
  object Wallet {
    
    @JSImport("yandex-money-sdk", "Wallet")
    @js.native
    val ^ : WalletStatic = js.native
    
    @scala.inline
    implicit class WalletMutableBuilder[Self <: Wallet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountInfo(value: ResponseCallback[AccountInfoResult] => Unit): Self = StObject.set(x, "accountInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncomingTransferAccept(value: (String, String, ResponseCallback[IncomingTransferAcceptResult]) => Unit): Self = StObject.set(x, "incomingTransferAccept", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIncomingTransferReject(value: (String, ResponseCallback[IncomingTransferRejectResult]) => Unit): Self = StObject.set(x, "incomingTransferReject", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOperationDetails(value: (String, ResponseCallback[OperationDetailsResult]) => Unit): Self = StObject.set(x, "operationDetails", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOperationHistory(value: (OperationHistoryOptions, ResponseCallback[OperationHistoryResult]) => Unit): Self = StObject.set(x, "operationHistory", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProcessPayment(value: (ProcessPaymentOptions, ResponseCallback[ProcessPaymentResult]) => Unit): Self = StObject.set(x, "processPayment", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRequestPayment(value: (RequestPaymentOptions, ResponseCallback[RequestPaymentResult]) => Unit): Self = StObject.set(x, "requestPayment", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSendAuthenticatedRequest(value: (SendAuthenticatedRequestParams, ResponseCallback[_]) => Unit): Self = StObject.set(x, "sendAuthenticatedRequest", js.Any.fromFunction2(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("yandex-money-sdk", "Wallet")
  @js.native
  class WalletCls protected () extends Wallet {
    def this(accessToken: String) = this()
  }
  
  @js.native
  trait ExternalPaymentStatic extends Instantiable1[/* instanceId */ String, ExternalPayment] {
    
    def getInstanceId(clientId: String, callback: ResponseCallback[GetInstanceIdResult]): Unit = js.native
  }
  
  type ResponseCallback[TBody] = js.Function3[/* err */ js.Any, /* body */ TBody, /* response */ IncomingMessage, js.Any]
  
  @js.native
  trait WalletStatic extends Instantiable1[/* accessToken */ String, Wallet] {
    
    def buildObtainTokenUrl(clientId: String, redirectURI: String, scope: js.Array[String]): String = js.native
    
    def getAccessToken(
      clientId: String,
      code: String,
      redirectURI: String,
      clientSecret: String,
      callback: ResponseCallback[GetAccessTokenResult]
    ): Unit = js.native
    
    def revokeToken(token: String, revoke_all: js.Any, callback: ResponseCallback[_]): Unit = js.native
  }
}
