package typings
package tsutilsLib.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VariableDeclarationKind extends js.Object

@JSImport("tsutils/util/util", "VariableDeclarationKind")
@js.native
object VariableDeclarationKind extends js.Object {
  @js.native
  sealed trait Const
    extends tsutilsLib.utilUtilMod.VariableDeclarationKind
  
  @js.native
  sealed trait Let
    extends tsutilsLib.utilUtilMod.VariableDeclarationKind
  
  @js.native
  sealed trait Var
    extends tsutilsLib.utilUtilMod.VariableDeclarationKind
  
  /* 2 */ val Const: Const with scala.Double = js.native
  /* 1 */ val Let: Let with scala.Double = js.native
  /* 0 */ val Var: Var with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[tsutilsLib.utilUtilMod.VariableDeclarationKind with scala.Double] = js.native
}

