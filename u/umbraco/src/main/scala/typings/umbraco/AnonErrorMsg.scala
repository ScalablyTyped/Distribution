package typings.umbraco

import typings.angular.mod.IHttpHeadersGetter
import typings.angular.mod.IHttpPromiseCallback
import typings.angular.mod.IRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorMsg[T] extends js.Object {
  var errorMsg: String = js.native
  @JSName("success")
  var success_Original: IHttpPromiseCallback[T] = js.native
  def success(data: T, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit = js.native
}

