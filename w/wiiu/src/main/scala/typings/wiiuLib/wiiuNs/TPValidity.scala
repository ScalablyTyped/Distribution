package typings
package wiiuLib.wiiuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - wiiuLib.wiiuLibNumbers.`0`
  - wiiuLib.wiiuLibNumbers.`1`
  - wiiuLib.wiiuLibNumbers.`2`
  - wiiuLib.wiiuLibNumbers.`3`
*/
trait TPValidity extends js.Object

object TPValidity {
  @scala.inline
  def INVALID: wiiuLib.wiiuLibNumbers.`3` = this.cast(3)
  @scala.inline
  def VALID: wiiuLib.wiiuLibNumbers.`0` = this.cast(0)
  @scala.inline
  def X_INVALID: wiiuLib.wiiuLibNumbers.`1` = this.cast(1)
  @scala.inline
  def Y_INVALID: wiiuLib.wiiuLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

