package typings.tstl.internalContainerPartialIPushBackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPushBack[T] extends js.Object {
  /**
    * Insert an element at the end.
    *
    * @param val Value to insert.
    */
  def push_back(`val`: T): Unit
}

@JSImport("tstl/internal/container/partial/IPushBack", "IPushBack")
@js.native
object IPushBack extends js.Object {
  type ContainerType[Range /* <: IPushBack[_] */] = js.Any | Range
  type IteratorType[Range /* <: IPushBack[_] */] = js.Any
}

