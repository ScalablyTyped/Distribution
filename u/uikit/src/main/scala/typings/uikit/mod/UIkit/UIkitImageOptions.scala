package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitImageOptions extends StObject {
  
  var dataSrc: js.UndefOr[String] = js.native
  
  var dataSrcset: js.UndefOr[String | Boolean] = js.native
  
  var height: js.UndefOr[String | Boolean] = js.native
  
  var offsetLeft: js.UndefOr[String | Double] = js.native
  
  var offsetTop: js.UndefOr[String] = js.native
  
  var sizes: js.UndefOr[String | Boolean] = js.native
  
  var target: js.UndefOr[String | Boolean] = js.native
  
  var width: js.UndefOr[String | Boolean] = js.native
}
object UIkitImageOptions {
  
  @scala.inline
  def apply(): UIkitImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitImageOptions]
  }
  
  @scala.inline
  implicit class UIkitImageOptionsMutableBuilder[Self <: UIkitImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSrc(value: String): Self = StObject.set(x, "dataSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSrcUndefined: Self = StObject.set(x, "dataSrc", js.undefined)
    
    @scala.inline
    def setDataSrcset(value: String | Boolean): Self = StObject.set(x, "dataSrcset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSrcsetUndefined: Self = StObject.set(x, "dataSrcset", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setOffsetLeft(value: String | Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeftUndefined: Self = StObject.set(x, "offsetLeft", js.undefined)
    
    @scala.inline
    def setOffsetTop(value: String): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
    
    @scala.inline
    def setSizes(value: String | Boolean): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setTarget(value: String | Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
