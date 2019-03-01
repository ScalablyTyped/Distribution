package typings
package videoDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CanPlaySource
  extends /**
		 * Create an instance of this Tech.
		 *
		 * @param [options]
		 *        The key/value store of player options.
		 *
		 * @param ready
		 *        Callback function to call when the `HTML5` Tech is ready.
		 */
org.scalablytyped.runtime.Instantiable0[videoDotJsLib.videoDotJsMod.videojsNs.Tech]
     with org.scalablytyped.runtime.Instantiable1[/* options */ js.Any, videoDotJsLib.videoDotJsMod.videojsNs.Tech]
     with org.scalablytyped.runtime.Instantiable2[
      /* options */ js.Any, 
      /* ready */ videoDotJsLib.videoDotJsMod.videojsNs.ComponentNs.ReadyCallback, 
      videoDotJsLib.videoDotJsMod.videojsNs.Tech
    ] {
  /**
  		 * Check if the tech can support the given source
  		 * @param srcObj
  		 *        The source object
  		 * @param options
  		 *        The options passed to the tech
  		 * @return 'probably', 'maybe', or '' (empty string)
  		 */
  def canPlaySource(srcObj: js.Any, options: js.Any): videoDotJsLib.videoDotJsLibStrings.problably | videoDotJsLib.videoDotJsLibStrings.maybe | videoDotJsLib.videoDotJsLibStrings.Empty = js.native
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
  def canPlayType(`type`: java.lang.String): java.lang.String = js.native
  /**
  		 * Get a `Tech` from the shared list by name.
  		 *
  		 * @param name
  		 *        `camelCase` or `TitleCase` name of the Tech to get
  		 *
  		 * @return The `Tech` or undefined if there was no tech with the name requested.
  		 */
  def getTech(name: java.lang.String): js.UndefOr[videoDotJsLib.videoDotJsMod.videojsNs.Tech] = js.native
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
  def isTech(component: js.Any): scala.Boolean = js.native
  /**
  		 * Registers a `Tech` into a shared list for videojs.
  		 *
  		 * @param name
  		 *        Name of the `Tech` to register.
  		 *
  		 * @param tech
  		 *        The `Tech` class to register.
  		 */
  def registerTech(name: java.lang.String, tech: js.Any): scala.Unit = js.native
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
  def withSourceHandlers(tech: `Anon_`): scala.Unit = js.native
}

