package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectPOmitMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Path extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/P/Omit.OmitAt<O, Path> : never
    }}}
    */
  @js.native
  trait Omit[O /* <: js.Object */, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */] extends StObject
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn ? O : Path extends [ts-toolbelt.ts-toolbelt/out/Any/Key.Key] ? O extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? ts-toolbelt.ts-toolbelt/out/List/Omit._Omit<O, Path[0]> : O extends object ? ts-toolbelt.ts-toolbelt/out/Object/Omit._Omit<O, Path[0]> : O : {[ K in keyof O ]: K extends Path[0]? ts-toolbelt.ts-toolbelt/out/Object/P/Omit.OmitAt<O[K], ts-toolbelt.ts-toolbelt/out/List/Tail.Tail<Path>> : O[K]}
    }}}
    */
  @js.native
  trait OmitAt[O, Path /* <: typings.tsToolbelt.outListListMod.List[Key] */] extends StObject
}
