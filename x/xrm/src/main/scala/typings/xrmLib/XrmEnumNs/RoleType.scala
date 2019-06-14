package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enumeration for Relationship Role Type Metadata
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibNumbers.`1`
  - xrmLib.xrmLibNumbers.`2`
*/
trait RoleType extends js.Object

object RoleType {
  @scala.inline
  def AssociationEntity: xrmLib.xrmLibNumbers.`2` = this.cast(2)
  @scala.inline
  def Referencing: xrmLib.xrmLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

