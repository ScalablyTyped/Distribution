package typings.winrtUwp.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadActivationMode extends StObject
/** Indicates when Windows will request a file update if another app reads the locally cached version of the file. */
@JSGlobal("Windows.Storage.Provider.ReadActivationMode")
@js.native
object ReadActivationMode extends StObject {
  
  /** Windows will trigger a file update request before allowing another app to access the local file. */
  @js.native
  sealed trait beforeAccess
    extends StObject
       with ReadActivationMode
  
  /** Windows will not trigger a file update request when another app accesses the local file. */
  @js.native
  sealed trait notNeeded
    extends StObject
       with ReadActivationMode
}
