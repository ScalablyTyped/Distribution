package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceExceptMod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ KeyType in keyof ObjectType as type-fest.type-fest/source/except.Filter<KeyType, KeysType> ]: ObjectType[KeyType]}
    }}}
    */
  @js.native
  trait Except[ObjectType, KeysType /* <: /* keyof ObjectType */ String */] extends StObject
  
  /**
  Filter out keys from an object.
  Returns `never` if `Exclude` is strictly equal to `Key`.
  Returns `never` if `Key` extends `Exclude`.
  Returns `Key` otherwise.
  @example
  ```
  type Filtered = Filter<'foo', 'foo'>;
  //=> never
  ```
  @example
  ```
  type Filtered = Filter<'bar', string>;
  //=> never
  ```
  @example
  ```
  type Filtered = Filter<'bar', 'foo'>;
  //=> 'bar'
  ```
  @see {Except}
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    type-fest.type-fest/source/internal.IsEqual<KeyType, ExcludeType> extends true ? never : KeyType extends ExcludeType ? never : KeyType
    }}}
    */
  type Filter[KeyType, ExcludeType] = KeyType
}
