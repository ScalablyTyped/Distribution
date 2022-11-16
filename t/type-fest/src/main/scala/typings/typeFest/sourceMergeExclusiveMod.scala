package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMergeExclusiveMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    FirstType | SecondType extends object ? type-fest.type-fest/source/merge-exclusive.Without<FirstType, SecondType> & SecondType | type-fest.type-fest/source/merge-exclusive.Without<SecondType, FirstType> & FirstType : FirstType | SecondType
    }}}
    */
  type MergeExclusive[FirstType, SecondType] = ((Without[FirstType, SecondType]) & SecondType) | ((Without[SecondType, FirstType]) & FirstType)
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ KeyType in std.Exclude<keyof FirstType, keyof SecondType> ]:? never}
    }}}
    */
  @js.native
  trait Without[FirstType, SecondType] extends StObject
}
