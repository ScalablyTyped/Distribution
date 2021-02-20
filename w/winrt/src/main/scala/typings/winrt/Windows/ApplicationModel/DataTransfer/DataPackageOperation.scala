package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataPackageOperation extends StObject
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageOperation")
@js.native
object DataPackageOperation extends StObject {
  
  @js.native
  sealed trait copy extends DataPackageOperation
  
  @js.native
  sealed trait link extends DataPackageOperation
  
  @js.native
  sealed trait move extends DataPackageOperation
  
  @js.native
  sealed trait none extends DataPackageOperation
}
