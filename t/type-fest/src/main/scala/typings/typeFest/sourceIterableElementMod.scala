package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceIterableElementMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    TargetIterable extends std.Iterable<infer ElementType> ? ElementType : TargetIterable extends std.AsyncIterable<infer ElementType> ? ElementType : never
    }}}
    */
  @js.native
  trait IterableElement[TargetIterable] extends StObject
}
