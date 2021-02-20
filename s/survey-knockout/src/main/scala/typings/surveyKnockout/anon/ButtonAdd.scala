package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonAdd extends StObject {
  
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
  implicit class ButtonAddMutableBuilder[Self <: ButtonAdd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonAdd(value: String): Self = StObject.set(x, "buttonAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonNext(value: String): Self = StObject.set(x, "buttonNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonPrev(value: String): Self = StObject.set(x, "buttonPrev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonRemove(value: String): Self = StObject.set(x, "buttonRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressBar(value: String): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressContainer(value: String): Self = StObject.set(x, "progressContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressText(value: String): Self = StObject.set(x, "progressText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
