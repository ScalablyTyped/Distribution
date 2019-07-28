package typings.winrt.WindowsNs.UINs.WebUINs

import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ICachedFileUpdaterActivatedEventArgs
import typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen
import typings.winrt.WindowsNs.StorageNs.ProviderNs.CachedFileUpdaterUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUICachedFileUpdaterActivatedEventArgs")
@js.native
class WebUICachedFileUpdaterActivatedEventArgs ()
  extends ICachedFileUpdaterActivatedEventArgs
     with IActivatedEventArgsDeferral {
  /* CompleteClass */
  override var activatedOperation: ActivatedOperation = js.native
  /* CompleteClass */
  override var cachedFileUpdaterUI: CachedFileUpdaterUI = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

