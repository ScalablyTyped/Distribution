package typings.twilioVideo.typesMod

import typings.twilioVideo.videoTrackMod.VideoTrack.Dimensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video/tsdef/types", "LocalVideoTrackStats")
@js.native
open class LocalVideoTrackStats () extends LocalTrackStats {
  
  var captureDimensions: Dimensions | Null = js.native
  
  var captureFrameRate: Double | Null = js.native
  
  var dimensions: Dimensions | Null = js.native
  
  var frameRate: Double | Null = js.native
}
