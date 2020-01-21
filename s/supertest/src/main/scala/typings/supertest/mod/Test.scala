package typings.supertest.mod

import typings.std.RegExp
import typings.superagent.mod.SuperAgentRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Test extends SuperAgentRequest {
  var app: js.UndefOr[js.Any] = js.native
  def expect(body: String): this.type = js.native
  def expect(body: String, callback: CallbackHandler): this.type = js.native
  def expect(body: js.Object): this.type = js.native
  def expect(body: js.Object, callback: CallbackHandler): this.type = js.native
  def expect(body: RegExp): this.type = js.native
  def expect(body: RegExp, callback: CallbackHandler): this.type = js.native
  def expect(checker: js.Function1[/* res */ Response, _]): this.type = js.native
  def expect(checker: js.Function1[/* res */ Response, _], callback: CallbackHandler): this.type = js.native
  def expect(field: String, `val`: String): this.type = js.native
  def expect(field: String, `val`: String, callback: CallbackHandler): this.type = js.native
  def expect(field: String, `val`: RegExp): this.type = js.native
  def expect(field: String, `val`: RegExp, callback: CallbackHandler): this.type = js.native
  def expect(status: Double): this.type = js.native
  def expect(status: Double, body: js.Any): this.type = js.native
  def expect(status: Double, body: js.Any, callback: CallbackHandler): this.type = js.native
  def expect(status: Double, callback: CallbackHandler): this.type = js.native
  def serverAddress(app: js.Any, path: String): String = js.native
}

