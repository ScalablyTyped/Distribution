package typings.winrtUwp.Windows.Media.Import

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
  sealed trait battery extends PhotoImportPowerSource
  
  /** The current power source is external. */
  @js.native
  sealed trait external extends PhotoImportPowerSource
  
  /** The current power source is unknown. */
  @js.native
  sealed trait unknown extends PhotoImportPowerSource
  
}

