package typings.ydnDb.ydn.db

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
@JSGlobal("ydn.db.EventType")
@js.native
object EventType extends StObject {
  
  @js.native
  sealed trait created
    extends StObject
       with EventType
  
  @js.native
  sealed trait deleted
    extends StObject
       with EventType
  
  @js.native
  sealed trait error
    extends StObject
       with EventType
  
  @js.native
  sealed trait fail
    extends StObject
       with EventType
  
  @js.native
  sealed trait ready
    extends StObject
       with EventType
  
  @js.native
  sealed trait updated
    extends StObject
       with EventType
}
