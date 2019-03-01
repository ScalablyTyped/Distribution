package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageActionItem extends js.Object {
  /**
    * A short title like 'Retry', 'Open Log' etc.
    */
  var title: java.lang.String
}

object MessageActionItem {
  @scala.inline
  def apply(title: java.lang.String): MessageActionItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MessageActionItem]
  }
}

