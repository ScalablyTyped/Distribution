package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KnownLibraryId extends StObject
/** Provides values that identify storage libraries. */
@JSGlobal("Windows.Storage.KnownLibraryId")
@js.native
object KnownLibraryId extends StObject {
  
  /** Documents library. */
  @js.native
  sealed trait documents
    extends StObject
       with KnownLibraryId
  
  /** Music library. */
  @js.native
  sealed trait music
    extends StObject
       with KnownLibraryId
  
  /** Pictures library. */
  @js.native
  sealed trait pictures
    extends StObject
       with KnownLibraryId
  
  /** Videos library. */
  @js.native
  sealed trait videos
    extends StObject
       with KnownLibraryId
}
