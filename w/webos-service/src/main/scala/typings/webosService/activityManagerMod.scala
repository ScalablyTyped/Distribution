package typings.webosService

import org.scalablytyped.runtime.StringDictionary
import typings.node.timersMod.global.NodeJS.Timeout
import typings.std.Record
import typings.webosService.anon.Name
import typings.webosService.serviceMod.Service
import typings.webosService.subscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityManagerMod {
  
  @JSImport("webos-service/activity-manager", "ActivityManager")
  @js.native
  open class ActivityManager protected () extends StObject {
    def this(service: Service, idleTimeout: Double) = this()
    
    /* private */ val _activities: StringDictionary[Subscription] = js.native
    
    /* private */ def _add(id: String, activity: Subscription): Unit = js.native
    
    /* private */ var _counter: Double = js.native
    
    /* private */ def _createActual(activitySpec: ActivitySpec): Unit = js.native
    /* private */ def _createActual(activitySpec: ActivitySpec, callback: js.Function1[/* payload */ Any, Unit]): Unit = js.native
    
    /* private */ def _createDummy(jobId: String): Unit = js.native
    /* private */ def _createDummy(jobId: String, callback: js.Function1[/* payload */ CreateDummyCallback, Unit]): Unit = js.native
    
    /* private */ def _createInternal(jobId: String): Unit = js.native
    /* private */ def _createInternal(jobId: String, callback: js.Function1[/* payload */ Any, Unit]): Unit = js.native
    
    /* private */ var _dummyActivityId: Double = js.native
    
    /* private */ var _idleTimer: Timeout | Null = js.native
    
    /* private */ def _remove(id: String): Unit = js.native
    
    /* private */ def _startTimer(): Unit = js.native
    
    /* private */ def _stopTimer(): Unit = js.native
    
    def adopt(activity: Record[String, Any]): Unit = js.native
    def adopt(activity: Record[String, Any], callback: js.Function1[/* payload */ Record[String, Any], Unit]): Unit = js.native
    
    def complete(activity: Record[String, Any]): Boolean | Unit = js.native
    def complete(
      activity: Record[String, Any],
      options: Unit,
      callback: js.Function1[/* payload */ Record[String, Any], Unit]
    ): Boolean | Unit = js.native
    def complete(activity: Record[String, Any], options: Record[String, Any]): Boolean | Unit = js.native
    def complete(
      activity: Record[String, Any],
      options: Record[String, Any],
      callback: js.Function1[/* payload */ Record[String, Any], Unit]
    ): Boolean | Unit = js.native
    
    def create(spec: String, callback: js.Function1[/* payload */ Any, Unit]): Unit = js.native
    def create(spec: Record[String, Any], callback: js.Function1[/* payload */ Any, Unit]): Unit = js.native
    
    var exitOnTimeout: Boolean = js.native
    
    var idleTimeout: Double = js.native
    
    val service: Service = js.native
    
    var useDummyActivity: Boolean = js.native
  }
  
  trait Activity extends StObject {
    
    val description: String
    
    val name: String
    
    val `type`: js.UndefOr[Type] = js.undefined
  }
  object Activity {
    
    inline def apply(description: String, name: String): Activity = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Activity]
    }
    
    extension [Self <: Activity](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ActivitySpec extends StObject {
    
    val activity: Activity
    
    val replace: js.UndefOr[Boolean] = js.undefined
    
    val start: js.UndefOr[Boolean] = js.undefined
    
    val subscribe: js.UndefOr[Boolean] = js.undefined
  }
  object ActivitySpec {
    
    inline def apply(activity: Activity): ActivitySpec = {
      val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActivitySpec]
    }
    
    extension [Self <: ActivitySpec](x: Self) {
      
      inline def setActivity(value: Activity): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setSubscribe(value: Boolean): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    }
  }
  
  trait CreateDummyCallback extends StObject {
    
    var activity: Name
    
    var isDummyActivity: Boolean
  }
  object CreateDummyCallback {
    
    inline def apply(activity: Name, isDummyActivity: Boolean): CreateDummyCallback = {
      val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], isDummyActivity = isDummyActivity.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateDummyCallback]
    }
    
    extension [Self <: CreateDummyCallback](x: Self) {
      
      inline def setActivity(value: Name): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setIsDummyActivity(value: Boolean): Self = StObject.set(x, "isDummyActivity", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    val explicit: js.UndefOr[Boolean] = js.undefined
    
    val foreground: js.UndefOr[Boolean] = js.undefined
    
    val persist: js.UndefOr[Boolean] = js.undefined
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
      
      inline def setExplicitUndefined: Self = StObject.set(x, "explicit", js.undefined)
      
      inline def setForeground(value: Boolean): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    }
  }
}
