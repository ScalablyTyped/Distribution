package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VariableDeclarationKind extends js.Object
@JSImport("tsutils/util/util", "VariableDeclarationKind")
@js.native
object VariableDeclarationKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VariableDeclarationKind with Double] = js.native
  
  @js.native
  sealed trait Const extends VariableDeclarationKind
  /* 2 */ @js.native
  object Const extends TopLevel[Const with Double]
  
  @js.native
  sealed trait Let extends VariableDeclarationKind
  /* 1 */ @js.native
  object Let extends TopLevel[Let with Double]
  
  @js.native
  sealed trait Var extends VariableDeclarationKind
  /* 0 */ @js.native
  object Var extends TopLevel[Var with Double]
}
