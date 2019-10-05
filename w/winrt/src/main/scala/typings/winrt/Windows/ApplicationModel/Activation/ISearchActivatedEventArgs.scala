package typings.winrt.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchActivatedEventArgs extends IActivatedEventArgs {
  var language: String
  var queryText: String
}

object ISearchActivatedEventArgs {
  @scala.inline
  def apply(
    kind: ActivationKind,
    language: String,
    previousExecutionState: ApplicationExecutionState,
    queryText: String,
    splashScreen: SplashScreen
  ): ISearchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind, language = language, previousExecutionState = previousExecutionState, queryText = queryText, splashScreen = splashScreen)
  
    __obj.asInstanceOf[ISearchActivatedEventArgs]
  }
}

