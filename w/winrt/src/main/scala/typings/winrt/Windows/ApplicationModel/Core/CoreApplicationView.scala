package typings.winrt.Windows.ApplicationModel.Core

import typings.winrt.Windows.UI.Core.CoreWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Core.CoreApplicationView")
@js.native
class CoreApplicationView () extends ICoreApplicationView {
  /* CompleteClass */
  override var coreWindow: CoreWindow = js.native
  /* CompleteClass */
  override var isHosted: Boolean = js.native
  /* CompleteClass */
  override var isMain: Boolean = js.native
  /* CompleteClass */
  override var onactivated: js.Any = js.native
}

