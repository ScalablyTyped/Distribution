package typings.twilio.mod

import typings.twilio.libBaseRequestClientMod.RequestClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("twilio", "RequestClient")
@js.native
/**
  * Make http request
  * @param opts - The options passed to https.Agent
  * @param opts.timeout - https.Agent timeout option. Used as the socket timeout, AND as the default request timeout.
  * @param opts.keepAlive - https.Agent keepAlive option
  * @param opts.keepAliveMsecs - https.Agent keepAliveMsecs option
  * @param opts.maxSockets - https.Agent maxSockets option
  * @param opts.maxTotalSockets - https.Agent maxTotalSockets option
  * @param opts.maxFreeSockets - https.Agent maxFreeSockets option
  * @param opts.scheduling - https.Agent scheduling option
  * @param opts.autoRetry - Enable auto-retry requests with exponential backoff on 429 responses. Defaults to false.
  * @param opts.maxRetryDelay - Max retry delay in milliseconds for 429 Too Many Request response retries. Defaults to 3000.
  * @param opts.maxRetries - Max number of request retries for 429 Too Many Request responses. Defaults to 3.
  */
open class RequestClientCls ()
  extends typings.twilio.libBaseRequestClientMod.^ {
  def this(opts: RequestClientOptions) = this()
}
