package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.SearchActivatedEventArgs")
@js.native
class SearchActivatedEventArgs () extends ISearchActivatedEventArgs {
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var language: java.lang.String = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var queryText: java.lang.String = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

