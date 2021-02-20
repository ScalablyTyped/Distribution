package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TodayPlayedTime extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ Result, Unit]] = js.native
  
  /**
    * 今天已经玩游戏的时间，单位：秒
    */
  var todayPlayedTime: Double = js.native
}
object TodayPlayedTime {
  
  @scala.inline
  def apply(todayPlayedTime: Double): TodayPlayedTime = {
    val __obj = js.Dynamic.literal(todayPlayedTime = todayPlayedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TodayPlayedTime]
  }
  
  @scala.inline
  implicit class TodayPlayedTimeMutableBuilder[Self <: TodayPlayedTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ Result => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTodayPlayedTime(value: Double): Self = StObject.set(x, "todayPlayedTime", value.asInstanceOf[js.Any])
  }
}
