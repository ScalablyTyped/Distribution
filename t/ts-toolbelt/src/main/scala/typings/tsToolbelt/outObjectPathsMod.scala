package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectPathsMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Object/Paths._Paths<O, P> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/List/List.List<ts-toolbelt.ts-toolbelt/out/Any/Key.Key>> : never
    }}}
    */
  type Paths[O, P /* <: typings.tsToolbelt.outListListMod.List[Any] */] = typings.tsToolbelt.outListListMod.List[Key]
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    A extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? A[number] : A[keyof A]
    }}}
    */
  @js.native
  trait UnionOf[A] extends StObject
  
  /**
    * @hidden
    */
  type _Paths[O, P /* <: typings.tsToolbelt.outListListMod.List[Any] */] = UnionOf[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: O[K] extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn | ts-toolbelt.ts-toolbelt/out/Misc/Primitive.Primitive? ts-toolbelt.ts-toolbelt/out/Object/NonNullable.NonNullableFlat<[...P, K | undefined]> : [ts-toolbelt.ts-toolbelt/out/Any/Keys.Keys<O[K]>] extends [never]? ts-toolbelt.ts-toolbelt/out/Object/NonNullable.NonNullableFlat<[...P, K | undefined]> : 12 extends ts-toolbelt.ts-toolbelt/out/List/Length.Length<P>? ts-toolbelt.ts-toolbelt/out/Object/NonNullable.NonNullableFlat<[...P, K | undefined]> : ts-toolbelt.ts-toolbelt/out/Object/Paths._Paths<O[K], [...P, K | undefined]>} */ js.Any
  ]
}
