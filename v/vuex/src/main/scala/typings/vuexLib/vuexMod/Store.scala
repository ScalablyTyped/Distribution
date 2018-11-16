package typings
package vuexLib.vuexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex", "Store")
@js.native
class Store[S] protected () extends js.Object {
  def this(options: StoreOptions[S]) = this()
  @JSName("commit")
  var commit_Original: Commit = js.native
  @JSName("dispatch")
  var dispatch_Original: Dispatch = js.native
  val getters: js.Any = js.native
  val state: S = js.native
  def commit(`type`: java.lang.String): scala.Unit = js.native
  def commit(`type`: java.lang.String, payload: js.Any): scala.Unit = js.native
  def commit(`type`: java.lang.String, payload: js.Any, options: CommitOptions): scala.Unit = js.native
  def commit[P /* <: Payload */](payloadWithType: P): scala.Unit = js.native
  def commit[P /* <: Payload */](payloadWithType: P, options: CommitOptions): scala.Unit = js.native
  def dispatch(`type`: java.lang.String): stdLib.Promise[_] = js.native
  def dispatch(`type`: java.lang.String, payload: js.Any): stdLib.Promise[_] = js.native
  def dispatch(`type`: java.lang.String, payload: js.Any, options: DispatchOptions): stdLib.Promise[_] = js.native
  def dispatch[P /* <: Payload */](payloadWithType: P): stdLib.Promise[_] = js.native
  def dispatch[P /* <: Payload */](payloadWithType: P, options: DispatchOptions): stdLib.Promise[_] = js.native
  def hotUpdate(options: vuexLib.Anon_Mutations[S]): scala.Unit = js.native
  def registerModule[T](path: java.lang.String, module: Module[T, S]): scala.Unit = js.native
  def registerModule[T](path: java.lang.String, module: Module[T, S], options: ModuleOptions): scala.Unit = js.native
  def registerModule[T](path: js.Array[java.lang.String], module: Module[T, S]): scala.Unit = js.native
  def registerModule[T](path: js.Array[java.lang.String], module: Module[T, S], options: ModuleOptions): scala.Unit = js.native
  def replaceState(state: S): scala.Unit = js.native
  def subscribe[P /* <: MutationPayload */](fn: js.Function2[/* mutation */ P, /* state */ S, _]): js.Function0[scala.Unit] = js.native
  def unregisterModule(path: java.lang.String): scala.Unit = js.native
  def unregisterModule(path: js.Array[java.lang.String]): scala.Unit = js.native
  def watch[T](
    getter: js.Function1[/* state */ S, T],
    cb: js.Function2[/* value */ T, /* oldValue */ T, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def watch[T](
    getter: js.Function1[/* state */ S, T],
    cb: js.Function2[/* value */ T, /* oldValue */ T, scala.Unit],
    options: vueLib.typesOptionsMod.WatchOptions
  ): js.Function0[scala.Unit] = js.native
}

