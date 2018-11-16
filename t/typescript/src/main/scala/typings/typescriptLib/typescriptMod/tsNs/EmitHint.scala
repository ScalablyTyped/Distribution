package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmitHint extends js.Object

@JSImport("typescript/ts", "EmitHint")
@js.native
object EmitHint extends js.Object {
  @js.native
  sealed trait Expression
    extends typescriptLib.typescriptMod.tsNs.EmitHint
  
  @js.native
  sealed trait IdentifierName
    extends typescriptLib.typescriptMod.tsNs.EmitHint
  
  @js.native
  sealed trait MappedTypeParameter
    extends typescriptLib.typescriptMod.tsNs.EmitHint
  
  @js.native
  sealed trait SourceFile
    extends typescriptLib.typescriptMod.tsNs.EmitHint
  
  @js.native
  sealed trait Unspecified
    extends typescriptLib.typescriptMod.tsNs.EmitHint
  
}

