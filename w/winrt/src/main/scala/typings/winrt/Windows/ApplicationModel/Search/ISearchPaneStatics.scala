package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchPaneStatics extends StObject {
  
  def getForCurrentView(): SearchPane = js.native
}
object ISearchPaneStatics {
  
  @scala.inline
  def apply(getForCurrentView: () => SearchPane): ISearchPaneStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView))
    __obj.asInstanceOf[ISearchPaneStatics]
  }
  
  @scala.inline
  implicit class ISearchPaneStaticsMutableBuilder[Self <: ISearchPaneStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetForCurrentView(value: () => SearchPane): Self = StObject.set(x, "getForCurrentView", js.Any.fromFunction0(value))
  }
}
