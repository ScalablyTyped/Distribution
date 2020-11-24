package typings.winrtUwp.global.Windows.UI.Text.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The entry point to all services provided by the Windows core text APIs and the text input server. This object is associated with an application's UI thread (the thread that CoreWindow runs on). */
@JSGlobal("Windows.UI.Text.Core.CoreTextServicesManager")
@js.native
abstract class CoreTextServicesManager ()
  extends typings.winrtUwp.Windows.UI.Text.Core.CoreTextServicesManager
/* static members */
@JSGlobal("Windows.UI.Text.Core.CoreTextServicesManager")
@js.native
object CoreTextServicesManager extends js.Object {
  
  /**
    * Gets the CoreTextServicesManager object for the currently active view.
    * @return A CoreTextServicesManager instance, which can be used to create further objects to support the app's text input scenarios.
    */
  def getForCurrentView(): typings.winrtUwp.Windows.UI.Text.Core.CoreTextServicesManager = js.native
}
