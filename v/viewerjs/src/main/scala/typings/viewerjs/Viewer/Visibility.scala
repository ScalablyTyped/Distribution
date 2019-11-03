package typings.viewerjs.Viewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Visibility extends js.Object

@JSGlobal("Viewer.Visibility")
@js.native
object Visibility extends js.Object {
  @js.native
  sealed trait Hidden extends Visibility
  
  @js.native
  sealed trait Visible extends Visibility
  
  @js.native
  sealed trait VisibleOnExtraLargeOrWiderScreen extends Visibility
  
  @js.native
  sealed trait VisibleOnLargeOrWiderScreen extends Visibility
  
  @js.native
  sealed trait VisibleOnMediumOrWiderScreen extends Visibility
  
  /* 0 */ val Hidden: typings.viewerjs.Viewer.Visibility.Hidden with Double = js.native
  /* 1 */ val Visible: typings.viewerjs.Viewer.Visibility.Visible with Double = js.native
  /* 4 */ val VisibleOnExtraLargeOrWiderScreen: typings.viewerjs.Viewer.Visibility.VisibleOnExtraLargeOrWiderScreen with Double = js.native
  /* 3 */ val VisibleOnLargeOrWiderScreen: typings.viewerjs.Viewer.Visibility.VisibleOnLargeOrWiderScreen with Double = js.native
  /* 2 */ val VisibleOnMediumOrWiderScreen: typings.viewerjs.Viewer.Visibility.VisibleOnMediumOrWiderScreen with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility with Double] = js.native
}

