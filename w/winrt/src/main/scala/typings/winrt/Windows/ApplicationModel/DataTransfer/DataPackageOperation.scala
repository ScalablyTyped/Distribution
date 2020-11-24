package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataPackageOperation extends js.Object
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageOperation")
@js.native
object DataPackageOperation extends js.Object {
  
  @js.native
  sealed trait copy extends DataPackageOperation
  
  @js.native
  sealed trait link extends DataPackageOperation
  
  @js.native
  sealed trait move extends DataPackageOperation
  
  @js.native
  sealed trait none extends DataPackageOperation
}
