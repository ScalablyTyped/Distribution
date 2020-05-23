package typings.urqlCore.clientMod

import typings.std.RequestInit
import typings.urqlCore.anon.FnCall
import typings.urqlCore.typesMod.Exchange
import typings.urqlCore.typesMod.RequestPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /** An ordered array of Exchanges. */
  var exchanges: js.UndefOr[js.Array[Exchange]] = js.undefined
  /** An alternative fetch implementation. */
  var fetch: js.UndefOr[FnCall] = js.undefined
  /** Any additional options to pass to fetch. */
  var fetchOptions: js.UndefOr[RequestInit | js.Function0[RequestInit]] = js.undefined
  /** Mask __typename from results. */
  var maskTypename: js.UndefOr[Boolean] = js.undefined
  /** Use HTTP GET for queries. */
  var preferGetMethod: js.UndefOr[Boolean] = js.undefined
  /** The default request policy for requests. */
  var requestPolicy: js.UndefOr[RequestPolicy] = js.undefined
  /** Activates support for Suspense. */
  var suspense: js.UndefOr[Boolean] = js.undefined
  /** Target endpoint URL such as `https://my-target:8080/graphql`. */
  var url: String
}

object ClientOptions {
  @scala.inline
  def apply(
    url: String,
    exchanges: js.Array[Exchange] = null,
    fetch: FnCall = null,
    fetchOptions: RequestInit | js.Function0[RequestInit] = null,
    maskTypename: js.UndefOr[Boolean] = js.undefined,
    preferGetMethod: js.UndefOr[Boolean] = js.undefined,
    requestPolicy: RequestPolicy = null,
    suspense: js.UndefOr[Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (exchanges != null) __obj.updateDynamic("exchanges")(exchanges.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(maskTypename)) __obj.updateDynamic("maskTypename")(maskTypename.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preferGetMethod)) __obj.updateDynamic("preferGetMethod")(preferGetMethod.get.asInstanceOf[js.Any])
    if (requestPolicy != null) __obj.updateDynamic("requestPolicy")(requestPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(suspense)) __obj.updateDynamic("suspense")(suspense.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

