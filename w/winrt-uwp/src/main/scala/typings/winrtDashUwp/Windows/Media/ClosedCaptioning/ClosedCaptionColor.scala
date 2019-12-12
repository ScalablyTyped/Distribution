package typings.winrtDashUwp.Windows.Media.ClosedCaptioning

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.black
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.blue
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.cyan
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.default
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.green
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.magenta
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.red
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.white
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionColor.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClosedCaptionColor extends js.Object

/** Specifies the color of closed caption UI elements. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionColor")
@js.native
object ClosedCaptionColor extends js.Object {
  /** Black */
  @js.native
  sealed trait black extends ClosedCaptionColor
  
  /** Blue */
  @js.native
  sealed trait blue extends ClosedCaptionColor
  
  /** Cyan */
  @js.native
  sealed trait cyan extends ClosedCaptionColor
  
  /** The default color. */
  @js.native
  sealed trait default extends ClosedCaptionColor
  
  /** Green */
  @js.native
  sealed trait green extends ClosedCaptionColor
  
  /** Magenta */
  @js.native
  sealed trait magenta extends ClosedCaptionColor
  
  /** Red */
  @js.native
  sealed trait red extends ClosedCaptionColor
  
  /** White */
  @js.native
  sealed trait white extends ClosedCaptionColor
  
  /** Yellow */
  @js.native
  sealed trait yellow extends ClosedCaptionColor
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClosedCaptionColor with Double] = js.native
  /* 2 */ @js.native
  object black extends TopLevel[black with Double]
  
  /* 5 */ @js.native
  object blue extends TopLevel[blue with Double]
  
  /* 8 */ @js.native
  object cyan extends TopLevel[cyan with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 4 */ @js.native
  object green extends TopLevel[green with Double]
  
  /* 7 */ @js.native
  object magenta extends TopLevel[magenta with Double]
  
  /* 3 */ @js.native
  object red extends TopLevel[red with Double]
  
  /* 1 */ @js.native
  object white extends TopLevel[white with Double]
  
  /* 6 */ @js.native
  object yellow extends TopLevel[yellow with Double]
  
}

