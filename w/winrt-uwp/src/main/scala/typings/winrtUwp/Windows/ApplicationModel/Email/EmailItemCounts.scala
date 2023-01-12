package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the counts for various email message attributes such as flagged, important, unread, and so on. */
trait EmailItemCounts extends StObject {
  
  /** Gets the number of flagged email messages. */
  var flagged: Double
  
  /** Gets the number of important email messages. */
  var important: Double
  
  /** Gets the total number of email messages */
  var total: Double
  
  /** Gets the number of unread email messages. */
  var unread: Double
}
object EmailItemCounts {
  
  inline def apply(flagged: Double, important: Double, total: Double, unread: Double): EmailItemCounts = {
    val __obj = js.Dynamic.literal(flagged = flagged.asInstanceOf[js.Any], important = important.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], unread = unread.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailItemCounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailItemCounts] (val x: Self) extends AnyVal {
    
    inline def setFlagged(value: Double): Self = StObject.set(x, "flagged", value.asInstanceOf[js.Any])
    
    inline def setImportant(value: Double): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setUnread(value: Double): Self = StObject.set(x, "unread", value.asInstanceOf[js.Any])
  }
}
