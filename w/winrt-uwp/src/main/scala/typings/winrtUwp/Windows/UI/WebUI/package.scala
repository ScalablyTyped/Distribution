package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.IActivatedEventArgs
import typings.winrtUwp.Windows.ApplicationModel.ISuspendingEventArgs
import typings.winrtUwp.Windows.WinRTEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Represents a method that handles the app activation event. */
type ActivatedEventHandler = js.Function1[/* ev */ IActivatedEventArgs & WinRTEvent[Any], Unit]

/** Represents a method that handles the app navigation event. */
type NavigatedEventHandler = js.Function1[/* ev */ IWebUINavigatedEventArgs & WinRTEvent[Any], Unit]

/** Represents a method that handles the app resumption event. */
type ResumingEventHandler = js.Function1[/* ev */ WinRTEvent[Any], Unit]

/** Represents a method that handles the app suspension event. */
type SuspendingEventHandler = js.Function1[/* ev */ ISuspendingEventArgs & WinRTEvent[Any], Unit]
