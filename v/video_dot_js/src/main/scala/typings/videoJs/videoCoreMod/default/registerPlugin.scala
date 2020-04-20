package typings.videoJs.videoCoreMod.default

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Register a Video.js plugin.
  *
  * @borrows plugin:registerPlugin as registerPlugin
  *
  * @param name
  *         The name of the plugin to be registered. Must be a string and
  *         must not match an existing plugin or a method on the `Player`
  *         prototype.
  *
  * @param plugin
  *         A sub-class of `Plugin` or a function for basic plugins.
  *
  * @return	For advanced plugins, a factory function for that plugin. For
  *         basic plugins, a wrapper function that initializes the plugin.
  */
@JSImport("video.js/dist/alt/video.core", "registerPlugin")
@js.native
object registerPlugin
  extends TopLevel[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.registerPlugin */ js.Any
    ]

