package typings.wegameApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WxPerformance extends StObject {
  
  /**
    * 时间戳
    */
  def now(): Double = js.native
}
object WxPerformance {
  
  @scala.inline
  def apply(now: () => Double): WxPerformance = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
    __obj.asInstanceOf[WxPerformance]
  }
  
  @scala.inline
  implicit class WxPerformanceMutableBuilder[Self <: WxPerformance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
  }
}
