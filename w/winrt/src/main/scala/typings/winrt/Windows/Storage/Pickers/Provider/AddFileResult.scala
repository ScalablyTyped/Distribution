package typings.winrt.Windows.Storage.Pickers.Provider

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.added
import typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.alreadyAdded
import typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.notAllowed
import typings.winrt.Windows.Storage.Pickers.Provider.AddFileResult.unavailable
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AddFileResult with Double] = js.native
  /* 0 */ @js.native
  object added extends TopLevel[added with Double]
  
  /* 1 */ @js.native
  object alreadyAdded extends TopLevel[alreadyAdded with Double]
  
  /* 2 */ @js.native
  object notAllowed extends TopLevel[notAllowed with Double]
  
  /* 3 */ @js.native
  object unavailable extends TopLevel[unavailable with Double]
  
}

