package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AsyncStatus extends js.Object

@JSGlobal("Windows.Foundation.AsyncStatus")
@js.native
object AsyncStatus extends js.Object {
  @js.native
  sealed trait canceled extends AsyncStatus
  
  @js.native
  sealed trait completed extends AsyncStatus
  
  @js.native
  sealed trait error extends AsyncStatus
  
  @js.native
  sealed trait started extends AsyncStatus
  
}

