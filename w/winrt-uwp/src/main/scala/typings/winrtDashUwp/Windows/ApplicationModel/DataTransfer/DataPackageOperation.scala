package typings.winrtDashUwp.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataPackageOperation extends js.Object

/** Specifies the operation to perform on the DataPackage in clipboard and drag and drop scenarios. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageOperation")
@js.native
object DataPackageOperation extends js.Object {
  /** Copies the content to the target destination. */
  @js.native
  sealed trait copy extends DataPackageOperation
  
  /** Creates a link for the data. */
  @js.native
  sealed trait link extends DataPackageOperation
  
  /** Copies the content to the target destination and deletes the original. */
  @js.native
  sealed trait move extends DataPackageOperation
  
  /** No action. Typically used when the DataPackage object requires delayed rendering. */
  @js.native
  sealed trait none extends DataPackageOperation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataPackageOperation with Double] = js.native
  /* 1 */ @js.native
  object copy extends TopLevel[copy with Double]
  
  /* 3 */ @js.native
  object link extends TopLevel[link with Double]
  
  /* 2 */ @js.native
  object move extends TopLevel[move with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

