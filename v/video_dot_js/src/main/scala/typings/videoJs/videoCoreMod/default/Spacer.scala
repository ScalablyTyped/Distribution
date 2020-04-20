package typings.videoJs.videoCoreMod.default

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.videoJs.mod.videojs.Component.ReadyCallback
import typings.videoJs.mod.videojs.ComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core", "Spacer")
@js.native
object Spacer
  extends /**
  * Creates an instance of this class.
  *
  * @param player
  *        The `Player` that this class should be attached to.
  *
  * @param [options]
  *        The key/value store of player options.
  *
  * @param [ready]
  *        Function that gets called when the `Component` is ready.
  */
Instantiable1[
      /* player */ typings.videoJs.mod.videojs.Player, 
      typings.videoJs.mod.videojs.Spacer
    ]
     with Instantiable2[
      /* player */ typings.videoJs.mod.videojs.Player, 
      /* options */ ComponentOptions, 
      typings.videoJs.mod.videojs.Spacer
    ]
     with Instantiable3[
      /* player */ typings.videoJs.mod.videojs.Player, 
      /* options */ ComponentOptions, 
      /* ready */ ReadyCallback, 
      typings.videoJs.mod.videojs.Spacer
    ]

