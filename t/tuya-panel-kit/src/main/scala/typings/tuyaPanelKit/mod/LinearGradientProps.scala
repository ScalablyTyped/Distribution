package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  gradientId :string | undefined,   style :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   children :react.react.ReactNode | undefined} & tuya-panel-kit.tuya-panel-kit/theme.LinearGradientBackground */
@js.native
trait LinearGradientProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var gradientId: js.UndefOr[String] = js.native
  
  var stops: js.UndefOr[Record[String, String]] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var x1: js.UndefOr[String] = js.native
  
  var x2: js.UndefOr[String] = js.native
  
  var y1: js.UndefOr[String] = js.native
  
  var y2: js.UndefOr[String] = js.native
}
object LinearGradientProps {
  
  @scala.inline
  def apply(): LinearGradientProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGradientProps]
  }
  
  @scala.inline
  implicit class LinearGradientPropsMutableBuilder[Self <: LinearGradientProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setGradientId(value: String): Self = StObject.set(x, "gradientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientIdUndefined: Self = StObject.set(x, "gradientId", js.undefined)
    
    @scala.inline
    def setStops(value: Record[String, String]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setX1(value: String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    @scala.inline
    def setX2(value: String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setY1(value: String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    @scala.inline
    def setY2(value: String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
