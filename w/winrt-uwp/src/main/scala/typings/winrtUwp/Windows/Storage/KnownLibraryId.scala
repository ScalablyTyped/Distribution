package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KnownLibraryId extends StObject
/** Provides values that identify storage libraries. */
@JSGlobal("Windows.Storage.KnownLibraryId")
@js.native
object KnownLibraryId extends StObject {
  
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
