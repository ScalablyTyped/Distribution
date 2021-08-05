package typings.tuyaPanelKit.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var content: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var contentRight: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var title: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object Container {
  
  inline def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setContainer(value: StyleProp[ViewStyle]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContent(value: StyleProp[ViewStyle]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentRight(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentRight", value.asInstanceOf[js.Any])
    
    inline def setContentRightNull: Self = StObject.set(x, "contentRight", null)
    
    inline def setContentRightUndefined: Self = StObject.set(x, "contentRight", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setTitle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
