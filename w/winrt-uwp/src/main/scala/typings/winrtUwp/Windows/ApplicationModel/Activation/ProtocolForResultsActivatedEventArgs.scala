package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.System.ProtocolForResultsOperation
import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Received by an application when it is launched by another application with the expectation that it will return results back to the caller. */
@js.native
trait ProtocolForResultsActivatedEventArgs extends js.Object {
  /** Gets the package family name of the application that activated the current application. */
  var callerPackageFamilyName: String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Data received from the application that activated the current application. */
  var data: ValueSet = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the ProtocolForResultsOperation that you use to signal that your app is ready to return to the app that launched it for results. */
  var protocolForResultsOperation: ProtocolForResultsOperation = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the Uniform Resource Identifier (URI) used to activate the app. */
  var uri: Uri = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher = js.native
}

object ProtocolForResultsActivatedEventArgs {
  @scala.inline
  def apply(
    callerPackageFamilyName: String,
    currentlyShownApplicationViewId: Double,
    data: ValueSet,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    protocolForResultsOperation: ProtocolForResultsOperation,
    splashScreen: SplashScreen,
    uri: Uri,
    viewSwitcher: ActivationViewSwitcher
  ): ProtocolForResultsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(callerPackageFamilyName = callerPackageFamilyName.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], protocolForResultsOperation = protocolForResultsOperation.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], viewSwitcher = viewSwitcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolForResultsActivatedEventArgs]
  }
  @scala.inline
  implicit class ProtocolForResultsActivatedEventArgsOps[Self <: ProtocolForResultsActivatedEventArgs] (val x: Self) extends AnyVal {
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
    def setProtocolForResultsOperation(value: ProtocolForResultsOperation): Self = this.set("protocolForResultsOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = this.set("splashScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: Uri): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewSwitcher(value: ActivationViewSwitcher): Self = this.set("viewSwitcher", value.asInstanceOf[js.Any])
  }
  
}

