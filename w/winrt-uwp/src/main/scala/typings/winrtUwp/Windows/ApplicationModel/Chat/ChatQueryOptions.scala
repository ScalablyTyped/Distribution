package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the criteria for finding chat messages. */
@js.native
trait ChatQueryOptions extends js.Object {
  /** Gets or sets the string to search for the in ChatMessageStore . */
  var searchString: String = js.native
}

object ChatQueryOptions {
  @scala.inline
  def apply(searchString: String): ChatQueryOptions = {
    val __obj = js.Dynamic.literal(searchString = searchString.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatQueryOptions]
  }
  @scala.inline
  implicit class ChatQueryOptionsOps[Self <: ChatQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
  }
  
}

