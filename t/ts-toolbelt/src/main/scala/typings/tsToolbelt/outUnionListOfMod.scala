package typings.tsToolbelt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outUnionListOfMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ts-toolbelt.ts-toolbelt/out/Union/ListOf._ListOf<U, [], ts-toolbelt.ts-toolbelt/out/Union/Last.Last<U>> extends infer X ? ts-toolbelt.ts-toolbelt/out/Any/Cast.Cast<X, ts-toolbelt.ts-toolbelt/out/List/List.List<any>> : never
    }}}
    */
  type ListOf[U /* <: Any */] = typings.tsToolbelt.outListListMod.List[Any]
  
  /**
    * @hidden
    */
  type _ListOf[U, LN /* <: typings.tsToolbelt.outListListMod.List[Any] */, LastU] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.1LN<U, LastU, LN>[ts-toolbelt.ts-toolbelt/out/Any/Extends.Extends<[U], [never]>] */ js.Any
}
