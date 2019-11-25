package typings.styledDashComponents.styledDashComponentsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.styledDashComponents.Anon_Sheet
  - typings.styledDashComponents.Anon_Target
*/
trait StyleSheetManagerProps extends js.Object

object StyleSheetManagerProps {
  @scala.inline
  def Anon_Sheet(sheet: ServerStyleSheet): StyleSheetManagerProps = {
    val __obj = js.Dynamic.literal(sheet = sheet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StyleSheetManagerProps]
  }
  @scala.inline
  def Anon_Target(target: HTMLElement): StyleSheetManagerProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StyleSheetManagerProps]
  }
}

