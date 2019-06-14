package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enumeration for Relationship Type Metadata
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibNumbers.`0`
  - xrmLib.xrmLibNumbers.`1`
*/
trait RelationshipType extends js.Object

object RelationshipType {
  @scala.inline
  def ManyToMany: xrmLib.xrmLibNumbers.`1` = this.cast(1)
  @scala.inline
  def OneToMany: xrmLib.xrmLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

