package typings
package uriDashJsLib.uriDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URIRegExps extends js.Object {
  var ESCAPE: stdLib.RegExp
  var IPV4ADDRESS: stdLib.RegExp
  var IPV6ADDRESS: stdLib.RegExp
  var NOT_FRAGMENT: stdLib.RegExp
  var NOT_HOST: stdLib.RegExp
  var NOT_PATH: stdLib.RegExp
  var NOT_PATH_NOSCHEME: stdLib.RegExp
  var NOT_QUERY: stdLib.RegExp
  var NOT_SCHEME: stdLib.RegExp
  var NOT_USERINFO: stdLib.RegExp
  var OTHER_CHARS: stdLib.RegExp
  var PCT_ENCODED: stdLib.RegExp
  var UNRESERVED: stdLib.RegExp
}

object URIRegExps {
  @scala.inline
  def apply(
    ESCAPE: stdLib.RegExp,
    IPV4ADDRESS: stdLib.RegExp,
    IPV6ADDRESS: stdLib.RegExp,
    NOT_FRAGMENT: stdLib.RegExp,
    NOT_HOST: stdLib.RegExp,
    NOT_PATH: stdLib.RegExp,
    NOT_PATH_NOSCHEME: stdLib.RegExp,
    NOT_QUERY: stdLib.RegExp,
    NOT_SCHEME: stdLib.RegExp,
    NOT_USERINFO: stdLib.RegExp,
    OTHER_CHARS: stdLib.RegExp,
    PCT_ENCODED: stdLib.RegExp,
    UNRESERVED: stdLib.RegExp
  ): URIRegExps = {
    val __obj = js.Dynamic.literal(ESCAPE = ESCAPE, IPV4ADDRESS = IPV4ADDRESS, IPV6ADDRESS = IPV6ADDRESS, NOT_FRAGMENT = NOT_FRAGMENT, NOT_HOST = NOT_HOST, NOT_PATH = NOT_PATH, NOT_PATH_NOSCHEME = NOT_PATH_NOSCHEME, NOT_QUERY = NOT_QUERY, NOT_SCHEME = NOT_SCHEME, NOT_USERINFO = NOT_USERINFO, OTHER_CHARS = OTHER_CHARS, PCT_ENCODED = PCT_ENCODED, UNRESERVED = UNRESERVED)
  
    __obj.asInstanceOf[URIRegExps]
  }
}

