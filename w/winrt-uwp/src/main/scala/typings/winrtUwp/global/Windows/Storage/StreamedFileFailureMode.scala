package typings.winrtUwp.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the reason that data could not be streamed. */
@JSGlobal("Windows.Storage.StreamedFileFailureMode")
@js.native
object StreamedFileFailureMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.StreamedFileFailureMode & Double] = js.native
  
  /* 1 */ val currentlyUnavailable: typings.winrtUwp.Windows.Storage.StreamedFileFailureMode.currentlyUnavailable & Double = js.native
  
  /* 0 */ val failed: typings.winrtUwp.Windows.Storage.StreamedFileFailureMode.failed & Double = js.native
  
  /* 2 */ val incomplete: typings.winrtUwp.Windows.Storage.StreamedFileFailureMode.incomplete & Double = js.native
}
