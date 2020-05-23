package typings.videoJs.videoCoreMod.default.Tech

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.videoJs.anon.TypeofTech
import typings.videoJs.mod.videojs.Component.ReadyCallback
import typings.videoJs.videoJsStrings._empty
import typings.videoJs.videoJsStrings.maybe
import typings.videoJs.videoJsStrings.problably
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core", "Tech")
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
  extends typings.videoJs.mod.videojs.Tech {
  def this(options: js.Any) = this()
  def this(options: js.Any, ready: ReadyCallback) = this()
}

@JSImport("video.js/dist/alt/video.core", "Tech")
@js.native
object ^
  extends TopLevel[
      (/**
  * Create an instance of this Tech.
  *
  * @param [options]
  *        The key/value store of player options.
  *
  * @param ready
  *        Callback function to call when the `HTML5` Tech is ready.
  */
Instantiable0[typings.videoJs.mod.videojs.Tech]) with (Instantiable1[/* options */ js.Any, typings.videoJs.mod.videojs.Tech]) with (Instantiable2[/* options */ js.Any, /* ready */ ReadyCallback, typings.videoJs.mod.videojs.Tech])
    ] {
  /**
    * Check if the tech can support the given source
    * @param srcObj
    *        The source object
    * @param options
    *        The options passed to the tech
    * @return 'probably', 'maybe', or '' (empty string)
    */
  def canPlaySource(srcObj: js.Any, options: js.Any): problably | maybe | _empty = js.native
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
  def canPlayType(`type`: String): String = js.native
  /**
    * Get a `Tech` from the shared list by name.
    *
    * @param name
    *        `camelCase` or `TitleCase` name of the Tech to get
    *
    * @return The `Tech` or undefined if there was no tech with the name requested.
    */
  def getTech(name: String): js.UndefOr[typings.videoJs.mod.videojs.Tech] = js.native
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
  def isTech(component: js.Any): Boolean = js.native
  /**
    * Registers a `Tech` into a shared list for videojs.
    *
    * @param name
    *        Name of the `Tech` to register.
    *
    * @param tech
    *        The `Tech` class to register.
    */
  def registerTech(name: String, tech: js.Any): Unit = js.native
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
  def withSourceHandlers(tech: TypeofTech): Unit = js.native
}

