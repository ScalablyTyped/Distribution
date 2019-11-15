package typings.videoDotJs.videoDotJsMod.default

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.videoDotJs.videoDotJsMod.videojs.Component.ReadyCallback
import typings.videoDotJs.videoDotJsMod.videojs.ComponentOptions
import typings.videoDotJs.videoDotJsMod.videojs.Player
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "VolumeLevel")
@js.native
object VolumeLevel
  extends /**
  * Creates an instance of this class.
  *
  * @param player
  *        The `Player` that this class should be attached to.
  *
  * @param [options]
  *        The key/value store of player options.
  *
  * @param [options.children]
  *        An array of children objects to intialize this component with. Children objects have
  *        a name property that will be used if more than one component of the same type needs to be
  *        added.
  *
  * @param [ready]
  *        Function that gets called when the `Component` is ready.
  */
Instantiable1[/* player */ Player, typings.videoDotJs.videoDotJsMod.videojs.VolumeLevel]
     with Instantiable2[
      /* player */ Player, 
      /* options */ ComponentOptions, 
      typings.videoDotJs.videoDotJsMod.videojs.VolumeLevel
    ]
     with Instantiable3[
      /* player */ Player, 
      /* options */ ComponentOptions, 
      /* ready */ ReadyCallback, 
      typings.videoDotJs.videoDotJsMod.videojs.VolumeLevel
    ]

