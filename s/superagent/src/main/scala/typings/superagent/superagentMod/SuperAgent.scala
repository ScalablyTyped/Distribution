package typings.superagent.superagentMod

import typings.cookiejar.cookiejarMod.CookieJar
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuperAgent[Req /* <: SuperAgentRequest */] extends Stream {
  var jar: CookieJar = js.native
  def attachCookies(req: Req): Unit = js.native
  def checkout(url: String): Req = js.native
  def checkout(url: String, callback: CallbackHandler): Req = js.native
  def connect(url: String): Req = js.native
  def connect(url: String, callback: CallbackHandler): Req = js.native
  def copy(url: String): Req = js.native
  def copy(url: String, callback: CallbackHandler): Req = js.native
  def del(url: String): Req = js.native
  def del(url: String, callback: CallbackHandler): Req = js.native
  def delete(url: String): Req = js.native
  def delete(url: String, callback: CallbackHandler): Req = js.native
  def get(url: String): Req = js.native
  def get(url: String, callback: CallbackHandler): Req = js.native
  def head(url: String): Req = js.native
  def head(url: String, callback: CallbackHandler): Req = js.native
  def lock(url: String): Req = js.native
  def lock(url: String, callback: CallbackHandler): Req = js.native
  def merge(url: String): Req = js.native
  def merge(url: String, callback: CallbackHandler): Req = js.native
  def mkactivity(url: String): Req = js.native
  def mkactivity(url: String, callback: CallbackHandler): Req = js.native
  def mkcol(url: String): Req = js.native
  def mkcol(url: String, callback: CallbackHandler): Req = js.native
  def move(url: String): Req = js.native
  def move(url: String, callback: CallbackHandler): Req = js.native
  def notify(url: String): Req = js.native
  def notify(url: String, callback: CallbackHandler): Req = js.native
  def options(url: String): Req = js.native
  def options(url: String, callback: CallbackHandler): Req = js.native
  def patch(url: String): Req = js.native
  def patch(url: String, callback: CallbackHandler): Req = js.native
  def post(url: String): Req = js.native
  def post(url: String, callback: CallbackHandler): Req = js.native
  def propfind(url: String): Req = js.native
  def propfind(url: String, callback: CallbackHandler): Req = js.native
  def proppatch(url: String): Req = js.native
  def proppatch(url: String, callback: CallbackHandler): Req = js.native
  def purge(url: String): Req = js.native
  def purge(url: String, callback: CallbackHandler): Req = js.native
  def put(url: String): Req = js.native
  def put(url: String, callback: CallbackHandler): Req = js.native
  def report(url: String): Req = js.native
  def report(url: String, callback: CallbackHandler): Req = js.native
  def saveCookies(res: Response): Unit = js.native
  def search(url: String): Req = js.native
  def search(url: String, callback: CallbackHandler): Req = js.native
  def subscribe(url: String): Req = js.native
  def subscribe(url: String, callback: CallbackHandler): Req = js.native
  def trace(url: String): Req = js.native
  def trace(url: String, callback: CallbackHandler): Req = js.native
  def unlock(url: String): Req = js.native
  def unlock(url: String, callback: CallbackHandler): Req = js.native
  def unsubscribe(url: String): Req = js.native
  def unsubscribe(url: String, callback: CallbackHandler): Req = js.native
}

