package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StorageItemTypes extends StObject
@JSGlobal("Windows.Storage.StorageItemTypes")
@js.native
object StorageItemTypes extends StObject {
  
  @js.native
  sealed trait file extends StorageItemTypes
  
  @js.native
  sealed trait folder extends StorageItemTypes
  
  @js.native
  sealed trait none extends StorageItemTypes
}
