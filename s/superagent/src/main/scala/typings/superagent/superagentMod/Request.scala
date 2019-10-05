package typings.superagent.superagentMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Writable
import typings.std.Promise
import typings.superagent.Anon_Auto
import typings.superagent.Anon_Bearer
import typings.superagent.Anon_ContentType
import typings.superagent.Anon_Deadline
import typings.superagent.Anon_Passphrase
import typings.superagent.superagentStrings.Cookie
import typings.superagent.superagentStrings.error
import typings.superagent.superagentStrings.progress
import typings.superagent.superagentStrings.response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends Promise[Response] {
  def abort(): Unit = js.native
  def accept(`type`: String): this.type = js.native
  def attach(field: String, file: MultipartValueSingle): this.type = js.native
  def attach(field: String, file: MultipartValueSingle, options: String): this.type = js.native
  def attach(field: String, file: MultipartValueSingle, options: Anon_ContentType): this.type = js.native
  def auth(token: String, options: Anon_Bearer): this.type = js.native
  def auth(user: String, pass: String): this.type = js.native
  def auth(user: String, pass: String, options: Anon_Auto): this.type = js.native
  def buffer(): this.type = js.native
  def buffer(`val`: Boolean): this.type = js.native
  def ca(cert: String): this.type = js.native
  def ca(cert: js.Array[Buffer | String]): this.type = js.native
  def ca(cert: Buffer): this.type = js.native
  def cert(cert: String): this.type = js.native
  def cert(cert: js.Array[Buffer | String]): this.type = js.native
  def cert(cert: Buffer): this.type = js.native
  def clearTimeout(): this.type = js.native
  def end(): Unit = js.native
  def end(callback: CallbackHandler): Unit = js.native
  def field(fields: StringDictionary[MultipartValue]): this.type = js.native
  def field(name: String, `val`: MultipartValue): this.type = js.native
  def get(field: String): String = js.native
  def key(cert: String): this.type = js.native
  def key(cert: js.Array[Buffer | String]): this.type = js.native
  def key(cert: Buffer): this.type = js.native
  def maxResponseSize(size: Double): this.type = js.native
  def ok(callback: js.Function1[/* res */ Response, Boolean]): this.type = js.native
  def on(name: String, handler: js.Function1[/* event */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_error(name: error, handler: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_progress(name: progress, handler: js.Function1[/* event */ ProgressEvent, Unit]): this.type = js.native
  @JSName("on")
  def on_response(name: response, handler: js.Function1[/* response */ Response, Unit]): this.type = js.native
  def parse(parser: Parser): this.type = js.native
  def part(): this.type = js.native
  def pfx(cert: String): this.type = js.native
  def pfx(cert: js.Array[Buffer | String]): this.type = js.native
  def pfx(cert: Buffer): this.type = js.native
  def pfx(cert: Anon_Passphrase): this.type = js.native
  def pipe(stream: WritableStream): Writable = js.native
  def pipe(stream: WritableStream, options: js.Object): Writable = js.native
  def query(`val`: String): this.type = js.native
  def query(`val`: js.Object): this.type = js.native
  def redirects(n: Double): this.type = js.native
  def responseType(`type`: String): this.type = js.native
  def retry(): this.type = js.native
  def retry(count: Double): this.type = js.native
  def retry(count: Double, callback: CallbackHandler): this.type = js.native
  def send(): this.type = js.native
  def send(data: String): this.type = js.native
  def send(data: js.Object): this.type = js.native
  def serialize(serializer: Serializer): this.type = js.native
  def set(field: String, `val`: String): this.type = js.native
  def set(field: js.Object): this.type = js.native
  @JSName("set")
  def set_Cookie(field: Cookie, `val`: js.Array[String]): this.type = js.native
  def timeout(ms: Double): this.type = js.native
  def timeout(ms: Anon_Deadline): this.type = js.native
  def `type`(`val`: String): this.type = js.native
  def unset(field: String): this.type = js.native
  def use(fn: Plugin): this.type = js.native
  def withCredentials(): this.type = js.native
  def write(data: String): this.type = js.native
  def write(data: String, encoding: String): this.type = js.native
  def write(data: Buffer): this.type = js.native
  def write(data: Buffer, encoding: String): this.type = js.native
}

