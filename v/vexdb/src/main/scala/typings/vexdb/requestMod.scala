package typings.vexdb

import typings.vexdb.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/request", JSImport.Namespace)
@js.native
object requestMod extends js.Object {
  def default(endpoint: js.Any, params: js.Any): js.Promise[Result] = js.native
  def request(endpoint: js.Any): js.Promise[_] = js.native
  def request(endpoint: js.Any, params: js.Object): js.Promise[_] = js.native
  def requestSize(endpoint: js.Any, params: js.Any): js.Promise[_] = js.native
  def serialize(params: js.Object): String = js.native
}

