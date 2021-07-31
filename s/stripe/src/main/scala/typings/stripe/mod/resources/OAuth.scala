package typings.stripe.mod.resources

import typings.stripe.mod.HeaderOptions
import typings.stripe.mod.IResponseFn
import typings.stripe.mod.Stripe
import typings.stripe.mod.StripeResource
import typings.stripe.mod.oauth.IOAuthAuthorizationCodeTokenRequest
import typings.stripe.mod.oauth.IOAuthDeauthorizationResponse
import typings.stripe.mod.oauth.IOAuthRefreshTokenRequest
import typings.stripe.mod.oauth.IOAuthToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.OAuth")
@js.native
class OAuth protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  def deauthorize(client_id: String, stripe_user_id: String): js.Promise[IOAuthDeauthorizationResponse] = js.native
  /**
    * When revoking access to an account, you must use an API key that matches the mode—live or test—of the authorization code (which depends on whether the client_id used was production or development).
    *
    * @param client_id The client_id of the application that you'd like to disconnect the account from. The account must be connected to this application.
    * @param stripe_user_id The account you'd like to disconnect from.
    */
  def deauthorize(client_id: String, stripe_user_id: String, options: HeaderOptions): js.Promise[IOAuthDeauthorizationResponse] = js.native
  def deauthorize(
    client_id: String,
    stripe_user_id: String,
    options: HeaderOptions,
    response: IResponseFn[IOAuthDeauthorizationResponse]
  ): js.Promise[IOAuthDeauthorizationResponse] = js.native
  def deauthorize(client_id: String, stripe_user_id: String, response: IResponseFn[IOAuthDeauthorizationResponse]): js.Promise[IOAuthDeauthorizationResponse] = js.native
  
  def token(data: IOAuthAuthorizationCodeTokenRequest): js.Promise[IOAuthToken] = js.native
  /**
    * Used both for turning an authorization_code into an access_token, and for getting a new access token using a refresh_token.
    *
    */
  def token(data: IOAuthAuthorizationCodeTokenRequest, options: HeaderOptions): js.Promise[IOAuthToken] = js.native
  def token(
    data: IOAuthAuthorizationCodeTokenRequest,
    options: HeaderOptions,
    response: IResponseFn[IOAuthToken]
  ): js.Promise[IOAuthToken] = js.native
  def token(data: IOAuthAuthorizationCodeTokenRequest, response: IResponseFn[IOAuthToken]): js.Promise[IOAuthToken] = js.native
  def token(data: IOAuthRefreshTokenRequest): js.Promise[IOAuthToken] = js.native
  def token(data: IOAuthRefreshTokenRequest, options: HeaderOptions): js.Promise[IOAuthToken] = js.native
  def token(data: IOAuthRefreshTokenRequest, options: HeaderOptions, response: IResponseFn[IOAuthToken]): js.Promise[IOAuthToken] = js.native
  def token(data: IOAuthRefreshTokenRequest, response: IResponseFn[IOAuthToken]): js.Promise[IOAuthToken] = js.native
}
