package typings.winrt.global.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.ApplicationModel.SuspendingOperation")
@js.native
open class SuspendingOperation ()
  extends StObject
     with typings.winrt.Windows.ApplicationModel.SuspendingOperation {
  
  /* CompleteClass */
  var deadline: js.Date = js.native
  
  /* CompleteClass */
  override def getDeferral(): typings.winrt.Windows.ApplicationModel.SuspendingDeferral = js.native
}
