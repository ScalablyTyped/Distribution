package typings.tuyaPanelKit.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabPanelProps
  extends StObject
     with ViewProps {
  
  var background: js.UndefOr[String] = js.undefined
}
object TabPanelProps {
  
  inline def apply(): TabPanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabPanelProps]
  }
  
  extension [Self <: TabPanelProps](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
  }
}
