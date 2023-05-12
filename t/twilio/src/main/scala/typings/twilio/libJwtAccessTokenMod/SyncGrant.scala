package typings.twilio.libJwtAccessTokenMod

import typings.twilio.twilioStrings.data_sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/jwt/AccessToken", "SyncGrant")
@js.native
/**
  * @param options.serviceSid - The service unique ID
  * @param options.endpointId - The endpoint ID
  */
open class SyncGrant ()
  extends Grant[SyncGrantOptions, SyncGrantPayload, data_sync]
     with SyncGrantOptions {
  def this(options: SyncGrantOptions) = this()
}
