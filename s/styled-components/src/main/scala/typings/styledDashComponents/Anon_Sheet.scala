package typings.styledDashComponents

import typings.styledDashComponents.styledDashComponentsMod.ServerStyleSheet
import typings.styledDashComponents.styledDashComponentsMod.StyleSheetManagerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sheet extends StyleSheetManagerProps {
  var sheet: ServerStyleSheet
}

object Anon_Sheet {
  @scala.inline
  def apply(sheet: ServerStyleSheet): Anon_Sheet = {
    val __obj = js.Dynamic.literal(sheet = sheet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Sheet]
  }
}

