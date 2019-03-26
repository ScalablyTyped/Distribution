package typings
package umbracoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Error[T] extends js.Object {
  @JSName("error")
  var error_Original: angularLib.angularMod.angularNs.IHttpPromiseCallback[umbracoLib.umbracoMod.resourcesNs.IResourcePromise] = js.native
  @JSName("success")
  var success_Original: angularLib.angularMod.angularNs.IHttpPromiseCallback[T] = js.native
  def error(
    data: umbracoLib.umbracoMod.resourcesNs.IResourcePromise,
    status: scala.Double,
    headers: angularLib.angularMod.angularNs.IHttpHeadersGetter,
    config: angularLib.angularMod.angularNs.IRequestConfig
  ): scala.Unit = js.native
  def success(
    data: T,
    status: scala.Double,
    headers: angularLib.angularMod.angularNs.IHttpHeadersGetter,
    config: angularLib.angularMod.angularNs.IRequestConfig
  ): scala.Unit = js.native
}

