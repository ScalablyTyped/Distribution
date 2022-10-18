package typings.twilio.libJwtAccessTokenMod

import typings.twilio.twilioStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/jwt/AccessToken", "VideoGrant")
@js.native
open class VideoGrant ()
  extends Grant[VideoGrantOptions, VideoGrantPayload, video]
     with VideoGrantOptions {
  def this(opts: VideoGrantOptions) = this()
}
