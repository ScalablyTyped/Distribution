package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a deferred process that will halt a thread until the deferral is complete. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Email.EmailMailboxChangedDeferral")
@js.native
open class EmailMailboxChangedDeferral ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxChangedDeferral {
  
  /** Indicates to waiting processes that the deferral is complete. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}
