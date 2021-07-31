package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapCodecInformation extends StObject {
  
  var codecId: String
  
  var fileExtensions: IVectorView[String]
  
  var friendlyName: String
  
  var mimeTypes: IVectorView[String]
}
object IBitmapCodecInformation {
  
  @scala.inline
  def apply(
    codecId: String,
    fileExtensions: IVectorView[String],
    friendlyName: String,
    mimeTypes: IVectorView[String]
  ): IBitmapCodecInformation = {
    val __obj = js.Dynamic.literal(codecId = codecId.asInstanceOf[js.Any], fileExtensions = fileExtensions.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], mimeTypes = mimeTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapCodecInformation]
  }
  
  @scala.inline
  implicit class IBitmapCodecInformationMutableBuilder[Self <: IBitmapCodecInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodecId(value: String): Self = StObject.set(x, "codecId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileExtensions(value: IVectorView[String]): Self = StObject.set(x, "fileExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypes(value: IVectorView[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
  }
}
