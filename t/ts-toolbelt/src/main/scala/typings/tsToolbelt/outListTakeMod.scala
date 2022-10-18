package typings.tsToolbelt

import typings.tsToolbelt.outIterationInternalMod.Way
import typings.tsToolbelt.outIterationIterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListTakeMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    L extends unknown ? N extends unknown ? ts-toolbelt.ts-toolbelt/out/List/Take._Take<L, N, way> : never : never
    }}}
    */
  @js.native
  trait Take[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Double */, way /* <: Way */] extends StObject
  
  /**
    * starts in reverse from the end till `N` = 0
    * @hidden
    */
  type TakeBack[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0TakeBack<L, N>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<0, ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<N>>] */ js.Any
  
  /**
    * starts in reverse from `N` till `N` = 0
    * @hidden
    */
  type TakeForth[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */, I /* <: Iteration */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0TakeForth<L, N, I, LN>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<-1, ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>>] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/List/Take.__Take<L, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<N>, way> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/List/List.List<any>> : never
    }}}
    */
  @js.native
  trait _Take[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Double */, way /* <: Way */] extends StObject
  
  /**
    * @hidden
    */
  type __Take[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */, way /* <: Way */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.TakeForth<L, N>[way] */ js.Any
}
