package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibNumbers.`1`
  - xrmLib.xrmLibNumbers.`2`
  - xrmLib.xrmLibNumbers.`3`
  - xrmLib.xrmLibNumbers.`4`
*/
trait ClientFormFactor extends js.Object

object ClientFormFactor {
  @scala.inline
  def Desktop: xrmLib.xrmLibNumbers.`2` = this.cast(2)
  @scala.inline
  def Phone: xrmLib.xrmLibNumbers.`4` = this.cast(4)
  @scala.inline
  def Tablet: xrmLib.xrmLibNumbers.`3` = this.cast(3)
  @scala.inline
  def Unknown: xrmLib.xrmLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

