package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetApplicationChosenEventArgs
  extends StObject
     with ITargetApplicationChosenEventArgs
object TargetApplicationChosenEventArgs {
  
  @scala.inline
  def apply(applicationName: String): TargetApplicationChosenEventArgs = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetApplicationChosenEventArgs]
  }
}
