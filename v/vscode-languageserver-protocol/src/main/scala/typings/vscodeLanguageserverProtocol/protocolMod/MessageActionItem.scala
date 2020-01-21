package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageActionItem extends js.Object {
  /**
    * A short title like 'Retry', 'Open Log' etc.
    */
  var title: String
}

object MessageActionItem {
  @scala.inline
  def apply(title: String): MessageActionItem = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageActionItem]
  }
}

