package typings.uriJs.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URIRegExps extends js.Object {
  var ESCAPE: RegExp = js.native
  var IPV4ADDRESS: RegExp = js.native
  var IPV6ADDRESS: RegExp = js.native
  var NOT_FRAGMENT: RegExp = js.native
  var NOT_HOST: RegExp = js.native
  var NOT_PATH: RegExp = js.native
  var NOT_PATH_NOSCHEME: RegExp = js.native
  var NOT_QUERY: RegExp = js.native
  var NOT_SCHEME: RegExp = js.native
  var NOT_USERINFO: RegExp = js.native
  var OTHER_CHARS: RegExp = js.native
  var PCT_ENCODED: RegExp = js.native
  var UNRESERVED: RegExp = js.native
}

object URIRegExps {
  @scala.inline
  def apply(
    ESCAPE: RegExp,
    IPV4ADDRESS: RegExp,
    IPV6ADDRESS: RegExp,
    NOT_FRAGMENT: RegExp,
    NOT_HOST: RegExp,
    NOT_PATH: RegExp,
    NOT_PATH_NOSCHEME: RegExp,
    NOT_QUERY: RegExp,
    NOT_SCHEME: RegExp,
    NOT_USERINFO: RegExp,
    OTHER_CHARS: RegExp,
    PCT_ENCODED: RegExp,
    UNRESERVED: RegExp
  ): URIRegExps = {
    val __obj = js.Dynamic.literal(ESCAPE = ESCAPE.asInstanceOf[js.Any], IPV4ADDRESS = IPV4ADDRESS.asInstanceOf[js.Any], IPV6ADDRESS = IPV6ADDRESS.asInstanceOf[js.Any], NOT_FRAGMENT = NOT_FRAGMENT.asInstanceOf[js.Any], NOT_HOST = NOT_HOST.asInstanceOf[js.Any], NOT_PATH = NOT_PATH.asInstanceOf[js.Any], NOT_PATH_NOSCHEME = NOT_PATH_NOSCHEME.asInstanceOf[js.Any], NOT_QUERY = NOT_QUERY.asInstanceOf[js.Any], NOT_SCHEME = NOT_SCHEME.asInstanceOf[js.Any], NOT_USERINFO = NOT_USERINFO.asInstanceOf[js.Any], OTHER_CHARS = OTHER_CHARS.asInstanceOf[js.Any], PCT_ENCODED = PCT_ENCODED.asInstanceOf[js.Any], UNRESERVED = UNRESERVED.asInstanceOf[js.Any])
    __obj.asInstanceOf[URIRegExps]
  }
  @scala.inline
  implicit class URIRegExpsOps[Self <: URIRegExps] (val x: Self) extends AnyVal {
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
    def setESCAPE(value: RegExp): Self = this.set("ESCAPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setIPV4ADDRESS(value: RegExp): Self = this.set("IPV4ADDRESS", value.asInstanceOf[js.Any])
    @scala.inline
    def setIPV6ADDRESS(value: RegExp): Self = this.set("IPV6ADDRESS", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOT_FRAGMENT(value: RegExp): Self = this.set("NOT_FRAGMENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOT_HOST(value: RegExp): Self = this.set("NOT_HOST", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOT_PATH(value: RegExp): Self = this.set("NOT_PATH", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOT_PATH_NOSCHEME(value: RegExp): Self = this.set("NOT_PATH_NOSCHEME", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOT_QUERY(value: RegExp): Self = this.set("NOT_QUERY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOT_SCHEME(value: RegExp): Self = this.set("NOT_SCHEME", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOT_USERINFO(value: RegExp): Self = this.set("NOT_USERINFO", value.asInstanceOf[js.Any])
    @scala.inline
    def setOTHER_CHARS(value: RegExp): Self = this.set("OTHER_CHARS", value.asInstanceOf[js.Any])
    @scala.inline
    def setPCT_ENCODED(value: RegExp): Self = this.set("PCT_ENCODED", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNRESERVED(value: RegExp): Self = this.set("UNRESERVED", value.asInstanceOf[js.Any])
  }
  
}

