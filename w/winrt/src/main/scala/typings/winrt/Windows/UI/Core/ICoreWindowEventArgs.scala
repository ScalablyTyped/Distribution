package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreWindowEventArgs extends StObject {
  
  var handled: Boolean
}
object ICoreWindowEventArgs {
  
  @scala.inline
  def apply(handled: Boolean): ICoreWindowEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreWindowEventArgs]
  }
  
  @scala.inline
  implicit class ICoreWindowEventArgsMutableBuilder[Self <: ICoreWindowEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
