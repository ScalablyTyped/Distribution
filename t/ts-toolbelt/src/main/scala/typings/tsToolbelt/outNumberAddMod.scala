package typings.tsToolbelt

import typings.tsToolbelt.outIterationIterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outNumberAddMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    N1 extends unknown ? N2 extends unknown ? ts-toolbelt.ts-toolbelt/out/Number/Add._Add<ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<N1>, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<N2>>[0] : never : never
    }}}
    */
  @js.native
  trait Add[N1 /* <: Double */, N2 /* <: Double */] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Number/Add._AddNegative<N1, N2> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/Iteration/Iteration.Iteration> : never
    }}}
    */
  @js.native
  trait AddNegative[N1 /* <: Iteration */, N2 /* <: Iteration */] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Number/Add._AddPositive<N1, N2> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/Iteration/Iteration.Iteration> : never
    }}}
    */
  @js.native
  trait AddPositive[N1 /* <: Iteration */, N2 /* <: Iteration */] extends StObject
  
  type _Add[N1 /* <: Iteration */, N2 /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0AddPositive<N1, N2>[ts-toolbelt.ts-toolbelt/out/Number/IsNegative._IsNegative<N2>] */ js.Any
  
  /**
    * @hidden
    */
  type _AddNegative[N1 /* <: Iteration */, N2 /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0AddNegative<N1, N2>[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<N2> extends 0 ? 1 : number extends ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<N2> ? 2 : 0] */ js.Any
  
  /**
    * @hidden
    */
  type _AddPositive[N1 /* <: Iteration */, N2 /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.1N1<N1, N2>[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<N2> extends 0 ? 1 : number extends ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<N2> ? 2 : 0] */ js.Any
}
