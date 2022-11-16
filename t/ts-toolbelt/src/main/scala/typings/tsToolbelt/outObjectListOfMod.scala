package typings.tsToolbelt

import typings.tsToolbelt.outIterationIterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectListOfMod {
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Iteration/Key.Key<I> extends keyof O ? ts-toolbelt.ts-toolbelt/out/List/Append.Append<LN, O[ts-toolbelt.ts-toolbelt/out/Iteration/Key.Key<I>]> : ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I> extends keyof O ? ts-toolbelt.ts-toolbelt/out/List/Append.Append<LN, O[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>]> : LN
    }}}
    */
  type AppendExists[O /* <: js.Object */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */] = LN
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/ListOf._ListOf<O> : never
    }}}
    */
  type ListOf[O /* <: js.Object */] = typings.tsToolbelt.outListListMod.List[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Object/ListOf.__ListOf<O> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/List/List.List<any>> : never
    }}}
    */
  type _ListOf[O /* <: js.Object */] = typings.tsToolbelt.outListListMod.List[Any]
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    number extends keyof O ? std.Array<O[number]> : string extends keyof O ? std.Array<O[string]> : symbol extends keyof O ? std.Array<O[symbol]> : ts-toolbelt.ts-toolbelt/out/Object/ListOf.___ListOf<O, ts-toolbelt.ts-toolbelt/out/Union/Select.Select<keyof O, number | / * template literal string: ${number} * / string, 'default'>, [], ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<0>>
    }}}
    */
  type __ListOf[O /* <: js.Object */] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: O[number] */ js.Any
  ]
  
  /**
    * @hidden
    */
  type ___ListOf[O /* <: js.Object */, K, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0ListOf<O, K, I, LN>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<[K], [never]>] */ js.Any
}
