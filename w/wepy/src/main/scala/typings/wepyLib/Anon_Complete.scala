package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Complete[T] extends js.Object {
  def complete(): scala.Unit
  def fail(): scala.Unit
  def success(res: T): scala.Unit
}

