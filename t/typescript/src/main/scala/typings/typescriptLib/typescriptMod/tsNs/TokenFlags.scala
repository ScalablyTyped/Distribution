package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenFlags extends js.Object

@JSImport("typescript/ts", "TokenFlags")
@js.native
object TokenFlags extends js.Object {
  @js.native
  sealed trait BinarySpecifier
    extends typescriptLib.typescriptMod.tsNs.TokenFlags
  
  @js.native
  sealed trait HexSpecifier
    extends typescriptLib.typescriptMod.tsNs.TokenFlags
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.tsNs.TokenFlags
  
  @js.native
  sealed trait Octal
    extends typescriptLib.typescriptMod.tsNs.TokenFlags
  
  @js.native
  sealed trait OctalSpecifier
    extends typescriptLib.typescriptMod.tsNs.TokenFlags
  
  @js.native
  sealed trait Scientific
    extends typescriptLib.typescriptMod.tsNs.TokenFlags
  
}

