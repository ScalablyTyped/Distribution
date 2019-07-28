package typings.ydnDashDb.ydnNs.dbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSGlobal("ydn.db.EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait created extends EventType
  
  @js.native
  sealed trait deleted extends EventType
  
  @js.native
  sealed trait error extends EventType
  
  @js.native
  sealed trait fail extends EventType
  
  @js.native
  sealed trait ready extends EventType
  
  @js.native
  sealed trait updated extends EventType
  
  /* 0 */ val created: typings.ydnDashDb.ydnNs.dbNs.EventType.created with Double = js.native
  /* 1 */ val deleted: typings.ydnDashDb.ydnNs.dbNs.EventType.deleted with Double = js.native
  /* 2 */ val error: typings.ydnDashDb.ydnNs.dbNs.EventType.error with Double = js.native
  /* 3 */ val fail: typings.ydnDashDb.ydnNs.dbNs.EventType.fail with Double = js.native
  /* 4 */ val ready: typings.ydnDashDb.ydnNs.dbNs.EventType.ready with Double = js.native
  /* 5 */ val updated: typings.ydnDashDb.ydnNs.dbNs.EventType.updated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
}

