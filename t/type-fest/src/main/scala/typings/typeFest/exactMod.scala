package typings.typeFest

import org.scalablytyped.runtime.TopLevel
import typings.std.Exclude
import typings.std.Record
import typings.typeFest.internalMod.KeysOfUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exactMod {
  
  /**
  Extract the element of an array that also works for array union.
  Returns `never` if T is not an array.
  It creates a type-safe way to access the element type of `unknown` type.
  */
  type ArrayElement[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  
  type Exact[ParameterType, InputType] = ParameterType | (ExactObject[ParameterType, InputType]) | js.Array[Any]
  
  /**
  Create a type from `ParameterType` and `InputType` and change keys exclusive to `InputType` to `never`.
  - Generate a list of keys that exists in `InputType` but not in `ParameterType`.
  - Mark these excess keys as `never`.
  */
  type ExactObject[ParameterType, InputType] = typings.typeFest.typeFestStrings.ExactObject & TopLevel[ParameterType] & (Record[Exclude[/* keyof InputType */ String, KeysOfUnion[ParameterType]], scala.Nothing])
  
  /**
  Extract the object field type if T is an object and K is a key of T, return `never` otherwise.
  It creates a type-safe way to access the member type of `unknown` type.
  */
  type ObjectValue[T, K] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
}
