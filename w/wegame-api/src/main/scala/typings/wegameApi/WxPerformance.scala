package typings.wegameApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WxPerformance extends StObject {
  
  /**
    * 时间戳
    */
  def now(): Double
}
object WxPerformance {
  
  inline def apply(now: () => Double): WxPerformance = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
    __obj.asInstanceOf[WxPerformance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WxPerformance] (val x: Self) extends AnyVal {
    
    inline def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
  }
}
