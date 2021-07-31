package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Media options
  */
trait IMediaOptions extends StObject {
  
  var imageOnly: Boolean
  
  var mediaModel: IMediaModel
}
object IMediaOptions {
  
  @scala.inline
  def apply(imageOnly: Boolean, mediaModel: IMediaModel): IMediaOptions = {
    val __obj = js.Dynamic.literal(imageOnly = imageOnly.asInstanceOf[js.Any], mediaModel = mediaModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaOptions]
  }
  
  @scala.inline
  implicit class IMediaOptionsMutableBuilder[Self <: IMediaOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageOnly(value: Boolean): Self = StObject.set(x, "imageOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaModel(value: IMediaModel): Self = StObject.set(x, "mediaModel", value.asInstanceOf[js.Any])
  }
}
