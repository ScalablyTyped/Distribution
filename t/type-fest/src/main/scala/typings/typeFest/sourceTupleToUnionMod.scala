package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceTupleToUnionMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    ArrayType extends [infer Head, ...infer Rest] ? Head | type-fest.type-fest/source/tuple-to-union.TupleToUnion<Rest> : never
    }}}
    */
  @js.native
  trait TupleToUnion[ArrayType] extends StObject
}
