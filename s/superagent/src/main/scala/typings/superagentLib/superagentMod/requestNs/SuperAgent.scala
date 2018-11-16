package typings
package superagentLib.superagentMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuperAgent[Req /* <: SuperAgentRequest */]
  extends nodeLib.streamMod.Stream {
  var jar: cookiejarLib.cookiejarMod.CookieJar = js.native
  def attachCookies(req: Req): scala.Unit = js.native
  def checkout(url: java.lang.String): Req = js.native
  def checkout(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def connect(url: java.lang.String): Req = js.native
  def connect(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def copy(url: java.lang.String): Req = js.native
  def copy(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def del(url: java.lang.String): Req = js.native
  def del(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def delete(url: java.lang.String): Req = js.native
  def delete(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def get(url: java.lang.String): Req = js.native
  def get(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def head(url: java.lang.String): Req = js.native
  def head(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def lock(url: java.lang.String): Req = js.native
  def lock(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def merge(url: java.lang.String): Req = js.native
  def merge(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def mkactivity(url: java.lang.String): Req = js.native
  def mkactivity(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def mkcol(url: java.lang.String): Req = js.native
  def mkcol(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def move(url: java.lang.String): Req = js.native
  def move(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def notify(url: java.lang.String): Req = js.native
  def notify(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def options(url: java.lang.String): Req = js.native
  def options(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def patch(url: java.lang.String): Req = js.native
  def patch(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def post(url: java.lang.String): Req = js.native
  def post(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def propfind(url: java.lang.String): Req = js.native
  def propfind(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def proppatch(url: java.lang.String): Req = js.native
  def proppatch(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def purge(url: java.lang.String): Req = js.native
  def purge(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def put(url: java.lang.String): Req = js.native
  def put(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def report(url: java.lang.String): Req = js.native
  def report(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def saveCookies(res: Response): scala.Unit = js.native
  def search(url: java.lang.String): Req = js.native
  def search(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def subscribe(url: java.lang.String): Req = js.native
  def subscribe(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def trace(url: java.lang.String): Req = js.native
  def trace(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def unlock(url: java.lang.String): Req = js.native
  def unlock(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
  def unsubscribe(url: java.lang.String): Req = js.native
  def unsubscribe(url: java.lang.String, callback: superagentLib.CallbackHandler): Req = js.native
}

