package typings
package typeaheadLib.BloodhoundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bloodhound only goes to the network when the internal search engine cannot
  * provide a sufficient number of results. In order to prevent an obscene
  * number of requests being made to the remote endpoint, requests are rate-limited.
  */
trait RemoteOptions[T] extends js.Object {
  /**
    * DEPRECATED: transform the remote response before the Bloodhound instance operates on it.
    * */
  var filter: js.UndefOr[js.Function1[/* response */ T, T]] = js.undefined
  /**
    * A function that provides a hook to allow you to prepare the settings
    * object passed to transport when a request is about to be made.
    * The function signature should be prepare(query, settings), where query
    * is the query #search was called with and settings is the default settings
    * object created internally by the Bloodhound instance. The prepare function
    * should return a settings object. Defaults to the identity function.
    *
    * @param query The query #search was called with.
    * @param settings The default settings object created internally by Bloodhound.
    * @returns A JqueryAjaxSettings object.
    */
  var prepare: js.UndefOr[
    js.Function2[
      /* query */ java.lang.String, 
      /* settings */ jqueryLib.JQueryAjaxSettings, 
      jqueryLib.JQueryAjaxSettings
    ]
  ] = js.undefined
  /**
    * The time interval in milliseconds that will be used by rateLimitBy.
    * Defaults to 300.
    */
  var rateLimitWait: js.UndefOr[scala.Double] = js.undefined
  /**
    * The method used to rate-limit network requests.
    * Can be either debounce or throttle. Defaults to debounce.
    */
  var rateLimitby: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A function with the signature transform(response) that allows you to
    * transform the remote response before the Bloodhound instance operates on it.
    * Defaults to the identity function.
    *
    * @param response Prefetch response.
    * @returns Transform response.
    */
  var transform: js.UndefOr[js.Function1[/* response */ T, T]] = js.undefined
  /**
    * The URL remote data should be loaded from.
    */
  var url: java.lang.String
  /**
    * A convenience option for prepare. If set, prepare will be a function
    * that replaces the value of this option in url with the URI encoded query.
    */
  var wildcard: js.UndefOr[java.lang.String] = js.undefined
}

object RemoteOptions {
  @scala.inline
  def apply[T](
    url: java.lang.String,
    filter: js.Function1[/* response */ T, T] = null,
    prepare: js.Function2[
      /* query */ java.lang.String, 
      /* settings */ jqueryLib.JQueryAjaxSettings, 
      jqueryLib.JQueryAjaxSettings
    ] = null,
    rateLimitWait: scala.Int | scala.Double = null,
    rateLimitby: java.lang.String = null,
    transform: js.Function1[/* response */ T, T] = null,
    wildcard: java.lang.String = null
  ): RemoteOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (prepare != null) __obj.updateDynamic("prepare")(prepare)
    if (rateLimitWait != null) __obj.updateDynamic("rateLimitWait")(rateLimitWait.asInstanceOf[js.Any])
    if (rateLimitby != null) __obj.updateDynamic("rateLimitby")(rateLimitby)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (wildcard != null) __obj.updateDynamic("wildcard")(wildcard)
    __obj.asInstanceOf[RemoteOptions[T]]
  }
}

