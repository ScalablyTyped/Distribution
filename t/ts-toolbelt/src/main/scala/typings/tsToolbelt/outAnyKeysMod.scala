package typings.tsToolbelt

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outAnyKeysMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    A extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? std.Exclude<keyof A, std.Array<keyof any>> | number : keyof A
    }}}
    */
  type Keys[A /* <: Any */] = (Exclude[/* keyof A */ String, js.Array[/* keyof any */ String]]) | Double
}
