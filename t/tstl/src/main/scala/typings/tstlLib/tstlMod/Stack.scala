package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "Stack")
@js.native
/**
  * Default Constructor.
  */
class Stack[T] ()
  extends tstlLib.containerMod.Stack[T] {
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(obj: tstlLib.containerStackMod.Stack[T]) = this()
}

