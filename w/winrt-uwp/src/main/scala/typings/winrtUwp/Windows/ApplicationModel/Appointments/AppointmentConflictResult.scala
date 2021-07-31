package typings.winrtUwp.Windows.ApplicationModel.Appointments

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a conflict between appointments. */
trait AppointmentConflictResult extends StObject {
  
  /** Gets the date of the appointment conflict. */
  var date: Date
  
  /** Gets a value indicating the type of appointment conflict. */
  var `type`: AppointmentConflictType
}
object AppointmentConflictResult {
  
  @scala.inline
  def apply(date: Date, `type`: AppointmentConflictType): AppointmentConflictResult = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentConflictResult]
  }
  
  @scala.inline
  implicit class AppointmentConflictResultMutableBuilder[Self <: AppointmentConflictResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AppointmentConflictType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
