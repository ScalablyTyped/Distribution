package typings.typesafeDashActions

import typings.typesafeDashActions.distTypeDashHelpersMod.TypeMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/is-action-of", JSImport.Namespace)
@js.native
object distIsDashActionDashOfMod extends js.Object {
  def isActionOf[AC /* <: ActionCreator[Anon_TypeString] */](actionCreator: AC): js.Function1[/* action */ Anon_TypeString, /* is std.ReturnType<AC> */ Boolean] = js.native
  def isActionOf[AC /* <: ActionCreator[Anon_TypeString] */](actionCreator: AC, action: Anon_TypeString): /* is std.ReturnType<AC> */ Boolean = js.native
  def isActionOf[AC /* <: ActionCreator[Anon_TypeString] */](actionCreator: js.Array[AC]): js.Function1[/* action */ Anon_TypeString, /* is std.ReturnType<AC> */ Boolean] = js.native
  def isActionOf[AC /* <: ActionCreator[Anon_TypeString] */](actionCreator: js.Array[AC], action: Anon_TypeString): /* is std.ReturnType<AC> */ Boolean = js.native
  type ActionCreator[T /* <: Anon_TypeString */] = (js.Function1[/* repeated */ js.Any, T]) with (TypeMeta[
    /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any
  ])
}

