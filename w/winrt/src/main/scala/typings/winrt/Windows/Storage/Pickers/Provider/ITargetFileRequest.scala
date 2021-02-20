package typings.winrt.Windows.Storage.Pickers.Provider

import typings.winrt.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITargetFileRequest extends StObject {
  
  def getDeferral(): TargetFileRequestDeferral = js.native
  
  var targetFile: IStorageFile = js.native
}
object ITargetFileRequest {
  
  @scala.inline
  def apply(getDeferral: () => TargetFileRequestDeferral, targetFile: IStorageFile): ITargetFileRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), targetFile = targetFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITargetFileRequest]
  }
  
  @scala.inline
  implicit class ITargetFileRequestMutableBuilder[Self <: ITargetFileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => TargetFileRequestDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetFile(value: IStorageFile): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
  }
}
