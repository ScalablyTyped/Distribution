package typings.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComplete extends js.Object {
  /**
    * All sections are loaded and animations are complete.
    **/
  var complete: String
  /**
    * The Hub is loading sections.
    **/
  var loading: String
}

object AnonComplete {
  @scala.inline
  def apply(complete: String, loading: String): AnonComplete = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComplete]
  }
}

