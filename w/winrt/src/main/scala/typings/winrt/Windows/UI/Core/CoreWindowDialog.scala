package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Size
import typings.winrt.Windows.UI.Popups.IUICommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreWindowDialog
  extends StObject
     with ICoreWindowDialog
object CoreWindowDialog {
  
  @scala.inline
  def apply(
    backButtonCommand: /* command */ IUICommand => Unit,
    cancelCommandIndex: Double,
    commands: IVector[IUICommand],
    defaultCommandIndex: Double,
    isInteractionDelayed: Double,
    maxSize: Size,
    minSize: Size,
    onshowing: js.Any,
    showAsync: () => IAsyncOperation[IUICommand],
    title: String
  ): CoreWindowDialog = {
    val __obj = js.Dynamic.literal(backButtonCommand = js.Any.fromFunction1(backButtonCommand), cancelCommandIndex = cancelCommandIndex.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], defaultCommandIndex = defaultCommandIndex.asInstanceOf[js.Any], isInteractionDelayed = isInteractionDelayed.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], onshowing = onshowing.asInstanceOf[js.Any], showAsync = js.Any.fromFunction0(showAsync), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreWindowDialog]
  }
}
