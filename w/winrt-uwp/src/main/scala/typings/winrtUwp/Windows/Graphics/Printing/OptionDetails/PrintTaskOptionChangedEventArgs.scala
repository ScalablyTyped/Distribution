package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Called when a print task option has changed. */
@js.native
trait PrintTaskOptionChangedEventArgs extends js.Object {
  
  /** Gets the ID of the print task option that changed. */
  var optionId: js.Any = js.native
}
object PrintTaskOptionChangedEventArgs {
  
  @scala.inline
  def apply(optionId: js.Any): PrintTaskOptionChangedEventArgs = {
    val __obj = js.Dynamic.literal(optionId = optionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskOptionChangedEventArgs]
  }
  
  @scala.inline
  implicit class PrintTaskOptionChangedEventArgsOps[Self <: PrintTaskOptionChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setOptionId(value: js.Any): Self = this.set("optionId", value.asInstanceOf[js.Any])
  }
}
