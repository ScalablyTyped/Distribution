package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enumeration for window positions when opening a new window
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibNumbers.`1`
  - xrmLib.xrmLibNumbers.`2`
*/
trait WindowPositions extends js.Object

object WindowPositions {
  @scala.inline
  def Center: xrmLib.xrmLibNumbers.`1` = this.cast(1)
  @scala.inline
  def Side: xrmLib.xrmLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

