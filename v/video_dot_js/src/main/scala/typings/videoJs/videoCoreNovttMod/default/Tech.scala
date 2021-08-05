package typings.videoJs.videoCoreNovttMod.default

import typings.videoJs.anon.TypeofTech
import typings.videoJs.mod.videojs.Component.ReadyCallback
import typings.videoJs.videoJsStrings._empty
import typings.videoJs.videoJsStrings.maybe
import typings.videoJs.videoJsStrings.problably
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tech {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("video.js/dist/alt/video.core.novtt", "default.Tech")
  @js.native
  /**
    * Create an instance of this Tech.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param ready
    *        Callback function to call when the `HTML5` Tech is ready.
    */
  class ^ ()
    extends StObject
       with typings.videoJs.mod.videojs.Tech {
    def this(options: js.Any) = this()
    def this(options: js.Any, ready: ReadyCallback) = this()
    def this(options: Unit, ready: ReadyCallback) = this()
  }
  
  @JSImport("video.js/dist/alt/video.core.novtt", "default.Tech")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the tech can support the given source
    * @param srcObj
    *        The source object
    * @param options
    *        The options passed to the tech
    * @return 'probably', 'maybe', or '' (empty string)
    */
  inline def canPlaySource(srcObj: js.Any, options: js.Any): problably | maybe | _empty = (^.asInstanceOf[js.Dynamic].applyDynamic("canPlaySource")(srcObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[problably | maybe | _empty]
  
  /**
    * Check if the type is supported by this tech.
    *
    * The base tech does not support any type, but source handlers might
    * overwrite this.
    *
    * @param type
    *        The media type to check
    * @return Returns the native video element's response
    */
  inline def canPlayType(`type`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canPlayType")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Get a `Tech` from the shared list by name.
    *
    * @param name
    *        `camelCase` or `TitleCase` name of the Tech to get
    *
    * @return The `Tech` or undefined if there was no tech with the name requested.
    */
  inline def getTech(name: String): js.UndefOr[typings.videoJs.mod.videojs.Tech] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTech")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.videoJs.mod.videojs.Tech]]
  
  /**
    * Return whether the argument is a Tech or not.
    * Can be passed either a Class like `Html5` or a instance like `player.tech_`
    *
    * @param component
    *        The item to check
    *
    * @return Whether it is a tech or not
    *         - True if it is a tech
    *         - False if it is not
    */
  inline def isTech(component: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTech")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Registers a `Tech` into a shared list for videojs.
    *
    * @param name
    *        Name of the `Tech` to register.
    *
    * @param tech
    *        The `Tech` class to register.
    */
  inline def registerTech(name: String, tech: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTech")(name.asInstanceOf[js.Any], tech.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * A functional mixin for techs that want to use the Source Handler pattern.
    * Source handlers are scripts for handling specific formats.
    * The source handler pattern is used for adaptive formats (HLS, DASH) that
    * manually load video data and feed it into a Source Buffer (Media Source Extensions)
    * Example: `Tech.withSourceHandlers.call(MyTech);`
    *
    * @param tech
    *        The tech to add source handler functions to.
    *
    */
  inline def withSourceHandlers(tech: TypeofTech): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("withSourceHandlers")(tech.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
