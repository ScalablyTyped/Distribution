package typings.twilio.libJwtAccessTokenMod

import typings.twilio.twilioStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/jwt/AccessToken", "VideoGrant")
@js.native
/**
  * @param options - ...
  * @param options.room - The Room name or Room sid.
  */
open class VideoGrant ()
  extends Grant[VideoGrantOptions, VideoGrantPayload, video]
     with VideoGrantOptions {
  def this(options: VideoGrantOptions) = this()
}
