package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 视频帧数据，若取不到则返回 null。当缓冲区为空的时候可能暂停取不到数据。 */
trait FrameDataOptions extends StObject {
  
  /** 帧数据 */
  var data: js.typedarray.ArrayBuffer
  
  /** 帧数据高度 */
  var height: Double
  
  /** 帧原始 dts */
  var pkDts: Double
  
  /** 帧原始 pts */
  var pkPts: Double
  
  /** 帧数据宽度 */
  var width: Double
}
object FrameDataOptions {
  
  inline def apply(data: js.typedarray.ArrayBuffer, height: Double, pkDts: Double, pkPts: Double, width: Double): FrameDataOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pkDts = pkDts.asInstanceOf[js.Any], pkPts = pkPts.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameDataOptions]
  }
  
  extension [Self <: FrameDataOptions](x: Self) {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPkDts(value: Double): Self = StObject.set(x, "pkDts", value.asInstanceOf[js.Any])
    
    inline def setPkPts(value: Double): Self = StObject.set(x, "pkPts", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
