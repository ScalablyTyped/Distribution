package typings.tsToolbelt

import typings.tsToolbelt.outBooleanInternalMod.Boolean
import typings.tsToolbelt.outIterationIterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListUnNestMod {
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    L[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] extends infer LP ? LP extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? ts-toolbelt.ts-toolbelt/out/List/Concat.Concat<LN, L[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>]> : ts-toolbelt.ts-toolbelt/out/List/Append.Append<LN, L[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>]> : never
    }}}
    */
  @js.native
  trait Flatter[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    L extends unknown ? ts-toolbelt.ts-toolbelt/out/List/UnNest._UnNest<L, strict> : never
    }}}
    */
  @js.native
  trait UnNest[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, strict /* <: Boolean */] extends StObject
  
  /**
    * @hidden
    */
  type UnNestLoose[L /* <: typings.tsToolbelt.outListListMod.List[Any] */] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.ts-toolbelt/out/List/UnionOf.UnionOf<L> extends infer UL ? UL extends unknown ? UL extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? ts-toolbelt.ts-toolbelt/out/List/UnionOf.UnionOf<UL> : UL : never : never */ js.Any
  ]
  
  /**
    * @hidden
    */
  type UnNestStrict[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0UnNestStrict<L, LN, I>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>, ts-toolbelt.ts-toolbelt/out/List/Length.Length<L>>] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/List/UnNest.__UnNest<ts-toolbelt.ts-toolbelt/out/List/_Internal.Naked<L>, strict> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/List/List.List<any>> : never
    }}}
    */
  @js.native
  trait _UnNest[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, strict /* <: Boolean */] extends StObject
  
  /**
    * @hidden
    */
  type __UnNest[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, strict /* <: Boolean */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0UnNestLoose<L>[ts-toolbelt.ts-toolbelt/out/Boolean/And.And<ts-toolbelt.ts-toolbelt/out/Boolean/Not.Not<ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<number, ts-toolbelt.ts-toolbelt/out/List/Length.Length<L>>>, strict>] */ js.Any
}
