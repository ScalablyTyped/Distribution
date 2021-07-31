package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkRegistrationState extends StObject
@JSGlobal("Windows.Networking.NetworkOperators.NetworkRegistrationState")
@js.native
object NetworkRegistrationState extends StObject {
  
  @js.native
  sealed trait denied
    extends StObject
       with NetworkRegistrationState
  
  @js.native
  sealed trait deregistered
    extends StObject
       with NetworkRegistrationState
  
  @js.native
  sealed trait home
    extends StObject
       with NetworkRegistrationState
  
  @js.native
  sealed trait none
    extends StObject
       with NetworkRegistrationState
  
  @js.native
  sealed trait partner
    extends StObject
       with NetworkRegistrationState
  
  @js.native
  sealed trait roaming
    extends StObject
       with NetworkRegistrationState
  
  @js.native
  sealed trait searching
    extends StObject
       with NetworkRegistrationState
}
