package typings.viewerjs.Viewer

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Visibility with Double] = js.native
  /* 0 */ @js.native
  object Hidden extends TopLevel[Hidden with Double]
  
  /* 1 */ @js.native
  object Visible extends TopLevel[Visible with Double]
  
  /* 4 */ @js.native
  object VisibleOnExtraLargeOrWiderScreen extends TopLevel[VisibleOnExtraLargeOrWiderScreen with Double]
  
  /* 3 */ @js.native
  object VisibleOnLargeOrWiderScreen extends TopLevel[VisibleOnLargeOrWiderScreen with Double]
  
  /* 2 */ @js.native
  object VisibleOnMediumOrWiderScreen extends TopLevel[VisibleOnMediumOrWiderScreen with Double]
  
}

