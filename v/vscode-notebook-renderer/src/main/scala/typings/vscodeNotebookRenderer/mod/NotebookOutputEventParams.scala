package typings.vscodeNotebookRenderer.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookOutputEventParams extends js.Object {
  
  var element: HTMLElement = js.native
  
  var mimeType: String = js.native
  
  var output: NotebookOutput = js.native
  
  var outputId: String = js.native
}
object NotebookOutputEventParams {
  
  @scala.inline
  def apply(element: HTMLElement, mimeType: String, output: NotebookOutput, outputId: String): NotebookOutputEventParams = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], outputId = outputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookOutputEventParams]
  }
  
  @scala.inline
  implicit class NotebookOutputEventParamsOps[Self <: NotebookOutputEventParams] (val x: Self) extends AnyVal {
    
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
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: NotebookOutput): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputId(value: String): Self = this.set("outputId", value.asInstanceOf[js.Any])
  }
}
