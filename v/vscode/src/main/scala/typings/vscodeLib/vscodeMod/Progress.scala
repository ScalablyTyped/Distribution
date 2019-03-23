package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress[T] extends js.Object {
  /**
  		 * Report a progress update.
  		 * @param value A progress item, like a message and/or an
  		 * report on how much work finished
  		 */
  def report(value: T): scala.Unit
}

object Progress {
  @scala.inline
  def apply[T](report: T => scala.Unit): Progress[T] = {
    val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
  
    __obj.asInstanceOf[Progress[T]]
  }
}

