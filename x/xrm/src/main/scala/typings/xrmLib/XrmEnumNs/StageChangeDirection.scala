package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StageChangeDirection extends js.Object

/**
     * Constant Enum: Direction types for a process stage change event
     * @see {@link ProcessFlow.StageChangeDirection}
     */
@JSGlobal("XrmEnum.StageChangeDirection")
@js.native
object StageChangeDirection extends js.Object {
  @js.native
  sealed trait Next
    extends xrmLib.XrmEnumNs.StageChangeDirection
  
  @js.native
  sealed trait Previous
    extends xrmLib.XrmEnumNs.StageChangeDirection
  
  /* "Next" */ val Next: Next with java.lang.String = js.native
  /* "Previous" */ val Previous: Previous with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.StageChangeDirection with java.lang.String] = js.native
}

