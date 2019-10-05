package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiOutboundSSO")
@js.native
object nlapiOutboundSSO extends js.Object {
  /**
    * Return a URL with a generated OAuth token.
    * @restriction Suitelets and Portlets only
    * @governance 20 units
    *
    * @param {string} ssoAppKey
    * @return {string}
    *
    * @since 2009.2
    * @param ssoAppKey
    * @return
    */
  def apply(ssoAppKey: String): String = js.native
}

