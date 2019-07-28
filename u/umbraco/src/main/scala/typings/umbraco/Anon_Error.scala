package typings.umbraco

import typings.angular.angularMod.IHttpHeadersGetter
import typings.angular.angularMod.IHttpPromiseCallback
import typings.angular.angularMod.IRequestConfig
import typings.umbraco.umbracoMod.resourcesNs.IResourcePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Error[T] extends js.Object {
  @JSName("error")
  var error_Original: IHttpPromiseCallback[IResourcePromise] = js.native
  @JSName("success")
  var success_Original: IHttpPromiseCallback[T] = js.native
  def error(data: IResourcePromise, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit = js.native
  def success(data: T, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit = js.native
}

