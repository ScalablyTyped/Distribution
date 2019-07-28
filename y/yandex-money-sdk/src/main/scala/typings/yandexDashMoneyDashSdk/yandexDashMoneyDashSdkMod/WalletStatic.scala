package typings.yandexDashMoneyDashSdk.yandexDashMoneyDashSdkMod

import org.scalablytyped.runtime.Instantiable1
import typings.yandexDashMoneyDashSdk.YandexMoneySDKNs.WalletNs.GetAccessTokenResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

