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
  
  val battery: battery with java.lang.String = js.native
  val external: external with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportPowerSource with java.lang.String
  ] = js.native
}

