package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StorageDeleteOption extends StObject
@JSGlobal("Windows.Storage.StorageDeleteOption")
@js.native
object StorageDeleteOption extends StObject {
  
  @js.native
  sealed trait default
    extends StObject
       with StorageDeleteOption
  
  @js.native
  sealed trait permanentDelete
    extends StObject
       with StorageDeleteOption
}
