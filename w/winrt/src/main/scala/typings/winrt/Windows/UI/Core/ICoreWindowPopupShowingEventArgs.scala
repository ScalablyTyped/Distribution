package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreWindowPopupShowingEventArgs extends StObject {
  
  def setDesiredSize(value: Size): Unit
}
object ICoreWindowPopupShowingEventArgs {
  
  inline def apply(setDesiredSize: Size => Unit): ICoreWindowPopupShowingEventArgs = {
    val __obj = js.Dynamic.literal(setDesiredSize = js.Any.fromFunction1(setDesiredSize))
    __obj.asInstanceOf[ICoreWindowPopupShowingEventArgs]
  }
  
  extension [Self <: ICoreWindowPopupShowingEventArgs](x: Self) {
    
    inline def setSetDesiredSize(value: Size => Unit): Self = StObject.set(x, "setDesiredSize", js.Any.fromFunction1(value))
  }
}
