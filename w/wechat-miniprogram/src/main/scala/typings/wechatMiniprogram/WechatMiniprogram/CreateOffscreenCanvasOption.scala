package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.WechatMiniprogram.Component.TrivialInstance
import typings.wechatMiniprogram.wechatMiniprogramStrings.`2d`
import typings.wechatMiniprogram.wechatMiniprogramStrings.webgl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOffscreenCanvasOption extends StObject {
  
  /** 在自定义组件下，当前组件实例的 this */
  var compInst: js.UndefOr[
    TrivialInstance | typings.wechatMiniprogram.WechatMiniprogram.Page.TrivialInstance
  ] = js.undefined
  
  /** 画布高度 */
  var height: js.UndefOr[Double] = js.undefined
  
  /** 创建的离屏 canvas 类型
    *
    * 可选值：
    * - 'webgl': webgl类型上下文;
    * - '2d': 2d类型上下文; */
  var `type`: js.UndefOr[webgl | `2d`] = js.undefined
  
  /** 画布宽度 */
  var width: js.UndefOr[Double] = js.undefined
}
object CreateOffscreenCanvasOption {
  
  inline def apply(): CreateOffscreenCanvasOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOffscreenCanvasOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateOffscreenCanvasOption] (val x: Self) extends AnyVal {
    
    inline def setCompInst(value: TrivialInstance | typings.wechatMiniprogram.WechatMiniprogram.Page.TrivialInstance): Self = StObject.set(x, "compInst", value.asInstanceOf[js.Any])
    
    inline def setCompInstUndefined: Self = StObject.set(x, "compInst", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setType(value: webgl | `2d`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
