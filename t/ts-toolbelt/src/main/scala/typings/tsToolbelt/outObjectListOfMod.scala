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
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Iteration/Key.Key<I> extends keyof O ? ts-toolbelt.ts-toolbelt/out/List/Append.Append<LN, O[ts-toolbelt.ts-toolbelt/out/Iteration/Key.Key<I>]> : ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I> extends keyof O ? ts-toolbelt.ts-toolbelt/out/List/Append.Append<LN, O[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>]> : LN
    }}}
    */
  @js.native
  trait AppendExists[O /* <: js.Object */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/ListOf._ListOf<O> : never
    }}}
    */
  @js.native
  trait ListOf[O /* <: js.Object */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Object/ListOf.__ListOf<O> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/List/List.List<any>> : never
    }}}
    */
  @js.native
  trait _ListOf[O /* <: js.Object */] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    number extends keyof O ? std.Array<O[number]> : string extends keyof O ? std.Array<O[string]> : symbol extends keyof O ? std.Array<O[symbol]> : ts-toolbelt.ts-toolbelt/out/Object/ListOf.___ListOf<O, ts-toolbelt.ts-toolbelt/out/Union/Select.Select<keyof O, number | / * template literal string: ${number} * / string, 'default'>, [], ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<0>>
    }}}
    */
  @js.native
  trait __ListOf[O /* <: js.Object */] extends StObject
  
  /**
    * @hidden
    */
  type ___ListOf[O /* <: js.Object */, K, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0ListOf<O, K, I, LN>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<[K], [never]>] */ js.Any
}
