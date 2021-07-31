package typings.winrt.global.Windows.ApplicationModel

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.ApplicationModel.SuspendingOperation")
@js.native
class SuspendingOperation ()
  extends StObject
     with typings.winrt.Windows.ApplicationModel.SuspendingOperation {
  
  /* CompleteClass */
  var deadline: Date = js.native
  
  /* CompleteClass */
  override def getDeferral(): typings.winrt.Windows.ApplicationModel.SuspendingDeferral = js.native
}
