package typings.vastClient.anon

import typings.vastClient.mod.VastAdExtension
import typings.vastClient.mod.VastSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<vast-client.vast-client.VastError, std.Exclude<keyof vast-client.vast-client.VastError, 'ERRORCODE'>> */
@js.native
trait PickVastErrorExcludekeyof extends js.Object {
  var ERRORMESSAGE: js.UndefOr[String] = js.native
  var extensions: js.UndefOr[js.Array[VastAdExtension]] = js.native
  var system: js.UndefOr[VastSystem | String | Null] = js.native
}

object PickVastErrorExcludekeyof {
  @scala.inline
  def apply(): PickVastErrorExcludekeyof = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickVastErrorExcludekeyof]
  }
  @scala.inline
  implicit class PickVastErrorExcludekeyofOps[Self <: PickVastErrorExcludekeyof] (val x: Self) extends AnyVal {
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

