package typings.webxr

import typings.std.GLenum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRLayerInit extends StObject {
  
  var colorFormat: js.UndefOr[GLenum] = js.undefined
  
  var depthFormat: js.UndefOr[GLenum] = js.undefined
  
  var isStatic: js.UndefOr[Boolean] = js.undefined
  
  var layout: js.UndefOr[XRLayerLayout] = js.undefined
  
  var mipLevels: js.UndefOr[Double] = js.undefined
  
  var space: XRSpace
  
  var viewPixelHeight: Double
  
  var viewPixelWidth: Double
}
object XRLayerInit {
  
  inline def apply(space: XRSpace, viewPixelHeight: Double, viewPixelWidth: Double): XRLayerInit = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any], viewPixelHeight = viewPixelHeight.asInstanceOf[js.Any], viewPixelWidth = viewPixelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRLayerInit]
  }
  
  extension [Self <: XRLayerInit](x: Self) {
    
    inline def setColorFormat(value: GLenum): Self = StObject.set(x, "colorFormat", value.asInstanceOf[js.Any])
    
    inline def setColorFormatUndefined: Self = StObject.set(x, "colorFormat", js.undefined)
    
    inline def setDepthFormat(value: GLenum): Self = StObject.set(x, "depthFormat", value.asInstanceOf[js.Any])
    
    inline def setDepthFormatUndefined: Self = StObject.set(x, "depthFormat", js.undefined)
    
    inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    inline def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
    
    inline def setLayout(value: XRLayerLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMipLevels(value: Double): Self = StObject.set(x, "mipLevels", value.asInstanceOf[js.Any])
    
    inline def setMipLevelsUndefined: Self = StObject.set(x, "mipLevels", js.undefined)
    
    inline def setSpace(value: XRSpace): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setViewPixelHeight(value: Double): Self = StObject.set(x, "viewPixelHeight", value.asInstanceOf[js.Any])
    
    inline def setViewPixelWidth(value: Double): Self = StObject.set(x, "viewPixelWidth", value.asInstanceOf[js.Any])
  }
}
