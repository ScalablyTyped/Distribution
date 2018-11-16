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
  
  val fixed: fixed with java.lang.String = js.native
  val removable: removable with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ImportNs.PhotoImportStorageMediumType with java.lang.String
  ] = js.native
}

