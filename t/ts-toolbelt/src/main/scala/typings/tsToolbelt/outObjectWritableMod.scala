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

object outObjectWritableMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Writable._Writable<O, K, depth> : never
    }}}
    */
  type Writable[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = PatchFlatChoice[WritablePart[_Pick[O, K], depth], O, BuiltIn, scala.Nothing]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {-readonly [ K in keyof O ]: O[K] extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn? O[K] : ts-toolbelt.ts-toolbelt/out/Object/Writable.WritableDeep<O[K]>}
    }}}
    */
  @js.native
  trait WritableDeep[O] extends StObject
  
  type WritableFlat[O] = (/* import warning: importer.ImportType#apply Failed type conversion: {-readonly [ K in keyof O ]: O[K]} */ js.Any) & js.Object
  
  type WritablePart[O /* <: js.Object */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepWritableDeep<O>[depth] */ js.Any
  
  type _Writable[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = PatchFlat[WritablePart[_Pick[O, K], depth], O, BuiltIn, scala.Nothing]
}
