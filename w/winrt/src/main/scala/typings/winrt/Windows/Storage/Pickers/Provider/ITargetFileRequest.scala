package typings.winrt.Windows.Storage.Pickers.Provider

import typings.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITargetFileRequest extends StObject {
  
  def getDeferral(): TargetFileRequestDeferral
  
  var targetFile: IStorageFile
}
object ITargetFileRequest {
  
  inline def apply(getDeferral: () => TargetFileRequestDeferral, targetFile: IStorageFile): ITargetFileRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), targetFile = targetFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITargetFileRequest]
  }
  
  extension [Self <: ITargetFileRequest](x: Self) {
    
    inline def setGetDeferral(value: () => TargetFileRequestDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    inline def setTargetFile(value: IStorageFile): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
  }
}
