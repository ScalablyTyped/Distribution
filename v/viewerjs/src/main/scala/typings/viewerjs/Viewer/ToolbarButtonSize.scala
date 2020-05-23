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
  
}

