package typings.videoJs.mod.videojs

import typings.std.Event
import typings.videoJs.mod.videojs.Plugin.PluginEventHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Plugin
  extends StObject
     with EventedMixin {
  
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
  def getEventHash(hash: Any): PluginEventHash = js.native
  
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
  def handleStateChanged(e: Event): Unit = js.native
  
  var player: Player = js.native
  
  /**
    * Get the version of the plugin that was set on <pluginName>.VERSION
    */
  def version(): String = js.native
}
object Plugin {
  
  trait PluginEventHash extends StObject {
    
    /**
      * For basic plugins, the return value of the plugin function. For
      * advanced plugins, the plugin instance on which the event is fired.
      */
    var instance: Plugin
    
    /**
      * The name of the plugin.
      */
    var name: String
    
    /**
      * For basic plugins, the plugin function. For advanced plugins, the
      * plugin class/constructor.
      */
    var plugin: String
  }
  object PluginEventHash {
    
    inline def apply(instance: Plugin, name: String, plugin: String): PluginEventHash = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginEventHash]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginEventHash] (val x: Self) extends AnyVal {
      
      inline def setInstance(value: Plugin): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
}
