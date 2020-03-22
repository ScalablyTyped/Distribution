package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
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
  sealed trait JsxAttributeValue extends EmitHint
  
  @js.native
  sealed trait MappedTypeParameter extends EmitHint
  
  @js.native
  sealed trait SourceFile extends EmitHint
  
  @js.native
  sealed trait Unspecified extends EmitHint
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitHint with Double] = js.native
  /* 5 */ @js.native
  object EmbeddedStatement extends TopLevel[EmbeddedStatement with Double]
  
  /* 1 */ @js.native
  object Expression
    extends TopLevel[typings.typescript.mod.EmitHint.Expression with Double]
  
  /* 2 */ @js.native
  object IdentifierName extends TopLevel[IdentifierName with Double]
  
  /* 6 */ @js.native
  object JsxAttributeValue extends TopLevel[JsxAttributeValue with Double]
  
  /* 3 */ @js.native
  object MappedTypeParameter extends TopLevel[MappedTypeParameter with Double]
  
  /* 0 */ @js.native
  object SourceFile
    extends TopLevel[typings.typescript.mod.EmitHint.SourceFile with Double]
  
  /* 4 */ @js.native
  object Unspecified extends TopLevel[Unspecified with Double]
  
}

