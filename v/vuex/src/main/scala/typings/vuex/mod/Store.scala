package typings.vuex.mod

import typings.vue.optionsMod.WatchOptions
import typings.vuex.anon.Actions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vuex", "Store")
@js.native
class Store[S] protected () extends StObject {
  def this(options: StoreOptions[S]) = this()
  
  def commit(`type`: String): Unit = js.native
  def commit(`type`: String, payload: js.Any): Unit = js.native
  def commit(`type`: String, payload: js.Any, options: CommitOptions): Unit = js.native
  def commit(`type`: String, payload: Unit, options: CommitOptions): Unit = js.native
  def commit[P /* <: Payload */](payloadWithType: P): Unit = js.native
  def commit[P /* <: Payload */](payloadWithType: P, options: CommitOptions): Unit = js.native
  @JSName("commit")
  var commit_Original: Commit = js.native
  
  def dispatch(`type`: String): js.Promise[js.Any] = js.native
  def dispatch(`type`: String, payload: js.Any): js.Promise[js.Any] = js.native
  def dispatch(`type`: String, payload: js.Any, options: DispatchOptions): js.Promise[js.Any] = js.native
  def dispatch(`type`: String, payload: Unit, options: DispatchOptions): js.Promise[js.Any] = js.native
  def dispatch[P /* <: Payload */](payloadWithType: P): js.Promise[js.Any] = js.native
  def dispatch[P /* <: Payload */](payloadWithType: P, options: DispatchOptions): js.Promise[js.Any] = js.native
  @JSName("dispatch")
  var dispatch_Original: Dispatch = js.native
  
  val getters: js.Any = js.native
  
  def hasModule(path: String): Boolean = js.native
  def hasModule(path: js.Array[String]): Boolean = js.native
  
  def hotUpdate(options: Actions[S]): Unit = js.native
  
  def registerModule[T](path: String, module: Module[T, S]): Unit = js.native
  def registerModule[T](path: String, module: Module[T, S], options: ModuleOptions): Unit = js.native
  def registerModule[T](path: js.Array[String], module: Module[T, S]): Unit = js.native
  def registerModule[T](path: js.Array[String], module: Module[T, S], options: ModuleOptions): Unit = js.native
  
  def replaceState(state: S): Unit = js.native
  
  val state: S = js.native
  
  def subscribe[P /* <: MutationPayload */](fn: js.Function2[/* mutation */ P, /* state */ S, js.Any]): js.Function0[Unit] = js.native
  def subscribe[P /* <: MutationPayload */](fn: js.Function2[/* mutation */ P, /* state */ S, js.Any], options: SubscribeOptions): js.Function0[Unit] = js.native
  
  def subscribeAction[P /* <: ActionPayload */](fn: SubscribeActionOptions[P, S]): js.Function0[Unit] = js.native
  def subscribeAction[P /* <: ActionPayload */](fn: SubscribeActionOptions[P, S], options: SubscribeOptions): js.Function0[Unit] = js.native
  
  def unregisterModule(path: String): Unit = js.native
  def unregisterModule(path: js.Array[String]): Unit = js.native
  
  def watch[T](
    getter: js.Function2[/* state */ S, /* getters */ js.Any, T],
    cb: js.Function2[/* value */ T, /* oldValue */ T, Unit]
  ): js.Function0[Unit] = js.native
  def watch[T](
    getter: js.Function2[/* state */ S, /* getters */ js.Any, T],
    cb: js.Function2[/* value */ T, /* oldValue */ T, Unit],
    options: WatchOptions
  ): js.Function0[Unit] = js.native
}
