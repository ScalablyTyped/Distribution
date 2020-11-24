package typings.valerieBrowser.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilsStatic extends js.Object {
  
  // Creates a function that returns the given value as an array of one item, or simply returns the given value if it is already an array.
  def asArray[T](value: js.Any): js.Array[_] = js.native
  
  def asFunction[T](fn: js.Function0[T]): js.Function0[T] = js.native
  // Creates a function that returns the given value, or simply returns the given value if it is already a function
  def asFunction[T](value: T): js.Function0[T] = js.native
  
  // Tests whether the given value is an array
  def isArray(value: js.Any): Boolean = js.native
  
  // Tests whether the given value is an array or object.
  def isArrayOrObject(value: js.Any): Boolean = js.native
  
  // Tests whether the given value is a function.
  def isFunction(value: js.Any): Boolean = js.native
  
  // Tests whether the given value is "missing".undefined, null, an empty string or an empty array are considered to be "missing".
  def isMissing(value: js.Any): Boolean = js.native
  
  // Tests whether the given value is an object.
  def isObject(value: js.Any): Boolean = js.native
  
  // Tests whether the give value is a string.
  def isString(value: js.Any): Boolean = js.native
  
  //Merges the given default options with the given options.
  //  - either parameter can be omitted and a clone of the other parameter will be returned
  //  - the merge is shallow
  //  - array properties are shallow cloned
  def mergeOptions(defaultOptions: ValidationOptions, options: js.Any): ValidationOptions = js.native
}
