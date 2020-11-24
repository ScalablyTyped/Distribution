package typings.tstl.ipointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPointer[T] extends js.Object {
  
  /**
    * Reference of the value.
    */
  var value: T = js.native
}
@JSImport("tstl/functional/IPointer", "IPointer")
@js.native
object IPointer extends js.Object {
  
  /**
    * Inference of value type.
    */
  type ValueType[Pointer /* <: IPointer[_] */] = js.Any
}
