package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProcessStatus extends js.Object

/**
  * Constant Enum: Status for {@link ProcessFlow.Process.getStatus Process.getStatus()}.
  * @see {@link ProcessFlow.ProcessStatus}
  */
@JSGlobal("XrmEnum.ProcessStatus")
@js.native
object ProcessStatus extends js.Object {
  @js.native
  sealed trait Aborted
    extends xrmLib.XrmEnumNs.ProcessStatus
  
  @js.native
  sealed trait Active
    extends xrmLib.XrmEnumNs.ProcessStatus
  
  @js.native
  sealed trait Finished
    extends xrmLib.XrmEnumNs.ProcessStatus
  
  /* "aborted" */ val Aborted: Aborted with java.lang.String = js.native
  /* "active" */ val Active: Active with java.lang.String = js.native
  /* "finished" */ val Finished: Finished with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.ProcessStatus with java.lang.String] = js.native
}

