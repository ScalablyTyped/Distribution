package typings.winrtUwp.Windows.Devices.Spi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpiSharingMode extends js.Object
/** Defines the sharing mode for the SPI bus. */
@JSGlobal("Windows.Devices.Spi.SpiSharingMode")
@js.native
object SpiSharingMode extends js.Object {
  
  /** SPI bus segment is not shared. */
  @js.native
  sealed trait exclusive extends SpiSharingMode
  
  /** SPI bus is shared. */
  @js.native
  sealed trait shared extends SpiSharingMode
}
