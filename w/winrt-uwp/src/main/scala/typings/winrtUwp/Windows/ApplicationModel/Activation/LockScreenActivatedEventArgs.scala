package typings.winrtUwp.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an event that occurs when the app is activated as the lock screen. */
@js.native
trait LockScreenActivatedEventArgs extends js.Object {
  /** Gets an object that allows an app that is activated as the lock screen to get the same data that the default lock screen can access, and to register for updates to that data. */
  var info: js.Any = js.native
  /** Gets the reason for the activation of the app for this event. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before the app was activated as the lock screen. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

object LockScreenActivatedEventArgs {
  @scala.inline
  def apply(
    info: js.Any,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): LockScreenActivatedEventArgs = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockScreenActivatedEventArgs]
  }
  @scala.inline
  implicit class LockScreenActivatedEventArgsOps[Self <: LockScreenActivatedEventArgs] (val x: Self) extends AnyVal {
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
    def setInfo(value: js.Any): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ActivationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = this.set("previousExecutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = this.set("splashScreen", value.asInstanceOf[js.Any])
  }
  
}

