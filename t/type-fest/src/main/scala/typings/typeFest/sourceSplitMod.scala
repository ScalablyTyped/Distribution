package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSplitMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends / * template literal string: ${inferHead}${Delimiter}${inferTail} * / string ? [/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Head * / any, ...type-fest.type-fest/source/split.Split</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tail * / any, Delimiter>] : S extends Delimiter ? [] : [S]
    }}}
    */
  @js.native
  trait Split[S /* <: String */, Delimiter /* <: String */] extends StObject
}
