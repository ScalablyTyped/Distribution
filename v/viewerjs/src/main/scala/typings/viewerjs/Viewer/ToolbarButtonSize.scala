package typings.viewerjs.Viewer

import org.scalablytyped.runtime.TopLevel
import typings.viewerjs.Viewer.ToolbarButtonSize.Large
import typings.viewerjs.Viewer.ToolbarButtonSize.Medium
import typings.viewerjs.Viewer.ToolbarButtonSize.Small
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolbarButtonSize with String] = js.native
  /* "large" */ @js.native
  object Large extends TopLevel[Large with String]
  
  /* "medium" */ @js.native
  object Medium extends TopLevel[Medium with String]
  
  /* "small" */ @js.native
  object Small extends TopLevel[Small with String]
  
}

