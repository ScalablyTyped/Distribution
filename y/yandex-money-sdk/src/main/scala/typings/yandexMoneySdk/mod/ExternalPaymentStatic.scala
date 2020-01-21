package typings.yandexMoneySdk.mod

import org.scalablytyped.runtime.Instantiable1
import typings.yandexMoneySdk.YandexMoneySDK.ExternalPayment.GetInstanceIdResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalPaymentStatic extends Instantiable1[/* instanceId */ String, ExternalPayment] {
  def getInstanceId(clientId: String, callback: ResponseCallback[GetInstanceIdResult]): Unit = js.native
}

