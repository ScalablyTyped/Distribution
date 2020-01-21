package typings.winrtUwp.Windows.Web.Http.Filters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides control of the local HTTP cache for responses to HTTP requests by methods in the Windows.Web.Http and Windows.Web.Http.Filters namespaces. */
@JSGlobal("Windows.Web.Http.Filters.HttpCacheControl")
@js.native
abstract class HttpCacheControl () extends js.Object {
  /** Get or set the read behavior to use for cache control on the HttpCacheControl object. */
  var readBehavior: HttpCacheReadBehavior = js.native
  /** Get or set the write behavior to use for cache control on the HttpCacheControl object. */
  var writeBehavior: HttpCacheWriteBehavior = js.native
}

