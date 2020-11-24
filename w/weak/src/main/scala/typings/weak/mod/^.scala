package typings.weak.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("weak", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Makes weak references to JavaScript Objects
    * @param object can be a regular Object, an Array, a Function, a RegExp, or any of the primitive types or constructor function created with new
    * @param callback a callback function to be invoked before the object is garbage collected
    */
  def apply[T /* <: js.Object */](`object`: T): WeakRef[T] = js.native
  def apply[T /* <: js.Object */](`object`: T, callback: js.Function0[Unit]): WeakRef[T] = js.native
}
