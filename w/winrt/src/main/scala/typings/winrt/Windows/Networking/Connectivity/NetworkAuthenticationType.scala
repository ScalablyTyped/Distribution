package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.ihv
import typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.none
import typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.open80211
import typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.rsna
import typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.rsnaPsk
import typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.sharedKey80211
import typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.unknown
import typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpa
import typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaNone
import typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaPsk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkAuthenticationType with Double] = js.native
  /* 9 */ @js.native
  object ihv extends TopLevel[ihv with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object open80211 extends TopLevel[open80211 with Double]
  
  /* 7 */ @js.native
  object rsna extends TopLevel[rsna with Double]
  
  /* 8 */ @js.native
  object rsnaPsk extends TopLevel[rsnaPsk with Double]
  
  /* 3 */ @js.native
  object sharedKey80211 extends TopLevel[sharedKey80211 with Double]
  
  /* 1 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 4 */ @js.native
  object wpa extends TopLevel[wpa with Double]
  
  /* 6 */ @js.native
  object wpaNone extends TopLevel[wpaNone with Double]
  
  /* 5 */ @js.native
  object wpaPsk extends TopLevel[wpaPsk with Double]
  
}

