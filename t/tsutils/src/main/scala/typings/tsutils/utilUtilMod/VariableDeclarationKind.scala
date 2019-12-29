package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VariableDeclarationKind with Double] = js.native
  /* 2 */ @js.native
  object Const extends TopLevel[Const with Double]
  
  /* 1 */ @js.native
  object Let extends TopLevel[Let with Double]
  
  /* 0 */ @js.native
  object Var extends TopLevel[Var with Double]
  
}

