package typings.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the SourceChanged event. */
@js.native
trait Print3DTaskSourceChangedEventArgs extends js.Object {
  
  /** Gets the updated 3D print package from the workflow. */
  var source: Printing3D3MFPackage = js.native
}
object Print3DTaskSourceChangedEventArgs {
  
  @scala.inline
  def apply(source: Printing3D3MFPackage): Print3DTaskSourceChangedEventArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print3DTaskSourceChangedEventArgs]
  }
  
  @scala.inline
  implicit class Print3DTaskSourceChangedEventArgsOps[Self <: Print3DTaskSourceChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setSource(value: Printing3D3MFPackage): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
