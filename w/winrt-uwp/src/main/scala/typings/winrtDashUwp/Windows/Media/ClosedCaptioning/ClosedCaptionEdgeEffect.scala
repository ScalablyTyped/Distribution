package typings.winrtDashUwp.Windows.Media.ClosedCaptioning

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.default
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.depressed
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.dropShadow
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.none
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.raised
import typings.winrtDashUwp.Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect.uniform
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClosedCaptionEdgeEffect with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 3 */ @js.native
  object depressed extends TopLevel[depressed with Double]
  
  /* 5 */ @js.native
  object dropShadow extends TopLevel[dropShadow with Double]
  
  /* 1 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object raised extends TopLevel[raised with Double]
  
  /* 4 */ @js.native
  object uniform extends TopLevel[uniform with Double]
  
}

