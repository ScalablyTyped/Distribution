package typings.xrm.XrmEnum

import typings.xrm.xrmNumbers.`1`
import typings.xrm.xrmNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enumeration for Relationship Role Type Metadata
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmNumbers.`1`
  - typings.xrm.xrmNumbers.`2`
*/
trait RoleType extends js.Object

object RoleType {
  @scala.inline
  def AssociationEntity: `2` = this.cast(2)
  @scala.inline
  def Referencing: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

