package typings.useSidecar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren[T /* <: js.Array[_] */] extends js.Object {
  def children(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param prop because its type T is not an array type */ prop: T
  ): js.Any
}

object AnonChildren {
  @scala.inline
  def apply[T /* <: js.Array[_] */](children: T => js.Any): AnonChildren[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[AnonChildren[T]]
  }
}

