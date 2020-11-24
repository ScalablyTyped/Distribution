package typings.winrtUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoImportStorageMediumType extends js.Object
/** Specifies the type of a storage medium. */
@JSGlobal("Windows.Media.Import.PhotoImportStorageMediumType")
@js.native
object PhotoImportStorageMediumType extends js.Object {
  
  /** The storage medium is fixed. */
  @js.native
  sealed trait fixed extends PhotoImportStorageMediumType
  
  /** The storage medium is removable. */
  @js.native
  sealed trait removable extends PhotoImportStorageMediumType
  
  /** The storage medium type is undefined. */
  @js.native
  sealed trait undefined extends PhotoImportStorageMediumType
}
