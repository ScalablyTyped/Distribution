package typings.tsToolbelt

import typings.tsToolbelt.outAnyComputeMod.ComputeRaw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outUnionStrictMod {
  
  type Strict[U /* <: js.Object */] = ComputeRaw[_Strict[U, U]]
  
  /**
    * @hidden
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    U extends unknown ? U & ts-toolbelt.ts-toolbelt/out/Object/Optional.OptionalFlat<ts-toolbelt.ts-toolbelt/out/Object/Record.Record<std.Exclude<ts-toolbelt.ts-toolbelt/out/Any/Keys.Keys<_U>, keyof U>, never, ['!', 'W']>> : never
    }}}
    */
  @js.native
  trait _Strict[U, _U] extends StObject
}
