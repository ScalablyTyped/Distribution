package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the criteria for finding chat messages. */
trait ChatQueryOptions extends js.Object {
  /** Gets or sets the string to search for the in ChatMessageStore . */
  var searchString: String
}

object ChatQueryOptions {
  @scala.inline
  def apply(searchString: String): ChatQueryOptions = {
    val __obj = js.Dynamic.literal(searchString = searchString.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatQueryOptions]
  }
}

