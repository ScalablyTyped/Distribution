package typings.vexdb

import typings.pQueue.optionsMod.DefaultAddOptions
import typings.pQueue.priorityQueueMod.default
import typings.vexdb.cacheMod.APIResponse
import typings.vexdb.responseObjectsMod.ResponseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("vexdb/out/methods/request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T /* <: ResponseObject */](endpoint: js.Any, params: js.Any): js.Promise[APIResponse[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[T]]]
  
  @JSImport("vexdb/out/methods/request", "queue")
  @js.native
  val queue: typings.pQueue.mod.default[default, DefaultAddOptions] = js.native
  
  @scala.inline
  def request[T /* <: ResponseObject */](endpoint: js.Any): js.Promise[APIResponse[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(endpoint.asInstanceOf[js.Any]).asInstanceOf[js.Promise[APIResponse[T]]]
  @scala.inline
  def request[T /* <: ResponseObject */](endpoint: js.Any, params: js.Object): js.Promise[APIResponse[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[APIResponse[T]]]
  
  @scala.inline
  def requestSize[T /* <: ResponseObject */](endpoint: js.Any, params: js.Any): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestSize")(endpoint.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  @scala.inline
  def serialize(params: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(params.asInstanceOf[js.Any]).asInstanceOf[String]
}
