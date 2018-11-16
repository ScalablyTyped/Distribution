package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubmitMode extends js.Object

/**
     * Constant Enum: Submit Modes for {@link Attributes.Attribute.setSubmitMode} Attributes.Attribute.setSubmitMode().
     * @see {@link Xrm.SubmitMode}
     */
@JSGlobal("XrmEnum.SubmitMode")
@js.native
object SubmitMode extends js.Object {
  @js.native
  sealed trait Always
    extends xrmLib.XrmEnumNs.SubmitMode
  
  @js.native
  sealed trait Dirty
    extends xrmLib.XrmEnumNs.SubmitMode
  
  @js.native
  sealed trait Never
    extends xrmLib.XrmEnumNs.SubmitMode
  
  /* "always" */ val Always: Always with java.lang.String = js.native
  /* "dirty" */ val Dirty: Dirty with java.lang.String = js.native
  /* "never" */ val Never: Never with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.SubmitMode with java.lang.String] = js.native
}

