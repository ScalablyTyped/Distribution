package typings.xrm.XrmEnumNs

import typings.xrm.xrmNumbers.`0`
import typings.xrm.xrmNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enumeration for Relationship Type Metadata
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmNumbers.`0`
  - typings.xrm.xrmNumbers.`1`
*/
trait RelationshipType extends js.Object

object RelationshipType {
  @scala.inline
  def ManyToMany: `1` = this.cast(1)
  @scala.inline
  def OneToMany: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

