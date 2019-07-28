package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmitHint extends js.Object

@JSImport("typescript", "EmitHint")
@js.native
object EmitHint extends js.Object {
  @js.native
  sealed trait EmbeddedStatement extends EmitHint
  
  @js.native
  sealed trait Expression extends EmitHint
  
  @js.native
  sealed trait IdentifierName extends EmitHint
  
  @js.native
  sealed trait MappedTypeParameter extends EmitHint
  
  @js.native
  sealed trait SourceFile extends EmitHint
  
  @js.native
  sealed trait Unspecified extends EmitHint
  
  /* 5 */ val EmbeddedStatement: typings.typescript.typescriptMod.EmitHint.EmbeddedStatement with Double = js.native
  /* 1 */ val Expression: typings.typescript.typescriptMod.EmitHint.Expression with Double = js.native
  /* 2 */ val IdentifierName: typings.typescript.typescriptMod.EmitHint.IdentifierName with Double = js.native
  /* 3 */ val MappedTypeParameter: typings.typescript.typescriptMod.EmitHint.MappedTypeParameter with Double = js.native
  /* 0 */ val SourceFile: typings.typescript.typescriptMod.EmitHint.SourceFile with Double = js.native
  /* 4 */ val Unspecified: typings.typescript.typescriptMod.EmitHint.Unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitHint with Double] = js.native
}

