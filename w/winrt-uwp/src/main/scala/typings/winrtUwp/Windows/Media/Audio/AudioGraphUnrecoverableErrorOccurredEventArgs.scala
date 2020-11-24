package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents arguments for an UnrecoverableErrorOccurred event. */
@js.native
trait AudioGraphUnrecoverableErrorOccurredEventArgs extends js.Object {
  
  /** Gets the error associated with the event. */
  var error: AudioGraphUnrecoverableError = js.native
}
object AudioGraphUnrecoverableErrorOccurredEventArgs {
  
  @scala.inline
  def apply(error: AudioGraphUnrecoverableError): AudioGraphUnrecoverableErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioGraphUnrecoverableErrorOccurredEventArgs]
  }
  
  @scala.inline
  implicit class AudioGraphUnrecoverableErrorOccurredEventArgsOps[Self <: AudioGraphUnrecoverableErrorOccurredEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: AudioGraphUnrecoverableError): Self = this.set("error", value.asInstanceOf[js.Any])
  }
}
