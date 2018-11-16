package typings
package typesafeDashActionsLib.distIsDashActionDashOfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/is-action-of", JSImport.Namespace)
@js.native
object distIsDashActionDashOfModMembers extends js.Object {
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */](actionCreator: AC[T1]): js.Function1[/* action */ A, /* is T1 */scala.Boolean] = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */](actionCreator: AC[T1], action: typesafeDashActionsLib.Anon_TypeString): /* is T1 */scala.Boolean = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */, T2 /* <: A */, T3 /* <: A */, T4 /* <: A */, T5 /* <: A */](actionCreators: ACs[T1, _ | T2, _ | T3, _ | T4, _ | T5]): js.Function1[/* action */ A, scala.Boolean] = js.native
  def isActionOf[A /* <: typesafeDashActionsLib.Anon_TypeString */, T1 /* <: A */, T2 /* <: A */, T3 /* <: A */, T4 /* <: A */, T5 /* <: A */](
    actionCreators: ACs[T1, _ | T2, _ | T3, _ | T4, _ | T5],
    action: typesafeDashActionsLib.Anon_TypeString
  ): scala.Boolean = js.native
}

