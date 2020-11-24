package typings.winrt.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputStreamOptions extends js.Object
@JSGlobal("Windows.Storage.Streams.InputStreamOptions")
@js.native
object InputStreamOptions extends js.Object {
  
  @js.native
  sealed trait none extends InputStreamOptions
  
  @js.native
  sealed trait partial extends InputStreamOptions
  
  @js.native
  sealed trait readAhead extends InputStreamOptions
}
