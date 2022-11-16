package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectPPickMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Path extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/P/Pick.PickAt<O, Path> : never
    }}}
    */
  type Pick[O /* <: js.Object */, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */] = O
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [] extends Path ? O : O extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn ? O : O extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? ts-toolbelt.ts-toolbelt/out/Object/ListOf._ListOf<{[ K in keyof ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, Path[0]> ]: ts-toolbelt.ts-toolbelt/out/Object/P/Pick.PickAt<O[K], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<Path>>}> : O extends object ? {[ K in keyof ts-toolbelt.ts-toolbelt/out/Object/Pick._Pick<O, Path[0]> ]: ts-toolbelt.ts-toolbelt/out/Object/P/Pick.PickAt<O[K], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<Path>>} : O
    }}}
    */
  type PickAt[O, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */] = O
}
