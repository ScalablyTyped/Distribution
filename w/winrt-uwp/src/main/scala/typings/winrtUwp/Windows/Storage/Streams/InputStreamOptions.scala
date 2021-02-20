package typings.winrtUwp.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputStreamOptions extends StObject
/** Specifies the read options for an input stream. */
@JSGlobal("Windows.Storage.Streams.InputStreamOptions")
@js.native
object InputStreamOptions extends StObject {
  
  /** No options are specified. */
  @js.native
  sealed trait none extends InputStreamOptions
  
  /** The asynchronous read operation completes when one or more bytes is available. */
  @js.native
  sealed trait partial extends InputStreamOptions
  
  /** The asynchronous read operation may optionally read ahead and prefetch additional bytes. */
  @js.native
  sealed trait readAhead extends InputStreamOptions
}
