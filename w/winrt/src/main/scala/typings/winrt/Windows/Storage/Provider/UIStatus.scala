package typings.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UIStatus extends js.Object

@JSGlobal("Windows.Storage.Provider.UIStatus")
@js.native
object UIStatus extends js.Object {
  @js.native
  sealed trait complete extends UIStatus
  
  @js.native
  sealed trait hidden extends UIStatus
  
  @js.native
  sealed trait unavailable extends UIStatus
  
  @js.native
  sealed trait visible extends UIStatus
  
}

