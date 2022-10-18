package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information for a device that invokes AutoPlay. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.DeviceActivatedEventArgs")
@js.native
open class DeviceActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.DeviceActivatedEventArgs {
  
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  var currentlyShownApplicationViewId: Double = js.native
  
  /** Gets the device identifier for the device that invoked AutoPlay. */
  /* CompleteClass */
  var deviceInformationId: String = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  
  /** Gets the action associated with the activated device. */
  /* CompleteClass */
  var verb: String = js.native
  
  /** Gets the view switcher object that allows you to set the view for the application. */
  /* CompleteClass */
  var viewSwitcher: ActivationViewSwitcher = js.native
}
