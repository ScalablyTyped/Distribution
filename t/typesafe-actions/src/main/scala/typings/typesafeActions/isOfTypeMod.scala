package typings.typesafeActions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/is-of-type", JSImport.Namespace)
@js.native
object isOfTypeMod extends js.Object {
  def isOfType[T /* <: String */](`type`: T): js.Function1[/* action */ AnonTypeString, Boolean] = js.native
  def isOfType[T /* <: String */](`type`: js.Array[T]): js.Function1[/* action */ AnonTypeString, Boolean] = js.native
  def isOfType[T /* <: String */, A /* <: AnonTypeString */](`type`: T, action: A): Boolean = js.native
  def isOfType[T /* <: String */, A /* <: AnonTypeString */](`type`: js.Array[T], action: A): Boolean = js.native
}

