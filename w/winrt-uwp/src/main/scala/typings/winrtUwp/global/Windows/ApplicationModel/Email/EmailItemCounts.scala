package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the counts for various email message attributes such as flagged, important, unread, and so on. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Email.EmailItemCounts")
@js.native
open class EmailItemCounts ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailItemCounts {
  
  /** Gets the number of flagged email messages. */
  /* CompleteClass */
  var flagged: Double = js.native
  
  /** Gets the number of important email messages. */
  /* CompleteClass */
  var important: Double = js.native
  
  /** Gets the total number of email messages */
  /* CompleteClass */
  var total: Double = js.native
  
  /** Gets the number of unread email messages. */
  /* CompleteClass */
  var unread: Double = js.native
}
