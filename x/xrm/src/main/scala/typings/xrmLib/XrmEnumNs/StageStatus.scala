package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StageStatus extends js.Object

/**
  * Constant Enum: Status for {@link ProcessFlow.Stage.getStatus Stage.getStatus()}.
  * @see {@link ProcessFlow.StageStatus}
  */
@JSGlobal("XrmEnum.StageStatus")
@js.native
object StageStatus extends js.Object {
  @js.native
  sealed trait Active
    extends xrmLib.XrmEnumNs.StageStatus
  
  @js.native
  sealed trait Inactive
    extends xrmLib.XrmEnumNs.StageStatus
  
  /* "active" */ val Active: Active with java.lang.String = js.native
  /* "inactive" */ val Inactive: Inactive with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.StageStatus with java.lang.String] = js.native
}

