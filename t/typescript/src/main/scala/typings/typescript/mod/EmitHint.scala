package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmitHint extends js.Object
@JSImport("typescript", "EmitHint")
@js.native
object EmitHint extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitHint with Double] = js.native
  
  @js.native
  sealed trait EmbeddedStatement extends EmitHint
  /* 5 */ @js.native
  object EmbeddedStatement extends TopLevel[EmbeddedStatement with Double]
  
  @js.native
  sealed trait Expression extends EmitHint
  /* 1 */ @js.native
  object Expression
    extends TopLevel[typings.typescript.mod.EmitHint.Expression with Double]
  
  @js.native
  sealed trait IdentifierName extends EmitHint
  /* 2 */ @js.native
  object IdentifierName extends TopLevel[IdentifierName with Double]
  
  @js.native
  sealed trait JsxAttributeValue extends EmitHint
  /* 6 */ @js.native
  object JsxAttributeValue extends TopLevel[JsxAttributeValue with Double]
  
  @js.native
  sealed trait MappedTypeParameter extends EmitHint
  /* 3 */ @js.native
  object MappedTypeParameter extends TopLevel[MappedTypeParameter with Double]
  
  @js.native
  sealed trait SourceFile extends EmitHint
  /* 0 */ @js.native
  object SourceFile
    extends TopLevel[typings.typescript.mod.EmitHint.SourceFile with Double]
  
  @js.native
  sealed trait Unspecified extends EmitHint
  /* 4 */ @js.native
  object Unspecified extends TopLevel[Unspecified with Double]
}
