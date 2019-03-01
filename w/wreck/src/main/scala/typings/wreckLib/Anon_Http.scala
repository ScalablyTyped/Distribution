package typings
package wreckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Http extends js.Object {
  var http: nodeLib.httpMod.Agent
  var https: nodeLib.httpMod.Agent
  var httpsAllowUnauthorized: nodeLib.httpMod.Agent
}

object Anon_Http {
  @scala.inline
  def apply(
    http: nodeLib.httpMod.Agent,
    https: nodeLib.httpMod.Agent,
    httpsAllowUnauthorized: nodeLib.httpMod.Agent
  ): Anon_Http = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("http")(http)
    __obj.updateDynamic("https")(https)
    __obj.updateDynamic("httpsAllowUnauthorized")(httpsAllowUnauthorized)
    __obj.asInstanceOf[Anon_Http]
  }
}

