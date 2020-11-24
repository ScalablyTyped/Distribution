package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolFormatFlags extends js.Object
@JSImport("typescript", "SymbolFormatFlags")
@js.native
object SymbolFormatFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolFormatFlags with Double] = js.native
  
  @js.native
  sealed trait AllowAnyNodeKind extends SymbolFormatFlags
  /* 4 */ @js.native
  object AllowAnyNodeKind extends TopLevel[AllowAnyNodeKind with Double]
  
  @js.native
  sealed trait None extends SymbolFormatFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait UseAliasDefinedOutsideCurrentScope extends SymbolFormatFlags
  /* 8 */ @js.native
  object UseAliasDefinedOutsideCurrentScope extends TopLevel[UseAliasDefinedOutsideCurrentScope with Double]
  
  @js.native
  sealed trait UseOnlyExternalAliasing extends SymbolFormatFlags
  /* 2 */ @js.native
  object UseOnlyExternalAliasing extends TopLevel[UseOnlyExternalAliasing with Double]
  
  @js.native
  sealed trait WriteTypeParametersOrArguments extends SymbolFormatFlags
  /* 1 */ @js.native
  object WriteTypeParametersOrArguments extends TopLevel[WriteTypeParametersOrArguments with Double]
}
