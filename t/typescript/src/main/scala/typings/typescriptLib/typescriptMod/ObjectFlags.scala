package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ObjectFlags extends js.Object

@JSImport("typescript", "ObjectFlags")
@js.native
object ObjectFlags extends js.Object {
  @js.native
  sealed trait Anonymous
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait Class
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait ClassOrInterface
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait ContainsSpread
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait EvolvingArray
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait FreshLiteral
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait Instantiated
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait Interface
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait JSLiteral
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait JsxAttributes
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait Mapped
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait MarkerType
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait ObjectLiteral
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait ObjectLiteralPatternWithComputedProperties
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait Reference
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait ReverseMapped
    extends typescriptLib.typescriptMod.ObjectFlags
  
  @js.native
  sealed trait Tuple
    extends typescriptLib.typescriptMod.ObjectFlags
  
  /* 16 */ val Anonymous: Anonymous with scala.Double = js.native
  /* 1 */ val Class: Class with scala.Double = js.native
  /* 3 */ val ClassOrInterface: ClassOrInterface with scala.Double = js.native
  /* 1024 */ val ContainsSpread: ContainsSpread with scala.Double = js.native
  /* 256 */ val EvolvingArray: EvolvingArray with scala.Double = js.native
  /* 32768 */ val FreshLiteral: FreshLiteral with scala.Double = js.native
  /* 64 */ val Instantiated: Instantiated with scala.Double = js.native
  /* 2 */ val Interface: Interface with scala.Double = js.native
  /* 16384 */ val JSLiteral: JSLiteral with scala.Double = js.native
  /* 4096 */ val JsxAttributes: JsxAttributes with scala.Double = js.native
  /* 32 */ val Mapped: Mapped with scala.Double = js.native
  /* 8192 */ val MarkerType: MarkerType with scala.Double = js.native
  /* 128 */ val ObjectLiteral: ObjectLiteral with scala.Double = js.native
  /* 512 */ val ObjectLiteralPatternWithComputedProperties: ObjectLiteralPatternWithComputedProperties with scala.Double = js.native
  /* 4 */ val Reference: Reference with scala.Double = js.native
  /* 2048 */ val ReverseMapped: ReverseMapped with scala.Double = js.native
  /* 8 */ val Tuple: Tuple with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.ObjectFlags with scala.Double] = js.native
}

