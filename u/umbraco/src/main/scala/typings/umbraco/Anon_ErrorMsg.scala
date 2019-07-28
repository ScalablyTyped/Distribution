package typings.umbraco

import typings.angular.angularMod.IHttpHeadersGetter
import typings.angular.angularMod.IHttpPromiseCallback
import typings.angular.angularMod.IRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ErrorMsg[T] extends js.Object {
  var errorMsg: String = js.native
  @JSName("success")
  var success_Original: IHttpPromiseCallback[T] = js.native
  def success(data: T, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit = js.native
}

