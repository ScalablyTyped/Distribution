package typings.tsutils.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VariableDeclarationKind extends js.Object

@JSImport("tsutils/util/util", "VariableDeclarationKind")
@js.native
object VariableDeclarationKind extends js.Object {
  @js.native
  sealed trait Const extends VariableDeclarationKind
  
  @js.native
  sealed trait Let extends VariableDeclarationKind
  
  @js.native
  sealed trait Var extends VariableDeclarationKind
  
  /* 2 */ val Const: typings.tsutils.utilUtilMod.VariableDeclarationKind.Const with Double = js.native
  /* 1 */ val Let: typings.tsutils.utilUtilMod.VariableDeclarationKind.Let with Double = js.native
  /* 0 */ val Var: typings.tsutils.utilUtilMod.VariableDeclarationKind.Var with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VariableDeclarationKind with Double] = js.native
}

