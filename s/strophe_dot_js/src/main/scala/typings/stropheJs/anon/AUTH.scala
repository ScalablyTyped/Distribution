package typings.stropheJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AUTH extends js.Object {
  var AUTH: String = js.native
  var BIND: String = js.native
  var BOSH: String = js.native
  var CLIENT: String = js.native
  var DISCO_INFO: String = js.native
  var DISCO_ITEMS: String = js.native
  var FRAMING: String = js.native
  var HTTPBIND: String = js.native
  var MUC: String = js.native
  var PROFILE: String = js.native
  var ROSTER: String = js.native
  var SASL: String = js.native
  var SESSION: String = js.native
  var STANZAS: String = js.native
  var STREAM: String = js.native
  var VERSION: String = js.native
  var XHTML: String = js.native
  var XHTML_IM: String = js.native
}

object AUTH {
  @scala.inline
  def apply(
    AUTH: String,
    BIND: String,
    BOSH: String,
    CLIENT: String,
    DISCO_INFO: String,
    DISCO_ITEMS: String,
    FRAMING: String,
    HTTPBIND: String,
    MUC: String,
    PROFILE: String,
    ROSTER: String,
    SASL: String,
    SESSION: String,
    STANZAS: String,
    STREAM: String,
    VERSION: String,
    XHTML: String,
    XHTML_IM: String
  ): AUTH = {
    val __obj = js.Dynamic.literal(AUTH = AUTH.asInstanceOf[js.Any], BIND = BIND.asInstanceOf[js.Any], BOSH = BOSH.asInstanceOf[js.Any], CLIENT = CLIENT.asInstanceOf[js.Any], DISCO_INFO = DISCO_INFO.asInstanceOf[js.Any], DISCO_ITEMS = DISCO_ITEMS.asInstanceOf[js.Any], FRAMING = FRAMING.asInstanceOf[js.Any], HTTPBIND = HTTPBIND.asInstanceOf[js.Any], MUC = MUC.asInstanceOf[js.Any], PROFILE = PROFILE.asInstanceOf[js.Any], ROSTER = ROSTER.asInstanceOf[js.Any], SASL = SASL.asInstanceOf[js.Any], SESSION = SESSION.asInstanceOf[js.Any], STANZAS = STANZAS.asInstanceOf[js.Any], STREAM = STREAM.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any], XHTML = XHTML.asInstanceOf[js.Any], XHTML_IM = XHTML_IM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUTH]
  }
  @scala.inline
  implicit class AUTHOps[Self <: AUTH] (val x: Self) extends AnyVal {
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
    def setAUTH(value: String): Self = this.set("AUTH", value.asInstanceOf[js.Any])
    @scala.inline
    def setBIND(value: String): Self = this.set("BIND", value.asInstanceOf[js.Any])
    @scala.inline
    def setBOSH(value: String): Self = this.set("BOSH", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLIENT(value: String): Self = this.set("CLIENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setDISCO_INFO(value: String): Self = this.set("DISCO_INFO", value.asInstanceOf[js.Any])
    @scala.inline
    def setDISCO_ITEMS(value: String): Self = this.set("DISCO_ITEMS", value.asInstanceOf[js.Any])
    @scala.inline
    def setFRAMING(value: String): Self = this.set("FRAMING", value.asInstanceOf[js.Any])
    @scala.inline
    def setHTTPBIND(value: String): Self = this.set("HTTPBIND", value.asInstanceOf[js.Any])
    @scala.inline
    def setMUC(value: String): Self = this.set("MUC", value.asInstanceOf[js.Any])
    @scala.inline
    def setPROFILE(value: String): Self = this.set("PROFILE", value.asInstanceOf[js.Any])
    @scala.inline
    def setROSTER(value: String): Self = this.set("ROSTER", value.asInstanceOf[js.Any])
    @scala.inline
    def setSASL(value: String): Self = this.set("SASL", value.asInstanceOf[js.Any])
    @scala.inline
    def setSESSION(value: String): Self = this.set("SESSION", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTANZAS(value: String): Self = this.set("STANZAS", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTREAM(value: String): Self = this.set("STREAM", value.asInstanceOf[js.Any])
    @scala.inline
    def setVERSION(value: String): Self = this.set("VERSION", value.asInstanceOf[js.Any])
    @scala.inline
    def setXHTML(value: String): Self = this.set("XHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def setXHTML_IM(value: String): Self = this.set("XHTML_IM", value.asInstanceOf[js.Any])
  }
  
}

