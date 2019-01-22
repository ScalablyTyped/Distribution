package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "Queue")
@js.native
/**
  * Default Constructor.
  */
class Queue[T] ()
  extends tstlLib.containerMod.Queue[T] {
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(obj: tstlLib.containerQueueMod.Queue[T]) = this()
}

