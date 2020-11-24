package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaSource::MediaSourceOpenOperationCompleted event. */
@js.native
trait MediaSourceOpenOperationCompletedEventArgs extends js.Object {
  
  /** Represents the error that occurred while asynchronously opening the MediaSource . */
  var error: MediaSourceError = js.native
}
object MediaSourceOpenOperationCompletedEventArgs {
  
  @scala.inline
  def apply(error: MediaSourceError): MediaSourceOpenOperationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceOpenOperationCompletedEventArgs]
  }
  
  @scala.inline
  implicit class MediaSourceOpenOperationCompletedEventArgsOps[Self <: MediaSourceOpenOperationCompletedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setError(value: MediaSourceError): Self = this.set("error", value.asInstanceOf[js.Any])
  }
}
