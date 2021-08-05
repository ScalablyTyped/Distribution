package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerEventOption extends StObject {
  
  /** 事件是否冒泡
    *
    * 默认值： `false`
    */
  var bubbles: js.UndefOr[Boolean] = js.undefined
  
  /** 事件是否拥有捕获阶段
    *
    * 默认值： `false`
    */
  var capturePhase: js.UndefOr[Boolean] = js.undefined
  
  /** 事件是否可以穿越组件边界，为false时，事件将只能在引用组件的节点树上触发，不进入其他任何组件内部
    *
    * 默认值： `false`
    */
  var composed: js.UndefOr[Boolean] = js.undefined
}
object TriggerEventOption {
  
  inline def apply(): TriggerEventOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerEventOption]
  }
  
  extension [Self <: TriggerEventOption](x: Self) {
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
    
    inline def setCapturePhase(value: Boolean): Self = StObject.set(x, "capturePhase", value.asInstanceOf[js.Any])
    
    inline def setCapturePhaseUndefined: Self = StObject.set(x, "capturePhase", js.undefined)
    
    inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
  }
}
