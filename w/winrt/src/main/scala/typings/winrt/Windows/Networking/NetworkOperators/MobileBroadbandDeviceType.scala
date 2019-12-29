package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandDeviceType extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceType")
@js.native
object MobileBroadbandDeviceType extends js.Object {
  @js.native
  sealed trait embedded extends MobileBroadbandDeviceType
  
  @js.native
  sealed trait remote extends MobileBroadbandDeviceType
  
  @js.native
  sealed trait removable extends MobileBroadbandDeviceType
  
  @js.native
  sealed trait unknown extends MobileBroadbandDeviceType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandDeviceType with Double] = js.native
  /* 1 */ @js.native
  object embedded extends TopLevel[embedded with Double]
  
  /* 3 */ @js.native
  object remote extends TopLevel[remote with Double]
  
  /* 2 */ @js.native
  object removable extends TopLevel[removable with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

