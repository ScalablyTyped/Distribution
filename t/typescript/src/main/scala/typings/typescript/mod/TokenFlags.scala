package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenFlags extends js.Object
@JSImport("typescript", "TokenFlags")
@js.native
object TokenFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenFlags with Double] = js.native
  
  @js.native
  sealed trait BinarySpecifier extends TokenFlags
  /* 128 */ @js.native
  object BinarySpecifier extends TopLevel[BinarySpecifier with Double]
  
  @js.native
  sealed trait HexSpecifier extends TokenFlags
  /* 64 */ @js.native
  object HexSpecifier extends TopLevel[HexSpecifier with Double]
  
  @js.native
  sealed trait None extends TokenFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Octal extends TokenFlags
  /* 32 */ @js.native
  object Octal extends TopLevel[Octal with Double]
  
  @js.native
  sealed trait OctalSpecifier extends TokenFlags
  /* 256 */ @js.native
  object OctalSpecifier extends TopLevel[OctalSpecifier with Double]
  
  @js.native
  sealed trait Scientific extends TokenFlags
  /* 16 */ @js.native
  object Scientific extends TopLevel[Scientific with Double]
}
