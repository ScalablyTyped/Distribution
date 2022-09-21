package typings.winrt.Windows.UI.WebUI

import typings.winrt.Windows.ApplicationModel.Activation.IActivatedEventArgs
import typings.winrt.Windows.ApplicationModel.ISuspendingEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActivatedEventHandler = js.Function2[/* sender */ Any, /* eventArgs */ IActivatedEventArgs, Unit]

type NavigatedEventHandler = js.Function2[/* sender */ Any, /* e */ IWebUINavigatedEventArgs, Unit]

type ResumingEventHandler = js.Function1[/* sender */ Any, Unit]

type SuspendingEventHandler = js.Function2[/* sender */ Any, /* e */ ISuspendingEventArgs, Unit]
