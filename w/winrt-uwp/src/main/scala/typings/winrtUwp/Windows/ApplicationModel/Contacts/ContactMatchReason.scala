package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Data.Text.TextSegment
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details about why search results matched the query parameters. */
@js.native
trait ContactMatchReason extends StObject {
  
  /** Gets the contact field type that matched the search, such as name, phone number, email address and so on. */
  var field: ContactMatchReasonKind = js.native
  
  /** Gets a list of matching TextSegment objects which tells you what to highlight in your view as the result of a contact search. */
  var segments: IVectorView[TextSegment] = js.native
  
  /** Gets the matching text result from a contact search. */
  var text: String = js.native
}
object ContactMatchReason {
  
  @scala.inline
  def apply(field: ContactMatchReasonKind, segments: IVectorView[TextSegment], text: String): ContactMatchReason = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactMatchReason]
  }
  
  @scala.inline
  implicit class ContactMatchReasonMutableBuilder[Self <: ContactMatchReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: ContactMatchReasonKind): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegments(value: IVectorView[TextSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
