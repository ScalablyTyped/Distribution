package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmitHint extends js.Object

@JSImport("typescript", "EmitHint")
@js.native
object EmitHint extends js.Object {
  @js.native
  sealed trait EmbeddedStatement
    extends typescriptLib.typescriptMod.EmitHint
  
  @js.native
  sealed trait Expression
    extends typescriptLib.typescriptMod.EmitHint
  
  @js.native
  sealed trait IdentifierName
    extends typescriptLib.typescriptMod.EmitHint
  
  @js.native
  sealed trait MappedTypeParameter
    extends typescriptLib.typescriptMod.EmitHint
  
  @js.native
  sealed trait SourceFile
    extends typescriptLib.typescriptMod.EmitHint
  
  @js.native
  sealed trait Unspecified
    extends typescriptLib.typescriptMod.EmitHint
  
  /* 5 */ val EmbeddedStatement: EmbeddedStatement with scala.Double = js.native
  /* 1 */ val Expression: Expression with scala.Double = js.native
  /* 2 */ val IdentifierName: IdentifierName with scala.Double = js.native
  /* 3 */ val MappedTypeParameter: MappedTypeParameter with scala.Double = js.native
  /* 0 */ val SourceFile: SourceFile with scala.Double = js.native
  /* 4 */ val Unspecified: Unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.EmitHint with scala.Double] = js.native
}

