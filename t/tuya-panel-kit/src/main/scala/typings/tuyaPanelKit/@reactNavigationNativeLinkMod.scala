package typings.tuyaPanelKit

import typings.react.mod.CElement
import typings.react.mod.ReactNode
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Text
import typings.reactNative.mod.TextProps
import typings.std.HTMLAnchorElement
import typings.std.MouseEvent
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationNativeLinkMod` {
  
  @JSImport("tuya-panel-kit/@react-navigation/native/Link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: Props): CElement[TextProps, Text] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[CElement[TextProps, Text]]
  
  // tslint:disable-next-line strict-export-declare-modifiers
  trait Props
    extends StObject
       with TextProps {
    
    var action: js.UndefOr[NavigationAction] = js.undefined
    
    @JSName("children")
    var children_Props: ReactNode
    
    @JSName("onPress")
    var onPress_Props: js.UndefOr[
        js.Function1[
          /* e */ (typings.react.mod.MouseEvent[HTMLAnchorElement, MouseEvent]) | GestureResponderEvent, 
          Unit
        ]
      ] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var to: String
  }
  object Props {
    
    inline def apply(to: String): Props = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAction(value: NavigationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnPress(
        value: /* e */ (typings.react.mod.MouseEvent[HTMLAnchorElement, MouseEvent]) | GestureResponderEvent => Unit
      ): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
