package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelationshipType extends js.Object

/**
  * An enumeration for Relationship Type Metadata
  */
@JSGlobal("XrmEnum.RelationshipType")
@js.native
object RelationshipType extends js.Object {
  @js.native
  sealed trait ManyToMany
    extends xrmLib.XrmEnumNs.RelationshipType
  
  @js.native
  sealed trait OneToMany
    extends xrmLib.XrmEnumNs.RelationshipType
  
  /* 1 */ val ManyToMany: ManyToMany with scala.Double = js.native
  /* 0 */ val OneToMany: OneToMany with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xrmLib.XrmEnumNs.RelationshipType with scala.Double] = js.native
}

