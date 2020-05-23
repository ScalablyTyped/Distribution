package typings.umbraco.anon

import typings.angular.mod.IHttpHeadersGetter
import typings.angular.mod.IHttpPromiseCallback
import typings.angular.mod.IRequestConfig
import typings.umbraco.mod.resources.IResourcePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error[T] extends js.Object {
  @JSName("error")
  var error_Original: IHttpPromiseCallback[IResourcePromise] = js.native
  @JSName("success")
  var success_Original: IHttpPromiseCallback[T] = js.native
  def error(data: IResourcePromise, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit = js.native
  def success(data: T, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit = js.native
}

