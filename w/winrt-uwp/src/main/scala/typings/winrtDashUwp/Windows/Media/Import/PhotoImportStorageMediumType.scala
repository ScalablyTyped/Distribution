package typings.winrtDashUwp.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 1 */ val fixed: typings.winrtDashUwp.Windows.Media.Import.PhotoImportStorageMediumType.fixed with Double = js.native
  /* 2 */ val removable: typings.winrtDashUwp.Windows.Media.Import.PhotoImportStorageMediumType.removable with Double = js.native
  /* 0 */ val undefined: typings.winrtDashUwp.Windows.Media.Import.PhotoImportStorageMediumType.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportStorageMediumType with Double] = js.native
}

