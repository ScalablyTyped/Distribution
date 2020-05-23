package typings.winrtUwp.Windows.Media.ClosedCaptioning

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
  
}

