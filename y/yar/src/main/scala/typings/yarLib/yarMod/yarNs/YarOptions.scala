package typings
package yarLib.yarMod.yarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YarOptions extends js.Object {
  /**
    * hapi cache options which includes (among other options):
    */
  var cache: js.UndefOr[hapiLib.hapiMod.CachePolicyOptions[_]] = js.undefined
  /**
    * the configuration for cookie-specific features:
    */
  var cookieOptions: yarLib.Anon_ClearInvalid
  /**
    * will cause yar to throw an exception if trying to persist to cache when the cache is unavailable.
    * Setting this to false will allow applications using yar to run uninterrupted if the cache is not ready (however sessions will not be saving).
    * Defaults to true.
    */
  var errorOnCacheNotReady: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * maximum cookie size before using server-side storage.
    * Defaults to 1K. Set to zero to always use server-side storage.
    */
  var maxCookieSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Determines the name of the cookie used to store session information.
    * Defaults to session.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * determines whether to store empty session before they've been modified.
    * Defaults to true.
    */
  var storeBlank: js.UndefOr[scala.Boolean] = js.undefined
}

