package typings.twilioVideo.typesMod

import typings.twilioVideo.videoTrackMod.VideoTrack.Dimensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video/tsdef/types", "RemoteVideoTrackStats")
@js.native
open class RemoteVideoTrackStats () extends RemoteTrackStats {
  
  var dimensions: Dimensions | Null = js.native
  
  var frameRate: Double | Null = js.native
}
