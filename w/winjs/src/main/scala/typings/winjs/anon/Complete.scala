package typings.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Complete extends js.Object {
  /**
    * All sections are loaded and animations are complete.
    **/
  var complete: String
  /**
    * The Hub is loading sections.
    **/
  var loading: String
}

object Complete {
  @scala.inline
  def apply(complete: String, loading: String): Complete = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[Complete]
  }
}

