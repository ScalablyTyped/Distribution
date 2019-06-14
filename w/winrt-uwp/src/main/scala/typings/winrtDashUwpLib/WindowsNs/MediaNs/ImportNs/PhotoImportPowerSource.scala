package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportPowerSource extends js.Object

/** Specifies the current power source of the source device containing items to be imported. */
@JSGlobal("Windows.Media.Import.PhotoImportPowerSource")
@js.native
object PhotoImportPowerSource extends js.Object {
  /** The current power source is a battery. */
  @js.native
  sealed trait battery
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportPowerSource
  
  /** The current power source is external. */
  @js.native
  sealed trait external
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportPowerSource
  
  /** The current power source is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportPowerSource
  
  /* 1 */ val battery: battery with scala.Double = js.native
  /* 2 */ val external: external with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportPowerSource with scala.Double
  ] = js.native
}

