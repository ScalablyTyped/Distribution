package typings.winrt.Windows.Storage.Pickers.Provider

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileSavePickerUI extends js.Object {
  
  var allowedFileTypes: IVectorView[String] = js.native
  
  var fileName: String = js.native
  
  var onfilenamechanged: js.Any = js.native
  
  var ontargetfilerequested: js.Any = js.native
  
  var settingsIdentifier: String = js.native
  
  var title: String = js.native
  
  def trySetFileName(value: String): SetFileNameResult = js.native
}
object IFileSavePickerUI {
  
  @scala.inline
  def apply(
    allowedFileTypes: IVectorView[String],
    fileName: String,
    onfilenamechanged: js.Any,
    ontargetfilerequested: js.Any,
    settingsIdentifier: String,
    title: String,
    trySetFileName: String => SetFileNameResult
  ): IFileSavePickerUI = {
    val __obj = js.Dynamic.literal(allowedFileTypes = allowedFileTypes.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], onfilenamechanged = onfilenamechanged.asInstanceOf[js.Any], ontargetfilerequested = ontargetfilerequested.asInstanceOf[js.Any], settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trySetFileName = js.Any.fromFunction1(trySetFileName))
    __obj.asInstanceOf[IFileSavePickerUI]
  }
  
  @scala.inline
  implicit class IFileSavePickerUIOps[Self <: IFileSavePickerUI] (val x: Self) extends AnyVal {
    
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
    def setAllowedFileTypes(value: IVectorView[String]): Self = this.set("allowedFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnfilenamechanged(value: js.Any): Self = this.set("onfilenamechanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntargetfilerequested(value: js.Any): Self = this.set("ontargetfilerequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsIdentifier(value: String): Self = this.set("settingsIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrySetFileName(value: String => SetFileNameResult): Self = this.set("trySetFileName", js.Any.fromFunction1(value))
  }
}
