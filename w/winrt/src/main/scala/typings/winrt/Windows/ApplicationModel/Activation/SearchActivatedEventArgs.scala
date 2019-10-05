package typings.winrt.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.SearchActivatedEventArgs")
@js.native
class SearchActivatedEventArgs () extends ISearchActivatedEventArgs {
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var language: String = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var queryText: String = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

