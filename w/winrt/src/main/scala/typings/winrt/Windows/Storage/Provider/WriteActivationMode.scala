package typings.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WriteActivationMode extends js.Object

@JSGlobal("Windows.Storage.Provider.WriteActivationMode")
@js.native
object WriteActivationMode extends js.Object {
  @js.native
  sealed trait afterWrite extends WriteActivationMode
  
  @js.native
  sealed trait notNeeded extends WriteActivationMode
  
  @js.native
  sealed trait readOnly extends WriteActivationMode
  
}

