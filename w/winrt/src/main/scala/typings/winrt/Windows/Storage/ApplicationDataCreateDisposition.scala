package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationDataCreateDisposition extends js.Object
@JSGlobal("Windows.Storage.ApplicationDataCreateDisposition")
@js.native
object ApplicationDataCreateDisposition extends js.Object {
  
  @js.native
  sealed trait always extends ApplicationDataCreateDisposition
  
  @js.native
  sealed trait existing extends ApplicationDataCreateDisposition
}
