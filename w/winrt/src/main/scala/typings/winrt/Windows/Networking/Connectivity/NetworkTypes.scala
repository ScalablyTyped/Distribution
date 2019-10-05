package typings.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkTypes extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkTypes")
@js.native
object NetworkTypes extends js.Object {
  @js.native
  sealed trait internet extends NetworkTypes
  
  @js.native
  sealed trait none extends NetworkTypes
  
  @js.native
  sealed trait privateNetwork extends NetworkTypes
  
  /* 1 */ val internet: typings.winrt.Windows.Networking.Connectivity.NetworkTypes.internet with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Networking.Connectivity.NetworkTypes.none with Double = js.native
  /* 2 */ val privateNetwork: typings.winrt.Windows.Networking.Connectivity.NetworkTypes.privateNetwork with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkTypes with Double] = js.native
}

