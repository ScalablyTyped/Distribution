package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ObjectFlags extends js.Object
@JSImport("typescript", "ObjectFlags")
@js.native
object ObjectFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectFlags with Double] = js.native
  
  @js.native
  sealed trait Anonymous extends ObjectFlags
  /* 16 */ @js.native
  object Anonymous extends TopLevel[Anonymous with Double]
  
  @js.native
  sealed trait ArrayLiteral extends ObjectFlags
  /* 65536 */ @js.native
  object ArrayLiteral extends TopLevel[ArrayLiteral with Double]
  
  @js.native
  sealed trait Class extends ObjectFlags
  /* 1 */ @js.native
  object Class extends TopLevel[Class with Double]
  
  @js.native
  sealed trait ClassOrInterface extends ObjectFlags
  /* 3 */ @js.native
  object ClassOrInterface extends TopLevel[ClassOrInterface with Double]
  
  @js.native
  sealed trait ContainsSpread extends ObjectFlags
  /* 1024 */ @js.native
  object ContainsSpread extends TopLevel[ContainsSpread with Double]
  
  @js.native
  sealed trait EvolvingArray extends ObjectFlags
  /* 256 */ @js.native
  object EvolvingArray extends TopLevel[EvolvingArray with Double]
  
  @js.native
  sealed trait FreshLiteral extends ObjectFlags
  /* 32768 */ @js.native
  object FreshLiteral extends TopLevel[FreshLiteral with Double]
  
  @js.native
  sealed trait Instantiated extends ObjectFlags
  /* 64 */ @js.native
  object Instantiated extends TopLevel[Instantiated with Double]
  
  @js.native
  sealed trait Interface extends ObjectFlags
  /* 2 */ @js.native
  object Interface extends TopLevel[Interface with Double]
  
  @js.native
  sealed trait JSLiteral extends ObjectFlags
  /* 16384 */ @js.native
  object JSLiteral extends TopLevel[JSLiteral with Double]
  
  @js.native
  sealed trait JsxAttributes extends ObjectFlags
  /* 4096 */ @js.native
  object JsxAttributes
    extends TopLevel[typings.typescript.mod.ObjectFlags.JsxAttributes with Double]
  
  @js.native
  sealed trait Mapped extends ObjectFlags
  /* 32 */ @js.native
  object Mapped extends TopLevel[Mapped with Double]
  
  @js.native
  sealed trait MarkerType extends ObjectFlags
  /* 8192 */ @js.native
  object MarkerType extends TopLevel[MarkerType with Double]
  
  @js.native
  sealed trait ObjectLiteral extends ObjectFlags
  /* 128 */ @js.native
  object ObjectLiteral extends TopLevel[ObjectLiteral with Double]
  
  @js.native
  sealed trait ObjectLiteralPatternWithComputedProperties extends ObjectFlags
  /* 512 */ @js.native
  object ObjectLiteralPatternWithComputedProperties extends TopLevel[ObjectLiteralPatternWithComputedProperties with Double]
  
  @js.native
  sealed trait ObjectRestType extends ObjectFlags
  /* 131072 */ @js.native
  object ObjectRestType extends TopLevel[ObjectRestType with Double]
  
  @js.native
  sealed trait Reference extends ObjectFlags
  /* 4 */ @js.native
  object Reference extends TopLevel[Reference with Double]
  
  @js.native
  sealed trait ReverseMapped extends ObjectFlags
  /* 2048 */ @js.native
  object ReverseMapped extends TopLevel[ReverseMapped with Double]
  
  @js.native
  sealed trait Tuple extends ObjectFlags
  /* 8 */ @js.native
  object Tuple extends TopLevel[Tuple with Double]
}
