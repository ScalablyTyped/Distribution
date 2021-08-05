package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramStrings._empty
import typings.wechatMiniprogram.wechatMiniprogramStrings.`out-of-bounds`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`touch-out-of-bounds`
import typings.wechatMiniprogram.wechatMiniprogramStrings.friction
import typings.wechatMiniprogram.wechatMiniprogramStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /**
    * 产生移动的原因
    *
    * - `touch` 拖动
    * - `touch-out-of-bounds` 超出移动范围
    * - `out-of-bounds` 超出移动范围后的回弹
    * - `friction` 惯性
    * - `空字符串` setData
    */
  var source: touch | `touch-out-of-bounds` | `out-of-bounds` | friction | _empty
  
  var x: Double
  
  var y: Double
}
object Source {
  
  inline def apply(source: touch | `touch-out-of-bounds` | `out-of-bounds` | friction | _empty, x: Double, y: Double): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setSource(value: touch | `touch-out-of-bounds` | `out-of-bounds` | friction | _empty): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
