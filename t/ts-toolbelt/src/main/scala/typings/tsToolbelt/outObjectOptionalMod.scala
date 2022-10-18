package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outObjectInternalMod.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectOptionalMod {
  
  type Optional[O /* <: js.Object */, K /* <: Key */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0PatchFlat<O, depth, K>[ts-toolbelt.ts-toolbelt/out/Any/Equals.Equals<ts-toolbelt.ts-toolbelt/out/Any/Key.Key, K>] */ js.Any
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof O ]:? ts-toolbelt.ts-toolbelt/out/Object/Optional.OptionalDeep<O[K]>}
    }}}
    */
  @js.native
  trait OptionalDeep[O] extends StObject
  
  type OptionalFlat[O] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]:? O[K]} */ js.Any) & js.Object
  
  type OptionalPart[O /* <: js.Object */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.DeepOptionalDeep<O>[depth] */ js.Any
}
