package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportStorageMediumType with Double] = js.native
  /* 1 */ @js.native
  object fixed extends TopLevel[fixed with Double]
  
  /* 2 */ @js.native
  object removable extends TopLevel[removable with Double]
  
  /* 0 */ @js.native
  object undefined extends TopLevel[undefined with Double]
  
}

