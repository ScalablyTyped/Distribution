package typings.wordpressComponents.autocompleteMod.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var activeId: String
  var isExpanded: Boolean
  var listBoxId: String
}

object RenderProps {
  @scala.inline
  def apply(activeId: String, isExpanded: Boolean, listBoxId: String): RenderProps = {
    val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], listBoxId = listBoxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
}

