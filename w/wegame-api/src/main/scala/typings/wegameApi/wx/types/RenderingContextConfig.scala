package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderingContextConfig extends StObject {
  
  /**
    * 表示是否抗锯齿
    */
  var antialias: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 抗锯齿样本数。最小值为 2，最大不超过系统限制数量，仅 iOS 支持
    */
  var antialiasSamples: js.UndefOr[Double] = js.undefined
  
  /**
    * 表示是否绘图完成后是否保留绘图缓冲区
    */
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
}
object RenderingContextConfig {
  
  inline def apply(): RenderingContextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderingContextConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderingContextConfig] (val x: Self) extends AnyVal {
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasSamples(value: Double): Self = StObject.set(x, "antialiasSamples", value.asInstanceOf[js.Any])
    
    inline def setAntialiasSamplesUndefined: Self = StObject.set(x, "antialiasSamples", js.undefined)
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
  }
}
