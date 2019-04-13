package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenFlags extends js.Object

@JSImport("typescript", "TokenFlags")
@js.native
object TokenFlags extends js.Object {
  @js.native
  sealed trait BinarySpecifier
    extends typescriptLib.typescriptMod.TokenFlags
  
  @js.native
  sealed trait HexSpecifier
    extends typescriptLib.typescriptMod.TokenFlags
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.TokenFlags
  
  @js.native
  sealed trait Octal
    extends typescriptLib.typescriptMod.TokenFlags
  
  @js.native
  sealed trait OctalSpecifier
    extends typescriptLib.typescriptMod.TokenFlags
  
  @js.native
  sealed trait Scientific
    extends typescriptLib.typescriptMod.TokenFlags
  
  /* 128 */ val BinarySpecifier: BinarySpecifier with scala.Double = js.native
  /* 64 */ val HexSpecifier: HexSpecifier with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 32 */ val Octal: Octal with scala.Double = js.native
  /* 256 */ val OctalSpecifier: OctalSpecifier with scala.Double = js.native
  /* 16 */ val Scientific: Scientific with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.TokenFlags with scala.Double] = js.native
}

