package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.themeMod.StopsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  style :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   gradientId :string | undefined} & tuya-panel-kit.tuya-panel-kit/theme.RadialGradientBackground */
@js.native
trait RadialGradientProps extends StObject {
  
  var cx: js.UndefOr[String] = js.native
  
  var cy: js.UndefOr[String] = js.native
  
  var fx: js.UndefOr[String] = js.native
  
  var fy: js.UndefOr[String] = js.native
  
  var gradientId: js.UndefOr[String] = js.native
  
  var rx: js.UndefOr[String] = js.native
  
  var ry: js.UndefOr[String] = js.native
  
  var stops: js.UndefOr[js.Array[StopsProps]] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object RadialGradientProps {
  
  @scala.inline
  def apply(): RadialGradientProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGradientProps]
  }
  
  @scala.inline
  implicit class RadialGradientPropsMutableBuilder[Self <: RadialGradientProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCx(value: String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setFx(value: String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
    
    @scala.inline
    def setFy(value: String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
    
    @scala.inline
    def setGradientId(value: String): Self = StObject.set(x, "gradientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientIdUndefined: Self = StObject.set(x, "gradientId", js.undefined)
    
    @scala.inline
    def setRx(value: String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    @scala.inline
    def setRy(value: String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    
    @scala.inline
    def setStops(value: js.Array[StopsProps]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: StopsProps*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
