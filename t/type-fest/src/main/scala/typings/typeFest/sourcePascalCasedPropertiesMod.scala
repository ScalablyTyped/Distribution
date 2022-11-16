package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcePascalCasedPropertiesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Value extends std.Function ? Value : Value extends std.Array<infer U> ? Value : {[ K in keyof Value as type-fest.type-fest/source/pascal-case.PascalCase<K> ]: Value[K]}
    }}}
    */
  type PascalCasedProperties[Value] = Value
}
