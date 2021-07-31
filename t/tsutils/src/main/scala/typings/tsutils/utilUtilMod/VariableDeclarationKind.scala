package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VariableDeclarationKind extends StObject
@JSImport("tsutils/util/util", "VariableDeclarationKind")
@js.native
object VariableDeclarationKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VariableDeclarationKind & Double] = js.native
  
  @js.native
  sealed trait Const
    extends StObject
       with VariableDeclarationKind
  /* 2 */ val Const: typings.tsutils.utilUtilMod.VariableDeclarationKind.Const & Double = js.native
  
  @js.native
  sealed trait Let
    extends StObject
       with VariableDeclarationKind
  /* 1 */ val Let: typings.tsutils.utilUtilMod.VariableDeclarationKind.Let & Double = js.native
  
  @js.native
  sealed trait Var
    extends StObject
       with VariableDeclarationKind
  /* 0 */ val Var: typings.tsutils.utilUtilMod.VariableDeclarationKind.Var & Double = js.native
}
