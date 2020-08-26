package typings.vexdb

import typings.pQueue.optionsMod.DefaultAddOptions
import typings.pQueue.priorityQueueMod.default
import typings.vexdb.cacheMod.APIResponse
import typings.vexdb.responseObjectsMod.ResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/request", JSImport.Namespace)
@js.native
object requestMod extends js.Object {
  val queue: typings.pQueue.mod.default[default, DefaultAddOptions] = js.native
  def default[T /* <: ResponseObject */](endpoint: js.Any, params: js.Any): js.Promise[APIResponse[T]] = js.native
  def request[T /* <: ResponseObject */](endpoint: js.Any): js.Promise[APIResponse[T]] = js.native
  def request[T /* <: ResponseObject */](endpoint: js.Any, params: js.Object): js.Promise[APIResponse[T]] = js.native
  def requestSize[T /* <: ResponseObject */](endpoint: js.Any, params: js.Any): js.Promise[Double] = js.native
  def serialize(params: js.Object): String = js.native
}

