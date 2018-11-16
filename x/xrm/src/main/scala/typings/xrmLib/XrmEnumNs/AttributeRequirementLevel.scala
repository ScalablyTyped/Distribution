package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttributeRequirementLevel extends js.Object

/**
     * Constant Enum: Requirement Level for {@link Attributes.Attribute.getRequiredLevel Attributes.Attribute.getRequiredLevel()} and
     * {@link Attributes.Attribute.setRequiredLevel Attributes.Attribute.setRequiredLevel()}.
     * @see {@link Xrm.Attributes.RequirementLevel}
     */
@JSGlobal("XrmEnum.AttributeRequirementLevel")
@js.native
object AttributeRequirementLevel extends js.Object {
  @js.native
  sealed trait None
    extends xrmLib.XrmEnumNs.AttributeRequirementLevel
  
  @js.native
  sealed trait Recommended
    extends xrmLib.XrmEnumNs.AttributeRequirementLevel
  
  @js.native
  sealed trait Required
    extends xrmLib.XrmEnumNs.AttributeRequirementLevel
  
  /* "none" */ val None: None with java.lang.String = js.native
  /* "recommended" */ val Recommended: Recommended with java.lang.String = js.native
  /* "required" */ val Required: Required with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.AttributeRequirementLevel with java.lang.String] = js.native
}

