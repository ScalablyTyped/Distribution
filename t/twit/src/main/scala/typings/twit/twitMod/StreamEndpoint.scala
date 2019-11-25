package typings.twit.twitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twit.twitStrings.`statuses/filter`
  - typings.twit.twitStrings.`statuses/sample`
  - typings.twit.twitStrings.`statuses/firehose`
  - typings.twit.twitStrings.user
  - typings.twit.twitStrings.site
*/
trait StreamEndpoint extends js.Object

object StreamEndpoint {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def site: typings.twit.twitStrings.site = this.cast("site")
  @scala.inline
  def `statuses/filter`: typings.twit.twitStrings.`statuses/filter` = this.cast("statuses/filter")
  @scala.inline
  def `statuses/firehose`: typings.twit.twitStrings.`statuses/firehose` = this.cast("statuses/firehose")
  @scala.inline
  def `statuses/sample`: typings.twit.twitStrings.`statuses/sample` = this.cast("statuses/sample")
  @scala.inline
  def user: typings.twit.twitStrings.user = this.cast("user")
}

