package typings.tuyaPanelKit

import typings.tuyaPanelKit.anon.AccessibilityRole
import typings.tuyaPanelKit.routersTypesMod.NavigationAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLinkPropsMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/native/useLinkProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasToAction: Props): AccessibilityRole = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasToAction.asInstanceOf[js.Any]).asInstanceOf[AccessibilityRole]
  
  // tslint:disable-next-line strict-export-declare-modifiers interface-over-type-literal
  trait Props extends StObject {
    
    var action: js.UndefOr[NavigationAction] = js.undefined
    
    var to: String
  }
  object Props {
    
    inline def apply(to: String): Props = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAction(value: NavigationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
