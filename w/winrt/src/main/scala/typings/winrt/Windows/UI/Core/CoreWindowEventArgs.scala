package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreWindowEventArgs
  extends StObject
     with ICoreWindowEventArgs
object CoreWindowEventArgs {
  
  @scala.inline
  def apply(handled: Boolean): CoreWindowEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreWindowEventArgs]
  }
}
