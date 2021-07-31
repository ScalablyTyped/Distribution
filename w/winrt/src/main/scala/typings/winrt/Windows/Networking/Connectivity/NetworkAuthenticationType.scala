package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkAuthenticationType extends StObject
@JSGlobal("Windows.Networking.Connectivity.NetworkAuthenticationType")
@js.native
object NetworkAuthenticationType extends StObject {
  
  @js.native
  sealed trait ihv
    extends StObject
       with NetworkAuthenticationType
  
  @js.native
  sealed trait none
    extends StObject
       with NetworkAuthenticationType
  
  @js.native
  sealed trait open80211
    extends StObject
       with NetworkAuthenticationType
  
  @js.native
  sealed trait rsna
    extends StObject
       with NetworkAuthenticationType
  
  @js.native
  sealed trait rsnaPsk
    extends StObject
       with NetworkAuthenticationType
  
  @js.native
  sealed trait sharedKey80211
    extends StObject
       with NetworkAuthenticationType
  
  @js.native
  sealed trait unknown
    extends StObject
       with NetworkAuthenticationType
  
  @js.native
  sealed trait wpa
    extends StObject
       with NetworkAuthenticationType
  
  @js.native
  sealed trait wpaNone
    extends StObject
       with NetworkAuthenticationType
  
  @js.native
  sealed trait wpaPsk
    extends StObject
       with NetworkAuthenticationType
}
