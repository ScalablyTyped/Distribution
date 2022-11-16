package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outObjectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectPMergeMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Path extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/P/Merge.MergeAt<O, Path, O1, depth> : never
    }}}
    */
  type Merge[O /* <: js.Object */, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, O1 /* <: js.Object */, depth /* <: Depth */] = O
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn ? O : Path extends [] ? O extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? ts-toolbelt.ts-toolbelt/out/Object/Merge.Merge<O, O1 & {}, depth, ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn, undefined> : O extends object ? ts-toolbelt.ts-toolbelt/out/Object/Merge.Merge<O, O1 & {}, depth, ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn, undefined> : O : {[ K in keyof O ]: K extends Path[0]? ts-toolbelt.ts-toolbelt/out/Object/P/Merge.MergeAt<O[K], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<Path>, O1, depth> : O[K]}
    }}}
    */
  type MergeAt[O, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, O1, depth /* <: Depth */] = O
}
