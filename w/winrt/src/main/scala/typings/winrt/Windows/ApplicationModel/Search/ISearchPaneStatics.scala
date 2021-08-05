package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchPaneStatics extends StObject {
  
  def getForCurrentView(): SearchPane
}
object ISearchPaneStatics {
  
  inline def apply(getForCurrentView: () => SearchPane): ISearchPaneStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
    __obj.asInstanceOf[ISearchPaneStatics]
  }
  
  extension [Self <: ISearchPaneStatics](x: Self) {
    
    inline def setGetForCurrentView(value: () => SearchPane): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
  }
}
