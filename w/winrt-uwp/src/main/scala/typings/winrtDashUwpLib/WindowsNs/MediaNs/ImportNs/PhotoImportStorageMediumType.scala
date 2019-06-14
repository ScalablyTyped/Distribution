package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ImportNs

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
  sealed trait fixed
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportStorageMediumType
  
  /** The storage medium is removable. */
  @js.native
  sealed trait removable
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportStorageMediumType
  
  /** The storage medium type is undefined. */
  @js.native
  sealed trait undefined
    extends winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportStorageMediumType
  
  /* 1 */ val fixed: fixed with scala.Double = js.native
  /* 2 */ val removable: removable with scala.Double = js.native
  /* 0 */ val undefined: undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportStorageMediumType with scala.Double
  ] = js.native
}

