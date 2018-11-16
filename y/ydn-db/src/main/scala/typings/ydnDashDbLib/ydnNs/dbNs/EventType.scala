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
  
  val created: created with java.lang.String = js.native
  val deleted: deleted with java.lang.String = js.native
  val error: error with java.lang.String = js.native
  val fail: fail with java.lang.String = js.native
  val ready: ready with java.lang.String = js.native
  val updated: updated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ydnDashDbLib.ydnNs.dbNs.EventType with java.lang.String] = js.native
}

