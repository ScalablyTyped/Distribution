package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/is-of-type", JSImport.Namespace)
@js.native
object distIsDashOfDashTypeMod extends js.Object {
  def isOfType[T /* <: java.lang.String */](`type`: T): js.Function1[/* action */ typesafeDashActionsLib.Anon_TypeString, scala.Boolean] = js.native
  def isOfType[T /* <: java.lang.String */](`type`: js.Array[T]): js.Function1[/* action */ typesafeDashActionsLib.Anon_TypeString, scala.Boolean] = js.native
  def isOfType[T /* <: java.lang.String */, A /* <: typesafeDashActionsLib.Anon_TypeString */](`type`: T, action: A): scala.Boolean = js.native
  def isOfType[T /* <: java.lang.String */, A /* <: typesafeDashActionsLib.Anon_TypeString */](`type`: js.Array[T], action: A): scala.Boolean = js.native
}

