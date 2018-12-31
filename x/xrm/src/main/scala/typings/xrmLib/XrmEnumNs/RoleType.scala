package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoleType extends js.Object

/**
  * An enumeration for Relationship Role Type Metadata
  */
@JSGlobal("XrmEnum.RoleType")
@js.native
object RoleType extends js.Object {
  @js.native
  sealed trait AssociationEntity
    extends xrmLib.XrmEnumNs.RoleType
  
  @js.native
  sealed trait Referencing
    extends xrmLib.XrmEnumNs.RoleType
  
  /* 2 */ val AssociationEntity: AssociationEntity with scala.Double = js.native
  /* 1 */ val Referencing: Referencing with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xrmLib.XrmEnumNs.RoleType with scala.Double] = js.native
}

