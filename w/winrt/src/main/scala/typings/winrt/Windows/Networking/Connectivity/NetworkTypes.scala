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
  
}

