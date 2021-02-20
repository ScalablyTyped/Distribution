package typings.vexdb

import typings.pQueue.optionsMod.DefaultAddOptions
import typings.pQueue.priorityQueueMod.default
import typings.vexdb.cacheMod.APIResponse
import typings.vexdb.responseObjectsMod.ResponseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("vexdb/out/methods/request", JSImport.Default)
  @js.native
  def default[T /* <: ResponseObject */](endpoint: js.Any, params: js.Any): js.Promise[APIResponse[T]] = js.native
  
  @JSImport("vexdb/out/methods/request", "queue")
  @js.native
  val queue: typings.pQueue.mod.default[default, DefaultAddOptions] = js.native
  
  @JSImport("vexdb/out/methods/request", "request")
  @js.native
  def request[T /* <: ResponseObject */](endpoint: js.Any): js.Promise[APIResponse[T]] = js.native
  @JSImport("vexdb/out/methods/request", "request")
  @js.native
  def request[T /* <: ResponseObject */](endpoint: js.Any, params: js.Object): js.Promise[APIResponse[T]] = js.native
  
  @JSImport("vexdb/out/methods/request", "requestSize")
  @js.native
  def requestSize[T /* <: ResponseObject */](endpoint: js.Any, params: js.Any): js.Promise[Double] = js.native
  
  @JSImport("vexdb/out/methods/request", "serialize")
  @js.native
  def serialize(params: js.Object): String = js.native
}
