package typings
package yandexDashMoneyDashSdkLib.yandexDashMoneyDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalletStatic
  extends ScalablyTyped.runtime.Instantiable1[/* accessToken */ java.lang.String, Wallet] {
  def buildObtainTokenUrl(clientId: java.lang.String, redirectURI: java.lang.String, scope: js.Array[java.lang.String]): java.lang.String = js.native
  def getAccessToken(
    clientId: java.lang.String,
    code: java.lang.String,
    redirectURI: java.lang.String,
    clientSecret: java.lang.String,
    callback: ResponseCallback[yandexDashMoneyDashSdkLib.YandexMoneySDKNs.WalletNs.GetAccessTokenResult]
  ): scala.Unit = js.native
  def revokeToken(token: java.lang.String, revoke_all: js.Any, callback: ResponseCallback[_]): scala.Unit = js.native
}

