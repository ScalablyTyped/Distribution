package typings.tsToolbelt

import typings.std.Exclude
import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outObjectPathMod.Path
import typings.tsToolbelt.outObjectUnionOfMod.UnionOf
import typings.tsToolbelt.outStringSplitMod.Split
import typings.tsToolbelt.outUnionSelectMod.Select
import typings.tsToolbelt.tsToolbeltStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outFunctionAutoPathMod {
  
  type AutoPath[O /* <: Any */, P /* <: String */, D /* <: String */] = _AutoPath[O, P, D, Split[P, D]]
  
  /**
    * @ignore
    */
  type ExecPath[A, SP /* <: typings.tsToolbelt.outListListMod.List[Index] */, Delimiter /* <: String */] = NextPath[Path[MetaPath[A, Delimiter, SP, js.Array[Any]], SP]]
  
  /**
    * @ignore
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [Exec] extends [never] ? ts-toolbelt.ts-toolbelt/out/Function/AutoPath.ExecPath<A, ts-toolbelt.ts-toolbelt/out/List/Pop.Pop<SP>, D> : Exec | P
    }}}
    */
  type HintPath[A, P /* <: String */, SP /* <: typings.tsToolbelt.outListListMod.List[Index] */, Exec /* <: String */, D /* <: String */] = Exec | P
  
  /**
    * @ignore
    */
  type Index = Double | String
  
  /**
    * @ignore
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    number extends K ? ts-toolbelt.ts-toolbelt/out/List/Head.Head<SP> : K & ts-toolbelt.ts-toolbelt/out/Function/AutoPath.Index
    }}}
    */
  type KeyToIndex[K /* <: Key */, SP /* <: typings.tsToolbelt.outListListMod.List[Index] */] = K & Index
  
  /**
    * @ignore
    */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof O ]: ts-toolbelt.ts-toolbelt/out/Function/AutoPath.MetaPath<O[K], D, ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<SP>, [...P, ts-toolbelt.ts-toolbelt/out/Function/AutoPath.KeyToIndex<K, SP>]> | ts-toolbelt.ts-toolbelt/out/String/Join.Join<[...P, ts-toolbelt.ts-toolbelt/out/Function/AutoPath.KeyToIndex<K, SP>], D>}
    }}}
    */
  @js.native
  trait MetaPath[O, D /* <: String */, SP /* <: typings.tsToolbelt.outListListMod.List[Index] */, P /* <: typings.tsToolbelt.outListListMod.List[Index] */] extends StObject
  
  /**
    * @ignore
    */
  type NextPath[OP] = Select[UnionOf[(Exclude[OP, String]) & js.Object], String, default]
  
  /**
    * @ignore
    */
  type _AutoPath[A, P /* <: String */, D /* <: String */, SP /* <: typings.tsToolbelt.outListListMod.List[Index] */] = HintPath[A, P, SP, ExecPath[A, SP, D], D]
}
