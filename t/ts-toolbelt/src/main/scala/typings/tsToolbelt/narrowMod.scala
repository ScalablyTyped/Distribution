package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.tryMod.Try
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object narrowMod {
  
  /**
    * Prevent type widening on generic function parameters
    * @param A to narrow
    * @returns `A`
    * @example
    * ```ts
    * import {F} from 'ts-toolbelt'
    *
    * declare function foo<A extends any[]>(x: F.Narrow<A>): A;
    * declare function bar<A extends object>(x: F.Narrow<A>): A;
    *
    * const test0 = foo(['e', 2, true, {f: ['g', ['h']]}])
    * // `A` inferred : ['e', 2, true, {f: ['g']}]
    *
    * const test1 = bar({a: 1, b: 'c', d: ['e', 2, true, {f: ['g']}]})
    * // `A` inferred : {a: 1, b: 'c', d: ['e', 2, true, {f: ['g']}]}
    * ```
    */
  type Narrow[A /* <: Any */] = Try[A, js.Array[Any], NarrowRaw[A]]
  
  /**
    * @hidden
    */
  type NarrowRaw[A] = js.Array[Any] | A | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: A[K] extends std.Function? A[K] : ts-toolbelt.ts-toolbelt/out/Function/Narrow.NarrowRaw<A[K]>}
    */ typings.tsToolbelt.tsToolbeltStrings.NarrowRaw & TopLevel[Any])
}
