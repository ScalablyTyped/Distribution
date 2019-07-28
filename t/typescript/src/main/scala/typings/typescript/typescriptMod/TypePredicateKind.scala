package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypePredicateKind extends js.Object

@JSImport("typescript", "TypePredicateKind")
@js.native
object TypePredicateKind extends js.Object {
  @js.native
  sealed trait Identifier extends TypePredicateKind
  
  @js.native
  sealed trait This extends TypePredicateKind
  
  /* 1 */ val Identifier: typings.typescript.typescriptMod.TypePredicateKind.Identifier with Double = js.native
  /* 0 */ val This: typings.typescript.typescriptMod.TypePredicateKind.This with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypePredicateKind with Double] = js.native
}

