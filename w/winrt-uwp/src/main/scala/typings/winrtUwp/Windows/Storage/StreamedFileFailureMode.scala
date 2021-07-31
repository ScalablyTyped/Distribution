package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StreamedFileFailureMode extends StObject
/** Indicates the reason that data could not be streamed. */
@JSGlobal("Windows.Storage.StreamedFileFailureMode")
@js.native
object StreamedFileFailureMode extends StObject {
  
  /** The data could not be accessed. */
  @js.native
  sealed trait currentlyUnavailable
    extends StObject
       with StreamedFileFailureMode
  
  /** Streaming the data failed. */
  @js.native
  sealed trait failed
    extends StObject
       with StreamedFileFailureMode
  
  /** Streaming the data failed to complete. */
  @js.native
  sealed trait incomplete
    extends StObject
       with StreamedFileFailureMode
}
