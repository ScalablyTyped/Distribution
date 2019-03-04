package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchActivatedEventArgs extends IActivatedEventArgs {
  var language: java.lang.String
  var queryText: java.lang.String
}

object ISearchActivatedEventArgs {
  @scala.inline
  def apply(
    kind: ActivationKind,
    language: java.lang.String,
    previousExecutionState: ApplicationExecutionState,
    queryText: java.lang.String,
    splashScreen: SplashScreen
  ): ISearchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind, language = language, previousExecutionState = previousExecutionState, queryText = queryText, splashScreen = splashScreen)
  
    __obj.asInstanceOf[ISearchActivatedEventArgs]
  }
}

