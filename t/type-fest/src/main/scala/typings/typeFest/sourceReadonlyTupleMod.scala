package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceReadonlyTupleMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Rest['length'] extends Length ? [...Rest] : // Terminate with readonly array (aka tuple)
  type-fest.type-fest/source/readonly-tuple.BuildTupleHelper<Element, Length, [Element, ...Rest]>
    }}}
    */
  type BuildTupleHelper[Element, Length /* <: Double */, Rest /* <: js.Array[Element] */] = /* import warning: importer.ImportType#apply c repeated non-array type: Rest */ js.Array[Rest]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    number extends Length ? std.Array<Element> : type-fest.type-fest/source/readonly-tuple.BuildTupleHelper<Element, Length, []>
    }}}
    */
  type ReadonlyTuple[Element, Length /* <: Double */] = js.Array[Element]
}
