package typings
package umbracoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ErrorMsg[T] extends js.Object {
  var errorMsg: java.lang.String = js.native
  @JSName("success")
  var success_Original: angularLib.angularMod.angularNs.IHttpPromiseCallback[T] = js.native
  def success(
    data: T,
    status: scala.Double,
    headers: angularLib.angularMod.angularNs.IHttpHeadersGetter,
    config: angularLib.angularMod.angularNs.IRequestConfig
  ): scala.Unit = js.native
}

