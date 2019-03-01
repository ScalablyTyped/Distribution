package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkState extends js.Object

@JSImport("video.js/videojs", "NetworkState")
@js.native
object NetworkState extends js.Object {
  @js.native
  sealed trait Empty
    extends videoDotJsLib.videoDotJsMod.videojsNs.NetworkState
  
  @js.native
  sealed trait Idle
    extends videoDotJsLib.videoDotJsMod.videojsNs.NetworkState
  
  @js.native
  sealed trait Loading
    extends videoDotJsLib.videoDotJsMod.videojsNs.NetworkState
  
  @js.native
  sealed trait NoSource
    extends videoDotJsLib.videoDotJsMod.videojsNs.NetworkState
  
}

