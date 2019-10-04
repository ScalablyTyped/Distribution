package typings.useDashGlobalDashHook.useDashGlobalDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-global-hook", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[S, A](React: ReactType, inititalState: S, actions: js.Object): js.Function2[
    /* stateFunc */ js.UndefOr[js.Function1[/* state */ S, _]], 
    /* actionsFunc */ js.UndefOr[js.Function1[/* state */ A, _]], 
    js.Tuple2[_, _]
  ] = js.native
  def default[S, A](React: ReactType, inititalState: S, actions: js.Object, initializers: InitializerFunction[S, A]): js.Function2[
    /* stateFunc */ js.UndefOr[js.Function1[/* state */ S, _]], 
    /* actionsFunc */ js.UndefOr[js.Function1[/* state */ A, _]], 
    js.Tuple2[_, _]
  ] = js.native
}

