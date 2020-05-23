package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.pause
import typings.titanium.titaniumStrings.resume
import typings.titanium.titaniumStrings.start
import typings.titanium.titaniumStrings.stop
import typings.titanium.titaniumStrings.taskremoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Android application component that executes in the background.
  */
@js.native
trait Service extends Proxy {
  /**
    * The intent used to start or bind to the Service.
    */
  val intent: Intent = js.native
  /**
    * A service can be started more than once -- this number (based on an incrementing integer)
    * indicates which "start number" in the sequence the current service instance is.
    */
  val serviceInstanceId: Double = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_pause(name: pause, callback: js.ThisFunction1[/* this */ this.type, /* event */ ServicePauseEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    name: resume,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ServiceResumeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(name: start, callback: js.ThisFunction1[/* this */ this.type, /* event */ ServiceStartEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stop(name: stop, callback: js.ThisFunction1[/* this */ this.type, /* event */ ServiceStopEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_taskremoved(
    name: taskremoved,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ServiceTaskremovedEvent, Unit]
  ): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_pause(name: pause): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pause(name: pause, event: ServicePauseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resume(name: resume): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resume(name: resume, event: ServiceResumeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_start(name: start): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_start(name: start, event: ServiceStartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_stop(name: stop): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_stop(name: stop, event: ServiceStopEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_taskremoved(name: taskremoved): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_taskremoved(name: taskremoved, event: ServiceTaskremovedEvent): Unit = js.native
  /**
    * Puts the service into the "background" state and removes its foreground notification.
    */
  def foregroundCancel(): Unit = js.native
  /**
    * Puts the service into the "foreground" state and displays a notification.
    */
  def foregroundNotify(id: Double, notification: Notification): Unit = js.native
  def foregroundNotify(id: Double, notification: Notification, foregroundServiceType: Double): Unit = js.native
  /**
    * Gets the value of the <Titanium.Android.Service.intent> property.
    * @deprecated Access <Titanium.Android.Service.intent> instead.
    */
  def getIntent(): Intent = js.native
  /**
    * Gets the value of the <Titanium.Android.Service.serviceInstanceId> property.
    * @deprecated Access <Titanium.Android.Service.serviceInstanceId> instead.
    */
  def getServiceInstanceId(): Double = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_pause(name: pause, callback: js.ThisFunction1[/* this */ this.type, /* event */ ServicePauseEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    name: resume,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ServiceResumeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(name: start, callback: js.ThisFunction1[/* this */ this.type, /* event */ ServiceStartEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stop(name: stop, callback: js.ThisFunction1[/* this */ this.type, /* event */ ServiceStopEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_taskremoved(
    name: taskremoved,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ServiceTaskremovedEvent, Unit]
  ): Unit = js.native
  /**
    * Starts the Service.
    */
  def start(): Unit = js.native
  /**
    * Stops this running instance of the Service.
    */
  def stop(): Unit = js.native
}

