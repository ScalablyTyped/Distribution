package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outMiscBuiltInMod.BuiltIn
import typings.tsToolbelt.outObjectInternalMod.Depth
import typings.tsToolbelt.outObjectPatchMod.PatchFlat
import typings.tsToolbelt.outObjectPatchMod.PatchFlatChoice
import typings.tsToolbelt.outObjectPickMod._Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectNullableMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Nullable._Nullable<O, K, depth> : never
    }}}
    */
  type Nullable[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = PatchFlatChoice[NullablePart[_Pick[O, K], depth], O, BuiltIn, scala.Nothing]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof O ]: ts-toolbelt.ts-toolbelt/out/Object/Nullable.NullableDeep<ts-toolbelt.ts-toolbelt/out/Union/Nullable.Nullable<O[K]>>}
    }}}
    */
  @js.native
  trait NullableDeep[O] extends StObject
  
  type NullableFlat[O] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: ts-toolbelt.ts-toolbelt/out/Union/Nullable.Nullable<O[K]>} */ js.Any
  
  /**
    * @hidden
    */
  type NullablePart[O /* <: js.Object */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepNullableDeep<O>[depth] */ js.Any
  
  type _Nullable[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = PatchFlat[NullablePart[_Pick[O, K], depth], O, BuiltIn, scala.Nothing]
}
