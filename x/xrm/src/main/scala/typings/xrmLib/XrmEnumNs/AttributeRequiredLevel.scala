package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enumeration for Attribute required level metadata
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibNumbers.`0`
  - xrmLib.xrmLibNumbers.`1`
  - xrmLib.xrmLibNumbers.`2`
  - xrmLib.xrmLibNumbers.`3`
*/
trait AttributeRequiredLevel extends js.Object

object AttributeRequiredLevel {
  @scala.inline
  def ApplicationRequired: xrmLib.xrmLibNumbers.`2` = this.cast(2)
  @scala.inline
  def None: xrmLib.xrmLibNumbers.`0` = this.cast(0)
  @scala.inline
  def Recommended: xrmLib.xrmLibNumbers.`3` = this.cast(3)
  @scala.inline
  def SystemRequired: xrmLib.xrmLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

