package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watch[T] extends js.Object {
  /** Closes the watch */
  def close(): Unit
  /** Synchronize with host and get updated program */
  def getProgram(): T
}

object Watch {
  @scala.inline
  def apply[T](close: () => Unit, getProgram: () => T): Watch[T] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getProgram = js.Any.fromFunction0(getProgram))
  
    __obj.asInstanceOf[Watch[T]]
  }
}

