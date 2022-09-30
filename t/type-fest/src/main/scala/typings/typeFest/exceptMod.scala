package typings.typeFest

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptMod {
  
  type Except[ObjectType, KeysType /* <: /* keyof ObjectType */ String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in keyof ObjectType as type-fest.type-fest/source/except.Filter<KeyType, KeysType> ]: ObjectType[KeyType]}
    */ typings.typeFest.typeFestStrings.Except & TopLevel[ObjectType]
  
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
  type Filter[KeyType, ExcludeType] = KeyType
}
