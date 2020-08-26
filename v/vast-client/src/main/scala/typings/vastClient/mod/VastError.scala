package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastError extends js.Object {
  /**
    * Whenever an error occurs during the VAST parsing, the parser will call on its own all related tracking error URLs. Reported errors are:
    *      no_ad: The VAST document is empty
    *      VAST error 101: VAST schema validation error.
    *      VAST error 301: Timeout of VAST URI provided in Wrapper element.
    *      VAST error 302: Wrapper limit reached.
    *      VAST error 303: No VAST response after one or more Wrappers.
    */
  var ERRORCODE: String | Double = js.native
  var ERRORMESSAGE: js.UndefOr[String] = js.native
  var extensions: js.UndefOr[js.Array[VastAdExtension]] = js.native
  var system: js.UndefOr[VastSystem | String | Null] = js.native
}

object VastError {
  @scala.inline
  def apply(ERRORCODE: String | Double): VastError = {
    val __obj = js.Dynamic.literal(ERRORCODE = ERRORCODE.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastError]
  }
  @scala.inline
  implicit class VastErrorOps[Self <: VastError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setERRORCODE(value: String | Double): Self = this.set("ERRORCODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setERRORMESSAGE(value: String): Self = this.set("ERRORMESSAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteERRORMESSAGE: Self = this.set("ERRORMESSAGE", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: VastAdExtension*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[VastAdExtension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setSystem(value: VastSystem | String): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
    @scala.inline
    def setSystemNull: Self = this.set("system", null)
  }
  
}

