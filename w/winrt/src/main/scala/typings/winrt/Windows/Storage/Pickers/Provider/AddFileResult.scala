package typings.winrt.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AddFileResult extends js.Object
@JSGlobal("Windows.Storage.Pickers.Provider.AddFileResult")
@js.native
object AddFileResult extends js.Object {
  
  @js.native
  sealed trait added extends AddFileResult
  
  @js.native
  sealed trait alreadyAdded extends AddFileResult
  
  @js.native
  sealed trait notAllowed extends AddFileResult
  
  @js.native
  sealed trait unavailable extends AddFileResult
}
