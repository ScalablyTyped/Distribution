package typings.xummSdk

import typings.xummSdk.distSrcTypesMetaAnyJsonMod.AnyJson
import typings.xummSdk.distSrcTypesMetaApplicationDetailsMod.ApplicationDetails
import typings.xummSdk.distSrcTypesMetaCuratedAssetsResponseMod.CuratedAssetsResponse
import typings.xummSdk.distSrcTypesMetaNftokenDetailMod.NftokenDetail
import typings.xummSdk.distSrcTypesMetaRatesResponseMod.RatesResponse
import typings.xummSdk.distSrcTypesMetaUserTokensMod.UserTokenValidity
import typings.xummSdk.distSrcTypesMetaXrplTransactionMod.XrplTransaction
import typings.xummSdk.distSrcTypesXummApiMod.CreatePayload
import typings.xummSdk.mod.XummSdk
import typings.xummSdk.xummSdkStrings.IN_PROGRESS
import typings.xummSdk.xummSdkStrings.NONE
import typings.xummSdk.xummSdkStrings.REJECTED
import typings.xummSdk.xummSdkStrings.SUCCESSFUL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMetaMod {
  
  @JSImport("xumm-sdk/dist/src/Meta", "Meta")
  @js.native
  open class Meta protected () extends StObject {
    def this(apiKey: String, apiSecret: String) = this()
    
    def _inject(Invoker: XummSdk): Unit = js.native
    
    /* private */ var apiKey: Any = js.native
    
    /* private */ var apiSecret: Any = js.native
    
    /* private */ var authPromise: Any = js.native
    
    /* private */ var authPromiseResolve: Any = js.native
    
    /* private */ var authorize: Any = js.native
    
    def call[T](endpoint: String): js.Promise[T] | scala.Nothing = js.native
    def call[T](endpoint: String, httpMethod: String): js.Promise[T] | scala.Nothing = js.native
    def call[T](endpoint: String, httpMethod: String, data: AnyJson): js.Promise[T] | scala.Nothing = js.native
    def call[T](endpoint: String, httpMethod: String, data: CreatePayload): js.Promise[T] | scala.Nothing = js.native
    def call[T](endpoint: String, httpMethod: Unit, data: AnyJson): js.Promise[T] | scala.Nothing = js.native
    def call[T](endpoint: String, httpMethod: Unit, data: CreatePayload): js.Promise[T] | scala.Nothing = js.native
    
    var endpoint: String = js.native
    
    def getCuratedAssets(): js.Promise[CuratedAssetsResponse] = js.native
    
    def getKycStatus(userTokenOrAccount: String): js.Promise[
        /* keyof xumm-sdk.xumm-sdk/dist/src/types/Meta/KycStatusResponse.PossibleKycStatuses */ NONE | IN_PROGRESS | REJECTED | SUCCESSFUL
      ] = js.native
    
    def getNftokenDetail(tokenId: String): js.Promise[NftokenDetail] | scala.Nothing = js.native
    
    def getRates(currencyCode: String): js.Promise[RatesResponse] = js.native
    
    def getTransaction(txHash: String): js.Promise[XrplTransaction] = js.native
    
    /* private */ var injected: Any = js.native
    
    /* private */ var invoker: Any = js.native
    
    /* private */ var isBrowser: Any = js.native
    
    /* private */ var jwt: Any = js.native
    
    /* private */ var jwtFlow: Any = js.native
    
    def ping(): js.Promise[ApplicationDetails] = js.native
    
    def setEndpoint(endpoint: String): Boolean = js.native
    
    def verifyUserTokens(userTokens: js.Array[String]): js.Promise[js.Array[UserTokenValidity]] = js.native
  }
}
