package typings.typeahead.Bloodhound

import typings.jquery.JQueryAjaxSettings
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
    js.Function2[/* query */ String, /* settings */ JQueryAjaxSettings, JQueryAjaxSettings]
  ] = js.undefined
  /**
    * The time interval in milliseconds that will be used by rateLimitBy.
    * Defaults to 300.
    */
  var rateLimitWait: js.UndefOr[Double] = js.undefined
  /**
    * The method used to rate-limit network requests.
    * Can be either debounce or throttle. Defaults to debounce.
    */
  var rateLimitby: js.UndefOr[String] = js.undefined
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
  var url: String
  /**
    * A convenience option for prepare. If set, prepare will be a function
    * that replaces the value of this option in url with the URI encoded query.
    */
  var wildcard: js.UndefOr[String] = js.undefined
}

object RemoteOptions {
  @scala.inline
  def apply[T](
    url: String,
    filter: /* response */ T => T = null,
    prepare: (/* query */ String, /* settings */ JQueryAjaxSettings) => JQueryAjaxSettings = null,
    rateLimitWait: Int | Double = null,
    rateLimitby: String = null,
    transform: /* response */ T => T = null,
    wildcard: String = null
  ): RemoteOptions[T] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (prepare != null) __obj.updateDynamic("prepare")(js.Any.fromFunction2(prepare))
    if (rateLimitWait != null) __obj.updateDynamic("rateLimitWait")(rateLimitWait.asInstanceOf[js.Any])
    if (rateLimitby != null) __obj.updateDynamic("rateLimitby")(rateLimitby.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (wildcard != null) __obj.updateDynamic("wildcard")(wildcard.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteOptions[T]]
  }
}

