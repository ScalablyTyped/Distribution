package typings.tuyaPanelKit.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugThumbTouchArea extends js.Object {
  
  var container: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var debugThumbTouchArea: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var thumb: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var touchArea: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var track: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object DebugThumbTouchArea {
  
  @scala.inline
  def apply(): DebugThumbTouchArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugThumbTouchArea]
  }
  
  @scala.inline
  implicit class DebugThumbTouchAreaOps[Self <: DebugThumbTouchArea] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: StyleProp[ViewStyle]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    
    @scala.inline
    def setDebugThumbTouchArea(value: StyleProp[ViewStyle]): Self = this.set("debugThumbTouchArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugThumbTouchArea: Self = this.set("debugThumbTouchArea", js.undefined)
    
    @scala.inline
    def setDebugThumbTouchAreaNull: Self = this.set("debugThumbTouchArea", null)
    
    @scala.inline
    def setThumb(value: StyleProp[ViewStyle]): Self = this.set("thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumb: Self = this.set("thumb", js.undefined)
    
    @scala.inline
    def setThumbNull: Self = this.set("thumb", null)
    
    @scala.inline
    def setTouchArea(value: StyleProp[ViewStyle]): Self = this.set("touchArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchArea: Self = this.set("touchArea", js.undefined)
    
    @scala.inline
    def setTouchAreaNull: Self = this.set("touchArea", null)
    
    @scala.inline
    def setTrack(value: StyleProp[ViewStyle]): Self = this.set("track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    
    @scala.inline
    def setTrackNull: Self = this.set("track", null)
  }
}
