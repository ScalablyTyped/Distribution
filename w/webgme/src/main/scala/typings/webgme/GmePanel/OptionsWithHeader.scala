package typings.webgme.GmePanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithHeader extends Options {
  var FLOATING_TITLE: String
  var HEADER_TITLE: String
  var NO_SCROLLING: String
}

object OptionsWithHeader {
  @scala.inline
  def apply(FLOATING_TITLE: String, HEADER_TITLE: String, LOGGER_INSTANCE_NAME: String, NO_SCROLLING: String): OptionsWithHeader = {
    val __obj = js.Dynamic.literal(FLOATING_TITLE = FLOATING_TITLE.asInstanceOf[js.Any], HEADER_TITLE = HEADER_TITLE.asInstanceOf[js.Any], LOGGER_INSTANCE_NAME = LOGGER_INSTANCE_NAME.asInstanceOf[js.Any], NO_SCROLLING = NO_SCROLLING.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithHeader]
  }
}

