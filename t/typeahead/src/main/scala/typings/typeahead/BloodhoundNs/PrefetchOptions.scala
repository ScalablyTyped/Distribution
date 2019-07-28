package typings.typeahead.BloodhoundNs

import typings.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Prefetched data is fetched and processed on initialization. If the browser
  * supports local storage, the processed data will be cached there to prevent
  * additional network requests on subsequent page loads.
  *
  * WARNING: While it's possible to get away with it for smaller data sets,
  * prefetched data isn't meant to contain entire sets of data. Rather, it should
  * act as a first-level cache. Ignoring this warning means you'll run the risk
  * of hitting local storage limits.
  */
trait PrefetchOptions[T] extends js.Object {
  /**
    * If false, will not attempt to read or write to local storage and
    * will always load prefetch data from url on initialization. Defaults to true.
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
    * The key that data will be stored in local storage under.
    * Defaults to value of url.
    */
  var cacheKey: js.UndefOr[String] = js.undefined
  /**
    * A function that provides a hook to allow you to prepare the settings
    * object passed to transport when a request is about to be made.
    * Defaults to the identity function.
    *
    * @param settings The default settings object created internally by the Bloodhound instance.
    * @returns A settings object.
    */
  var prepare: js.UndefOr[js.Function1[/* settings */ JQueryAjaxSettings, JQueryAjaxSettings]] = js.undefined
  /**
    * A string used for thumbprinting prefetched data. If this doesn't
    * match what's stored in local storage, the data will be refetched.
    */
  var thumbprint: js.UndefOr[String] = js.undefined
  /**
    * A function with the signature transform(response) that allows you to
    * transform the prefetch response before the Bloodhound instance operates
    * on it. Defaults to the identity function.
    *
    * @param response Prefetch response.
    * @returns Transform response.
    */
  var transform: js.UndefOr[js.Function1[/* response */ T, T]] = js.undefined
  /**
    * The time (in milliseconds) the prefetched data should be cached in
    * local storage. Defaults to 86400000 (1 day).
    */
  var ttl: js.UndefOr[Double] = js.undefined
  /**
    * The URL prefetch data should be loaded from.
    */
  var url: String
}

object PrefetchOptions {
  @scala.inline
  def apply[T](
    url: String,
    cache: js.UndefOr[Boolean] = js.undefined,
    cacheKey: String = null,
    prepare: /* settings */ JQueryAjaxSettings => JQueryAjaxSettings = null,
    thumbprint: String = null,
    transform: /* response */ T => T = null,
    ttl: Int | Double = null
  ): PrefetchOptions[T] = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(cacheKey)
    if (prepare != null) __obj.updateDynamic("prepare")(js.Any.fromFunction1(prepare))
    if (thumbprint != null) __obj.updateDynamic("thumbprint")(thumbprint)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefetchOptions[T]]
  }
}

