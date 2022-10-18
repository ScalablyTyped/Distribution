package typings.winrtUwp.global.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages an app activation operation. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.ActivatedOperation")
@js.native
open class ActivatedOperation ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation {
  
  /**
    * Requests that the completion of app activation be delayed.
    * @return The activation deferral object.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.UI.WebUI.ActivatedDeferral = js.native
}
