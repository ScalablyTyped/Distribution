package typings.viewerjs.Viewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolbarButtonSize extends js.Object

@JSGlobal("Viewer.ToolbarButtonSize")
@js.native
object ToolbarButtonSize extends js.Object {
  @js.native
  sealed trait Large extends ToolbarButtonSize
  
  @js.native
  sealed trait Medium extends ToolbarButtonSize
  
  @js.native
  sealed trait Small extends ToolbarButtonSize
  
  /* "large" */ val Large: typings.viewerjs.Viewer.ToolbarButtonSize.Large with String = js.native
  /* "medium" */ val Medium: typings.viewerjs.Viewer.ToolbarButtonSize.Medium with String = js.native
  /* "small" */ val Small: typings.viewerjs.Viewer.ToolbarButtonSize.Small with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolbarButtonSize with String] = js.native
}

