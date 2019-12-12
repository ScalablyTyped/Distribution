package typings.winrtDashUwp.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Storage.StorageOpenOptions.allowOnlyReaders
import typings.winrtDashUwp.Windows.Storage.StorageOpenOptions.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorageOpenOptions extends js.Object

/** Provides options to use when opening a file. */
@JSGlobal("Windows.Storage.StorageOpenOptions")
@js.native
object StorageOpenOptions extends js.Object {
  /** Only allow the file to be read. */
  @js.native
  sealed trait allowOnlyReaders extends StorageOpenOptions
  
  /** No options are specified. */
  @js.native
  sealed trait none extends StorageOpenOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StorageOpenOptions with Double] = js.native
  /* 1 */ @js.native
  object allowOnlyReaders extends TopLevel[allowOnlyReaders with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

