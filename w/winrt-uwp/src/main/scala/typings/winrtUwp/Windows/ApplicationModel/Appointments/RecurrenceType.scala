package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RecurrenceType extends StObject
/** Specifies the recurrence type of an appointment. */
@JSGlobal("Windows.ApplicationModel.Appointments.RecurrenceType")
@js.native
object RecurrenceType extends StObject {
  
  /** The appointment is an exceptional instance of a recurring appointment. */
  @js.native
  sealed trait exceptionInstance
    extends StObject
       with RecurrenceType
  
  /** The appointment is an instance of a recurring appointment. */
  @js.native
  sealed trait instance
    extends StObject
       with RecurrenceType
  
  /** The appointment is the master appointment for a recurring appointment. */
  @js.native
  sealed trait master
    extends StObject
       with RecurrenceType
}
