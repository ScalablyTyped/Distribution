package typings.twilioSync.mod

import typings.twilsock.mod.InitRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Client for the Twilio Sync service.
  *
  * @example
  * ```typescript
  * // Using NPM resolution
  * const SyncClient = require('twilio-sync');
  * const syncClient = new SyncClient(token, { loglevel: 'debug' });
  *
  * // Using CDN
  * const syncClient = new Twilio.Sync.Client(token, { logLevel: 'debug' });
  * ```
  */
@JSImport("twilio-sync", "SyncClient")
@js.native
open class SyncClient protected () extends Client {
  /**
    * @param fpaToken Twilio access token.
    * @param options Options to customize the client.
    */
  def this(fpaToken: String) = this()
  def this(fpaToken: String, options: SyncClientOptions) = this()
}
object SyncClient {
  
  @JSImport("twilio-sync", "SyncClient")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fired when connection is interrupted by unexpected reason.
    *
    * Parameters:
    * 1. object `connectionError` - connection error details. It has following properties:
    *     * boolean `terminal` - twilsock will stop connection attempts
    *     * string `message` - root cause
    *     * number? `httpStatusCode` - HTTP status code if available
    *     * number? `errorCode` - Twilio public error code if available
    * @example
    * ```typescript
    * syncClient.on('connectionError', (connectionError) => {
    *   console.error('Connection was interrupted:', connectionError.message);
    *   console.error('Is terminal:', connectionError.terminal);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "SyncClient.connectionError")
  @js.native
  val connectionError: /* "connectionError" */ String = js.native
  
  /**
    * Fired when connection state has been changed.
    *
    * Parameters:
    * 1. {@link ConnectionState} `connectionState` - contains current service connection state.
    * @example
    * ```typescript
    * syncClient.on('connectionStateChanged', (newState) => {
    *   console.log('Received a new connection state:', newState);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "SyncClient.connectionStateChanged")
  @js.native
  val connectionStateChanged: /* "connectionStateChanged" */ String = js.native
  
  /* static member */
  inline def populateInitRegistrations(reg: InitRegistration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("populateInitRegistrations")(reg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Fired when the access token is about to expire and needs to be updated.
    * The trigger takes place three minutes before the JWT access token expiry.
    * For long living applications, you should refresh the token when either
    * {@link SyncClient.tokenAboutToExpire | tokenAboutToExpire} or
    * {@link SyncClient.tokenExpired | tokenExpire} events occur; handling just
    * one of them is sufficient.
    * @example
    * The following example illustrates access token refresh.
    * ```typescript
    * syncClient.on('tokenAboutToExpire', () => {
    *   // Obtain a JWT access token: https://www.twilio.com/docs/sync/identity-and-access-tokens
    *   const token = '<your-access-token-here>';
    *   syncClient.updateToken(token);
    * });
    * ```
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "SyncClient.tokenAboutToExpire")
  @js.native
  val tokenAboutToExpire: /* "tokenAboutToExpire" */ String = js.native
  
  /**
    * Fired when the access token is expired.
    * In case the token is not refreshed, all subsequent Sync operations will fail and the client will disconnect.
    * For long living applications, you should refresh the token when either
    * {@link SyncClient.tokenAboutToExpire | tokenAboutToExpire} or
    * {@link SyncClient.tokenExpired | tokenExpire} events occur; handling just
    * one of them is sufficient.
    * @event
    */
  /* static member */
  @JSImport("twilio-sync", "SyncClient.tokenExpired")
  @js.native
  val tokenExpired: /* "tokenExpired" */ String = js.native
}
