package typings.tsToolbelt

import typings.tsToolbelt.outAnyCastMod.Cast
import typings.tsToolbelt.outListInternalMod.Key
import typings.tsToolbelt.outObjectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListNonNullableMod {
  
  type NonNullable[L /* <: typings.tsToolbelt.outListListMod.List[Any] */, K /* <: Key */, depth /* <: Depth */] = Cast[
    NonNullablePart[L, (/* template literal string: ${K&number} */ String) | K, depth], 
    typings.tsToolbelt.outListListMod.List[Any]
  ]
  
  type NonNullableDeep[O, K /* <: Key */] = _NonNullableDeep[NonNullableFlat[O, K]]
  
  type NonNullableFlat[O, K /* <: Key */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof O ]: P extends K? ts-toolbelt.ts-toolbelt/out/Union/NonNullable.NonNullable<O[P]> : O[P]} */ js.Any
  
  type NonNullablePart[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.Flat<O, K>[depth] */ js.Any
  
  /**
    * @hidden
    */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof O ]: O[K] extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn? O[K] : ts-toolbelt.ts-toolbelt/out/List/NonNullable.NonNullableDeep<O[K], ts-toolbelt.ts-toolbelt/out/List/_Internal.Key>}
    }}}
    */
  @js.native
  trait _NonNullableDeep[O] extends StObject
}
