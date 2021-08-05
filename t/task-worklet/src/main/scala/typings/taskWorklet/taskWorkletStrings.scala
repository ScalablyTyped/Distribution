package typings.taskWorklet

import typings.taskWorklet.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskWorkletStrings {
  
  @js.native
  sealed trait cancelled
    extends StObject
       with State
  inline def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait completed
    extends StObject
       with State
  inline def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait fulfilled
    extends StObject
       with State
  inline def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  
  @js.native
  sealed trait pending
    extends StObject
       with State
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait scheduled
    extends StObject
       with State
  inline def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
}
