package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KnownLibraryId extends js.Object

/** Provides values that identify storage libraries. */
@JSGlobal("Windows.Storage.KnownLibraryId")
@js.native
object KnownLibraryId extends js.Object {
  /** Documents library. */
  @js.native
  sealed trait documents extends KnownLibraryId
  
  /** Music library. */
  @js.native
  sealed trait music extends KnownLibraryId
  
  /** Pictures library. */
  @js.native
  sealed trait pictures extends KnownLibraryId
  
  /** Videos library. */
  @js.native
  sealed trait videos extends KnownLibraryId
  
}

