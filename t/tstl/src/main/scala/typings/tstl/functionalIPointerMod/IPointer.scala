package typings.tstl.functionalIPointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointer[T] extends js.Object {
  /**
    * Reference of the value.
    */
  var value: T
}

object IPointer {
  @scala.inline
  def apply[T](value: T): IPointer[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPointer[T]]
  }
}

