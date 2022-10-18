package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outMiscBuiltInMod.BuiltIn
import typings.tsToolbelt.outObjectInternalMod.Depth
import typings.tsToolbelt.outObjectPatchMod.PatchFlat
import typings.tsToolbelt.outObjectPickMod._Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectReadonlyMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/Readonly._Readonly<O, K, depth> : never
    }}}
    */
  @js.native
  trait Readonly[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {readonly [ K in keyof O ]: O[K] extends ts-toolbelt.ts-toolbelt/out/Misc/BuiltIn.BuiltIn? O[K] : ts-toolbelt.ts-toolbelt/out/Object/Readonly.ReadonlyDeep<O[K]>}
    }}}
    */
  @js.native
  trait ReadonlyDeep[O] extends StObject
  
  type ReadonlyFlat[O] = (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof O ]: O[K]} */ js.Any) & js.Object
  
  type ReadonlyPart[O /* <: js.Object */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepReadonlyDeep<O>[depth] */ js.Any
  
  type _Readonly[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = PatchFlat[ReadonlyPart[_Pick[O, K], depth], O, BuiltIn, scala.Nothing]
}
