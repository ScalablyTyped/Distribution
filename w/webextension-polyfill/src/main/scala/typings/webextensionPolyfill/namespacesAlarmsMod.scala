package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesAlarmsMod {
  
  object Alarms {
    
    trait Alarm extends StObject {
      
      /**
        * Name of this alarm.
        */
      var name: String
      
      /**
        * When present, signals that the alarm triggers periodically after so many minutes.
        * Optional.
        */
      var periodInMinutes: js.UndefOr[Double] = js.undefined
      
      /**
        * Time when the alarm is scheduled to fire, in milliseconds past the epoch.
        */
      var scheduledTime: Double
    }
    object Alarm {
      
      inline def apply(name: String, scheduledTime: Double): Alarm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scheduledTime = scheduledTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[Alarm]
      }
      
      extension [Self <: Alarm](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPeriodInMinutes(value: Double): Self = StObject.set(x, "periodInMinutes", value.asInstanceOf[js.Any])
        
        inline def setPeriodInMinutesUndefined: Self = StObject.set(x, "periodInMinutes", js.undefined)
        
        inline def setScheduledTime(value: Double): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Details about the alarm. The alarm first fires either at 'when' milliseconds past the epoch (if 'when' is provided),
      * after 'delayInMinutes' minutes from the current time (if 'delayInMinutes' is provided instead),
      * or after 'periodInMinutes' minutes from the current time (if only 'periodInMinutes' is provided).
      * Users should never provide both 'when' and 'delayInMinutes'. If 'periodInMinutes' is provided,
      * then the alarm recurs repeatedly after that many minutes.
      */
    trait CreateAlarmInfoType extends StObject {
      
      /**
        * Number of minutes from the current time after which the alarm should first fire.
        * Optional.
        */
      var delayInMinutes: js.UndefOr[Double] = js.undefined
      
      /**
        * Number of minutes after which the alarm should recur repeatedly.
        * Optional.
        */
      var periodInMinutes: js.UndefOr[Double] = js.undefined
      
      /**
        * Time when the alarm is scheduled to first fire, in milliseconds past the epoch.
        * Optional.
        */
      var when: js.UndefOr[Double] = js.undefined
    }
    object CreateAlarmInfoType {
      
      inline def apply(): CreateAlarmInfoType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateAlarmInfoType]
      }
      
      extension [Self <: CreateAlarmInfoType](x: Self) {
        
        inline def setDelayInMinutes(value: Double): Self = StObject.set(x, "delayInMinutes", value.asInstanceOf[js.Any])
        
        inline def setDelayInMinutesUndefined: Self = StObject.set(x, "delayInMinutes", js.undefined)
        
        inline def setPeriodInMinutes(value: Double): Self = StObject.set(x, "periodInMinutes", value.asInstanceOf[js.Any])
        
        inline def setPeriodInMinutesUndefined: Self = StObject.set(x, "periodInMinutes", js.undefined)
        
        inline def setWhen(value: Double): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
        
        inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
      }
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Clears the alarm with the given name.
        *
        * @param name Optional. The name of the alarm to clear. Defaults to the empty string.
        */
      def clear(): js.Promise[Boolean] = js.native
      def clear(name: String): js.Promise[Boolean] = js.native
      
      /**
        * Clears all alarms.
        */
      def clearAll(): js.Promise[Boolean] = js.native
      
      /**
        * Creates an alarm. After the delay is expired, the onAlarm event is fired. If there is another alarm with the same name
        * (or no name if none is specified), it will be cancelled and replaced by this alarm.
        *
        * @param alarmInfo Details about the alarm. The alarm first fires either at 'when' milliseconds past the epoch (if 'when'
        * is provided), after 'delayInMinutes' minutes from the current time (if 'delayInMinutes' is provided instead),
        * or after 'periodInMinutes' minutes from the current time (if only 'periodInMinutes' is provided).
        * Users should never provide both 'when' and 'delayInMinutes'. If 'periodInMinutes' is provided,
        * then the alarm recurs repeatedly after that many minutes.
        */
      def create(alarmInfo: CreateAlarmInfoType): Unit = js.native
      /**
        * Creates an alarm. After the delay is expired, the onAlarm event is fired. If there is another alarm with the same name
        * (or no name if none is specified), it will be cancelled and replaced by this alarm.
        *
        * @param name Optional. Optional name to identify this alarm. Defaults to the empty string.
        * @param alarmInfo Details about the alarm. The alarm first fires either at 'when' milliseconds past the epoch (if 'when'
        * is provided), after 'delayInMinutes' minutes from the current time (if 'delayInMinutes' is provided instead),
        * or after 'periodInMinutes' minutes from the current time (if only 'periodInMinutes' is provided).
        * Users should never provide both 'when' and 'delayInMinutes'. If 'periodInMinutes' is provided,
        * then the alarm recurs repeatedly after that many minutes.
        */
      def create(name: String, alarmInfo: CreateAlarmInfoType): Unit = js.native
      def create(name: Unit, alarmInfo: CreateAlarmInfoType): Unit = js.native
      
      /**
        * Retrieves details about the specified alarm.
        *
        * @param name Optional. The name of the alarm to get. Defaults to the empty string.
        */
      def get(): js.Promise[Alarm] = js.native
      def get(name: String): js.Promise[Alarm] = js.native
      
      /**
        * Gets an array of all the alarms.
        */
      def getAll(): js.Promise[js.Array[Alarm]] = js.native
      
      /**
        * Fired when an alarm has expired. Useful for transient background pages.
        *
        * @param name The alarm that has expired.
        */
      var onAlarm: Event[js.Function1[/* name */ Alarm, Unit]] = js.native
    }
  }
}
