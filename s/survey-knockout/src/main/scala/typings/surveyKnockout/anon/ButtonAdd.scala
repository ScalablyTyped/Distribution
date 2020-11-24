package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonAdd extends js.Object {
  
  var button: String = js.native
  
  var buttonAdd: String = js.native
  
  var buttonNext: String = js.native
  
  var buttonPrev: String = js.native
  
  var buttonRemove: String = js.native
  
  var progress: String = js.native
  
  var progressBar: String = js.native
  
  var progressContainer: String = js.native
  
  var progressText: String = js.native
  
  var root: String = js.native
  
  var title: String = js.native
}
object ButtonAdd {
  
  @scala.inline
  def apply(
    button: String,
    buttonAdd: String,
    buttonNext: String,
    buttonPrev: String,
    buttonRemove: String,
    progress: String,
    progressBar: String,
    progressContainer: String,
    progressText: String,
    root: String,
    title: String
  ): ButtonAdd = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonAdd = buttonAdd.asInstanceOf[js.Any], buttonNext = buttonNext.asInstanceOf[js.Any], buttonPrev = buttonPrev.asInstanceOf[js.Any], buttonRemove = buttonRemove.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], progressBar = progressBar.asInstanceOf[js.Any], progressContainer = progressContainer.asInstanceOf[js.Any], progressText = progressText.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonAdd]
  }
  
  @scala.inline
  implicit class ButtonAddOps[Self <: ButtonAdd] (val x: Self) extends AnyVal {
    
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
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonAdd(value: String): Self = this.set("buttonAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonNext(value: String): Self = this.set("buttonNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonPrev(value: String): Self = this.set("buttonPrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonRemove(value: String): Self = this.set("buttonRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: String): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBar(value: String): Self = this.set("progressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressContainer(value: String): Self = this.set("progressContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressText(value: String): Self = this.set("progressText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
