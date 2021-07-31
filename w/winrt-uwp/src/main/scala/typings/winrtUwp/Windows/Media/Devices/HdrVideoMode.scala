package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HdrVideoMode extends StObject
/** Defines the High Dynamic Range (HDR) video modes. */
@JSGlobal("Windows.Media.Devices.HdrVideoMode")
@js.native
object HdrVideoMode extends StObject {
  
  /** The system dynamically enables HDR video capture when appropriate. */
  @js.native
  sealed trait auto
    extends StObject
       with HdrVideoMode
  
  /** HDR video capture is disabled. */
  @js.native
  sealed trait off
    extends StObject
       with HdrVideoMode
  
  /** HDR video capture is enabled. */
  @js.native
  sealed trait on
    extends StObject
       with HdrVideoMode
}
