package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbolFormatFlags extends js.Object

@JSImport("typescript", "SymbolFormatFlags")
@js.native
object SymbolFormatFlags extends js.Object {
  @js.native
  sealed trait AllowAnyNodeKind
    extends typescriptLib.typescriptMod.SymbolFormatFlags
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.SymbolFormatFlags
  
  @js.native
  sealed trait UseAliasDefinedOutsideCurrentScope
    extends typescriptLib.typescriptMod.SymbolFormatFlags
  
  @js.native
  sealed trait UseOnlyExternalAliasing
    extends typescriptLib.typescriptMod.SymbolFormatFlags
  
  @js.native
  sealed trait WriteTypeParametersOrArguments
    extends typescriptLib.typescriptMod.SymbolFormatFlags
  
  /* 4 */ val AllowAnyNodeKind: AllowAnyNodeKind with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 8 */ val UseAliasDefinedOutsideCurrentScope: UseAliasDefinedOutsideCurrentScope with scala.Double = js.native
  /* 2 */ val UseOnlyExternalAliasing: UseOnlyExternalAliasing with scala.Double = js.native
  /* 1 */ val WriteTypeParametersOrArguments: WriteTypeParametersOrArguments with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.SymbolFormatFlags with scala.Double] = js.native
}

