package typings.winrtUwp.Windows.UI.Text.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TextRequested event. */
@js.native
trait CoreTextTextRequestedEventArgs extends js.Object {
  
  /** Gets information about a TextRequested event. */
  var request: CoreTextTextRequest = js.native
}
object CoreTextTextRequestedEventArgs {
  
  @scala.inline
  def apply(request: CoreTextTextRequest): CoreTextTextRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextTextRequestedEventArgs]
  }
  
  @scala.inline
  implicit class CoreTextTextRequestedEventArgsOps[Self <: CoreTextTextRequestedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setRequest(value: CoreTextTextRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
}
