package typings.uifabricUtilities

import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreateMergedRefMod {
  
  @JSImport("@uifabric/utilities/lib/createMergedRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMergedRef[TType, TValue](): js.Function1[
    /* repeated */ js.UndefOr[
      (js.Function1[/* instance */ TType | TValue | Null, Unit]) | (RefObject[TType | TValue | Null]) | Null
    ], 
    js.Function1[/* newValue */ TType | TValue | Null, Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMergedRef")().asInstanceOf[js.Function1[
    /* repeated */ js.UndefOr[
      (js.Function1[/* instance */ TType | TValue | Null, Unit]) | (RefObject[TType | TValue | Null]) | Null
    ], 
    js.Function1[/* newValue */ TType | TValue | Null, Unit]
  ]]
  inline def createMergedRef[TType, TValue](value: TValue): js.Function1[
    /* repeated */ js.UndefOr[
      (js.Function1[/* instance */ TType | TValue | Null, Unit]) | (RefObject[TType | TValue | Null]) | Null
    ], 
    js.Function1[/* newValue */ TType | TValue | Null, Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMergedRef")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* repeated */ js.UndefOr[
      (js.Function1[/* instance */ TType | TValue | Null, Unit]) | (RefObject[TType | TValue | Null]) | Null
    ], 
    js.Function1[/* newValue */ TType | TValue | Null, Unit]
  ]]
}
