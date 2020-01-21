package typings.styledComponents

import typings.styledComponents.styledComponentsMod.ServerStyleSheet
import typings.styledComponents.styledComponentsMod.StyleSheetManagerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSheet extends StyleSheetManagerProps {
  var sheet: ServerStyleSheet
}

object AnonSheet {
  @scala.inline
  def apply(sheet: ServerStyleSheet): AnonSheet = {
    val __obj = js.Dynamic.literal(sheet = sheet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSheet]
  }
}

