package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an important date for a contact. */
@js.native
trait ContactDate extends StObject {
  
  /** Gets and sets the day for an important date for a contact. */
  var day: Double = js.native
  
  /** Gets and sets the description for an important date for a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  
  /** Gets and sets the kind of important date for a contact. */
  var kind: ContactDateKind = js.native
  
  /** Gets and sets the month for an important date for a contact. */
  var month: Double = js.native
  
  /** Gets and sets the year for an important date for a contact. */
  var year: Double = js.native
}
object ContactDate {
  
  @scala.inline
  def apply(day: Double, description: String, kind: ContactDateKind, month: Double, year: Double): ContactDate = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactDate]
  }
  
  @scala.inline
  implicit class ContactDateMutableBuilder[Self <: ContactDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ContactDateKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
