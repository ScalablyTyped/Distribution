package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enumeration for view types.
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibNumbers.`1039`
  - xrmLib.xrmLibNumbers.`4230`
*/
trait ViewType extends js.Object

object ViewType {
  @scala.inline
  def SystemView: xrmLib.xrmLibNumbers.`1039` = this.cast(1039)
  @scala.inline
  def UserView: xrmLib.xrmLibNumbers.`4230` = this.cast(4230)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

