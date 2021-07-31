package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataPackageOperation extends StObject
/** Specifies the operation to perform on the DataPackage in clipboard and drag and drop scenarios. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageOperation")
@js.native
object DataPackageOperation extends StObject {
  
  /** Copies the content to the target destination. */
  @js.native
  sealed trait copy
    extends StObject
       with DataPackageOperation
  
  /** Creates a link for the data. */
  @js.native
  sealed trait link
    extends StObject
       with DataPackageOperation
  
  /** Copies the content to the target destination and deletes the original. */
  @js.native
  sealed trait move
    extends StObject
       with DataPackageOperation
  
  /** No action. Typically used when the DataPackage object requires delayed rendering. */
  @js.native
  sealed trait none
    extends StObject
       with DataPackageOperation
}
