package typings.tsToolbelt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListTailMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    L extends [] ? L : L extends [any | undefined, ...infer LTail] ? LTail : L
    }}}
    */
  @js.native
  trait Tail[L /* <: typings.tsToolbelt.outListListMod.List[Any] */] extends StObject
}
