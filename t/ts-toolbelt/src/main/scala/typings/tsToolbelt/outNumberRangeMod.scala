package typings.tsToolbelt

import typings.tsToolbelt.outIterationInternalMod.Way
import typings.tsToolbelt.outIterationIterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outNumberRangeMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    From extends unknown ? To extends unknown ? ts-toolbelt.ts-toolbelt/out/Number/Range._Range<From, To, way> : never : never
    }}}
    */
  @js.native
  trait Range[From /* <: Double */, To /* <: Double */, way /* <: Way */] extends StObject
  
  /**
    * @hidden
    */
  type RangeBack[From /* <: Iteration */, To /* <: Iteration */, L /* <: typings.tsToolbelt.outListListMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0RangeBack<From, To, L>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<From, To>] */ js.Any
  
  /**
    * @hidden
    */
  type RangeForth[From /* <: Iteration */, To /* <: Iteration */, L /* <: typings.tsToolbelt.outListListMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0RangeForth<From, To, L>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<From, To>] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Number/Range.__Range<ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<From>, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<To>, way> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, std.Array<string | number>> : never
    }}}
    */
  type _Range[From /* <: Double */, To /* <: Double */, way /* <: Way */] = js.Array[String | Double]
  
  /**
    * @hidden
    */
  type __Range[From /* <: Iteration */, To /* <: Iteration */, way /* <: Way */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.RangeForth<To, From>[way] */ js.Any
}
