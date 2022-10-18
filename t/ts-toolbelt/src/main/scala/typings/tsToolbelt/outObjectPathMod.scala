package typings.tsToolbelt

import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outIterationIterationMod.Iteration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectPathMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Object/Path._Path<O & {}, P, ts-toolbelt.ts-toolbelt/out/Iteration/IterationOf.IterationOf<0>> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, any> : never
    }}}
    */
  @js.native
  trait Path[O /* <: Any */, P /* <: typings.tsToolbelt.outListListMod.List[Key] */] extends StObject
  
  /**
    * @ignore
    */
  type _Path[O, P /* <: typings.tsToolbelt.outListListMod.List[Key] */, I /* <: Iteration */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.0Path<O, P, I>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>, ts-toolbelt.ts-toolbelt/out/List/Length.Length<P>>] */ js.Any
}
