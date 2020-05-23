package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Data.Text.TextSegment
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about why search results matched the query parameters. */
trait ContactMatchReason extends js.Object {
  /** Gets the contact field type that matched the search, such as name, phone number, email address and so on. */
  var field: ContactMatchReasonKind
  /** Gets a list of matching TextSegment objects which tells you what to highlight in your view as the result of a contact search. */
  var segments: IVectorView[TextSegment]
  /** Gets the matching text result from a contact search. */
  var text: String
}

object ContactMatchReason {
  @scala.inline
  def apply(field: ContactMatchReasonKind, segments: IVectorView[TextSegment], text: String): ContactMatchReason = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactMatchReason]
  }
}

