package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceJoinMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Strings extends [] ? '' : Strings extends [string | number] ? / * template literal string: ${Strings[0]} * / string : // @ts-expect-error `Rest` is inferred as `unknown` here: https://github.com/microsoft/TypeScript/issues/45281
  Strings extends [string | number, ...infer Rest] ? / * template literal string: ${Strings[0]}${Delimiter}${Join<Rest,Delimiter>} * / string : string
    }}}
    */
  @js.native
  trait Join[Strings /* <: js.Array[String | Double] */, Delimiter /* <: String */] extends StObject
}
