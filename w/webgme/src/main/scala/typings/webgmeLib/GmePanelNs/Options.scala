package typings
package webgmeLib.GmePanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var LOGGER_INSTANCE_NAME: java.lang.String
}

object Options {
  @scala.inline
  def apply(LOGGER_INSTANCE_NAME: java.lang.String): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LOGGER_INSTANCE_NAME")(LOGGER_INSTANCE_NAME)
    __obj.asInstanceOf[Options]
  }
}

