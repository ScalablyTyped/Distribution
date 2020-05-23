package typings.winrt.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SetFileNameResult extends js.Object

@JSGlobal("Windows.Storage.Pickers.Provider.SetFileNameResult")
@js.native
object SetFileNameResult extends js.Object {
  @js.native
  sealed trait notAllowed extends SetFileNameResult
  
  @js.native
  sealed trait succeeded extends SetFileNameResult
  
  @js.native
  sealed trait unavailable extends SetFileNameResult
  
}

