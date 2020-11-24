package typings.when.global.When

import typings.when.When.Descriptor
import typings.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("When.settle")
@js.native
object settle extends js.Object {
  
  /**
    * Returns a promise for an array containing the same number of elements as the input array.
    * Each element is a descriptor object describing of the outcome of the corresponding element in the input.
    * The returned promise will only reject if array itself is a rejected promise. Otherwise,
    * it will always fulfill with an array of descriptors. This is in contrast to when.all,
    * which will reject if any element of array rejects.
    * @memberOf when
    *
    * @param promisesOrValues array of anything, may contain a mix
    *      of {@link Promise}s and values
    */
  def apply[T](promisesOrValues: js.Array[_]): Promise[js.Array[Descriptor[T]]] = js.native
}
