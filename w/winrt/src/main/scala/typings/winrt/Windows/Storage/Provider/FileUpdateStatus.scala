package typings.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileUpdateStatus extends js.Object

@JSGlobal("Windows.Storage.Provider.FileUpdateStatus")
@js.native
object FileUpdateStatus extends js.Object {
  @js.native
  sealed trait complete extends FileUpdateStatus
  
  @js.native
  sealed trait completeAndRenamed extends FileUpdateStatus
  
  @js.native
  sealed trait currentlyUnavailable extends FileUpdateStatus
  
  @js.native
  sealed trait failed extends FileUpdateStatus
  
  @js.native
  sealed trait incomplete extends FileUpdateStatus
  
  @js.native
  sealed trait userInputNeeded extends FileUpdateStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileUpdateStatus with Double] = js.native
  /* 1 */ @js.native
  object complete extends TopLevel[complete with Double]
  
  /* 5 */ @js.native
  object completeAndRenamed extends TopLevel[completeAndRenamed with Double]
  
  /* 3 */ @js.native
  object currentlyUnavailable extends TopLevel[currentlyUnavailable with Double]
  
  /* 4 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 0 */ @js.native
  object incomplete extends TopLevel[incomplete with Double]
  
  /* 2 */ @js.native
  object userInputNeeded extends TopLevel[userInputNeeded with Double]
  
}

