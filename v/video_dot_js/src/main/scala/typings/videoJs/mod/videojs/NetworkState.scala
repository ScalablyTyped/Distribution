package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkState extends StObject
@JSImport("video.js", "videojs.NetworkState")
@js.native
object NetworkState extends StObject {
  
  @js.native
  sealed trait Empty extends NetworkState
  
  @js.native
  sealed trait Idle extends NetworkState
  
  @js.native
  sealed trait Loading extends NetworkState
  
  @js.native
  sealed trait NoSource extends NetworkState
}
