package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the set of identifiers for the character sets that a point-of-service printer can use. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterCharacterSetIds")
@js.native
abstract class PosPrinterCharacterSetIds ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterCharacterSetIds
object PosPrinterCharacterSetIds {
  
  @JSGlobal("Windows.Devices.PointOfService.PosPrinterCharacterSetIds")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the identifier for the ANSI character set. */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.PosPrinterCharacterSetIds.ansi")
  @js.native
  def ansi: Double = js.native
  @scala.inline
  def ansi_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ansi")(x.asInstanceOf[js.Any])
  
  /** Gets the identifier for the ASCII character set. */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.PosPrinterCharacterSetIds.ascii")
  @js.native
  def ascii: Double = js.native
  @scala.inline
  def ascii_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascii")(x.asInstanceOf[js.Any])
  
  /** Gets the identifier for the UTF16LE character set. */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.PosPrinterCharacterSetIds.utf16LE")
  @js.native
  def utf16LE: Double = js.native
  @scala.inline
  def utf16LE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utf16LE")(x.asInstanceOf[js.Any])
}
