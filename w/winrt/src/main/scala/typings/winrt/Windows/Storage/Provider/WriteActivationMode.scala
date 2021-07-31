package typings.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WriteActivationMode extends StObject
@JSGlobal("Windows.Storage.Provider.WriteActivationMode")
@js.native
object WriteActivationMode extends StObject {
  
  @js.native
  sealed trait afterWrite
    extends StObject
       with WriteActivationMode
  
  @js.native
  sealed trait notNeeded
    extends StObject
       with WriteActivationMode
  
  @js.native
  sealed trait readOnly
    extends StObject
       with WriteActivationMode
}
