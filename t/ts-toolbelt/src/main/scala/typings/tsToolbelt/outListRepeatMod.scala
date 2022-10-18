package typings.tsToolbelt

import typings.tsToolbelt.outIterationIterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListRepeatMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    N extends unknown ? L extends unknown ? ts-toolbelt.ts-toolbelt/out/List/Repeat._Repeat<A, N, L> : never : never
    }}}
    */
  @js.native
  trait Repeat[A /* <: Any */, N /* <: Double */, L /* <: typings.tsToolbelt.outListListMod.List[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/List/Repeat.__Repeat<N, A, L, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<0>> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/List/List.List<any>> : never
    }}}
    */
  @js.native
  trait _Repeat[A /* <: Any */, N /* <: Double */, L /* <: typings.tsToolbelt.outListListMod.List[Any] */] extends StObject
  
  /**
    * @hidden
    */
  type __Repeat[N /* <: Double */, A, L /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0Repeat<N, A, L, I>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>, N>] */ js.Any
}
