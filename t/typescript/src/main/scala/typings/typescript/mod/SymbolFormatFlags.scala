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
  @js.native
  sealed trait AllowAnyNodeKind extends SymbolFormatFlags
  
  @js.native
  sealed trait None extends SymbolFormatFlags
  
  @js.native
  sealed trait UseAliasDefinedOutsideCurrentScope extends SymbolFormatFlags
  
  @js.native
  sealed trait UseOnlyExternalAliasing extends SymbolFormatFlags
  
  @js.native
  sealed trait WriteTypeParametersOrArguments extends SymbolFormatFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolFormatFlags with Double] = js.native
  /* 4 */ @js.native
  object AllowAnyNodeKind extends TopLevel[AllowAnyNodeKind with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 8 */ @js.native
  object UseAliasDefinedOutsideCurrentScope extends TopLevel[UseAliasDefinedOutsideCurrentScope with Double]
  
  /* 2 */ @js.native
  object UseOnlyExternalAliasing extends TopLevel[UseOnlyExternalAliasing with Double]
  
  /* 1 */ @js.native
  object WriteTypeParametersOrArguments extends TopLevel[WriteTypeParametersOrArguments with Double]
  
}

