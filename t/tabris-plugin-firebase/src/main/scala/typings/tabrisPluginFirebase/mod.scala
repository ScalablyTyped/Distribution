package typings.tabrisPluginFirebase

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.mod.EventObject
import typings.tabris.mod.NativeObject
import typings.tabris.mod.PropertyChangedEvent
import typings.tabrisPluginFirebase.anon.ClearAll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object firebase {
      
      @js.native
      trait Analytics
        extends NativeObject
           with typings.tabrisPluginFirebase.mod.global.firebase.PropertyMixins.Analytics {
        
        def logEvent(eventName: String): Unit = js.native
        def logEvent(eventName: String, parameters: StringDictionary[String]): Unit = js.native
        
        def set(properties: AnalyticsProperties): this.type = js.native
        def set(property: String, value: js.Any): this.type = js.native
        
        def setUserProperty(propertyName: String, value: String): Unit = js.native
      }
      @JSGlobal("firebase.Analytics")
      @js.native
      val Analytics: typings.tabrisPluginFirebase.mod.global.firebase.Analytics = js.native
      
      @js.native
      trait MessageEvent
        extends EventObject[typings.tabrisPluginFirebase.mod.global.firebase.Messaging] {
        
        var data: js.Any = js.native
      }
      @JSGlobal("firebase.MessageEvent")
      @js.native
      val MessageEvent: typings.tabrisPluginFirebase.mod.global.firebase.MessageEvent = js.native
      
      @js.native
      trait Messaging extends NativeObject {
        
        val instanceId: String = js.native
        
        val launchData: js.Object = js.native
        
        def off(listeners: MessagingEvents): this.type = js.native
        
        def on(listeners: MessagingEvents): this.type = js.native
        
        def once(listeners: MessagingEvents): this.type = js.native
        
        val pendingMessages: ClearAll = js.native
        
        def requestPermissions(): Unit = js.native
        
        def resetInstanceId(): Unit = js.native
        
        val token: String = js.native
      }
      @JSGlobal("firebase.Messaging")
      @js.native
      val Messaging: typings.tabrisPluginFirebase.mod.global.firebase.Messaging = js.native
      
      trait MessagingEvents extends StObject {
        
        var instanceIdChanged: js.UndefOr[
                js.Function1[
                  /* event */ PropertyChangedEvent[typings.tabrisPluginFirebase.mod.global.firebase.Messaging, String], 
                  Unit
                ]
              ] = js.undefined
        
        var message: js.UndefOr[
                js.Function1[/* event */ typings.tabrisPluginFirebase.mod.global.firebase.MessageEvent, Unit]
              ] = js.undefined
        
        var tokenChanged: js.UndefOr[
                js.Function1[
                  /* event */ PropertyChangedEvent[typings.tabrisPluginFirebase.mod.global.firebase.Messaging, String], 
                  Unit
                ]
              ] = js.undefined
      }
      object MessagingEvents {
        
        @JSGlobal("firebase.MessagingEvents")
        @js.native
        val ^ : MessagingEvents = js.native
        
        @scala.inline
        implicit class MessagingEventsMutableBuilder[Self <: MessagingEvents] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setInstanceIdChanged(
            value: /* event */ PropertyChangedEvent[typings.tabrisPluginFirebase.mod.global.firebase.Messaging, String] => Unit
          ): Self = StObject.set(x, "instanceIdChanged", js.Any.fromFunction1(value))
          
          @scala.inline
          def setInstanceIdChangedUndefined: Self = StObject.set(x, "instanceIdChanged", js.undefined)
          
          @scala.inline
          def setMessage(value: /* event */ typings.tabrisPluginFirebase.mod.global.firebase.MessageEvent => Unit): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
          
          @scala.inline
          def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
          
          @scala.inline
          def setTokenChanged(
            value: /* event */ PropertyChangedEvent[typings.tabrisPluginFirebase.mod.global.firebase.Messaging, String] => Unit
          ): Self = StObject.set(x, "tokenChanged", js.Any.fromFunction1(value))
          
          @scala.inline
          def setTokenChangedUndefined: Self = StObject.set(x, "tokenChanged", js.undefined)
        }
      }
      
      /* Inlined std.Partial<tabris-plugin-firebase.tabris-plugin-firebase.<global>.firebase.PropertyMixins.Analytics> */
      trait AnalyticsProperties extends StObject {
        
        var analyticsCollectionEnabled: js.UndefOr[Boolean] = js.undefined
        
        var screenName: js.UndefOr[String] = js.undefined
        
        var userId: js.UndefOr[String] = js.undefined
      }
      object AnalyticsProperties {
        
        @scala.inline
        def apply(): AnalyticsProperties = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AnalyticsProperties]
        }
        
        @scala.inline
        implicit class AnalyticsPropertiesMutableBuilder[Self <: AnalyticsProperties] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAnalyticsCollectionEnabled(value: Boolean): Self = StObject.set(x, "analyticsCollectionEnabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAnalyticsCollectionEnabledUndefined: Self = StObject.set(x, "analyticsCollectionEnabled", js.undefined)
          
          @scala.inline
          def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
          
          @scala.inline
          def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
        }
      }
      
      object PropertyMixins {
        
        trait Analytics extends StObject {
          
          var analyticsCollectionEnabled: Boolean
          
          var screenName: String
          
          var userId: String
        }
        object Analytics {
          
          @scala.inline
          def apply(analyticsCollectionEnabled: Boolean, screenName: String, userId: String): typings.tabrisPluginFirebase.mod.global.firebase.PropertyMixins.Analytics = {
            val __obj = js.Dynamic.literal(analyticsCollectionEnabled = analyticsCollectionEnabled.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
            __obj.asInstanceOf[typings.tabrisPluginFirebase.mod.global.firebase.PropertyMixins.Analytics]
          }
          
          @scala.inline
          implicit class AnalyticsMutableBuilder[Self <: typings.tabrisPluginFirebase.mod.global.firebase.PropertyMixins.Analytics] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setAnalyticsCollectionEnabled(value: Boolean): Self = StObject.set(x, "analyticsCollectionEnabled", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
          }
        }
      }
    }
  }
}
