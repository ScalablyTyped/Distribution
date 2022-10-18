package typings.tsToolbelt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListGroupMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    L extends unknown ? N extends unknown ? ts-toolbelt.ts-toolbelt/out/List/Group._Group<L, N> : never : never
    }}}
    */
  @js.native
  trait Group[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Double */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/List/Group.__Group<L, N, []> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/List/List.List<any>> : never
    }}}
    */
  @js.native
  trait _Group[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Double */] extends StObject
  
  /**
    * @hidden
    */
  type __Group[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, N /* <: Double */, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0Group<L, N, LN>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<L, ts-toolbelt.ts-toolbelt/out/List/List.List<never>>] */ js.Any
}
