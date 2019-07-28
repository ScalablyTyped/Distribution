package typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs

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
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation.default with Double = js.native
  /* 5 */ val landscape: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation.landscape with Double = js.native
  /* 6 */ val landscapeFlipped: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation.landscapeFlipped with Double = js.native
  /* 1 */ val notAvailable: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation.notAvailable with Double = js.native
  /* 3 */ val portrait: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation.portrait with Double = js.native
  /* 4 */ val portraitFlipped: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation.portraitFlipped with Double = js.native
  /* 2 */ val printerCustom: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintOrientation.printerCustom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOrientation with Double] = js.native
}

