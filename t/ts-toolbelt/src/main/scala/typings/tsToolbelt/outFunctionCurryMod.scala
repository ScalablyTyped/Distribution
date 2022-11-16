package typings.tsToolbelt

import typings.tsToolbelt.outAnyCastMod.Cast
import typings.tsToolbelt.outFunctionFunctionMod.Function
import typings.tsToolbelt.outFunctionParametersMod.Parameters
import typings.tsToolbelt.outIterationIterationMod.Iteration
import typings.tsToolbelt.outObjectNonNullableMod.NonNullableFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outFunctionCurryMod {
  
  type Curry[F /* <: Function[Any, Any] */] = js.Function1[
    /* p */ Gaps[Parameters[F]], 
    /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.ts-toolbelt/out/List/RequiredKeys.RequiredKeys<ts-toolbelt.ts-toolbelt/out/Function/Curry.GapsOf<ts-toolbelt.ts-toolbelt/out/Function/Curry.Gaps<ts-toolbelt.ts-toolbelt/out/Function/Parameters.Parameters<F>>, ts-toolbelt.ts-toolbelt/out/Function/Parameters.Parameters<F>>> extends never ? ts-toolbelt.ts-toolbelt/out/Function/Return.Return<F> : ts-toolbelt.ts-toolbelt/out/Function/Curry.Curry<(p : ts-toolbelt.ts-toolbelt/out/Function/Curry.GapsOf<ts-toolbelt.ts-toolbelt/out/Function/Curry.Gaps<ts-toolbelt.ts-toolbelt/out/Function/Parameters.Parameters<F>>, ts-toolbelt.ts-toolbelt/out/Function/Parameters.Parameters<F>>): ts-toolbelt.ts-toolbelt/out/Function/Return.Return<F>> */ js.Any
  ]
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    L1[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] extends ts-toolbelt.ts-toolbelt/out/Any/x.x ? ts-toolbelt.ts-toolbelt/out/List/Concat.Concat<LN, L2[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>]> : LN
    }}}
    */
  type GapOf[L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */, L2 /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */] = LN
  
  /**
    * @hidden
    */
  type Gaps[L /* <: typings.tsToolbelt.outListListMod.List[Any] */] = Cast[
    NonNullableFlat[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof L ]:? L[K] | ts-toolbelt.ts-toolbelt/out/Any/x.x} */ js.Any
    ], 
    typings.tsToolbelt.outListListMod.List[Any]
  ]
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Function/Curry._GapsOf<L1, ts-toolbelt.ts-toolbelt/out/Function/Curry.SplitParams<L2>, [], ts-toolbelt.ts-toolbelt/out/Function/Curry.SplitParams<L2>, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<0>> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/List/List.List<any>> : never
    }}}
    */
  type GapsOf[L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */, L2 /* <: typings.tsToolbelt.outListListMod.List[Any] */] = typings.tsToolbelt.outListListMod.List[Any]
  
  /**
    * Undoes the job of [[SplitParams]]
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Function/Curry._JoinParams<P, []> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/List/List.List<any>> : never
    }}}
    */
  type JoinParams[P /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */] = typings.tsToolbelt.outListListMod.List[Any]
  
  /**
    * Splits tuples to preserve their labels
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Function/Curry._SplitParams<P, [], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<P>> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, std.Array<ts-toolbelt.ts-toolbelt/out/List/List.List<any>>> : never
    }}}
    */
  type SplitParams[P /* <: typings.tsToolbelt.outListListMod.List[Any] */] = js.Array[typings.tsToolbelt.outListListMod.List[Any]]
  
  /**
    * @hidden
    */
  type _GapsOf[L1 /* <: typings.tsToolbelt.outListListMod.List[Any] */, L2 /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */, L2D /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0GapsOf<L1, L2, LN, I, L2D>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>, ts-toolbelt.ts-toolbelt/out/List/Length.Length<L1>>] */ js.Any
  
  /**
    * @hidden
    */
  type _JoinParams[PSplit /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */, L /* <: typings.tsToolbelt.outListListMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0JoinParams<PSplit, L>[number extends ts-toolbelt.ts-toolbelt/out/List/Length.Length<PSplit> ? 2 : PSplit extends [] ? 1 : 0] */ js.Any
  
  /**
    * @hidden
    */
  type _SplitParams[P /* <: typings.tsToolbelt.outListListMod.List[Any] */, PSplit /* <: js.Array[typings.tsToolbelt.outListListMod.List[Any]] */, PRest /* <: typings.tsToolbelt.outListListMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.1PSplit<P, PRest, PSplit>[number extends ts-toolbelt.ts-toolbelt/out/List/Length.Length<P> ? 2 : P extends [] ? 1 : 0] */ js.Any
}
