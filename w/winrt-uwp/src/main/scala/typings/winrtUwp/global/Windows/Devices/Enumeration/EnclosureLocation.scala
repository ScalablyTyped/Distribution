package typings.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the physical location of a device in its enclosure. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Enumeration.EnclosureLocation")
@js.native
open class EnclosureLocation ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Enumeration.EnclosureLocation {
  
  /** Indicates whether the device is physically located in the docking station of the portable computer. */
  /* CompleteClass */
  var inDock: Boolean = js.native
  
  /** Indicates whether the device is physically located in the lid of the portable computer. */
  /* CompleteClass */
  var inLid: Boolean = js.native
  
  /** Indicates which panel of the computer the device is physically located on. */
  /* CompleteClass */
  var panel: typings.winrtUwp.Windows.Devices.Enumeration.Panel = js.native
}
