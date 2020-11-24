package typings.winrtUwp.global.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the current power source of the source device containing items to be imported. */
@JSGlobal("Windows.Media.Import.PhotoImportPowerSource")
@js.native
object PhotoImportPowerSource extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Import.PhotoImportPowerSource with Double] = js.native
  
  /* 1 */ val battery: typings.winrtUwp.Windows.Media.Import.PhotoImportPowerSource.battery with Double = js.native
  
  /* 2 */ val external: typings.winrtUwp.Windows.Media.Import.PhotoImportPowerSource.external with Double = js.native
  
  /* 0 */ val unknown: typings.winrtUwp.Windows.Media.Import.PhotoImportPowerSource.unknown with Double = js.native
}
