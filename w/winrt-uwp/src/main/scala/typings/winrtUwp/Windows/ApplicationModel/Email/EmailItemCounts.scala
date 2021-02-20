package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the counts for various email message attributes such as flagged, important, unread, and so on. */
@js.native
trait EmailItemCounts extends StObject {
  
  /** Gets the number of flagged email messages. */
  var flagged: Double = js.native
  
  /** Gets the number of important email messages. */
  var important: Double = js.native
  
  /** Gets the total number of email messages */
  var total: Double = js.native
  
  /** Gets the number of unread email messages. */
  var unread: Double = js.native
}
object EmailItemCounts {
  
  @scala.inline
  def apply(flagged: Double, important: Double, total: Double, unread: Double): EmailItemCounts = {
    val __obj = js.Dynamic.literal(flagged = flagged.asInstanceOf[js.Any], important = important.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], unread = unread.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailItemCounts]
  }
  
  @scala.inline
  implicit class EmailItemCountsMutableBuilder[Self <: EmailItemCounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlagged(value: Double): Self = StObject.set(x, "flagged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportant(value: Double): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnread(value: Double): Self = StObject.set(x, "unread", value.asInstanceOf[js.Any])
  }
}
