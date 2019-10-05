package typings.videoDotJs.videoDotJsMod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadyState extends js.Object

@JSImport("video.js", "videojs.ReadyState")
@js.native
object ReadyState extends js.Object {
  @js.native
  sealed trait HaveCurrentData extends ReadyState
  
  @js.native
  sealed trait HaveEnoughData extends ReadyState
  
  @js.native
  sealed trait HaveFutureData extends ReadyState
  
  @js.native
  sealed trait HaveMetadata extends ReadyState
  
  @js.native
  sealed trait HaveNothing extends ReadyState
  
}

