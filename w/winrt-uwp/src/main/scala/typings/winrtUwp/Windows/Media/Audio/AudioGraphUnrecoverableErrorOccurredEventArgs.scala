package typings.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents arguments for an UnrecoverableErrorOccurred event. */
trait AudioGraphUnrecoverableErrorOccurredEventArgs extends StObject {
  
  /** Gets the error associated with the event. */
  var error: AudioGraphUnrecoverableError
}
object AudioGraphUnrecoverableErrorOccurredEventArgs {
  
  inline def apply(error: AudioGraphUnrecoverableError): AudioGraphUnrecoverableErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioGraphUnrecoverableErrorOccurredEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioGraphUnrecoverableErrorOccurredEventArgs] (val x: Self) extends AnyVal {
    
    inline def setError(value: AudioGraphUnrecoverableError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
