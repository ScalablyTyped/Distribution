package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkTypes extends StObject
@JSGlobal("Windows.Networking.Connectivity.NetworkTypes")
@js.native
object NetworkTypes extends StObject {
  
  @js.native
  sealed trait internet
    extends StObject
       with NetworkTypes
  
  @js.native
  sealed trait none
    extends StObject
       with NetworkTypes
  
  @js.native
  sealed trait privateNetwork
    extends StObject
       with NetworkTypes
}
