package typings.webgme.GmePanelNs

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
    val __obj = js.Dynamic.literal(FLOATING_TITLE = FLOATING_TITLE, HEADER_TITLE = HEADER_TITLE, LOGGER_INSTANCE_NAME = LOGGER_INSTANCE_NAME, NO_SCROLLING = NO_SCROLLING)
  
    __obj.asInstanceOf[OptionsWithHeader]
  }
}

