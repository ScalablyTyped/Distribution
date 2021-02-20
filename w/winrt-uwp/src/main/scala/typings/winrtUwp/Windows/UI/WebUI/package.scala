package typings.winrtUwp.Windows.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object WebUI {
  
  /** Represents a method that handles the app activation event. */
  type ActivatedEventHandler = js.Function1[
    /* ev */ typings.winrtUwp.Windows.ApplicationModel.Activation.IActivatedEventArgs with typings.winrtUwp.Windows.WinRTEvent[_], 
    scala.Unit
  ]
  
  /** Represents a method that handles the app navigation event. */
  type NavigatedEventHandler = js.Function1[
    /* ev */ typings.winrtUwp.Windows.UI.WebUI.IWebUINavigatedEventArgs with typings.winrtUwp.Windows.WinRTEvent[_], 
    scala.Unit
  ]
  
  /** Represents a method that handles the app resumption event. */
  type ResumingEventHandler = js.Function1[/* ev */ typings.winrtUwp.Windows.WinRTEvent[js.Any], scala.Unit]
  
  /** Represents a method that handles the app suspension event. */
  type SuspendingEventHandler = js.Function1[
    /* ev */ typings.winrtUwp.Windows.ApplicationModel.ISuspendingEventArgs with typings.winrtUwp.Windows.WinRTEvent[_], 
    scala.Unit
  ]
}
