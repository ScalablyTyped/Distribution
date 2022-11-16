package typings.tsToolbelt

import typings.std.Exclude
import typings.tsToolbelt.outAnyComputeMod.ComputeRaw
import typings.tsToolbelt.outAnyKeysMod.Keys
import typings.tsToolbelt.outObjectOptionalMod.OptionalFlat
import typings.tsToolbelt.outObjectRecordMod.Record
import typings.tsToolbelt.tsToolbeltStrings.Exclamationmark
import typings.tsToolbelt.tsToolbeltStrings.W
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
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    U extends unknown ? U & ts-toolbelt.ts-toolbelt/out/Object/Optional.OptionalFlat<ts-toolbelt.ts-toolbelt/out/Object/Record.Record<std.Exclude<ts-toolbelt.ts-toolbelt/out/Any/Keys.Keys<_U>, keyof U>, never, ['!', 'W']>> : never
    }}}
    */
  type _Strict[U, _U] = U & (OptionalFlat[
    Record[
      Exclude[Keys[_U], /* keyof U */ String], 
      scala.Nothing, 
      js.Tuple2[Exclamationmark, W]
    ]
  ])
}
