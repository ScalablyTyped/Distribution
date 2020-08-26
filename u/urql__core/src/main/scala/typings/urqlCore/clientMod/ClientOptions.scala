package typings.urqlCore.clientMod

import typings.std.RequestInit
import typings.urqlCore.anon.FnCall
import typings.urqlCore.typesMod.Exchange
import typings.urqlCore.typesMod.RequestPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  /** An ordered array of Exchanges. */
  var exchanges: js.UndefOr[js.Array[Exchange]] = js.native
  /** An alternative fetch implementation. */
  var fetch: js.UndefOr[FnCall] = js.native
  /** Any additional options to pass to fetch. */
  var fetchOptions: js.UndefOr[RequestInit | js.Function0[RequestInit]] = js.native
  /** Mask __typename from results. */
  var maskTypename: js.UndefOr[Boolean] = js.native
  /** Use HTTP GET for queries. */
  var preferGetMethod: js.UndefOr[Boolean] = js.native
  /** The default request policy for requests. */
  var requestPolicy: js.UndefOr[RequestPolicy] = js.native
  /** Activates support for Suspense. */
  var suspense: js.UndefOr[Boolean] = js.native
  /** Target endpoint URL such as `https://my-target:8080/graphql`. */
  var url: String = js.native
}

object ClientOptions {
  @scala.inline
  def apply(url: String): ClientOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setExchangesVarargs(value: Exchange*): Self = this.set("exchanges", js.Array(value :_*))
    @scala.inline
    def setExchanges(value: js.Array[Exchange]): Self = this.set("exchanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExchanges: Self = this.set("exchanges", js.undefined)
    @scala.inline
    def setFetch(value: FnCall): Self = this.set("fetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    @scala.inline
    def setFetchOptionsFunction0(value: () => RequestInit): Self = this.set("fetchOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setFetchOptions(value: RequestInit | js.Function0[RequestInit]): Self = this.set("fetchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchOptions: Self = this.set("fetchOptions", js.undefined)
    @scala.inline
    def setMaskTypename(value: Boolean): Self = this.set("maskTypename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskTypename: Self = this.set("maskTypename", js.undefined)
    @scala.inline
    def setPreferGetMethod(value: Boolean): Self = this.set("preferGetMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferGetMethod: Self = this.set("preferGetMethod", js.undefined)
    @scala.inline
    def setRequestPolicy(value: RequestPolicy): Self = this.set("requestPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestPolicy: Self = this.set("requestPolicy", js.undefined)
    @scala.inline
    def setSuspense(value: Boolean): Self = this.set("suspense", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuspense: Self = this.set("suspense", js.undefined)
  }
  
}

