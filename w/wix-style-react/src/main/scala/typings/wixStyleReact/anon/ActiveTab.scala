package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveTab extends StObject {
  
  var activeTab: String
}
object ActiveTab {
  
  inline def apply(activeTab: String): ActiveTab = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTab]
  }
  
  extension [Self <: ActiveTab](x: Self) {
    
    inline def setActiveTab(value: String): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
  }
}
