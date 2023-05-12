package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcePascalCaseMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    type-fest.type-fest/source/camel-case.CamelCase<Value, {  preserveConsecutiveUppercase :true}> extends string ? std.Capitalize<type-fest.type-fest/source/camel-case.CamelCase<Value, {  preserveConsecutiveUppercase :true}>> : type-fest.type-fest/source/camel-case.CamelCase<Value, {  preserveConsecutiveUppercase :true}>
    }}}
    */
  type PascalCase[Value] = Value
}
