package typings
package tabrisDashPluginDashFirebaseLib.tabrisDashPluginDashFirebaseMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("firebase")
@js.native
object firebaseNs extends js.Object {
  @js.native
  trait Analytics
    extends tabrisDashPluginDashFirebaseLib.tabrisDashPluginDashFirebaseMod.NativeObject
       with tabrisDashPluginDashFirebaseLib.tabrisDashPluginDashFirebaseMod.Global.firebaseNs.PropertyMixinsNs.Analytics {
    def logEvent(eventName: java.lang.String): scala.Unit = js.native
    def logEvent(
      eventName: java.lang.String,
      parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]
    ): scala.Unit = js.native
    def set(properties: AnalyticsProperties): this.type = js.native
    def setUserProperty(propertyName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  }
  
  trait MessageEvent
    extends tabrisDashPluginDashFirebaseLib.tabrisDashPluginDashFirebaseMod.EventObject[Messaging] {
    var data: js.Any
  }
  
  @js.native
  trait Messaging
    extends tabrisDashPluginDashFirebaseLib.tabrisDashPluginDashFirebaseMod.NativeObject {
    val instanceId: java.lang.String = js.native
    val launchData: js.Object = js.native
    val token: java.lang.String = js.native
    def off(listeners: MessagingEvents): this.type = js.native
    def on(listeners: MessagingEvents): this.type = js.native
    def once(listeners: MessagingEvents): this.type = js.native
    def resetInstanceId(): scala.Unit = js.native
  }
  
  trait MessagingEvents extends js.Object {
    var instanceIdChanged: js.UndefOr[
        js.Function1[
          /* event */ tabrisDashPluginDashFirebaseLib.tabrisDashPluginDashFirebaseMod.PropertyChangedEvent[Messaging, java.lang.String], 
          scala.Unit
        ]
      ] = js.undefined
    var message: js.UndefOr[js.Function1[/* event */ MessageEvent, scala.Unit]] = js.undefined
    var tokenChanged: js.UndefOr[
        js.Function1[
          /* event */ tabrisDashPluginDashFirebaseLib.tabrisDashPluginDashFirebaseMod.PropertyChangedEvent[Messaging, java.lang.String], 
          scala.Unit
        ]
      ] = js.undefined
  }
  
  val Analytics: Analytics = js.native
  val MessageEvent: MessageEvent = js.native
  val Messaging: Messaging = js.native
  val MessagingEvents: MessagingEvents = js.native
  @JSName("PropertyMixins")
  @js.native
  object PropertyMixinsNs extends js.Object {
    trait Analytics extends js.Object {
      var analyticsCollectionEnabled: scala.Boolean
      var screenName: java.lang.String
      var userId: java.lang.String
    }
    
  }
  
  type AnalyticsProperties = stdLib.Partial[
    tabrisDashPluginDashFirebaseLib.tabrisDashPluginDashFirebaseMod.Global.firebaseNs.PropertyMixinsNs.Analytics
  ]
}

