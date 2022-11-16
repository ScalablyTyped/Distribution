package typings.tsToolbelt

import typings.tsToolbelt.outBooleanInternalMod.Boolean
import typings.tsToolbelt.outIterationIterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListFlattenMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    L extends unknown ? ts-toolbelt.ts-toolbelt/out/List/Flatten._Flatten<L, strict, limit> : never
    }}}
    */
  type Flatten[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, strict /* <: Boolean */, limit /* <: Double */] = typings.tsToolbelt.outListListMod.List[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/List/Flatten.__Flatten<L, [], strict, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<limit>, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<0>> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/List/List.List<any>> : never
    }}}
    */
  type _Flatten[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, strict /* <: Boolean */, limit /* <: Double */] = typings.tsToolbelt.outListListMod.List[Any]
  
  /**
    * @hidden
    */
  type __Flatten[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, LO /* <: typings.tsToolbelt.outListListMod.List[Any] */, strict /* <: Boolean */, limit /* <: Iteration */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0Flatten<L, strict, limit, I>[ts-toolbelt.ts-toolbelt/out/Boolean/Or.Or<ts-toolbelt.ts-toolbelt/out/Any/Equals.Equals<L, LO>, ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<limit, I>>] */ js.Any
}
