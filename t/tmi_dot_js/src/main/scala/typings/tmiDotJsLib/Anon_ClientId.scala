package typings
package tmiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientId extends js.Object {
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ClientId {
  @scala.inline
  def apply(clientId: java.lang.String = null, debug: js.UndefOr[scala.Boolean] = js.undefined): Anon_ClientId = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[Anon_ClientId]
  }
}

