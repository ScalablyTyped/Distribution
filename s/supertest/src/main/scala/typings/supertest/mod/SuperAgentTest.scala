package typings.supertest.mod

import typings.cookiejar.mod.CookieJar
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.eventsMod.EventEmitterOptions
import typings.node.streamMod.ReadableOptions
import typings.superagent.mod.Parser
import typings.superagent.mod.Plugin
import typings.superagent.mod.Serializer
import typings.supertest.supertestStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined supertest.supertest.SuperTest<supertest.supertest.Test> & std.Pick<supertest.supertest.Request, 'use' | 'on' | 'set' | 'query' | 'type' | 'accept' | 'auth' | 'withCredentials' | 'retry' | 'ok' | 'redirects' | 'timeout' | 'buffer' | 'serialize' | 'parse' | 'ca' | 'key' | 'pfx' | 'cert'> */
@js.native
trait SuperAgentTest extends js.Object {
  @JSName("accept")
  var accept_Original: js.Function1[/* type */ String, this.type] = js.native
  @JSName("auth")
  var auth_Original: js.Function2[/* user */ String, /* pass */ String, this.type] = js.native
  @JSName("buffer")
  var buffer_Original: js.Function0[this.type] = js.native
  @JSName("ca")
  var ca_Original: js.Function1[/* cert */ String, this.type] = js.native
  @JSName("cert")
  var cert_Original: js.Function1[/* cert */ String, this.type] = js.native
  var jar: CookieJar = js.native
  @JSName("key")
  var key_Original: js.Function1[/* cert */ String, this.type] = js.native
  @JSName("ok")
  var ok_Original: js.Function1[
    /* callback */ js.Function1[/* res */ typings.superagent.mod.Response, Boolean], 
    this.type
  ] = js.native
  @JSName("on")
  var on_Original: js.Function2[error, /* handler */ js.Function1[/* err */ js.Any, Unit], this.type] = js.native
  @JSName("parse")
  var parse_Original: js.Function1[/* parser */ Parser, this.type] = js.native
  @JSName("pfx")
  var pfx_Original: js.Function1[/* cert */ String, this.type] = js.native
  @JSName("query")
  var query_Original: js.Function1[/* val */ js.Object, this.type] = js.native
  @JSName("redirects")
  var redirects_Original: js.Function1[/* n */ Double, this.type] = js.native
  @JSName("retry")
  var retry_Original: js.Function0[this.type] = js.native
  @JSName("serialize")
  var serialize_Original: js.Function1[/* serializer */ Serializer, this.type] = js.native
  @JSName("set")
  var set_Original: js.Function1[/* field */ js.Object, this.type] = js.native
  @JSName("timeout")
  var timeout_Original: js.Function1[/* ms */ Double, this.type] = js.native
  @JSName("type")
  var type_Original: js.Function1[/* val */ String, this.type] = js.native
  @JSName("use")
  var use_Original: js.Function1[/* fn */ Plugin, this.type] = js.native
  @JSName("withCredentials")
  var withCredentials_Original: js.Function0[this.type] = js.native
  def accept(`type`: String): this.type = js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def attachCookies(req: Test): Unit = js.native
  def auth(user: String, pass: String): this.type = js.native
  def buffer(): this.type = js.native
  def ca(cert: String): this.type = js.native
  def cert(cert: String): this.type = js.native
  def checkout(url: String): Test = js.native
  def checkout(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def connect(url: String): Test = js.native
  def connect(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def copy(url: String): Test = js.native
  def copy(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def del(url: String): Test = js.native
  def del(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def delete(url: String): Test = js.native
  def delete(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  def eventNames(): js.Array[String | js.Symbol] = js.native
  def get(url: String): Test = js.native
  def get(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def getMaxListeners(): Double = js.native
  def head(url: String): Test = js.native
  def head(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def key(cert: String): this.type = js.native
  def listenerCount(`type`: String): Double = js.native
  def listenerCount(`type`: js.Symbol): Double = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def lock(url: String): Test = js.native
  def lock(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def merge(url: String): Test = js.native
  def merge(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def mkactivity(url: String): Test = js.native
  def mkactivity(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def mkcol(url: String): Test = js.native
  def mkcol(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def move(url: String): Test = js.native
  def move(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def notify(url: String): Test = js.native
  def notify(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def ok(callback: js.Function1[/* res */ typings.superagent.mod.Response, Boolean]): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_error(name: error, handler: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def options(url: String): Test = js.native
  def options(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def parse(parser: Parser): this.type = js.native
  def patch(url: String): Test = js.native
  def patch(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def pfx(cert: String): this.type = js.native
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  def post(url: String): Test = js.native
  def post(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  // Added in Node 6...
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def propfind(url: String): Test = js.native
  def propfind(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def proppatch(url: String): Test = js.native
  def proppatch(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def purge(url: String): Test = js.native
  def purge(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def put(url: String): Test = js.native
  def put(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def query(`val`: js.Object): this.type = js.native
  def rawListeners(event: String): js.Array[js.Function] = js.native
  def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  def redirects(n: Double): this.type = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def report(url: String): Test = js.native
  def report(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def retry(): this.type = js.native
  def saveCookies(res: typings.superagent.mod.Response): Unit = js.native
  def search(url: String): Test = js.native
  def search(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def serialize(serializer: Serializer): this.type = js.native
  def set(field: js.Object): this.type = js.native
  def setMaxListeners(n: Double): this.type = js.native
  def subscribe(url: String): Test = js.native
  def subscribe(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def timeout(ms: Double): this.type = js.native
  def trace(url: String): Test = js.native
  def trace(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def `type`(`val`: String): this.type = js.native
  def unlock(url: String): Test = js.native
  def unlock(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def unsubscribe(url: String): Test = js.native
  def unsubscribe(url: String, callback: typings.superagent.mod.CallbackHandler): Test = js.native
  def use(fn: Plugin): this.type = js.native
  def withCredentials(): this.type = js.native
}

