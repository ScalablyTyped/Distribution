package typings.tuyaPanelKit.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabPanelProps extends ViewProps {
  
  var background: js.UndefOr[String] = js.native
}
object TabPanelProps {
  
  @scala.inline
  def apply(): TabPanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabPanelProps]
  }
  
  @scala.inline
  implicit class TabPanelPropsMutableBuilder[Self <: TabPanelProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
  }
}
