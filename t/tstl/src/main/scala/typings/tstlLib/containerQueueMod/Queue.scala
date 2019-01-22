package typings
package tstlLib.containerQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/Queue", "Queue")
@js.native
/**
  * Default Constructor.
  */
class Queue[T] ()
  extends tstlLib.baseContainerAdaptorContainerMod.AdaptorContainer[T, tstlLib.containerListMod.List[T], Queue[T]] {
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(obj: Queue[T]) = this()
  /**
    * Get the last element.
    *
    * @return The last element.
    */
  def back(): T = js.native
  /**
    * Get the first element.
    *
    * @return The first element.
    */
  def front(): T = js.native
}

