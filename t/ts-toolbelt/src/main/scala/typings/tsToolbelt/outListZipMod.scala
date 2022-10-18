package typings.tsToolbelt

import typings.tsToolbelt.outIterationIterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListZipMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    L extends unknown ? L1 extends unknown ? ts-toolbelt.ts-toolbelt/out/List/Zip._Zip<L, L1> : never : never
    }}}
    */
  @js.native
  trait Zip[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/List/Zip.__Zip<ts-toolbelt.ts-toolbelt/out/List/_Internal.Naked<L>, L1, [], ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<0>> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/List/List.List<any>> : never
    }}}
    */
  @js.native
  trait _Zip[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */] extends StObject
  
  /**
    * @hidden
    */
  type __Zip[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0Zip<L, L1, LN, I>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>, ts-toolbelt.ts-toolbelt/out/List/Length.Length<L>>] */ js.Any
}
