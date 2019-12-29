package typings.winrt.Windows.Devices.Enumeration.Pnp

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PnpObjectType extends js.Object

@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObjectType")
@js.native
object PnpObjectType extends js.Object {
  @js.native
  sealed trait device extends PnpObjectType
  
  @js.native
  sealed trait deviceContainer extends PnpObjectType
  
  @js.native
  sealed trait deviceInterface extends PnpObjectType
  
  @js.native
  sealed trait deviceInterfaceClass extends PnpObjectType
  
  @js.native
  sealed trait unknown extends PnpObjectType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PnpObjectType with Double] = js.native
  /* 3 */ @js.native
  object device extends TopLevel[device with Double]
  
  /* 2 */ @js.native
  object deviceContainer extends TopLevel[deviceContainer with Double]
  
  /* 1 */ @js.native
  object deviceInterface extends TopLevel[deviceInterface with Double]
  
  /* 4 */ @js.native
  object deviceInterfaceClass extends TopLevel[deviceInterfaceClass with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

