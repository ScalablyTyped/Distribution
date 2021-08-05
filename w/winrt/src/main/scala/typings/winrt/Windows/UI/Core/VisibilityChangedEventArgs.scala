package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibilityChangedEventArgs
  extends StObject
     with IVisibilityChangedEventArgs
object VisibilityChangedEventArgs {
  
  inline def apply(handled: Boolean, visible: Boolean): VisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityChangedEventArgs]
  }
}
