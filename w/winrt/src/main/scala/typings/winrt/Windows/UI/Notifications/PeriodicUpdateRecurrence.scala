package typings.winrt.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PeriodicUpdateRecurrence extends StObject
@JSGlobal("Windows.UI.Notifications.PeriodicUpdateRecurrence")
@js.native
object PeriodicUpdateRecurrence extends StObject {
  
  @js.native
  sealed trait daily
    extends StObject
       with PeriodicUpdateRecurrence
  
  @js.native
  sealed trait halfHour
    extends StObject
       with PeriodicUpdateRecurrence
  
  @js.native
  sealed trait hour
    extends StObject
       with PeriodicUpdateRecurrence
  
  @js.native
  sealed trait sixHours
    extends StObject
       with PeriodicUpdateRecurrence
  
  @js.native
  sealed trait twelveHours
    extends StObject
       with PeriodicUpdateRecurrence
}
