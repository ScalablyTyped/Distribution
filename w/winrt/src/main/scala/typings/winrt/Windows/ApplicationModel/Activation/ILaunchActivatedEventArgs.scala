package typings.winrt.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILaunchActivatedEventArgs extends IActivatedEventArgs {
  var arguments: String = js.native
  var tileId: String = js.native
}

object ILaunchActivatedEventArgs {
  @scala.inline
  def apply(
    arguments: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    tileId: String
  ): ILaunchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], tileId = tileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILaunchActivatedEventArgs]
  }
  @scala.inline
  implicit class ILaunchActivatedEventArgsOps[Self <: ILaunchActivatedEventArgs] (val x: Self) extends AnyVal {
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
    def setArguments(value: String): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileId(value: String): Self = this.set("tileId", value.asInstanceOf[js.Any])
  }
  
}

