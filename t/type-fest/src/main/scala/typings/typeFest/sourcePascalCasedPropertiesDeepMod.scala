package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcePascalCasedPropertiesDeepMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Value extends std.Function | std.Date | std.RegExp ? Value : Value extends std.Array<infer U> ? std.Array<type-fest.type-fest/source/pascal-cased-properties-deep.PascalCasedPropertiesDeep<U>> : Value extends std.Set<infer U> ? std.Set<type-fest.type-fest/source/pascal-cased-properties-deep.PascalCasedPropertiesDeep<U>> : {[ K in keyof Value as type-fest.type-fest/source/pascal-case.PascalCase<K> ]: type-fest.type-fest/source/pascal-cased-properties-deep.PascalCasedPropertiesDeep<Value[K]>}
    }}}
    */
  type PascalCasedPropertiesDeep[Value] = Value
}
