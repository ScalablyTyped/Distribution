package typings.styledComponents

import typings.std.HTMLElement
import typings.styledComponents.styledComponentsMod.StyleSheetManagerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends StyleSheetManagerProps {
  var target: HTMLElement
}

object AnonTarget {
  @scala.inline
  def apply(target: HTMLElement): AnonTarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTarget]
  }
}

