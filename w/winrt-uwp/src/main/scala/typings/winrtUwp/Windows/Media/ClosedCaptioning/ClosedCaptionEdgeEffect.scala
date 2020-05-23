package typings.winrtUwp.Windows.Media.ClosedCaptioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClosedCaptionEdgeEffect extends js.Object

/** Specifies the edge effect of closed caption text. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect")
@js.native
object ClosedCaptionEdgeEffect extends js.Object {
  /** The default edge effect. */
  @js.native
  sealed trait default extends ClosedCaptionEdgeEffect
  
  /** Depressed edge. */
  @js.native
  sealed trait depressed extends ClosedCaptionEdgeEffect
  
  /** Drop shadow. */
  @js.native
  sealed trait dropShadow extends ClosedCaptionEdgeEffect
  
  /** No edge effect. */
  @js.native
  sealed trait none extends ClosedCaptionEdgeEffect
  
  /** Raised edge. */
  @js.native
  sealed trait raised extends ClosedCaptionEdgeEffect
  
  /** Uniform edge */
  @js.native
  sealed trait uniform extends ClosedCaptionEdgeEffect
  
}

