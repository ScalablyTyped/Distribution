package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated because it is the app associated with a URI scheme name. */
@js.native
trait WebUIProtocolActivatedEventArgs extends js.Object {
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the family name of the caller's package. */
  var callerPackageFamilyName: String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets the data used for activation. */
  var data: ValueSet = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the Uniform Resource Identifier (URI) for which the app was activated. */
  var uri: Uri = js.native
}

object WebUIProtocolActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    callerPackageFamilyName: String,
    currentlyShownApplicationViewId: Double,
    data: ValueSet,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    uri: Uri
  ): WebUIProtocolActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], callerPackageFamilyName = callerPackageFamilyName.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIProtocolActivatedEventArgs]
  }
  @scala.inline
  implicit class WebUIProtocolActivatedEventArgsOps[Self <: WebUIProtocolActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivatedOperation(value: ActivatedOperation): Self = this.set("activatedOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallerPackageFamilyName(value: String): Self = this.set("callerPackageFamilyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentlyShownApplicationViewId(value: Double): Self = this.set("currentlyShownApplicationViewId", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: ValueSet): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ActivationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = this.set("previousExecutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = this.set("splashScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: Uri): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

