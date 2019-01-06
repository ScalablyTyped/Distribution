package typings
package superagentLib.superagentMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends stdLib.Promise[Response] {
  def abort(): scala.Unit = js.native
  def accept(`type`: java.lang.String): this.type = js.native
  def attach(field: java.lang.String, file: superagentLib.MultipartValueSingle): this.type = js.native
  def attach(field: java.lang.String, file: superagentLib.MultipartValueSingle, options: java.lang.String): this.type = js.native
  def attach(
    field: java.lang.String,
    file: superagentLib.MultipartValueSingle,
    options: superagentLib.Anon_Filename
  ): this.type = js.native
  def auth(token: java.lang.String, options: superagentLib.Anon_TypeBearer): this.type = js.native
  def auth(user: java.lang.String, pass: java.lang.String): this.type = js.native
  def auth(user: java.lang.String, pass: java.lang.String, options: superagentLib.Anon_Type): this.type = js.native
  def buffer(): this.type = js.native
  def buffer(`val`: scala.Boolean): this.type = js.native
  def ca(cert: nodeLib.Buffer): this.type = js.native
  def cert(cert: java.lang.String): this.type = js.native
  def cert(cert: nodeLib.Buffer): this.type = js.native
  def clearTimeout(): this.type = js.native
  def end(): this.type = js.native
  def end(callback: superagentLib.CallbackHandler): this.type = js.native
  def field(fields: org.scalablytyped.runtime.StringDictionary[superagentLib.MultipartValue]): this.type = js.native
  def field(name: java.lang.String, `val`: superagentLib.MultipartValue): this.type = js.native
  def get(field: java.lang.String): java.lang.String = js.native
  def key(cert: java.lang.String): this.type = js.native
  def key(cert: nodeLib.Buffer): this.type = js.native
  def ok(callback: js.Function1[/* res */ Response, scala.Boolean]): this.type = js.native
  def on(name: java.lang.String, handler: js.Function1[/* event */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    name: superagentLib.superagentLibStrings.error,
    handler: js.Function1[/* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_progress(
    name: superagentLib.superagentLibStrings.progress,
    handler: js.Function1[/* event */ ProgressEvent, scala.Unit]
  ): this.type = js.native
  def parse(parser: superagentLib.Parser): this.type = js.native
  def part(): this.type = js.native
  def pfx(cert: java.lang.String): this.type = js.native
  def pfx(cert: nodeLib.Buffer): this.type = js.native
  def pfx(cert: superagentLib.Anon_Pfx): this.type = js.native
  def pipe(stream: nodeLib.NodeJSNs.WritableStream): nodeLib.streamMod.Writable = js.native
  def pipe(stream: nodeLib.NodeJSNs.WritableStream, options: js.Object): nodeLib.streamMod.Writable = js.native
  def query(`val`: java.lang.String): this.type = js.native
  def query(`val`: js.Object): this.type = js.native
  def redirects(n: scala.Double): this.type = js.native
  def responseType(`type`: java.lang.String): this.type = js.native
  def retry(): this.type = js.native
  def retry(count: scala.Double): this.type = js.native
  def retry(count: scala.Double, callback: superagentLib.CallbackHandler): this.type = js.native
  def send(): this.type = js.native
  def send(data: java.lang.String): this.type = js.native
  def send(data: js.Object): this.type = js.native
  def serialize(serializer: superagentLib.Serializer): this.type = js.native
  def set(field: java.lang.String, `val`: java.lang.String): this.type = js.native
  def set(field: js.Object): this.type = js.native
  @JSName("set")
  def set_Cookie(field: superagentLib.superagentLibStrings.Cookie, `val`: js.Array[java.lang.String]): this.type = js.native
  def timeout(ms: scala.Double): this.type = js.native
  def timeout(ms: superagentLib.Anon_Deadline): this.type = js.native
  def `type`(`val`: java.lang.String): this.type = js.native
  def unset(field: java.lang.String): this.type = js.native
  def use(fn: Plugin): this.type = js.native
  def withCredentials(): this.type = js.native
  def write(data: java.lang.String): this.type = js.native
  def write(data: java.lang.String, encoding: java.lang.String): this.type = js.native
  def write(data: nodeLib.Buffer): this.type = js.native
  def write(data: nodeLib.Buffer, encoding: java.lang.String): this.type = js.native
}

