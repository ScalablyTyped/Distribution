package typings.videoJs.mod.default

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.videoJs.mod.videojs.Component.ReadyCallback
import typings.videoJs.mod.videojs.TrackButtonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js", "DescriptionsButton")
@js.native
object DescriptionsButton
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
  *        The function to call when this component is ready.
  */
Instantiable1[
      /* player */ typings.videoJs.mod.videojs.Player, 
      typings.videoJs.mod.videojs.DescriptionsButton
    ]
     with Instantiable2[
      /* player */ typings.videoJs.mod.videojs.Player, 
      /* options */ TrackButtonOptions, 
      typings.videoJs.mod.videojs.DescriptionsButton
    ]
     with Instantiable3[
      /* player */ typings.videoJs.mod.videojs.Player, 
      js.UndefOr[/* options */ TrackButtonOptions], 
      /* ready */ ReadyCallback, 
      typings.videoJs.mod.videojs.DescriptionsButton
    ]
