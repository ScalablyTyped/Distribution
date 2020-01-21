package typings.uriJs.uriAllMinMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URIRegExps extends js.Object {
  var ESCAPE: RegExp
  var IPV4ADDRESS: RegExp
  var IPV6ADDRESS: RegExp
  var NOT_FRAGMENT: RegExp
  var NOT_HOST: RegExp
  var NOT_PATH: RegExp
  var NOT_PATH_NOSCHEME: RegExp
  var NOT_QUERY: RegExp
  var NOT_SCHEME: RegExp
  var NOT_USERINFO: RegExp
  var OTHER_CHARS: RegExp
  var PCT_ENCODED: RegExp
  var UNRESERVED: RegExp
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
}

