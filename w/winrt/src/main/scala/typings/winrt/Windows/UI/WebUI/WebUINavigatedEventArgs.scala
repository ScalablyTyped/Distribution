package typings.winrt.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebUINavigatedEventArgs
  extends StObject
     with IWebUINavigatedEventArgs
object WebUINavigatedEventArgs {
  
  @scala.inline
  def apply(navigatedOperation: WebUINavigatedOperation): WebUINavigatedEventArgs = {
    val __obj = js.Dynamic.literal(navigatedOperation = navigatedOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUINavigatedEventArgs]
  }
}
