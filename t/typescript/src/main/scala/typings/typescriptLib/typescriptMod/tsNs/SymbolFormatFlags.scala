package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbolFormatFlags extends js.Object

@JSImport("typescript/ts", "SymbolFormatFlags")
@js.native
object SymbolFormatFlags extends js.Object {
  @js.native
  sealed trait AllowAnyNodeKind
    extends typescriptLib.typescriptMod.tsNs.SymbolFormatFlags
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.tsNs.SymbolFormatFlags
  
  @js.native
  sealed trait UseAliasDefinedOutsideCurrentScope
    extends typescriptLib.typescriptMod.tsNs.SymbolFormatFlags
  
  @js.native
  sealed trait UseOnlyExternalAliasing
    extends typescriptLib.typescriptMod.tsNs.SymbolFormatFlags
  
  @js.native
  sealed trait WriteTypeParametersOrArguments
    extends typescriptLib.typescriptMod.tsNs.SymbolFormatFlags
  
}

