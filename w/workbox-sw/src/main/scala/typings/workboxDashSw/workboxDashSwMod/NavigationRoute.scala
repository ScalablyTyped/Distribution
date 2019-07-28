package typings.workboxDashSw.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NavigationRoute makes it easy to create a Route that matches for browser
  * [navigation requests]{@link https://developers.google.com/web/fundamentals/primers/service-workers/high-performance-loading#first_what_are_navigation_requests}.
  *
  * It will only match incoming Requests whose
  * [`mode`]{@link https://fetch.spec.whatwg.org/#concept-request-mode}
  * is set to `navigate`.
  *
  * You can optionally only apply this route to a subset of navigation requests
  * by using one or both of the `blacklist` and `whitelist` parameters.
  */
trait NavigationRoute extends js.Object

