package typings.styledComponents.styledComponentsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.styledComponents.AnonSheet
  - typings.styledComponents.AnonTarget
*/
trait StyleSheetManagerProps extends js.Object

object StyleSheetManagerProps {
  @scala.inline
  def AnonSheet(sheet: ServerStyleSheet): StyleSheetManagerProps = {
    val __obj = js.Dynamic.literal(sheet = sheet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StyleSheetManagerProps]
  }
  @scala.inline
  def AnonTarget(target: HTMLElement): StyleSheetManagerProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StyleSheetManagerProps]
  }
}

