package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constraint extends AVal {
  /** May return a string when this constraint is indicative of the presence of a specific property in the source AVal. */
  var propHint: js.UndefOr[js.Function0[js.UndefOr[java.lang.String]]] = js.native
  /** May return a type that `getType` can use to “guess” its type based on the fact that it propagates to this constraint. */
  var typeHint: js.UndefOr[js.Function0[js.UndefOr[Type]]] = js.native
}

