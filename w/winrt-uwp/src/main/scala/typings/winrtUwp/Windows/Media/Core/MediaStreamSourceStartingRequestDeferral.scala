package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way for the application to asynchronously report that it has completed processing the MediaStreamSource.Starting event. */
@js.native
trait MediaStreamSourceStartingRequestDeferral extends js.Object {
  
  /** Reports that the application has completed processing the Starting event. */
  def complete(): Unit = js.native
}
object MediaStreamSourceStartingRequestDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): MediaStreamSourceStartingRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[MediaStreamSourceStartingRequestDeferral]
  }
  
  @scala.inline
  implicit class MediaStreamSourceStartingRequestDeferralOps[Self <: MediaStreamSourceStartingRequestDeferral] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
  }
}
