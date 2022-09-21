package typings.vuex.mod

import typings.vueRuntimeCore.mod.App
import typings.vueRuntimeCore.mod.InjectionKey
import typings.vueRuntimeCore.mod.WatchOptions
import typings.vuex.anon.Actions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vuex", "Store")
@js.native
open class Store[S] protected () extends StObject {
  def this(options: StoreOptions[S]) = this()
  
  def commit(`type`: String): Unit = js.native
  def commit(`type`: String, payload: Any): Unit = js.native
  def commit(`type`: String, payload: Any, options: CommitOptions): Unit = js.native
  def commit(`type`: String, payload: Unit, options: CommitOptions): Unit = js.native
  def commit[P /* <: Payload */](payloadWithType: P): Unit = js.native
  def commit[P /* <: Payload */](payloadWithType: P, options: CommitOptions): Unit = js.native
  @JSName("commit")
  var commit_Original: Commit = js.native
  
  def dispatch(`type`: String): js.Promise[Any] = js.native
  def dispatch(`type`: String, payload: Any): js.Promise[Any] = js.native
  def dispatch(`type`: String, payload: Any, options: DispatchOptions): js.Promise[Any] = js.native
  def dispatch(`type`: String, payload: Unit, options: DispatchOptions): js.Promise[Any] = js.native
  def dispatch[P /* <: Payload */](payloadWithType: P): js.Promise[Any] = js.native
  def dispatch[P /* <: Payload */](payloadWithType: P, options: DispatchOptions): js.Promise[Any] = js.native
  @JSName("dispatch")
  var dispatch_Original: Dispatch = js.native
  
  val getters: Any = js.native
  
  def hasModule(path: String): Boolean = js.native
  def hasModule(path: js.Array[String]): Boolean = js.native
  
  def hotUpdate(options: Actions[S]): Unit = js.native
  
  def install(app: App[Any]): Unit = js.native
  def install(app: App[Any], injectKey: String): Unit = js.native
  def install(app: App[Any], injectKey: InjectionKey[Store[Any]]): Unit = js.native
  
  def registerModule[T](path: String, module: Module[T, S]): Unit = js.native
  def registerModule[T](path: String, module: Module[T, S], options: ModuleOptions): Unit = js.native
  def registerModule[T](path: js.Array[String], module: Module[T, S]): Unit = js.native
  def registerModule[T](path: js.Array[String], module: Module[T, S], options: ModuleOptions): Unit = js.native
  
  def replaceState(state: S): Unit = js.native
  
  val state: S = js.native
  
  def subscribe[P /* <: MutationPayload */](fn: js.Function2[/* mutation */ P, /* state */ S, Any]): js.Function0[Unit] = js.native
  def subscribe[P /* <: MutationPayload */](fn: js.Function2[/* mutation */ P, /* state */ S, Any], options: SubscribeOptions): js.Function0[Unit] = js.native
  
  def subscribeAction[P /* <: ActionPayload */](fn: SubscribeActionOptions[P, S]): js.Function0[Unit] = js.native
  def subscribeAction[P /* <: ActionPayload */](fn: SubscribeActionOptions[P, S], options: SubscribeOptions): js.Function0[Unit] = js.native
  
  def unregisterModule(path: String): Unit = js.native
  def unregisterModule(path: js.Array[String]): Unit = js.native
  
  def watch[T](
    getter: js.Function2[/* state */ S, /* getters */ Any, T],
    cb: js.Function2[/* value */ T, /* oldValue */ T, Unit]
  ): js.Function0[Unit] = js.native
  def watch[T](
    getter: js.Function2[/* state */ S, /* getters */ Any, T],
    cb: js.Function2[/* value */ T, /* oldValue */ T, Unit],
    options: WatchOptions[Boolean]
  ): js.Function0[Unit] = js.native
}
