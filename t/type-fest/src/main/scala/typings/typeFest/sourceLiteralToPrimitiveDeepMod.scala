package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceLiteralToPrimitiveDeepMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends object ? T extends std.Array<infer U> ? std.Array<type-fest.type-fest/source/literal-to-primitive-deep.LiteralToPrimitiveDeep<U>> : {[ K in keyof type-fest.type-fest/source/omit-index-signature.OmitIndexSignature<T> ]: type-fest.type-fest/source/literal-to-primitive-deep.LiteralToPrimitiveDeep<T[K]>} : type-fest.type-fest/source/literal-to-primitive.LiteralToPrimitive<T>
    }}}
    */
  type LiteralToPrimitiveDeep[T] = Double
}
