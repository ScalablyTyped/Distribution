package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "NetworkQualityStats")
@js.native
class NetworkQualityStats () extends StObject {
  
  var audio: NetworkQualityAudioStats | Null = js.native
  
  var level: NetworkQualityLevel = js.native
  
  // nullable depending on verbosity config
  var video: NetworkQualityVideoStats | Null = js.native
}
