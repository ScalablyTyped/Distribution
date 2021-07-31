package typings.tuyaPanelKit

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerBackgroundMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/stack/views/Header/HeaderBackground", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasStyleRest: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStyleRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  // tslint:disable-next-line strict-export-declare-modifiers
  trait Props
    extends StObject
       with ViewProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    @JSName("style")
    var style_Props: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
