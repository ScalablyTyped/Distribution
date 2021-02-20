package typings.winrt.Windows.UI.ViewManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInputPaneStatics extends StObject {
  
  def getForCurrentView(): InputPane = js.native
}
object IInputPaneStatics {
  
  @scala.inline
  def apply(getForCurrentView: () => InputPane): IInputPaneStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
    __obj.asInstanceOf[IInputPaneStatics]
  }
  
  @scala.inline
  implicit class IInputPaneStaticsMutableBuilder[Self <: IInputPaneStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetForCurrentView(value: () => InputPane): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
  }
}
