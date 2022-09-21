package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPhoneRepeatCalendarOption extends StObject {
  
  /** 是否提醒，默认 true */
  var alarm: js.UndefOr[Boolean] = js.undefined
  
  /** 提醒提前量，单位秒，默认 0 表示开始时提醒 */
  var alarmOffset: js.UndefOr[Double] = js.undefined
  
  /** 是否全天事件，默认 false */
  var allDay: js.UndefOr[Boolean] = js.undefined
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[AddPhoneRepeatCalendarCompleteCallback] = js.undefined
  
  /** 事件说明 */
  var description: js.UndefOr[String] = js.undefined
  
  /** 结束时间的 unix 时间戳，默认与开始时间相同 */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[AddPhoneRepeatCalendarFailCallback] = js.undefined
  
  /** 事件位置 */
  var location: js.UndefOr[String] = js.undefined
  
  /** 重复周期结束时间的 unix 时间戳，不填表示一直重复 */
  var repeatEndTime: js.UndefOr[Double] = js.undefined
  
  /** 重复周期，默认 month 每月重复 */
  var repeatInterval: js.UndefOr[String] = js.undefined
  
  /** 开始时间的 unix 时间戳 (1970年1月1日开始所经过的秒数) */
  var startTime: Double
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[AddPhoneRepeatCalendarSuccessCallback] = js.undefined
  
  /** 日历事件标题 */
  var title: String
}
object AddPhoneRepeatCalendarOption {
  
  inline def apply(startTime: Double, title: String): AddPhoneRepeatCalendarOption = {
    val __obj = js.Dynamic.literal(startTime = startTime.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPhoneRepeatCalendarOption]
  }
  
  extension [Self <: AddPhoneRepeatCalendarOption](x: Self) {
    
    inline def setAlarm(value: Boolean): Self = StObject.set(x, "alarm", value.asInstanceOf[js.Any])
    
    inline def setAlarmOffset(value: Double): Self = StObject.set(x, "alarmOffset", value.asInstanceOf[js.Any])
    
    inline def setAlarmOffsetUndefined: Self = StObject.set(x, "alarmOffset", js.undefined)
    
    inline def setAlarmUndefined: Self = StObject.set(x, "alarm", js.undefined)
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRepeatEndTime(value: Double): Self = StObject.set(x, "repeatEndTime", value.asInstanceOf[js.Any])
    
    inline def setRepeatEndTimeUndefined: Self = StObject.set(x, "repeatEndTime", js.undefined)
    
    inline def setRepeatInterval(value: String): Self = StObject.set(x, "repeatInterval", value.asInstanceOf[js.Any])
    
    inline def setRepeatIntervalUndefined: Self = StObject.set(x, "repeatInterval", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
