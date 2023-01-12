package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TodayPlayedTime extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ Result, Unit]] = js.undefined
  
  /**
    * 今天已经玩游戏的时间，单位：秒
    */
  var todayPlayedTime: Double
}
object TodayPlayedTime {
  
  inline def apply(todayPlayedTime: Double): TodayPlayedTime = {
    val __obj = js.Dynamic.literal(todayPlayedTime = todayPlayedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TodayPlayedTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TodayPlayedTime] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ Result => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTodayPlayedTime(value: Double): Self = StObject.set(x, "todayPlayedTime", value.asInstanceOf[js.Any])
  }
}
