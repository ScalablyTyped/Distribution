package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Data.Text.TextSegment
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details about why search results matched the query parameters. */
@js.native
trait ContactMatchReason extends js.Object {
  
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
  implicit class ContactMatchReasonOps[Self <: ContactMatchReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setField(value: ContactMatchReasonKind): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegments(value: IVectorView[TextSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
