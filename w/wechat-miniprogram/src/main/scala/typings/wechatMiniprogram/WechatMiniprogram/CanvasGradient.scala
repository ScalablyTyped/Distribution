package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasGradient extends StObject {
  
  /** [CanvasGradient.addColorStop(number stop, string color)](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasGradient.addColorStop.html)
  *
  * 添加颜色的渐变点。小于最小 stop 的部分会按最小 stop 的 color 来渲染，大于最大 stop 的部分会按最大 stop 的 color 来渲染
  *
  * **示例代码**
  *
  *
  * ```js
  const ctx = wx.createCanvasContext('myCanvas')
  // Create circular gradient
  const grd = ctx.createLinearGradient(30, 10, 120, 10)
  grd.addColorStop(0, 'red')
  grd.addColorStop(0.16, 'orange')
  grd.addColorStop(0.33, 'yellow')
  grd.addColorStop(0.5, 'green')
  grd.addColorStop(0.66, 'cyan')
  grd.addColorStop(0.83, 'blue')
  grd.addColorStop(1, 'purple')
  // Fill with gradient
  ctx.setFillStyle(grd)
  ctx.fillRect(10, 10, 150, 80)
  ctx.draw()
  ```
  * ![](@program/dev/image/canvas/color-stop.png) */
  def addColorStop(/** 表示渐变中开始与结束之间的位置，范围 0-1。 */
  stop: Double, /** 渐变点的颜色。 */
  color: String): Unit
}
object CanvasGradient {
  
  @scala.inline
  def apply(addColorStop: (Double, String) => Unit): CanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
    __obj.asInstanceOf[CanvasGradient]
  }
  
  @scala.inline
  implicit class CanvasGradientMutableBuilder[Self <: CanvasGradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddColorStop(value: (Double, String) => Unit): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2(value))
  }
}
