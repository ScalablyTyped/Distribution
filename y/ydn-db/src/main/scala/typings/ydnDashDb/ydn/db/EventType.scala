package typings.ydnDashDb.ydn.db

import org.scalablytyped.runtime.TopLevel
import typings.ydnDashDb.ydn.db.EventType.created
import typings.ydnDashDb.ydn.db.EventType.deleted
import typings.ydnDashDb.ydn.db.EventType.error
import typings.ydnDashDb.ydn.db.EventType.fail
import typings.ydnDashDb.ydn.db.EventType.ready
import typings.ydnDashDb.ydn.db.EventType.updated
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
  /* 0 */ @js.native
  object created extends TopLevel[created with Double]
  
  /* 1 */ @js.native
  object deleted extends TopLevel[deleted with Double]
  
  /* 2 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 3 */ @js.native
  object fail extends TopLevel[fail with Double]
  
  /* 4 */ @js.native
  object ready extends TopLevel[ready with Double]
  
  /* 5 */ @js.native
  object updated extends TopLevel[updated with Double]
  
}

