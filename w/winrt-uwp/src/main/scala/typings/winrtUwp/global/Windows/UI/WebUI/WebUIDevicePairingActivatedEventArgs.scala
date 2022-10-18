package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information for a device that invokes pairing. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.WebUIDevicePairingActivatedEventArgs")
@js.native
open class WebUIDevicePairingActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.WebUIDevicePairingActivatedEventArgs {
  
  /** Gets the app activated operation. */
  /* CompleteClass */
  var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  
  /** Gets info about the device that triggered the operation. */
  /* CompleteClass */
  var deviceInformation: DeviceInformation = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: SplashScreen = js.native
}
