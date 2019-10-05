package typings.winrt.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val added: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.added with Double = js.native
  /* 1 */ val alreadyAdded: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.alreadyAdded with Double = js.native
  /* 2 */ val notAllowed: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.notAllowed with Double = js.native
  /* 3 */ val unavailable: typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.unavailable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AddFileResult with Double] = js.native
}

