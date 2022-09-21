package typings.superagentRetryDelay

import org.scalablytyped.runtime.StringDictionary
import typings.cookiejar.mod.CookieJar
import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import typings.std.WritableStream
import typings.superagent.mod.MultipartValue
import typings.superagent.mod.MultipartValueSingle
import typings.superagent.mod.Plugin
import typings.superagent.mod.Request
import typings.superagent.mod.Response
import typings.superagent.mod.SuperAgentRequest
import typings.superagent.mod.SuperAgentStatic
import typings.superagentRetryDelay.superagentRetryDelayStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(request: SuperAgentStatic): EnhancedSuperAgentStatic = ^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any]).asInstanceOf[EnhancedSuperAgentStatic]
  
  @JSImport("superagent-retry-delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type BrowserParser = js.Function1[/* str */ String, Any]
  
  // these types should be exported by `superagent` but are not -------
  type CallbackHandler = js.Function2[/* err */ Any, /* res */ Response, Unit]
  
  @js.native
  trait EnhancedSuperAgent[Req /* <: EnhancedSuperAgentRequest */] extends Stream {
    
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
    
    var jar: CookieJar = js.native
    
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
  
  // ------------------------------------------------------------------
  /* Inlined std.Omit<superagent.superagent.SuperAgentRequest, 'retry'> & {retry (count : number | undefined, delay : number | undefined): superagent.superagent.SuperAgentRequest} */
  @js.native
  trait EnhancedSuperAgentRequest extends StObject {
    
    def abort(): Unit = js.native
    @JSName("abort")
    var abort_Original: js.Function0[Unit] = js.native
    
    def accept(`type`: String): this.type = js.native
    @JSName("accept")
    var accept_Original: js.Function1[/* type */ String, this.type] = js.native
    
    def agent(): this.type = js.native
    @JSName("agent")
    var agent_Original: js.Function0[this.type] = js.native
    
    def attach(field: String, file: MultipartValueSingle): this.type = js.native
    @JSName("attach")
    var attach_Original: js.Function2[/* field */ String, /* file */ MultipartValueSingle, this.type] = js.native
    
    def auth(user: String, pass: String): this.type = js.native
    @JSName("auth")
    var auth_Original: js.Function2[/* user */ String, /* pass */ String, this.type] = js.native
    
    def buffer(): this.type = js.native
    @JSName("buffer")
    var buffer_Original: js.Function0[this.type] = js.native
    
    def ca(cert: String): this.type = js.native
    @JSName("ca")
    var ca_Original: js.Function1[/* cert */ String, this.type] = js.native
    
    def `catch`[TResult](): js.Promise[Response | TResult] = js.native
    @JSName("catch")
    var catch_Original: js.Function0[js.Promise[Response | scala.Nothing]] = js.native
    
    def cert(cert: String): this.type = js.native
    @JSName("cert")
    var cert_Original: js.Function1[/* cert */ String, this.type] = js.native
    
    def clearTimeout(): this.type = js.native
    @JSName("clearTimeout")
    var clearTimeout_Original: js.Function0[this.type] = js.native
    
    var cookies: String = js.native
    
    def disableTLSCerts(): this.type = js.native
    @JSName("disableTLSCerts")
    var disableTLSCerts_Original: js.Function0[this.type] = js.native
    
    def end(): Unit = js.native
    @JSName("end")
    var end_Original: js.Function0[Unit] = js.native
    
    def field(name: String, `val`: MultipartValue): this.type = js.native
    @JSName("field")
    var field_Original: js.Function2[/* name */ String, /* val */ MultipartValue, this.type] = js.native
    
    def `finally`(): js.Promise[Response] = js.native
    @JSName("finally")
    var finally_Original: js.Function0[js.Promise[Response]] = js.native
    
    def get(field: String): String = js.native
    @JSName("get")
    var get_Original: js.Function1[/* field */ String, String] = js.native
    
    def http2(): this.type = js.native
    @JSName("http2")
    var http2_Original: js.Function0[this.type] = js.native
    
    def key(cert: String): this.type = js.native
    @JSName("key")
    var key_Original: js.Function1[/* cert */ String, this.type] = js.native
    
    def maxResponseSize(size: Double): this.type = js.native
    @JSName("maxResponseSize")
    var maxResponseSize_Original: js.Function1[/* size */ Double, this.type] = js.native
    
    var method: String = js.native
    
    def ok(callback: js.Function1[/* res */ Response, Boolean]): this.type = js.native
    @JSName("ok")
    var ok_Original: js.Function1[/* callback */ js.Function1[/* res */ Response, Boolean], this.type] = js.native
    
    @JSName("on")
    var on_Original: js.Function2[error, /* handler */ js.Function1[/* err */ Any, Unit], this.type] = js.native
    @JSName("on")
    def on_error(name: error, handler: js.Function1[/* err */ Any, Unit]): this.type = js.native
    
    def parse(parser: typings.superagent.mod.Parser): this.type = js.native
    @JSName("parse")
    var parse_Original: js.Function1[/* parser */ typings.superagent.mod.Parser, this.type] = js.native
    
    def part(): this.type = js.native
    @JSName("part")
    var part_Original: js.Function0[this.type] = js.native
    
    def pfx(cert: String): this.type = js.native
    @JSName("pfx")
    var pfx_Original: js.Function1[/* cert */ String, this.type] = js.native
    
    def pipe(stream: WritableStream[Any]): Writable = js.native
    @JSName("pipe")
    var pipe_Original: js.Function1[/* stream */ WritableStream[Any], Writable] = js.native
    
    def query(`val`: js.Object): this.type = js.native
    @JSName("query")
    var query_Original: js.Function1[/* val */ js.Object, this.type] = js.native
    
    def redirects(n: Double): this.type = js.native
    @JSName("redirects")
    var redirects_Original: js.Function1[/* n */ Double, this.type] = js.native
    
    def responseType(`type`: String): this.type = js.native
    @JSName("responseType")
    var responseType_Original: js.Function1[/* type */ String, this.type] = js.native
    
    def retry(): SuperAgentRequest = js.native
    def retry(count: Double): SuperAgentRequest = js.native
    def retry(count: Double, delay: Double): SuperAgentRequest = js.native
    def retry(count: Unit, delay: Double): SuperAgentRequest = js.native
    
    def send(): this.type = js.native
    @JSName("send")
    var send_Original: js.Function0[this.type] = js.native
    
    def serialize(serializer: typings.superagent.mod.Serializer): this.type = js.native
    @JSName("serialize")
    var serialize_Original: js.Function1[/* serializer */ typings.superagent.mod.Serializer, this.type] = js.native
    
    def set(field: js.Object): this.type = js.native
    @JSName("set")
    var set_Original: js.Function1[/* field */ js.Object, this.type] = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    @JSName("then")
    var then_Original: js.Function0[js.Promise[Response | scala.Nothing]] = js.native
    
    def timeout(ms: Double): this.type = js.native
    @JSName("timeout")
    var timeout_Original: js.Function1[/* ms */ Double, this.type] = js.native
    
    def trustLocalhost(): this.type = js.native
    @JSName("trustLocalhost")
    var trustLocalhost_Original: js.Function0[this.type] = js.native
    
    def `type`(`val`: String): this.type = js.native
    @JSName("type")
    var type_Original: js.Function1[/* val */ String, this.type] = js.native
    
    def unset(field: String): this.type = js.native
    @JSName("unset")
    var unset_Original: js.Function1[/* field */ String, this.type] = js.native
    
    var url: String = js.native
    
    def use(fn: Plugin): this.type = js.native
    @JSName("use")
    var use_Original: js.Function1[/* fn */ Plugin, this.type] = js.native
    
    def withCredentials(): this.type = js.native
    @JSName("withCredentials")
    var withCredentials_Original: js.Function0[this.type] = js.native
    
    def write(data: String): Boolean = js.native
    @JSName("write")
    var write_Original: js.Function1[/* data */ String, Boolean] = js.native
  }
  
  @js.native
  trait EnhancedSuperAgentStatic extends EnhancedSuperAgent[EnhancedSuperAgentRequest] {
    
    // tslint:disable-next-line:unified-signatures
    def apply(method: String, url: String): EnhancedSuperAgentRequest = js.native
    def apply(url: String): EnhancedSuperAgentRequest = js.native
    
    def agent(): this.type & Request = js.native
    
    var parse: StringDictionary[Parser] = js.native
    
    var serialize: StringDictionary[Serializer] = js.native
  }
  
  type NodeParser = js.Function2[
    /* res */ Response, 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* body */ Any, Unit], 
    Unit
  ]
  
  type Parser = BrowserParser | NodeParser
  
  type Serializer = js.Function1[/* obj */ Any, String]
}
