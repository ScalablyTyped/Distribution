package typings.winrt.Windows.Storage.Pickers.Provider

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileSavePickerUI extends StObject {
  
  var allowedFileTypes: IVectorView[String]
  
  var fileName: String
  
  var onfilenamechanged: Any
  
  var ontargetfilerequested: Any
  
  var settingsIdentifier: String
  
  var title: String
  
  def trySetFileName(value: String): SetFileNameResult
}
object IFileSavePickerUI {
  
  inline def apply(
    allowedFileTypes: IVectorView[String],
    fileName: String,
    onfilenamechanged: Any,
    ontargetfilerequested: Any,
    settingsIdentifier: String,
    title: String,
    trySetFileName: String => SetFileNameResult
  ): IFileSavePickerUI = {
    val __obj = js.Dynamic.literal(allowedFileTypes = allowedFileTypes.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], onfilenamechanged = onfilenamechanged.asInstanceOf[js.Any], ontargetfilerequested = ontargetfilerequested.asInstanceOf[js.Any], settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trySetFileName = js.Any.fromFunction1(trySetFileName))
    __obj.asInstanceOf[IFileSavePickerUI]
  }
  
  extension [Self <: IFileSavePickerUI](x: Self) {
    
    inline def setAllowedFileTypes(value: IVectorView[String]): Self = StObject.set(x, "allowedFileTypes", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setOnfilenamechanged(value: Any): Self = StObject.set(x, "onfilenamechanged", value.asInstanceOf[js.Any])
    
    inline def setOntargetfilerequested(value: Any): Self = StObject.set(x, "ontargetfilerequested", value.asInstanceOf[js.Any])
    
    inline def setSettingsIdentifier(value: String): Self = StObject.set(x, "settingsIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTrySetFileName(value: String => SetFileNameResult): Self = StObject.set(x, "trySetFileName", js.Any.fromFunction1(value))
  }
}
