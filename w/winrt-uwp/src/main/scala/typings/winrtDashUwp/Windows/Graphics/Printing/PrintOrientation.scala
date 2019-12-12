package typings.winrtDashUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintOrientation.default
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintOrientation.landscape
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintOrientation.landscapeFlipped
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintOrientation.notAvailable
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintOrientation.portrait
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintOrientation.portraitFlipped
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintOrientation.printerCustom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOrientation extends js.Object

/** Specifies the orientation options for the printed output. */
@JSGlobal("Windows.Graphics.Printing.PrintOrientation")
@js.native
object PrintOrientation extends js.Object {
  /** The default orientation option. */
  @js.native
  sealed trait default extends PrintOrientation
  
  /** The Landscape orientation option. */
  @js.native
  sealed trait landscape extends PrintOrientation
  
  /** The LandscapeFlipped orientation option. */
  @js.native
  sealed trait landscapeFlipped extends PrintOrientation
  
  /** An orientaiton option that is not available with the application or one that is not supported by the print device. */
  @js.native
  sealed trait notAvailable extends PrintOrientation
  
  /** The Portrait orientation option. */
  @js.native
  sealed trait portrait extends PrintOrientation
  
  /** The PortraitFlipped orientation option. */
  @js.native
  sealed trait portraitFlipped extends PrintOrientation
  
  /** A custom orientation that is specific to the print device. */
  @js.native
  sealed trait printerCustom extends PrintOrientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOrientation with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 5 */ @js.native
  object landscape extends TopLevel[landscape with Double]
  
  /* 6 */ @js.native
  object landscapeFlipped extends TopLevel[landscapeFlipped with Double]
  
  /* 1 */ @js.native
  object notAvailable extends TopLevel[notAvailable with Double]
  
  /* 3 */ @js.native
  object portrait extends TopLevel[portrait with Double]
  
  /* 4 */ @js.native
  object portraitFlipped extends TopLevel[portraitFlipped with Double]
  
  /* 2 */ @js.native
  object printerCustom extends TopLevel[printerCustom with Double]
  
}

