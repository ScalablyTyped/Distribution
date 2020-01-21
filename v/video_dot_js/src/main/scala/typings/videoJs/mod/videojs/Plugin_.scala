package typings.videoJs.mod.videojs

import typings.std.Event_
import typings.videoJs.mod.videojs.Plugin.PluginEventHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parent class for all advanced plugins.
  *
  * @fires   Player#beforepluginsetup
  * @fires   Player#beforepluginsetup:$name
  * @fires   Player#pluginsetup
  * @fires   Player#pluginsetup:$name
  * @listens Player#dispose
  * @throws  {Error}
  *          If attempting to instantiate the base {@link Plugin} class
  *          directly instead of via a sub-class.
  */
@js.native
trait Plugin_ extends EventedMixin {
  var player: Player = js.native
  /**
    * Disposes a plugin.
    *
    * Subclasses can override this if they want, but for the sake of safety,
    * it's probably best to subscribe the "dispose" event.
    *
    * @fires Plugin#dispose
    */
  def dispose(): Unit = js.native
  /**
    * Each event triggered by plugins includes a hash of additional data with
    * conventional properties.
    *
    * This returns that object or mutates an existing hash.
    *
    * @param [hash={}]
    *          An object to be used as event an event hash.
    *
    * @return An event hash object with provided properties mixed-in.
    */
  def getEventHash(): PluginEventHash = js.native
  def getEventHash(hash: js.Any): PluginEventHash = js.native
  /**
    * Handles "statechanged" events on the plugin. No-op by default, override by
    * subclassing.
    *
    * @param e
    *           An event object provided by a "statechanged" event.
    *
    * @param e.changes
    *           An object describing changes that occurred with the "statechanged"
    *           event.
    */
  def handleStateChanged(e: Event_): Unit = js.native
  /**
    * Get the version of the plugin that was set on <pluginName>.VERSION
    */
  def version(): String = js.native
}

