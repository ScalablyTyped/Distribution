package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoImportPowerSource extends StObject
/** Specifies the current power source of the source device containing items to be imported. */
@JSGlobal("Windows.Media.Import.PhotoImportPowerSource")
@js.native
object PhotoImportPowerSource extends StObject {
  
  /** The current power source is a battery. */
  @js.native
  sealed trait battery
    extends StObject
       with PhotoImportPowerSource
  
  /** The current power source is external. */
  @js.native
  sealed trait external
    extends StObject
       with PhotoImportPowerSource
  
  /** The current power source is unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with PhotoImportPowerSource
}
