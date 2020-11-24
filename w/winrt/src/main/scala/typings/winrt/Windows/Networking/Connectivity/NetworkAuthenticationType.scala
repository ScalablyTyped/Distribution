package typings.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkAuthenticationType extends js.Object
@JSGlobal("Windows.Networking.Connectivity.NetworkAuthenticationType")
@js.native
object NetworkAuthenticationType extends js.Object {
  
  @js.native
  sealed trait ihv extends NetworkAuthenticationType
  
  @js.native
  sealed trait none extends NetworkAuthenticationType
  
  @js.native
  sealed trait open80211 extends NetworkAuthenticationType
  
  @js.native
  sealed trait rsna extends NetworkAuthenticationType
  
  @js.native
  sealed trait rsnaPsk extends NetworkAuthenticationType
  
  @js.native
  sealed trait sharedKey80211 extends NetworkAuthenticationType
  
  @js.native
  sealed trait unknown extends NetworkAuthenticationType
  
  @js.native
  sealed trait wpa extends NetworkAuthenticationType
  
  @js.native
  sealed trait wpaNone extends NetworkAuthenticationType
  
  @js.native
  sealed trait wpaPsk extends NetworkAuthenticationType
}
