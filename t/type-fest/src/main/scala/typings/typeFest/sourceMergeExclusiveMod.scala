package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMergeExclusiveMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    FirstType | SecondType extends object ? type-fest.type-fest/source/merge-exclusive.Without<FirstType, SecondType> & SecondType | type-fest.type-fest/source/merge-exclusive.Without<SecondType, FirstType> & FirstType : FirstType | SecondType
    }}}
    */
  @js.native
  trait MergeExclusive[FirstType, SecondType] extends StObject
  
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
