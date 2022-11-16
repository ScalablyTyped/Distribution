package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectPUpdateMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Path extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/P/Update.UpdateAt<O, Path, A> : never
    }}}
    */
  type Update[O /* <: js.Object */, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, A /* <: Any */] = O
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn ? O : Path extends [ts-toolbelt.ts-toolbelt/out/Any/Key.Key] ? O extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? ts-toolbelt.ts-toolbelt/out/List/Update.Update<O, Path[0], A> : O extends object ? ts-toolbelt.ts-toolbelt/out/Object/Update.Update<O, Path[0], A> : O : {[ K in keyof O ]: K extends Path[0]? ts-toolbelt.ts-toolbelt/out/Object/P/Update.UpdateAt<O[K], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<Path>, A> : O[K]}
    }}}
    */
  type UpdateAt[O, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, A] = O
}
