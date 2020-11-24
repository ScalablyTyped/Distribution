package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkState extends js.Object
@JSImport("video.js", "videojs.NetworkState")
@js.native
object NetworkState extends js.Object {
  
  @js.native
  sealed trait Empty extends NetworkState
  
  @js.native
  sealed trait Idle extends NetworkState
  
  @js.native
  sealed trait Loading extends NetworkState
  
  @js.native
  sealed trait NoSource extends NetworkState
}
