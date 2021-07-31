package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about the target app the user chose to share content with. To get this object, you must handle the TargetApplicationChosen event. */
trait TargetApplicationChosenEventArgs extends StObject {
  
  /** Contains the name of the app that the user chose to share content with. */
  var applicationName: String
}
object TargetApplicationChosenEventArgs {
  
  @scala.inline
  def apply(applicationName: String): TargetApplicationChosenEventArgs = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetApplicationChosenEventArgs]
  }
  
  @scala.inline
  implicit class TargetApplicationChosenEventArgsMutableBuilder[Self <: TargetApplicationChosenEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
  }
}
