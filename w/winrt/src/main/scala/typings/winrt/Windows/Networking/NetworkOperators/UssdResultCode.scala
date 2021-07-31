package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UssdResultCode extends StObject
@JSGlobal("Windows.Networking.NetworkOperators.UssdResultCode")
@js.native
object UssdResultCode extends StObject {
  
  @js.native
  sealed trait actionRequired
    extends StObject
       with UssdResultCode
  
  @js.native
  sealed trait networkTimeout
    extends StObject
       with UssdResultCode
  
  @js.native
  sealed trait noActionRequired
    extends StObject
       with UssdResultCode
  
  @js.native
  sealed trait operationNotSupported
    extends StObject
       with UssdResultCode
  
  @js.native
  sealed trait otherLocalClient
    extends StObject
       with UssdResultCode
  
  @js.native
  sealed trait terminated
    extends StObject
       with UssdResultCode
}
