package typings.tsToolbelt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outAnyKnownKeysMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof O ]: string extends K? never : number extends K? never : K} extends {[ K in keyof O ]: infer U} ? U & ts-toolbelt.ts-toolbelt/out/Any/Keys.Keys<O> : never
    }}}
    */
  @js.native
  trait KnownKeys[O /* <: js.Object */] extends StObject
}
