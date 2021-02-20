package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ObjectFlags extends StObject
@JSImport("typescript", "ObjectFlags")
@js.native
object ObjectFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectFlags with Double] = js.native
  
  @js.native
  sealed trait Anonymous extends ObjectFlags
  /* 16 */ val Anonymous: typings.typescript.mod.ObjectFlags.Anonymous with Double = js.native
  
  @js.native
  sealed trait ArrayLiteral extends ObjectFlags
  /* 65536 */ val ArrayLiteral: typings.typescript.mod.ObjectFlags.ArrayLiteral with Double = js.native
  
  @js.native
  sealed trait Class extends ObjectFlags
  /* 1 */ val Class: typings.typescript.mod.ObjectFlags.Class with Double = js.native
  
  @js.native
  sealed trait ClassOrInterface extends ObjectFlags
  /* 3 */ val ClassOrInterface: typings.typescript.mod.ObjectFlags.ClassOrInterface with Double = js.native
  
  @js.native
  sealed trait ContainsSpread extends ObjectFlags
  /* 1024 */ val ContainsSpread: typings.typescript.mod.ObjectFlags.ContainsSpread with Double = js.native
  
  @js.native
  sealed trait EvolvingArray extends ObjectFlags
  /* 256 */ val EvolvingArray: typings.typescript.mod.ObjectFlags.EvolvingArray with Double = js.native
  
  @js.native
  sealed trait FreshLiteral extends ObjectFlags
  /* 32768 */ val FreshLiteral: typings.typescript.mod.ObjectFlags.FreshLiteral with Double = js.native
  
  @js.native
  sealed trait Instantiated extends ObjectFlags
  /* 64 */ val Instantiated: typings.typescript.mod.ObjectFlags.Instantiated with Double = js.native
  
  @js.native
  sealed trait Interface extends ObjectFlags
  /* 2 */ val Interface: typings.typescript.mod.ObjectFlags.Interface with Double = js.native
  
  @js.native
  sealed trait JSLiteral extends ObjectFlags
  /* 16384 */ val JSLiteral: typings.typescript.mod.ObjectFlags.JSLiteral with Double = js.native
  
  @js.native
  sealed trait JsxAttributes extends ObjectFlags
  /* 4096 */ val JsxAttributes: typings.typescript.mod.ObjectFlags.JsxAttributes with Double = js.native
  
  @js.native
  sealed trait Mapped extends ObjectFlags
  /* 32 */ val Mapped: typings.typescript.mod.ObjectFlags.Mapped with Double = js.native
  
  @js.native
  sealed trait MarkerType extends ObjectFlags
  /* 8192 */ val MarkerType: typings.typescript.mod.ObjectFlags.MarkerType with Double = js.native
  
  @js.native
  sealed trait ObjectLiteral extends ObjectFlags
  /* 128 */ val ObjectLiteral: typings.typescript.mod.ObjectFlags.ObjectLiteral with Double = js.native
  
  @js.native
  sealed trait ObjectLiteralPatternWithComputedProperties extends ObjectFlags
  /* 512 */ val ObjectLiteralPatternWithComputedProperties: typings.typescript.mod.ObjectFlags.ObjectLiteralPatternWithComputedProperties with Double = js.native
  
  @js.native
  sealed trait ObjectRestType extends ObjectFlags
  /* 131072 */ val ObjectRestType: typings.typescript.mod.ObjectFlags.ObjectRestType with Double = js.native
  
  @js.native
  sealed trait Reference extends ObjectFlags
  /* 4 */ val Reference: typings.typescript.mod.ObjectFlags.Reference with Double = js.native
  
  @js.native
  sealed trait ReverseMapped extends ObjectFlags
  /* 2048 */ val ReverseMapped: typings.typescript.mod.ObjectFlags.ReverseMapped with Double = js.native
  
  @js.native
  sealed trait Tuple extends ObjectFlags
  /* 8 */ val Tuple: typings.typescript.mod.ObjectFlags.Tuple with Double = js.native
}
