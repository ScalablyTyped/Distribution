package typings.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadActivationMode extends js.Object
@JSGlobal("Windows.Storage.Provider.ReadActivationMode")
@js.native
object ReadActivationMode extends js.Object {
  
  @js.native
  sealed trait beforeAccess extends ReadActivationMode
  
  @js.native
  sealed trait notNeeded extends ReadActivationMode
}
