package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StreamedFileFailureMode extends StObject
@JSGlobal("Windows.Storage.StreamedFileFailureMode")
@js.native
object StreamedFileFailureMode extends StObject {
  
  @js.native
  sealed trait currentlyUnavailable extends StreamedFileFailureMode
  
  @js.native
  sealed trait failed extends StreamedFileFailureMode
  
  @js.native
  sealed trait incomplete extends StreamedFileFailureMode
}
