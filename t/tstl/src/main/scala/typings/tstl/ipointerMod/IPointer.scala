package typings.tstl.ipointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointer[T] extends js.Object {
  /**
    * Reference of the value.
    */
  var value: T
}

@JSImport("tstl/functional/IPointer", "IPointer")
@js.native
object IPointer extends js.Object {
  /**
    * Inference of Value Type.
    */
  type ValueType[Pointer /* <: IPointer[_] */] = js.Any
}

