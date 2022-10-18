package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectPUpdateMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Path extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/P/Update.UpdateAt<O, Path, A> : never
    }}}
    */
  @js.native
  trait Update[O /* <: js.Object */, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, A /* <: Any */] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn ? O : Path extends [ts-toolbelt.ts-toolbelt/out/Any/Key.Key] ? O extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? ts-toolbelt.ts-toolbelt/out/List/Update.Update<O, Path[0], A> : O extends object ? ts-toolbelt.ts-toolbelt/out/Object/Update.Update<O, Path[0], A> : O : {[ K in keyof O ]: K extends Path[0]? ts-toolbelt.ts-toolbelt/out/Object/P/Update.UpdateAt<O[K], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<Path>, A> : O[K]}
    }}}
    */
  @js.native
  trait UpdateAt[O, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */, A] extends StObject
}
