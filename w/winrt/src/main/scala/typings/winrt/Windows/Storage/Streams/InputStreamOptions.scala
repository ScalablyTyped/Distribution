package typings.winrt.Windows.Storage.Streams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputStreamOptions extends StObject
@JSGlobal("Windows.Storage.Streams.InputStreamOptions")
@js.native
object InputStreamOptions extends StObject {
  
  @js.native
  sealed trait none
    extends StObject
       with InputStreamOptions
  
  @js.native
  sealed trait partial
    extends StObject
       with InputStreamOptions
  
  @js.native
  sealed trait readAhead
    extends StObject
       with InputStreamOptions
}
