package typings.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twit.twitStrings.mixed
  - typings.twit.twitStrings.popular
  - typings.twit.twitStrings.recent
*/
trait ResultType extends js.Object

object ResultType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mixed: typings.twit.twitStrings.mixed = this.cast("mixed")
  @scala.inline
  def popular: typings.twit.twitStrings.popular = this.cast("popular")
  @scala.inline
  def recent: typings.twit.twitStrings.recent = this.cast("recent")
}

