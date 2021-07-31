package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProfileMediaType extends StObject
@JSGlobal("Windows.Networking.NetworkOperators.ProfileMediaType")
@js.native
object ProfileMediaType extends StObject {
  
  @js.native
  sealed trait wlan
    extends StObject
       with ProfileMediaType
  
  @js.native
  sealed trait wwan
    extends StObject
       with ProfileMediaType
}
