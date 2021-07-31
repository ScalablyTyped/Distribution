package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabPaneProps
  extends StObject
     with TabProps {
  
  var tab: js.UndefOr[ReactNode] = js.undefined
  
  var tabWidth: js.UndefOr[Double] = js.undefined
}
object TabPaneProps {
  
  @scala.inline
  def apply(): TabPaneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabPaneProps]
  }
  
  @scala.inline
  implicit class TabPanePropsMutableBuilder[Self <: TabPaneProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTab(value: ReactNode): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    
    @scala.inline
    def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
  }
}
