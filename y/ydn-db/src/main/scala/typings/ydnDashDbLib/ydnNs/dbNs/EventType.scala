package typings
package ydnDashDbLib.ydnNs.dbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSGlobal("ydn.db.EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait created
    extends ydnDashDbLib.ydnNs.dbNs.EventType
  
  @js.native
  sealed trait deleted
    extends ydnDashDbLib.ydnNs.dbNs.EventType
  
  @js.native
  sealed trait error
    extends ydnDashDbLib.ydnNs.dbNs.EventType
  
  @js.native
  sealed trait fail
    extends ydnDashDbLib.ydnNs.dbNs.EventType
  
  @js.native
  sealed trait ready
    extends ydnDashDbLib.ydnNs.dbNs.EventType
  
  @js.native
  sealed trait updated
    extends ydnDashDbLib.ydnNs.dbNs.EventType
  
  /* 0 */ val created: created with scala.Double = js.native
  /* 1 */ val deleted: deleted with scala.Double = js.native
  /* 2 */ val error: error with scala.Double = js.native
  /* 3 */ val fail: fail with scala.Double = js.native
  /* 4 */ val ready: ready with scala.Double = js.native
  /* 5 */ val updated: updated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ydnDashDbLib.ydnNs.dbNs.EventType with scala.Double] = js.native
}

