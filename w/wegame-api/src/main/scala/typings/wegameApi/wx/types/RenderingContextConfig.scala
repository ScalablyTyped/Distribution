package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderingContextConfig extends StObject {
  
  /**
    * 表示是否抗锯齿
    */
  var antialias: js.UndefOr[Boolean] = js.native
  
  /**
    * 抗锯齿样本数。最小值为 2，最大不超过系统限制数量，仅 iOS 支持
    */
  var antialiasSamples: js.UndefOr[Double] = js.native
  
  /**
    * 表示是否绘图完成后是否保留绘图缓冲区
    */
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
}
object RenderingContextConfig {
  
  @scala.inline
  def apply(): RenderingContextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderingContextConfig]
  }
  
  @scala.inline
  implicit class RenderingContextConfigMutableBuilder[Self <: RenderingContextConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntialiasSamples(value: Double): Self = StObject.set(x, "antialiasSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntialiasSamplesUndefined: Self = StObject.set(x, "antialiasSamples", js.undefined)
    
    @scala.inline
    def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    @scala.inline
    def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
  }
}
