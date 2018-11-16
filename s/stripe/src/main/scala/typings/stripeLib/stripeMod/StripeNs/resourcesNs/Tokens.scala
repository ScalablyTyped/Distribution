package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tokens
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  def create(data: stripeLib.stripeMod.StripeNs.tokensNs.IBankAccountTokenCreationOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IBankAccountToken] = js.native
  /**
               * Creates a single use token that wraps the details of a bank account. This token can be used
               * in place of a bank account object with any API method. These tokens can only be used once:
               * by attaching them to a recipient or managed account.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.tokensNs.IBankAccountTokenCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IBankAccountToken] = js.native
  /**
               * Creates a single use token that wraps the details of a bank account. This token can be used
               * in place of a bank account object with any API method. These tokens can only be used once:
               * by attaching them to a recipient or managed account.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.tokensNs.IBankAccountTokenCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.tokensNs.IBankAccountToken]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IBankAccountToken] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.tokensNs.IBankAccountTokenCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.tokensNs.IBankAccountToken]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IBankAccountToken] = js.native
  def create(data: stripeLib.stripeMod.StripeNs.tokensNs.ICardTokenCreationOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.ICardToken] = js.native
  /**
               * Creates a single use token that wraps the details of a credit card. This token can be used
               * in place of a credit card object with any API method. These tokens can only be used once:
               * by creating a new charge object, or attaching them to a customer.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.tokensNs.ICardTokenCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.ICardToken] = js.native
  /**
               * Creates a single use token that wraps the details of a credit card. This token can be used
               * in place of a credit card object with any API method. These tokens can only be used once:
               * by creating a new charge object, or attaching them to a customer.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.tokensNs.ICardTokenCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.tokensNs.ICardToken]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.ICardToken] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.tokensNs.ICardTokenCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.tokensNs.ICardToken]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.ICardToken] = js.native
  def create(data: stripeLib.stripeMod.StripeNs.tokensNs.IPiiTokenCreationOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IToken] = js.native
  /**
               * Creates a single use token that wraps the details of personally identifiable information (PII).
               * This token can be used in place of a personal_id_number in the Account Update API method.
               * These tokens can only be used once.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.tokensNs.IPiiTokenCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IToken] = js.native
  /**
               * Creates a single use token that wraps the details of personally identifiable information (PII).
               * This token can be used in place of a personal_id_number in the Account Update API method.
               * These tokens can only be used once.
               */
  def create(
    data: stripeLib.stripeMod.StripeNs.tokensNs.IPiiTokenCreationOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.tokensNs.IToken]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IToken] = js.native
  def create(
    data: stripeLib.stripeMod.StripeNs.tokensNs.IPiiTokenCreationOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.tokensNs.IToken]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IToken] = js.native
  def retrieve(tokenId: java.lang.String): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IToken] = js.native
  def retrieve(tokenId: java.lang.String, data: stripeLib.stripeMod.StripeNs.IDataOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IToken] = js.native
  /**
               * Retrieves the token with the given ID.
               */
  def retrieve(
    tokenId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IToken] = js.native
  /**
               * Retrieves the token with the given ID.
               */
  def retrieve(
    tokenId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.tokensNs.IToken]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IToken] = js.native
  def retrieve(
    tokenId: java.lang.String,
    data: stripeLib.stripeMod.StripeNs.IDataOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.tokensNs.IToken]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IToken] = js.native
  def retrieve(tokenId: java.lang.String, options: stripeLib.stripeMod.StripeNs.HeaderOptions): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IToken] = js.native
  def retrieve(
    tokenId: java.lang.String,
    options: stripeLib.stripeMod.StripeNs.HeaderOptions,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.tokensNs.IToken]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IToken] = js.native
  def retrieve(
    tokenId: java.lang.String,
    response: stripeLib.stripeMod.StripeNs.IResponseFn[stripeLib.stripeMod.StripeNs.tokensNs.IToken]
  ): stdLib.Promise[stripeLib.stripeMod.StripeNs.tokensNs.IToken] = js.native
}

