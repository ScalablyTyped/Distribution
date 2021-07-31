package typings.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileUpdateStatus extends StObject
@JSGlobal("Windows.Storage.Provider.FileUpdateStatus")
@js.native
object FileUpdateStatus extends StObject {
  
  @js.native
  sealed trait complete
    extends StObject
       with FileUpdateStatus
  
  @js.native
  sealed trait completeAndRenamed
    extends StObject
       with FileUpdateStatus
  
  @js.native
  sealed trait currentlyUnavailable
    extends StObject
       with FileUpdateStatus
  
  @js.native
  sealed trait failed
    extends StObject
       with FileUpdateStatus
  
  @js.native
  sealed trait incomplete
    extends StObject
       with FileUpdateStatus
  
  @js.native
  sealed trait userInputNeeded
    extends StObject
       with FileUpdateStatus
}
