package typings.themeDashUi.themeDashUiMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeUIContext extends js.Object {
  var components: Record[StyledTags, SxComponent]
  var theme: Theme
}

object ThemeUIContext {
  @scala.inline
  def apply(components: Record[StyledTags, SxComponent], theme: Theme): ThemeUIContext = {
    val __obj = js.Dynamic.literal(components = components, theme = theme)
  
    __obj.asInstanceOf[ThemeUIContext]
  }
}

