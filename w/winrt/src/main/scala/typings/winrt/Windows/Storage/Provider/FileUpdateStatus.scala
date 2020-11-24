package typings.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
