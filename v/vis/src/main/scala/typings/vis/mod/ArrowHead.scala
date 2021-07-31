package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowHead extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var imageHeight: js.UndefOr[Double] = js.undefined
  
  var imageWidth: js.UndefOr[Double] = js.undefined
  
  var scaleFactor: js.UndefOr[Double] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ArrowHead {
  
  @scala.inline
  def apply(): ArrowHead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowHead]
  }
  
  @scala.inline
  implicit class ArrowHeadMutableBuilder[Self <: ArrowHead] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageHeightUndefined: Self = StObject.set(x, "imageHeight", js.undefined)
    
    @scala.inline
    def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageWidthUndefined: Self = StObject.set(x, "imageWidth", js.undefined)
    
    @scala.inline
    def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
