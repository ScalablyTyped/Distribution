package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenFlags extends StObject
@JSImport("typescript", "TokenFlags")
@js.native
object TokenFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenFlags & Double] = js.native
  
  @js.native
  sealed trait BinarySpecifier
    extends StObject
       with TokenFlags
  /* 128 */ val BinarySpecifier: typings.typescript.mod.TokenFlags.BinarySpecifier & Double = js.native
  
  @js.native
  sealed trait HexSpecifier
    extends StObject
       with TokenFlags
  /* 64 */ val HexSpecifier: typings.typescript.mod.TokenFlags.HexSpecifier & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TokenFlags
  /* 0 */ val None: typings.typescript.mod.TokenFlags.None & Double = js.native
  
  @js.native
  sealed trait Octal
    extends StObject
       with TokenFlags
  /* 32 */ val Octal: typings.typescript.mod.TokenFlags.Octal & Double = js.native
  
  @js.native
  sealed trait OctalSpecifier
    extends StObject
       with TokenFlags
  /* 256 */ val OctalSpecifier: typings.typescript.mod.TokenFlags.OctalSpecifier & Double = js.native
  
  @js.native
  sealed trait Scientific
    extends StObject
       with TokenFlags
  /* 16 */ val Scientific: typings.typescript.mod.TokenFlags.Scientific & Double = js.native
}
