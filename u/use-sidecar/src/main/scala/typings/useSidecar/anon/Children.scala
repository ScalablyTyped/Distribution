package typings.useSidecar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children[T /* <: js.Array[_] */] extends js.Object {
  def children(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param prop because its type T is not an array type */ prop: T
  ): js.Any
}

object Children {
  @scala.inline
  def apply[T](children: T => js.Any): Children[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[Children[T]]
  }
}

