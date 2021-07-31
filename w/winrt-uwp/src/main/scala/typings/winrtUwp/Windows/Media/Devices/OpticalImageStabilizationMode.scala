package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OpticalImageStabilizationMode extends StObject
/** Defines the optical image stabilization modes. */
@JSGlobal("Windows.Media.Devices.OpticalImageStabilizationMode")
@js.native
object OpticalImageStabilizationMode extends StObject {
  
  /** The system dynamically enables optical image stabilization when appropriate. */
  @js.native
  sealed trait auto
    extends StObject
       with OpticalImageStabilizationMode
  
  /** Optical image stabilization is disabled. */
  @js.native
  sealed trait off
    extends StObject
       with OpticalImageStabilizationMode
  
  /** Optical image stabilization is enabled. */
  @js.native
  sealed trait on
    extends StObject
       with OpticalImageStabilizationMode
}
