package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadyState extends js.Object

@JSImport("video.js/videojs", "ReadyState")
@js.native
object ReadyState extends js.Object {
  @js.native
  sealed trait HaveCurrentData
    extends videoDotJsLib.videoDotJsMod.videojsNs.ReadyState
  
  @js.native
  sealed trait HaveEnoughData
    extends videoDotJsLib.videoDotJsMod.videojsNs.ReadyState
  
  @js.native
  sealed trait HaveFutureData
    extends videoDotJsLib.videoDotJsMod.videojsNs.ReadyState
  
  @js.native
  sealed trait HaveMetadata
    extends videoDotJsLib.videoDotJsMod.videojsNs.ReadyState
  
  @js.native
  sealed trait HaveNothing
    extends videoDotJsLib.videoDotJsMod.videojsNs.ReadyState
  
}

