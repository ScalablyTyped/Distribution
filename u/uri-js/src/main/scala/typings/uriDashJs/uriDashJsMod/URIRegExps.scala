package typings.uriDashJs.uriDashJsMod

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
    val __obj = js.Dynamic.literal(ESCAPE = ESCAPE, IPV4ADDRESS = IPV4ADDRESS, IPV6ADDRESS = IPV6ADDRESS, NOT_FRAGMENT = NOT_FRAGMENT, NOT_HOST = NOT_HOST, NOT_PATH = NOT_PATH, NOT_PATH_NOSCHEME = NOT_PATH_NOSCHEME, NOT_QUERY = NOT_QUERY, NOT_SCHEME = NOT_SCHEME, NOT_USERINFO = NOT_USERINFO, OTHER_CHARS = OTHER_CHARS, PCT_ENCODED = PCT_ENCODED, UNRESERVED = UNRESERVED)
  
    __obj.asInstanceOf[URIRegExps]
  }
}

