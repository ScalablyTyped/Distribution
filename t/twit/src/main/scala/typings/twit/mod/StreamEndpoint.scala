package typings.twit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twit.twitStrings.statusesSlashfilter
  - typings.twit.twitStrings.statusesSlashsample
  - typings.twit.twitStrings.statusesSlashfirehose
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
  def statusesSlashfilter: typings.twit.twitStrings.statusesSlashfilter = this.cast("statuses/filter")
  @scala.inline
  def statusesSlashfirehose: typings.twit.twitStrings.statusesSlashfirehose = this.cast("statuses/firehose")
  @scala.inline
  def statusesSlashsample: typings.twit.twitStrings.statusesSlashsample = this.cast("statuses/sample")
  @scala.inline
  def user: typings.twit.twitStrings.user = this.cast("user")
}

