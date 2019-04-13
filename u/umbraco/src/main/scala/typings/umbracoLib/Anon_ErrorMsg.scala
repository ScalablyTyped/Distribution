package typings
package umbracoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ErrorMsg[T] extends js.Object {
  var errorMsg: java.lang.String = js.native
  @JSName("success")
  var success_Original: angularLib.angularMod.IHttpPromiseCallback[T] = js.native
  def success(
    data: T,
    status: scala.Double,
    headers: angularLib.angularMod.IHttpHeadersGetter,
    config: angularLib.angularMod.IRequestConfig
  ): scala.Unit = js.native
}

