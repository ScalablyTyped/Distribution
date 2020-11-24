package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.themeMod.StopsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  style :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   gradientId :string | undefined} & tuya-panel-kit.tuya-panel-kit/theme.RadialGradientBackground */
@js.native
trait RadialGradientProps extends js.Object {
  
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
  implicit class RadialGradientPropsOps[Self <: RadialGradientProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCx(value: String): Self = this.set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    
    @scala.inline
    def setCy(value: String): Self = this.set("cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    
    @scala.inline
    def setFx(value: String): Self = this.set("fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFx: Self = this.set("fx", js.undefined)
    
    @scala.inline
    def setFy(value: String): Self = this.set("fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFy: Self = this.set("fy", js.undefined)
    
    @scala.inline
    def setGradientId(value: String): Self = this.set("gradientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientId: Self = this.set("gradientId", js.undefined)
    
    @scala.inline
    def setRx(value: String): Self = this.set("rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    
    @scala.inline
    def setRy(value: String): Self = this.set("ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: StopsProps*): Self = this.set("stops", js.Array(value :_*))
    
    @scala.inline
    def setStops(value: js.Array[StopsProps]): Self = this.set("stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
