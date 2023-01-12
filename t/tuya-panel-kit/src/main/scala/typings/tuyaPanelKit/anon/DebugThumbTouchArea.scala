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
  
  inline def apply(): DebugThumbTouchArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugThumbTouchArea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebugThumbTouchArea] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: StyleProp[ViewStyle]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDebugThumbTouchArea(value: StyleProp[ViewStyle]): Self = StObject.set(x, "debugThumbTouchArea", value.asInstanceOf[js.Any])
    
    inline def setDebugThumbTouchAreaNull: Self = StObject.set(x, "debugThumbTouchArea", null)
    
    inline def setDebugThumbTouchAreaUndefined: Self = StObject.set(x, "debugThumbTouchArea", js.undefined)
    
    inline def setThumb(value: StyleProp[ViewStyle]): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbNull: Self = StObject.set(x, "thumb", null)
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setTouchArea(value: StyleProp[ViewStyle]): Self = StObject.set(x, "touchArea", value.asInstanceOf[js.Any])
    
    inline def setTouchAreaNull: Self = StObject.set(x, "touchArea", null)
    
    inline def setTouchAreaUndefined: Self = StObject.set(x, "touchArea", js.undefined)
    
    inline def setTrack(value: StyleProp[ViewStyle]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackNull: Self = StObject.set(x, "track", null)
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
