package typings.tsToolbelt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectReadonlyKeysMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends unknown ? ts-toolbelt.ts-toolbelt/out/Object/ReadonlyKeys._ReadonlyKeys<O> : never
    }}}
    */
  @js.native
  trait ReadonlyKeys[O /* <: js.Object */] extends StObject
  
  type _ReadonlyKeys[O /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: -? {  0 :K}[ts-toolbelt.ts-toolbelt/out/Any/Equals.Equals<{-readonly [ Q in K ]: O[K]}, {[ Q in K ]: O[K]}>]}[keyof O] */ js.Any
}
