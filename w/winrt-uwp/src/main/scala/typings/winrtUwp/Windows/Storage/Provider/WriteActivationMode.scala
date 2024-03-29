package typings.winrtUwp.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WriteActivationMode extends StObject
/** Indicates whether other apps can write to the locally cached version of the file and when Windows will request an update if another app writes to that local file. */
@JSGlobal("Windows.Storage.Provider.WriteActivationMode")
@js.native
object WriteActivationMode extends StObject {
  
  /** Windows will trigger a file update request after another app writes to the local file. */
  @js.native
  sealed trait afterWrite
    extends StObject
       with WriteActivationMode
  
  /** Windows will trigger a file update request when another app writes to the local file. */
  @js.native
  sealed trait notNeeded
    extends StObject
       with WriteActivationMode
  
  /** Other apps can't write to the local file. */
  @js.native
  sealed trait readOnly
    extends StObject
       with WriteActivationMode
}
