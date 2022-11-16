package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outObjectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectPReadonlyMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Path extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/P/Readonly.ReadonlyAt<O, Path, depth> : never
    }}}
    */
  type Readonly[O /* <: js.Object */, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, depth /* <: Depth */] = O
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn ? O : Path extends [ts-toolbelt.ts-toolbelt/out/Any/Key.Key] ? O extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? ts-toolbelt.ts-toolbelt/out/Object/Readonly.Readonly<O, Path[0], depth> : O extends object ? ts-toolbelt.ts-toolbelt/out/Object/Readonly.Readonly<O, Path[0], depth> : O : {[ K in keyof O ]: K extends Path[0]? ts-toolbelt.ts-toolbelt/out/Object/P/Readonly.ReadonlyAt<O[K], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<Path>, depth> : O[K]}
    }}}
    */
  type ReadonlyAt[O, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, depth /* <: Depth */] = O
}
