package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.draft
  - typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.future
  - typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.pending
  - typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.`private`
  - typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.publish
*/
trait PostStatus extends js.Object

object PostStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def draft: typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.draft = this.cast("draft")
  @scala.inline
  def future: typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.future = this.cast("future")
  @scala.inline
  def pending: typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.pending = this.cast("pending")
  @scala.inline
  def `private`: typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.`private` = this.cast("private")
  @scala.inline
  def publish: typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.publish = this.cast("publish")
}

