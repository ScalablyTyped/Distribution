package typings.tuyaPanelKit.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugThumbTouchArea extends StObject {
  
  var container: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var debugThumbTouchArea: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var thumb: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var touchArea: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var track: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object DebugThumbTouchArea {
  
  @scala.inline
  def apply(): DebugThumbTouchArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugThumbTouchArea]
  }
  
  @scala.inline
  implicit class DebugThumbTouchAreaMutableBuilder[Self <: DebugThumbTouchArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: StyleProp[ViewStyle]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = StObject.set(x, "container", null)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setDebugThumbTouchArea(value: StyleProp[ViewStyle]): Self = StObject.set(x, "debugThumbTouchArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugThumbTouchAreaNull: Self = StObject.set(x, "debugThumbTouchArea", null)
    
    @scala.inline
    def setDebugThumbTouchAreaUndefined: Self = StObject.set(x, "debugThumbTouchArea", js.undefined)
    
    @scala.inline
    def setThumb(value: StyleProp[ViewStyle]): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbNull: Self = StObject.set(x, "thumb", null)
    
    @scala.inline
    def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    @scala.inline
    def setTouchArea(value: StyleProp[ViewStyle]): Self = StObject.set(x, "touchArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchAreaNull: Self = StObject.set(x, "touchArea", null)
    
    @scala.inline
    def setTouchAreaUndefined: Self = StObject.set(x, "touchArea", js.undefined)
    
    @scala.inline
    def setTrack(value: StyleProp[ViewStyle]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackNull: Self = StObject.set(x, "track", null)
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
