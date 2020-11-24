package typings.ydnDb.ydn.db

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
