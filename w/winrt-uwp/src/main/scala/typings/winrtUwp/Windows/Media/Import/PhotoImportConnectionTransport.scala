package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoImportConnectionTransport extends StObject
/** Specifies the connection transport used for photo import. */
@JSGlobal("Windows.Media.Import.PhotoImportConnectionTransport")
@js.native
object PhotoImportConnectionTransport extends StObject {
  
  /** The connection transport is Bluetooth. */
  @js.native
  sealed trait bluetooth
    extends StObject
       with PhotoImportConnectionTransport
  
  /** The connection transport is Internet Protocol. */
  @js.native
  sealed trait ip
    extends StObject
       with PhotoImportConnectionTransport
  
  /** The connection transport is unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with PhotoImportConnectionTransport
  
  /** The connection transport is USB. */
  @js.native
  sealed trait usb
    extends StObject
       with PhotoImportConnectionTransport
}
