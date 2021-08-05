package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreWindowPopupShowingEventArgs
  extends StObject
     with ICoreWindowPopupShowingEventArgs
object CoreWindowPopupShowingEventArgs {
  
  inline def apply(setDesiredSize: Size => Unit): CoreWindowPopupShowingEventArgs = {
    val __obj = js.Dynamic.literal(setDesiredSize = js.Any.fromFunction1(setDesiredSize))
    __obj.asInstanceOf[CoreWindowPopupShowingEventArgs]
  }
}
