package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.ccmp
import typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.ihv
import typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.none
import typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.rsnUseGroup
import typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.tkip
import typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.unknown
import typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep
import typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep104
import typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep40
import typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wpaUseGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkEncryptionType extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkEncryptionType")
@js.native
object NetworkEncryptionType extends js.Object {
  @js.native
  sealed trait ccmp extends NetworkEncryptionType
  
  @js.native
  sealed trait ihv extends NetworkEncryptionType
  
  @js.native
  sealed trait none extends NetworkEncryptionType
  
  @js.native
  sealed trait rsnUseGroup extends NetworkEncryptionType
  
  @js.native
  sealed trait tkip extends NetworkEncryptionType
  
  @js.native
  sealed trait unknown extends NetworkEncryptionType
  
  @js.native
  sealed trait wep extends NetworkEncryptionType
  
  @js.native
  sealed trait wep104 extends NetworkEncryptionType
  
  @js.native
  sealed trait wep40 extends NetworkEncryptionType
  
  @js.native
  sealed trait wpaUseGroup extends NetworkEncryptionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkEncryptionType with Double] = js.native
  /* 6 */ @js.native
  object ccmp extends TopLevel[ccmp with Double]
  
  /* 9 */ @js.native
  object ihv extends TopLevel[ihv with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 8 */ @js.native
  object rsnUseGroup extends TopLevel[rsnUseGroup with Double]
  
  /* 5 */ @js.native
  object tkip extends TopLevel[tkip with Double]
  
  /* 1 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 2 */ @js.native
  object wep extends TopLevel[wep with Double]
  
  /* 4 */ @js.native
  object wep104 extends TopLevel[wep104 with Double]
  
  /* 3 */ @js.native
  object wep40 extends TopLevel[wep40 with Double]
  
  /* 7 */ @js.native
  object wpaUseGroup extends TopLevel[wpaUseGroup with Double]
  
}

