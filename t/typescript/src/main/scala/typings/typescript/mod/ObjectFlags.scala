package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ObjectFlags extends StObject
@JSImport("typescript", "ObjectFlags")
@js.native
object ObjectFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectFlags & Double] = js.native
  
  @js.native
  sealed trait Anonymous
    extends StObject
       with ObjectFlags
  /* 16 */ val Anonymous: typings.typescript.mod.ObjectFlags.Anonymous & Double = js.native
  
  @js.native
  sealed trait ArrayLiteral
    extends StObject
       with ObjectFlags
  /* 65536 */ val ArrayLiteral: typings.typescript.mod.ObjectFlags.ArrayLiteral & Double = js.native
  
  @js.native
  sealed trait Class
    extends StObject
       with ObjectFlags
  /* 1 */ val Class: typings.typescript.mod.ObjectFlags.Class & Double = js.native
  
  @js.native
  sealed trait ClassOrInterface
    extends StObject
       with ObjectFlags
  /* 3 */ val ClassOrInterface: typings.typescript.mod.ObjectFlags.ClassOrInterface & Double = js.native
  
  @js.native
  sealed trait ContainsSpread
    extends StObject
       with ObjectFlags
  /* 1024 */ val ContainsSpread: typings.typescript.mod.ObjectFlags.ContainsSpread & Double = js.native
  
  @js.native
  sealed trait EvolvingArray
    extends StObject
       with ObjectFlags
  /* 256 */ val EvolvingArray: typings.typescript.mod.ObjectFlags.EvolvingArray & Double = js.native
  
  @js.native
  sealed trait FreshLiteral
    extends StObject
       with ObjectFlags
  /* 32768 */ val FreshLiteral: typings.typescript.mod.ObjectFlags.FreshLiteral & Double = js.native
  
  @js.native
  sealed trait Instantiated
    extends StObject
       with ObjectFlags
  /* 64 */ val Instantiated: typings.typescript.mod.ObjectFlags.Instantiated & Double = js.native
  
  @js.native
  sealed trait Interface
    extends StObject
       with ObjectFlags
  /* 2 */ val Interface: typings.typescript.mod.ObjectFlags.Interface & Double = js.native
  
  @js.native
  sealed trait JSLiteral
    extends StObject
       with ObjectFlags
  /* 16384 */ val JSLiteral: typings.typescript.mod.ObjectFlags.JSLiteral & Double = js.native
  
  @js.native
  sealed trait JsxAttributes
    extends StObject
       with ObjectFlags
  /* 4096 */ val JsxAttributes: typings.typescript.mod.ObjectFlags.JsxAttributes & Double = js.native
  
  @js.native
  sealed trait Mapped
    extends StObject
       with ObjectFlags
  /* 32 */ val Mapped: typings.typescript.mod.ObjectFlags.Mapped & Double = js.native
  
  @js.native
  sealed trait MarkerType
    extends StObject
       with ObjectFlags
  /* 8192 */ val MarkerType: typings.typescript.mod.ObjectFlags.MarkerType & Double = js.native
  
  @js.native
  sealed trait ObjectLiteral
    extends StObject
       with ObjectFlags
  /* 128 */ val ObjectLiteral: typings.typescript.mod.ObjectFlags.ObjectLiteral & Double = js.native
  
  @js.native
  sealed trait ObjectLiteralPatternWithComputedProperties
    extends StObject
       with ObjectFlags
  /* 512 */ val ObjectLiteralPatternWithComputedProperties: typings.typescript.mod.ObjectFlags.ObjectLiteralPatternWithComputedProperties & Double = js.native
  
  @js.native
  sealed trait ObjectRestType
    extends StObject
       with ObjectFlags
  /* 131072 */ val ObjectRestType: typings.typescript.mod.ObjectFlags.ObjectRestType & Double = js.native
  
  @js.native
  sealed trait Reference
    extends StObject
       with ObjectFlags
  /* 4 */ val Reference: typings.typescript.mod.ObjectFlags.Reference & Double = js.native
  
  @js.native
  sealed trait ReverseMapped
    extends StObject
       with ObjectFlags
  /* 2048 */ val ReverseMapped: typings.typescript.mod.ObjectFlags.ReverseMapped & Double = js.native
  
  @js.native
  sealed trait Tuple
    extends StObject
       with ObjectFlags
  /* 8 */ val Tuple: typings.typescript.mod.ObjectFlags.Tuple & Double = js.native
}
