package typings.tsToolbelt

import typings.tsToolbelt.outAnyTryMod.Try
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outFunctionNarrowMod {
  
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
  type NarrowRaw[A] = /* import warning: importer.ImportType#apply Failed type conversion: A extends [] ? [] : never */ js.Any
}
