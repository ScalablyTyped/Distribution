package typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrt.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProtocolActivatedEventArgs extends IActivatedEventArgs {
  var uri: Uri
}

object IProtocolActivatedEventArgs {
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    uri: Uri
  ): IProtocolActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen, uri = uri)
  
    __obj.asInstanceOf[IProtocolActivatedEventArgs]
  }
}

