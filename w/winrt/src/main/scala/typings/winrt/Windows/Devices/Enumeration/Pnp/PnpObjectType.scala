package typings.winrt.Windows.Devices.Enumeration.Pnp

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
  
}

