package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowSizeChangedEventArgs
  extends StObject
     with IWindowSizeChangedEventArgs
object WindowSizeChangedEventArgs {
  
  inline def apply(handled: Boolean, size: Size): WindowSizeChangedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowSizeChangedEventArgs]
  }
}
