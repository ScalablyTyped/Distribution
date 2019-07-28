package typings.xrm.XrmEnumNs

import typings.xrm.xrmNumbers.`0`
import typings.xrm.xrmNumbers.`1`
import typings.xrm.xrmNumbers.`2`
import typings.xrm.xrmNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enumeration for Attribute required level metadata
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmNumbers.`0`
  - typings.xrm.xrmNumbers.`1`
  - typings.xrm.xrmNumbers.`2`
  - typings.xrm.xrmNumbers.`3`
*/
trait AttributeRequiredLevel extends js.Object

object AttributeRequiredLevel {
  @scala.inline
  def ApplicationRequired: `2` = this.cast(2)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def Recommended: `3` = this.cast(3)
  @scala.inline
  def SystemRequired: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

