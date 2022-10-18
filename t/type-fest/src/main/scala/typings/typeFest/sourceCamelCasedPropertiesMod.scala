package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCamelCasedPropertiesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Value extends std.Function ? Value : Value extends std.Array<infer U> ? Value : {[ K in keyof Value as type-fest.type-fest/source/camel-case.CamelCase<K> ]: Value[K]}
    }}}
    */
  @js.native
  trait CamelCasedProperties[Value] extends StObject
}
