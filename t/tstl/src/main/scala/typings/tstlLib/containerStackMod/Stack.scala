package typings
package tstlLib.containerStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/Stack", "Stack")
@js.native
/**
  * Default Constructor.
  */
class Stack[T] ()
  extends tstlLib.baseContainerAdaptorContainerMod.AdaptorContainer[T, tstlLib.containerVectorMod.Vector[T], Stack[T]] {
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(obj: Stack[T]) = this()
  /**
    * Get the last element.
    *
    * @return The last element.
    */
  def top(): T = js.native
}

