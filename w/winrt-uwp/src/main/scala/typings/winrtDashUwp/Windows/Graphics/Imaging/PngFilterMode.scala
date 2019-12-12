package typings.winrtDashUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Graphics.Imaging.PngFilterMode.adaptive
import typings.winrtDashUwp.Windows.Graphics.Imaging.PngFilterMode.automatic
import typings.winrtDashUwp.Windows.Graphics.Imaging.PngFilterMode.average
import typings.winrtDashUwp.Windows.Graphics.Imaging.PngFilterMode.none
import typings.winrtDashUwp.Windows.Graphics.Imaging.PngFilterMode.paeth
import typings.winrtDashUwp.Windows.Graphics.Imaging.PngFilterMode.sub
import typings.winrtDashUwp.Windows.Graphics.Imaging.PngFilterMode.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PngFilterMode extends js.Object

/** Specifies the filter used to optimize the image prior to image compression in PNG images. */
@JSGlobal("Windows.Graphics.Imaging.PngFilterMode")
@js.native
object PngFilterMode extends js.Object {
  /** The Adaptive type filter is applied. */
  @js.native
  sealed trait adaptive extends PngFilterMode
  
  /** The filter type will be chosen automatically. */
  @js.native
  sealed trait automatic extends PngFilterMode
  
  /** The Average type filter is applied. */
  @js.native
  sealed trait average extends PngFilterMode
  
  /** The image is unmodified. */
  @js.native
  sealed trait none extends PngFilterMode
  
  /** The Paeth type filter is applied. */
  @js.native
  sealed trait paeth extends PngFilterMode
  
  /** The Sub type filter is applied. */
  @js.native
  sealed trait sub extends PngFilterMode
  
  /** The Up filter type is applied. */
  @js.native
  sealed trait up extends PngFilterMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PngFilterMode with Double] = js.native
  /* 6 */ @js.native
  object adaptive extends TopLevel[adaptive with Double]
  
  /* 0 */ @js.native
  object automatic extends TopLevel[automatic with Double]
  
  /* 4 */ @js.native
  object average extends TopLevel[average with Double]
  
  /* 1 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 5 */ @js.native
  object paeth extends TopLevel[paeth with Double]
  
  /* 2 */ @js.native
  object sub extends TopLevel[sub with Double]
  
  /* 3 */ @js.native
  object up extends TopLevel[up with Double]
  
}

