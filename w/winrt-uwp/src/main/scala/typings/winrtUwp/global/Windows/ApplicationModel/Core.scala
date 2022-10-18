package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  /** Provides an app's display info such as its display name and description, and a method to launch the app. */
  /* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Core.AppListEntry")
  @js.native
  open class AppListEntry ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Core.AppListEntry {
    
    /** Provides an app's display name, description, and logo. */
    /* CompleteClass */
    var displayInfo: typings.winrtUwp.Windows.ApplicationModel.AppDisplayInfo = js.native
    
    /**
      * Launches the app associated with this AppListEntry
      * @return If the launch fails for any reason, the Boolean value is false
      */
    /* CompleteClass */
    override def launchAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
}
