package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceReadonlyTupleMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Rest['length'] extends Length ? [...Rest] : // Terminate with readonly array (aka tuple)
  type-fest.type-fest/source/readonly-tuple.BuildTupleHelper<Element, Length, [Element, ...Rest]>
    }}}
    */
  @js.native
  trait BuildTupleHelper[Element, Length /* <: Double */, Rest /* <: js.Array[Element] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    number extends Length ? std.Array<Element> : type-fest.type-fest/source/readonly-tuple.BuildTupleHelper<Element, Length, []>
    }}}
    */
  @js.native
  trait ReadonlyTuple[Element, Length /* <: Double */] extends StObject
}
