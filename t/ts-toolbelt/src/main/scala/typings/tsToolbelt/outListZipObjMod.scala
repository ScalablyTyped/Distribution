package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outIterationIterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListZipObjMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    LKeys extends unknown ? LFields extends unknown ? ts-toolbelt.ts-toolbelt/out/List/ZipObj._ZipObj<LKeys, LFields> : never : never
    }}}
    */
  @js.native
  trait ZipObj[LKeys /* <: typings.tsToolbelt.outListListMod.List[Key] */, LFields /* <: typings.tsToolbelt.outListListMod.List[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/List/ZipObj.__ZipObj<ts-toolbelt.ts-toolbelt/out/List/_Internal.Naked<LKeys>, LFields, {}, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<0>> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, object> : never
    }}}
    */
  @js.native
  trait _ZipObj[LKeys /* <: typings.tsToolbelt.outListListMod.List[Key] */, LFields /* <: typings.tsToolbelt.outListListMod.List[Any] */] extends StObject
  
  /**
    * @hidden
    */
  type __ZipObj[LKeys /* <: typings.tsToolbelt.outListListMod.List[Key] */, LFields /* <: typings.tsToolbelt.outListListMod.List[Any] */, O /* <: js.Object */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0ZipObj<LKeys, LFields, O, I>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>, ts-toolbelt.ts-toolbelt/out/List/Length.Length<LKeys>>] */ js.Any
}
